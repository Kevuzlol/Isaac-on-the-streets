package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.Level2Knop;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.PlayAgainKnop;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.StartKnop;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.StopKnop;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Endscherm extends StaticScene {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Endscherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }
    @Override
    public void setupScene() {
        //setBackgroundAudio("");
        setBackgroundImage("backgrounds/endScreen_isaacOnTheStreets.jpeg");

    }

    @Override
    public void setupEntities() {
        var isaacOnTheStreetsTitleText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() * 0.1),
                "Eindscherm"
        );
        isaacOnTheStreetsTitleText.setAnchorPoint(AnchorPoint.TOP_CENTER);
        isaacOnTheStreetsTitleText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
        isaacOnTheStreetsTitleText.setStrokeWidth(3);
        isaacOnTheStreetsTitleText.setStrokeColor(Color.BLACK);
        isaacOnTheStreetsTitleText.setFill(Color.WHITE);
        addEntity(isaacOnTheStreetsTitleText);

        PlayAgainKnop PlayAgainKnop = new PlayAgainKnop(new Coordinate2D(getWidth() / 2, getHeight() / 3 + 450), isaacOnTheStreets);
        PlayAgainKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(PlayAgainKnop);

        StopKnop stopKnop = new StopKnop(new Coordinate2D(getWidth() / 2 + 390, getHeight() / 3 + 400), isaacOnTheStreets);
        stopKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(stopKnop);

    }
}
