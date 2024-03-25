package com.github.hanyaeger.isaaconthestreets.entities.mappen;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Muren;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Verkeersbord;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels.Box;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.CrystalMeth;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Hartje;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Heroine;
import com.github.hanyaeger.isaaconthestreets.entities.powerups.Speed;

public class Map extends TileMap {
    @Override
    public void setupEntities() {
        addEntity(1, Muren.class, "sprites/wall.jpeg");
        addEntity(2, Box.class, "sprites/box.jpeg");
        addEntity(3, Verkeersbord.class, "sprites/stopsign2.png");

        addEntity(10, Hartje.class, "sprites/hartje.png");
        addEntity(11, Speed.class, "sprites/pil.jpeg");
        addEntity(12, CrystalMeth.class, "sprites/crystal_meth.png");
        addEntity(13, Heroine.class, "sprites/naald.jpeg");

    }

    @Override
    public int[][] defineMap() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
    }
}
