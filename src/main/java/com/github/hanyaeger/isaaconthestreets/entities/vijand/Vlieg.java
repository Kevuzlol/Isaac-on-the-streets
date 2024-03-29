package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Obstakels;

import java.util.List;

public class Vlieg extends Vijand {

    private int health = 5;
    private IsaacOnTheStreets isaacOnTheStreets;

    public Vlieg(String resource, Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets) {
        super(resource, initialLocation, new Size(110, 110), 4, 4,   isaacOnTheStreets,5);

        setAutoCycle(50, 0);
        setSnelheid(3);
        setDamage(1);
        setMotion(getSnelheid(), Direction.RIGHT);
        this.isaacOnTheStreets = isaacOnTheStreets;

    }
    @Override
    public void onCollision(List<Collider> list) {
        var obstakelCollision = false;
        var steenCollision = false;
        for (Collider collider : list) {
            if (collider instanceof Steen) {
                steenCollision = true;
            }
        }
        if(steenCollision){
            if(Vijand.getPowerUpisactief()) {
                health--;
            }

        }
        if (health <= 0) {
            remove();
            Vijand.setAantalVijanden(Vijand.getAantalVijanden() - 1);
            System.out.println("Number of enemies: " + Vijand.getAantalVijanden());
        }
        if (Vijand.getAantalVijanden() <= 0) {
            this.isaacOnTheStreets.setActiveScene(2);
        }
    }


}
