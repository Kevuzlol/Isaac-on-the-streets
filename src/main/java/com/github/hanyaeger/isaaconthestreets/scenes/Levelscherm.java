package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.Steen;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Map;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;

public abstract class Levelscherm extends DynamicScene implements TileMapContainer {

    final IsaacOnTheStreets isaacOnTheStreets;

    public Levelscherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/young-wild-free.mp3");
    }

    @Override
    public void setupEntities() {

    }

    public void createSteen(final Coordinate2D coordinate2D, final Direction direction) {
        var steen = new Steen(coordinate2D, direction);
        addEntity(steen);
    }
}
