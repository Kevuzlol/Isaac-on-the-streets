package com.github.hanyaeger.isaaconthestreets.entities;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;

import java.util.List;

public class Steen extends DynamicSpriteEntity implements Collided,Collider, SceneBorderCrossingWatcher {

    public Steen(final Coordinate2D initialLocation, final Direction direction) {
        super("sprites/boulder.png", initialLocation,new Size(20,20), 1, 1);
        setMotion(5, direction);

    }

    @Override
    public void onCollision(final List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof Isaac || collider instanceof  Steen) {
            } else {
                remove();
            }
        }
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        remove();
    }
}
