package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

import com.github.hanyaeger.api.entities.Direction;

import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;


public class Ratten extends Vijand {

    private int health = 3;

    public Ratten(String resource, Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets, Isaac isaac) {
        super(resource, initialLocation, new Size(90, 90), 4, 3, isaacOnTheStreets,3, isaac);

        setAutoCycle(25, 3);
        setSnelheid(5);
        setDamage(1);
        setMotion(getSnelheid(), Direction.LEFT);

    }



}
