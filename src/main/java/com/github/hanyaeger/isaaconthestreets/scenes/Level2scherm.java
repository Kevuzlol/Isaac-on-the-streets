package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.StopKnop;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Level2Map;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.text.SchildText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;

public class Level2scherm extends Levelscherm implements TileMapContainer {

    public Level2scherm(IsaacOnTheStreets isaacOnTheStreets) {
        super(isaacOnTheStreets);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/level2background.jpeg");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(50, 50));
        addEntity(healthText);
        var schildText = new SchildText(new Coordinate2D(200, 50));
        addEntity(schildText);

        addEntity(new Isaac(new Coordinate2D(700, 40), healthText, schildText, isaacOnTheStreets, this));

        Ratten rat1 = new Ratten("sprites/rat_1.png", new Coordinate2D(450,400),isaacOnTheStreets);
        Ratten rat2 = new Ratten("sprites/rat_1.png", new Coordinate2D(400,500),isaacOnTheStreets);
        Ratten rat3 = new Ratten("sprites/rat_1.png", new Coordinate2D(400,600),isaacOnTheStreets);

        addEntity(rat1);
        addEntity(rat2);
        addEntity(rat3);

        StopKnop stopKnop = new StopKnop(new Coordinate2D(getWidth() / 2 + 390, getHeight() / 3 + 400), isaacOnTheStreets);
        stopKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(stopKnop);

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level2Map());
    }
}

