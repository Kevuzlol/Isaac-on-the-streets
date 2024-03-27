package com.github.hanyaeger.isaaconthestreets.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Set;

public class Isaac extends DynamicSpriteEntity implements SceneBorderTouchingWatcher, Collider, Collided, KeyListener {
    private final HealthText healthText;

    private final IsaacOnTheStreets isaacOnTheStreets;

    public Isaac(Coordinate2D initialLocation, final HealthText healthText, IsaacOnTheStreets isaacOnTheStreets) {
        super("sprites/Hanny.png", initialLocation, new Size(100, 100), 1, 2);

        this.healthText = healthText;

        this.isaacOnTheStreets = isaacOnTheStreets;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setCurrentFrameIndex(0);
            setMotion(3, Direction.LEFT);
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setCurrentFrameIndex(1);
            setMotion(3, Direction.RIGHT);
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3, Direction.UP);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3, Direction.DOWN);
        }
        else{
            setSpeed(0);
        }
    }

    @Override
    public void onCollision(List<Collider> collidingObject) {
        var obstakelCollision = false;
        for (Collider collider : collidingObject) {
            if (collider instanceof Obstakels) {
                obstakelCollision = true;
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
}
