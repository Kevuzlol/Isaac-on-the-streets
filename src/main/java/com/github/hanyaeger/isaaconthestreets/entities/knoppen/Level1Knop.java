package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Level1Knop extends Knop{

    public Level1Knop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreet){
        super(initialLocation, "Level 1", isaacOnTheStreets);
    }
}
