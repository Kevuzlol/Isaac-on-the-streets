package com.github.hanyaeger.Isaac_on_the_streets;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

public class Isaac_on_the_streets extends YaegerGame {
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

    }
}
