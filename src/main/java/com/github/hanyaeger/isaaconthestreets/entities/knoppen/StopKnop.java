package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import javafx.scene.input.MouseButton;

public class StopKnop extends Knop {

    public StopKnop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets) {
        super(initialLocation, "stop spel", isaacOnTheStreets);
    }


    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
        isaacOnTheStreets.quit();
        //stop spel
    }
}