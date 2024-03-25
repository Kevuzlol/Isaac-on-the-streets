package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import javafx.scene.input.MouseButton;


public class Level3Knop extends Knop{

    public Level3Knop(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets){
        super(initialLocation, "Level 3", isaacOnTheStreets);
    }
    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
        //isaacOnTheStreets.setActiveScene(6);
        //level3
         // isaacOnTheStreets.setActiveScene(3); //om eindscherm te testen
          isaacOnTheStreets.setActiveScene(2); //om scoreScherm te testen

    }

}
