package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;

import java.util.List;

public class Vlieg extends Vijand {

    private int health = 5;
    private IsaacOnTheStreets isaacOnTheStreets;

    public Vlieg(String resource, Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets) {
        super(resource, initialLocation, new Size(110, 110), 4, 4,   isaacOnTheStreets);

        setAutoCycle(50, 0);
        setSnelheid(3);
        setDamage(1);
        setMotion(getSnelheid(), Direction.RIGHT);
        this.isaacOnTheStreets = isaacOnTheStreets;

    }

    @Override
    public int getHealth() {
        return health;
    }
}
