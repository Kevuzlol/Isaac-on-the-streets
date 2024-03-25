package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Map;

public class Level1scherm extends DynamicScene implements TileMapContainer {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Level1scherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/young-wild-free.mp3");
        setBackgroundImage("backgrounds/boss_level.jpeg");
    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Map());
    }
}
