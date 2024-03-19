package com.github.hanyaeger.isaaconthestreets;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.isaaconthestreets.scenes.Endscherm;
import com.github.hanyaeger.isaaconthestreets.scenes.Scorescherm;
import com.github.hanyaeger.isaaconthestreets.scenes.Speelscherm;
import com.github.hanyaeger.isaaconthestreets.scenes.Startscherm;

public class IsaacOnTheStreets extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Isaac on the streets");
        setSize(new Size(800, 600));
    }


    @Override
    public void setupScenes() {
        addScene(0, new Startscherm(this));
        addScene(1, new Scorescherm(this));
        addScene(2, new Endscherm(this));
        addScene(3, new Speelscherm(this));
    }
}
