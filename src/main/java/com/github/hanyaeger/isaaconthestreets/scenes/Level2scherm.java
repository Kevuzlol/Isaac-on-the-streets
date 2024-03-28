package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Level2Map;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;

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
        addEntity(new HealthText(new Coordinate2D(50, 50)));

        addEntity(new Isaac(new Coordinate2D(700, 40), healthText, isaacOnTheStreets, this));

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level2Map());
    }
}

