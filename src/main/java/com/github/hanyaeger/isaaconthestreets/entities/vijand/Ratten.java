package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Ratten extends Vijand {
    public Ratten(String resource, Coordinate2D initialLocation) {
        super(resource, initialLocation, new Size(110, 110), 4,3);

        setAutoCycle(25, 3);
        setSnelheid(5);
        setDamage(1);
        setMotion(getSnelheid(), Direction.LEFT);

    }


    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
//        // If the entity touches the left border, change direction to right
//        if (sceneBorder.equals(SceneBorder.LEFT)) {
//            setMotion(getSnelheid(), Direction.RIGHT);
//        }
//        // If the entity touches the right border, change direction to left
//        else if (sceneBorder.equals(SceneBorder.RIGHT)) {
//            setMotion(getSnelheid(), Direction.LEFT);
//        }
//        // If the entity touches the top or bottom border, reverse its vertical motion
//        else if (sceneBorder.equals(SceneBorder.TOP) ) {
//            setMotion(getSnelheid(), Direction.DOWN);
//        }
//        else if (sceneBorder.equals(SceneBorder.BOTTOM) ) {
//            setMotion(getSnelheid(), Direction.UP);
//        }
        changeDirection(120D);
//        changeDirection(getDirection());
        double direction = getDirection() % 360;
        System.out.println(direction);
        if (direction >= 0 && direction < 90) {
            setAutoCycleRow(2);
            System.out.println(getAutoCycleRow());
        } else if (direction >= 90 && direction < 180) {
            setAutoCycleRow(1);
            System.out.println(getAutoCycleRow());

        } else if (direction >= 180 && direction < 270) {
            setAutoCycleRow(2);
            System.out.println(getAutoCycleRow());

        } else if (direction >= 269 && direction < 360) {
            setAutoCycleRow(3);
            System.out.println(getAutoCycleRow());

        }
    }
}
