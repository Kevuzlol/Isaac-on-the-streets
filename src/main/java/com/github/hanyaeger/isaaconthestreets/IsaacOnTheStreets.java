package com.github.hanyaeger.isaaconthestreets;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.isaaconthestreets.scenes.*;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class IsaacOnTheStreets extends YaegerGame {

    private int score = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Isaac on the streets");
        setSize(new Size(1024, 1024));
    }


    @Override
    public void setupScenes() {
        addScene(0, new Startscherm(this));
        addScene(1, new KiesLevelscherm(this));
        addScene(2, new Scorescherm(this));
        addScene(3, new Endscherm(this));
        addScene(4, new Level1scherm(this));
        addScene(5, new Level2scherm(this));
        addScene(6, new Level3scherm(this));
    }

    public int getScore(){
        return score;
    }

    public void addScore(int scoreToevoegen){
        this.score += scoreToevoegen;
    }
}
