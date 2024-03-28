package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Level1Map;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vijand;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vlieg;


public class Level1scherm extends Levelscherm implements TileMapContainer {

    public Level1scherm(IsaacOnTheStreets isaacOnTheStreets) {
        super(isaacOnTheStreets);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/boss_level.jpeg");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(50, 50));
        addEntity(new HealthText(new Coordinate2D(50, 50)));

        addEntity(new Isaac(new Coordinate2D(700, 40), healthText, isaacOnTheStreets, this));

        Ratten ratten = new Ratten("sprites/rat_1.png", new Coordinate2D(200,200));
        addEntity(ratten);

        Vlieg vlieg = new Vlieg("sprites/vlieg.png",new Coordinate2D(200,100));
        addEntity(vlieg);

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level1Map());
    }
}
