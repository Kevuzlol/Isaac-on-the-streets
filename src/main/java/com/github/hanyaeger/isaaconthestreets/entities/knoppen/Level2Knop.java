package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Level2Knop extends Knop {
    public Level2Knop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreet){
        super(initialLocation, "Level 2", isaacOnTheStreets);
    }
}
