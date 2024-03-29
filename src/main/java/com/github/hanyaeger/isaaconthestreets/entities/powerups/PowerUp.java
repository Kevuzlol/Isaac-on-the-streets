package com.github.hanyaeger.isaaconthestreets.entities.powerups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;

import java.util.List;

public abstract class PowerUp extends SpriteEntity implements Collided, Collider {
    public PowerUp(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObject) {
        for (Collider collider : collidingObject){
            if (collider instanceof Isaac){
                remove();
            }
        }
    }

}
