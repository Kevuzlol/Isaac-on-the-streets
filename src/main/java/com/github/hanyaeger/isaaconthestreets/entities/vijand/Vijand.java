package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;

import java.util.List;

public abstract class Vijand extends DynamicSpriteEntity implements Collider, Collided, SceneBorderTouchingWatcher {

    private int damage = 1;
    private double snelheid = 3;

    protected Vijand(String resource, Coordinate2D initialLocation, Size size, int row, int column) {
        super(resource, initialLocation, size, row, column);
        // setmotion voor speed en beweging


    }

    // inplaats van methode doedamage gelijk in de oncollision
    @Override
    public void onCollision(List<Collider> list) {
        for (Collider collider : list) {
            if (collider instanceof Isaac) {
                System.out.println("collision test!");
                //health - damage;
//            } else if( collider instanceof steen){
//                System.out.println("collision test!");
//                //health - damage
            }
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
}
