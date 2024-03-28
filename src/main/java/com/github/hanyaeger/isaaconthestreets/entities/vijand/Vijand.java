package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;

import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;
import com.github.hanyaeger.api.entities.Direction;

import java.util.List;

public abstract class Vijand extends DynamicSpriteEntity implements Collider, Collided, SceneBorderTouchingWatcher {

    // stati variable aanmaken die bijhoud hoeveel enemys er zijn

    private static int aantalVijanden = 0;
    private IsaacOnTheStreets isaacOnTheStreets;
    protected  static int health = 5;
    private int damage = 1;
    private double snelheid = 3;

    protected Vijand(String resource, Coordinate2D initialLocation, Size size, int row, int column, final IsaacOnTheStreets isaacOnTheStreets) {
        super(resource, initialLocation, size, row, column);
        // setmotion voor speed en beweging
        this.isaacOnTheStreets = isaacOnTheStreets;
        aantalVijanden++;
    }

    // inplaats van methode doedamage gelijk in de oncollision
    @Override
    public void onCollision(List<Collider> list) {

        double direction = getDirection() % 360;
        var isaacCollision = false;
        var obstakelCollision = false;
        var steenCollision = false;
        for (Collider collider : list) {
            if (collider instanceof Isaac) {
                isaacCollision = true;
                // System.out.println("collision test!");
                health -= 1; // damage dan wel van isaac
            } else if (collider instanceof Steen) {
                steenCollision = true;
            }
            if (collider instanceof Obstakels) {
                //  System.out.println("TEST obstakel colliosn");
                obstakelCollision = true;
            }
        }


        if (obstakelCollision) {
            if (direction >= 0 && direction < 90) {
                changeDirection(80D);
            }
            if (direction >= 90 && direction < 180) {
                changeDirection(80D);
            }
            if (direction >= 180 && direction < 270) {
                changeDirection(80D);
            }
            if (direction >= 269 && direction < 360) {
                changeDirection(80D);

            }
        }

        if (steenCollision) {
            //System.out.println("collision test steen!");
            health -= 1;  // damage dan wel van steen
        }


        if (aantalVijanden == 0) {
            this.isaacOnTheStreets.setActiveScene(3);
        }

    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
//
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSnelheid(double snelheid) {
        this.snelheid = snelheid;
    }

    public double getSnelheid() {
        return snelheid;
    }


    public static int getAantalVijanden() {
        return aantalVijanden;
    }

    public void setAantalVijanden(int aantalVijanden) {
        this.aantalVijanden = aantalVijanden;
    }


    public static int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health = health;
    }

}




