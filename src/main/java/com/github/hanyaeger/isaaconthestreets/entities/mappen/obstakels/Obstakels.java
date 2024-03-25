package com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Obstakels extends SpriteEntity implements Collider {
    public Obstakels(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }
}
