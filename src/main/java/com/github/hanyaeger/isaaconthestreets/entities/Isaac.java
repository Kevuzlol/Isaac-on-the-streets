package com.github.hanyaeger.isaaconthestreets.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Isaac extends DynamicSpriteEntity {
    protected Isaac(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation);
    }
}
