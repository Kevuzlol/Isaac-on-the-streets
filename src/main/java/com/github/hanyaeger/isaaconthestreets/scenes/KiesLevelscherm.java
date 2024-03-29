package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import static com.github.hanyaeger.isaaconthestreets.entities.knoppen.StopKnop.*;

public class KiesLevelscherm extends StaticScene {
    private IsaacOnTheStreets isaacOnTheStreets;

    public KiesLevelscherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/startscherm_isaacOnTheStreets.jpeg");
    }

    @Override
    public void setupEntities() {
        var isaacOnTheStreetsTitleText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() * 0.1),
                "Kies level"
        );
        isaacOnTheStreetsTitleText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        isaacOnTheStreetsTitleText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        isaacOnTheStreetsTitleText.setStrokeWidth(2);
        isaacOnTheStreetsTitleText.setStrokeColor(Color.BLACK);
        isaacOnTheStreetsTitleText.setFill(Color.WHITE);
        addEntity(isaacOnTheStreetsTitleText);

//level knoppen
        Level1Knop Level1Knop = new Level1Knop(new Coordinate2D(getWidth() / 2, getHeight() / 3), isaacOnTheStreets);
        Level1Knop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(Level1Knop);

        Level2Knop Level2Knop = new Level2Knop(new Coordinate2D(getWidth() / 2, getHeight() / 3 + 100), isaacOnTheStreets);
        Level2Knop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(Level2Knop);

        Level3Knop Level3Knop = new Level3Knop(new Coordinate2D(getWidth() / 2, getHeight() / 3 + 200), isaacOnTheStreets);
        Level3Knop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(Level3Knop);

        StopKnop stopKnop = new StopKnop(new Coordinate2D(getWidth() / 2 + 390, getHeight() / 3 + 400), isaacOnTheStreets);
        stopKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(stopKnop);

    }
}
