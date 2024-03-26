package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;

public class Ratten extends Vijand{
    public Ratten(String resource, Coordinate2D initialLocation) {
        super(resource,initialLocation);
        setSnelheid(10);
        setDamage(1);
        setMotion(getSnelheid(),Direction.LEFT);
    }

}
