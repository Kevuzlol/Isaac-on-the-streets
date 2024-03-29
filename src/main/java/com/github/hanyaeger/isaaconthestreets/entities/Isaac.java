package com.github.hanyaeger.isaaconthestreets.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.media.SoundClip;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.CrystalMeth;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Hartje;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Heroine;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Speed;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.text.SchildText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vijand;
import com.github.hanyaeger.isaaconthestreets.scenes.Levelscherm;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;


public class Isaac extends DynamicSpriteEntity implements SceneBorderTouchingWatcher, Collider, Collided, KeyListener {
    private final IsaacOnTheStreets isaacOnTheStreets;
    private final Levelscherm level;
    private HealthText healthText;
    private SchildText schildText;
    private int health = 3;
    private boolean schild = false;
    private int snelheidVermeenigvuldiger = 1;
    private long kwetsbaarheidTijd;
    private long gooiSteenTimer;
    private long gooiSteenWachttijd = 500;
    private int onkwetsbaarTijd = 3000;

    public Isaac(Coordinate2D initialLocation, HealthText healthText, SchildText schildText, final IsaacOnTheStreets isaacOnTheStreets, Levelscherm level) {
        super("sprites/isaac.png", initialLocation, new Size(40, 40), 12, 16);

        this.isaacOnTheStreets = isaacOnTheStreets;
        this.level = level;

        this.healthText = healthText;
        healthText.setText(health);
        this.schildText = schildText;

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setCurrentFrameIndex(0);
            setMotion(3 * snelheidVermeenigvuldiger, Direction.LEFT);
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setCurrentFrameIndex(1);
            setMotion(3 * snelheidVermeenigvuldiger, Direction.RIGHT);
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3 * snelheidVermeenigvuldiger, Direction.UP);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3 * snelheidVermeenigvuldiger, Direction.DOWN);
        } else {
            setSpeed(0);
        }

        if (pressedKeys.contains(KeyCode.SPACE)) {
            if (System.currentTimeMillis() - gooiSteenTimer >= gooiSteenWachttijd) {
                gooiSteenTimer = System.currentTimeMillis();

                Coordinate2D location;
                if (Direction.RIGHT.equals(Direction.valueOf(this.getDirection()))) {
                    location = new Coordinate2D(this.getBoundingBox().getMaxX() - 20, this.getBoundingBox().getCenterY() - 10);
                } else {
                    location = new Coordinate2D(this.getBoundingBox().getMinX() + 10, this.getBoundingBox().getCenterY() - 10);
                }
                level.createSteen(location, Direction.valueOf(this.getDirection()));
            }
        }
    }


    @Override
    public void onCollision(List<Collider> collidingObjects) {
        var obstakelCollision = false;
        var vijandCollision = false;
        for (Collider collider : collidingObjects) {
            if (collider instanceof Obstakels) {
                obstakelCollision = true;
            } else if (collider instanceof Vijand) {
                vijandCollision = true;
            } else if (collider instanceof Speed) {
                snelheidVermeenigvuldiger = 2;
            } else if (collider instanceof Hartje) {
                healthText.setText(++health);
            } else if (collider instanceof Heroine) {
                schild = true;
                schildText.setText("Schild");
            } else if (collider instanceof CrystalMeth){
                var popSound = new SoundClip("audio/Moffel.mp3");
                popSound.play();
            }
        }

        if (obstakelCollision) {
            if (getDirection() == Direction.DOWN.getValue()) {
                setAnchorLocationY(getAnchorLocation().getY() - (getSpeed() + 1));
            }
            if (getDirection() == Direction.UP.getValue()) {
                setAnchorLocationY(getAnchorLocation().getY() + (getSpeed() + 1));
            }
            if (getDirection() == Direction.LEFT.getValue()) {
                setAnchorLocationX(getAnchorLocation().getX() + (getSpeed() + 1));
            }
            if (getDirection() == Direction.RIGHT.getValue()) {
                setAnchorLocationX(getAnchorLocation().getX() - (getSpeed() + 1));
            }
        }

        if (vijandCollision) {
            if (System.currentTimeMillis() - kwetsbaarheidTijd >= onkwetsbaarTijd) {
                if (schild == true) {
                    schild = false;
                    schildText.setText("");
                } else {
                    healthText.setText(--health);
                }
                kwetsbaarheidTijd = System.currentTimeMillis();
                if (health <= 0) {
                    this.isaacOnTheStreets.setActiveScene(3);
                }
            }
        }
    }

    @Override
    public void notifyBoundaryTouching(final SceneBorder border) {
        setSpeed(0);

        switch (border) {
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }

    public int getIsaacHealth() {
        return health;
    }
}
