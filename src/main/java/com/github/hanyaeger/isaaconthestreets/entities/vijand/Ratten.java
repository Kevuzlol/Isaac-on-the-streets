package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Ratten extends Vijand {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Ratten(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation, new Size(110, 110), 4, 3,null);

        setAutoCycle(25, 3);
        setSnelheid(5);
        setDamage(1);
        setMotion(getSnelheid(), Direction.LEFT);
        this.isaacOnTheStreets = isaacOnTheStreets;
    }


    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        changeDirection(80D);
//        changeDirection(getDirection());
//        System.out.println(getDirection());
        double direction = getDirection() % 360;
        //  System.out.println("rat direction");
        //  System.out.println(direction);
        if (direction >= 0 && direction < 90) {
            setAutoCycleRow(2);
            //System.out.println(getAutoCycleRow());
        } else if (direction >= 90 && direction < 180) {
            setAutoCycleRow(1);
            // System.out.println(getAutoCycleRow());

        } else if (direction >= 180 && direction < 270) {
            setAutoCycleRow(2);
            // System.out.println(getAutoCycleRow());

        } else if (direction >= 269 && direction < 360) {
            setAutoCycleRow(3);
            //  System.out.println(getAutoCycleRow());

        }
    }


    // on collision
//       if (health == 0) {
//        this.isaacOnTheStreets.setActiveScene(2);
//    }
}
