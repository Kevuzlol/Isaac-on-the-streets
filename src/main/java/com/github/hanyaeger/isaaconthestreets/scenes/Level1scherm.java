package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Map;

import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;

import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vijand;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vlieg;


public class Level1scherm extends DynamicScene implements TileMapContainer {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Level1scherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }

    @Override
    public void setupScene() {
        //
        // setBackgroundAudio("audio/young-wild-free.mp3");
        setBackgroundImage("backgrounds/boss_level.jpeg");
    }

    @Override
    public void setupEntities() {
        Ratten ratten = new Ratten("sprites/rat_1.png", new Coordinate2D(100,100));
        addEntity(ratten);

        Vlieg vlieg = new Vlieg("sprites/vlieg.png",new Coordinate2D(200,100));
        addEntity(vlieg);

        var healthText = new HealthText(new Coordinate2D(100, 0));
        addEntity(healthText);

        addEntity(new Isaac(new Coordinate2D(1, 1), healthText, isaacOnTheStreets, this));

        System.out.println("ratten health " + ratten.getHealth());


    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Map());
    }



    public void createSteen(final Coordinate2D coordinate2D, final Direction direction) {
        var steen = new Steen(coordinate2D, direction);
        addEntity(steen);
    }
}
