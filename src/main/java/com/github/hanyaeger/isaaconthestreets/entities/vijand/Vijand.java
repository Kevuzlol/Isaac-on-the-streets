package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;

import java.util.List;


public abstract class Vijand extends DynamicSpriteEntity implements Collider, Collided, SceneBorderTouchingWatcher {

    // stati variable aanmaken die bijhoud hoeveel enemys er zijn

    private static int aantalVijanden = 0;
    protected IsaacOnTheStreets isaacOnTheStreets;
    private int health = 6;
    private int standardDamage = 1;
    private int ontvangenPowerupDamage = 2;
    private int geefDamage = 1;
    private double snelheid = 3;
    private static boolean powerupIsActief = false;



    public Vijand(String resource, Coordinate2D initialLocation, Size size, int row, int column, final IsaacOnTheStreets isaacOnTheStreets) {
        super(resource, initialLocation, size, row, column);
        // setmotion voor speed en beweging
        this.isaacOnTheStreets = isaacOnTheStreets;
        aantalVijanden++;
    }

    // inplaats van methode doedamage gelijk in de oncollision
    @Override
    public void onCollision(List<Collider> list) {
        var obstakelCollision = false;
        var steenCollision = false;
        for (Collider collider : list) {
            if (collider instanceof Obstakels) {
                //  System.out.println("TEST obstakel colliosn");
                obstakelCollision = true;
            }
            if (collider instanceof Steen) {
                steenCollision = true;
            }
        }
        if (obstakelCollision) {
            changeDirection(80d);
        }
        if(steenCollision){
            if(powerupIsActief) {
                health -= ontvangenPowerupDamage;
            } else {
                health -= standardDamage;
            }

        }
        if (health <= 0) {
                remove();
                Vijand.setAantalVijanden(Vijand.getAantalVijanden() - 1);
                System.out.println("Number of enemies: " + Vijand.getAantalVijanden());
            }
        if (Vijand.getAantalVijanden() <= 0) {
            this.isaacOnTheStreets.setActiveScene(2);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        changeDirection(120D);
//        changeDirection(getDirection());
        double direction = getDirection() % 360;
        if (direction >= 0 && direction < 90) {
            setAutoCycleRow(2);
            // System.out.println(getAutoCycleRow());
        } else if (direction >= 90 && direction < 180) {
            setAutoCycleRow(1);
            // System.out.println(getAutoCycleRow());

        } else if (direction >= 180 && direction < 270) {
            setAutoCycleRow(2);
            // System.out.println(getAutoCycleRow());

        } else if (direction >= 269 && direction < 360) {
            setAutoCycleRow(3);
            // System.out.println(getAutoCycleRow());

        }
    }


    // snelheid en damage
    public void setDamage(int damage) {
        this.geefDamage = damage;
    }

    public void setSnelheid(double snelheid) {
        this.snelheid = snelheid;
    }

    public double getSnelheid() {
        return snelheid;
    }


    // aantal vijanden
    public static int getAantalVijanden() {
        return aantalVijanden;
    }

    public static void setAantalVijanden(int aantalVijanden) {
        Vijand.aantalVijanden = aantalVijanden;
    }


    // health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static boolean getPowerUpisactief(){
        return powerupIsActief;
    }

    public void setOntvangenPowerupDamage( int ontvangenPowerupDamage){
        this.ontvangenPowerupDamage = ontvangenPowerupDamage;
    }
}




