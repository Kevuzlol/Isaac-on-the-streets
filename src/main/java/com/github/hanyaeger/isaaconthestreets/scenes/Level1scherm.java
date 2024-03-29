package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.StopKnop;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Level1Map;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Stopbord;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vlieg;


public class Level1scherm extends Levelscherm implements TileMapContainer {

    public Level1scherm(IsaacOnTheStreets isaacOnTheStreets) {
        super(isaacOnTheStreets);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/level1background.jpeg");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(50, 50));
        addEntity(healthText);

        addEntity(new Isaac(new Coordinate2D(700, 40), healthText, isaacOnTheStreets, this));

        Ratten ratten = new Ratten("sprites/rat_1.png", new Coordinate2D(200, 200), isaacOnTheStreets);
        addEntity(ratten);

        Vlieg vlieg = new Vlieg("sprites/vlieg.png", new Coordinate2D(200, 100), isaacOnTheStreets);
        addEntity(vlieg);

        Stopbord stopbord = new Stopbord("sprites/stopsign.png", new Coordinate2D(150, 200), isaacOnTheStreets);
        addEntity(stopbord);

        StopKnop stopKnop = new StopKnop(new Coordinate2D(getWidth() / 2 + 390, getHeight() / 3 + 400), isaacOnTheStreets);
        stopKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(stopKnop);

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level1Map());
    }
}
