package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import javafx.scene.input.MouseButton;

public class PlayAgainKnop extends Knop{

    public PlayAgainKnop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets){
        super(initialLocation, "Level 1", isaacOnTheStreets);
    }
    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
        isaacOnTheStreets.setActiveScene(1);
        //gaat naar kies level scherm
    }


}
