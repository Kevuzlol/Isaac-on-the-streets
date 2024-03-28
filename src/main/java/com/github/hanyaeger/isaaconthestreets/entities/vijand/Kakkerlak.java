package com.github.hanyaeger.isaaconthestreets.entities.vijand;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Kakkerlak  extends  Vijand{

    private IsaacOnTheStreets isaacOnTheStreets;
    protected Kakkerlak(String resource, Coordinate2D initialLocation, Size size, int row, int column) {
        super(resource, initialLocation, new Size(110, 110), 4,4,null);
        setAutoCycle(50, 0);
        setSnelheid(3);
        setDamage(1);
        setMotion(getSnelheid(), Direction.RIGHT);
        this.isaacOnTheStreets = isaacOnTheStreets;
    }


    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
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
