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

import static java.lang.Math.*;

public class Kakkerlak extends Vijand {

    private int health = 10;
    private Isaac isaac;

    private IsaacOnTheStreets isaacOnTheStreets;

    public Kakkerlak(String resource, Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets,Isaac isaac) {
        super(resource, initialLocation, new Size(110, 110), 15,20, isaacOnTheStreets);
        setAutoCycle(70, 0);
        setSnelheid(7);
        setDamage(1);
        setMotion(getSnelheid(), Direction.RIGHT);
        this.isaacOnTheStreets = isaacOnTheStreets;
        this.isaac = isaac;

    }


    public void ontwijkIsaac(){
          setDirection(angleTo(isaac) + PI); // pi want radius
    }



    @Override
    public int getHealth() {
        return health;
    }

}
