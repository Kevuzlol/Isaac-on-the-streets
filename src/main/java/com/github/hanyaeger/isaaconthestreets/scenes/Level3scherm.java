package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import com.github.hanyaeger.isaaconthestreets.entities.Isaac;
import com.github.hanyaeger.isaaconthestreets.entities.knoppen.StopKnop;
import com.github.hanyaeger.isaaconthestreets.entities.mappen.Level3Map;
import com.github.hanyaeger.isaaconthestreets.entities.text.HealthText;
import com.github.hanyaeger.isaaconthestreets.entities.text.SchildText;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Kakkerlak;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Ratten;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Stopbord;
import com.github.hanyaeger.isaaconthestreets.entities.vijand.Vlieg;

public class Level3scherm extends Levelscherm implements TileMapContainer {

    public Level3scherm(IsaacOnTheStreets isaacOnTheStreets) {
        super(isaacOnTheStreets);
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/level3background.jpeg");
       // setBackgroundAudio("audio/young-wild-free.mp3");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(50, 50));
        addEntity(healthText);
        var schildText = new SchildText(new Coordinate2D(200, 50));
        addEntity(schildText);

        Isaac isaac = new Isaac(new Coordinate2D(700, 40), healthText, schildText, isaacOnTheStreets, this);
        addEntity(isaac);

        StopKnop stopKnop = new StopKnop(new Coordinate2D(getWidth() / 2 + 390, getHeight() / 3 + 400), isaacOnTheStreets);
        stopKnop.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(stopKnop);

        Stopbord stopbord1 = new Stopbord("sprites/stopsign.png", new Coordinate2D(500, 600), isaacOnTheStreets);
        addEntity(stopbord1);

        Stopbord stopbord2 = new Stopbord("sprites/stopsign.png", new Coordinate2D(170, 300), isaacOnTheStreets);
        addEntity(stopbord2);

        Vlieg vlieg = new Vlieg("sprites/vlieg.png", new Coordinate2D(200, 100), isaacOnTheStreets);
        addEntity(vlieg);







        Kakkerlak kakkerlak = new Kakkerlak("sprites/kakkerlak.png", new Coordinate2D(400, 600), isaacOnTheStreets, isaac);
        addEntity(kakkerlak);


    }

    @Override
    public void setupTileMaps() {
        addTileMap(new Level3Map());
    }
}
