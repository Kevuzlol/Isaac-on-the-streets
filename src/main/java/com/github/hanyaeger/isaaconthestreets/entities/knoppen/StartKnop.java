package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class StartKnop extends Knop {

    public StartKnop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets) {
        super(initialLocation, "Start spel", isaacOnTheStreets);
    }
}
