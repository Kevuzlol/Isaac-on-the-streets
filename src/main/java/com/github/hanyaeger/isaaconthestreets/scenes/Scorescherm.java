package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Scorescherm extends StaticScene {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Scorescherm(IsaacOnTheStreets isaacOnTheStreets) {
        this.isaacOnTheStreets = isaacOnTheStreets;
    }
    @Override
    public void setupScene() {
        setBackgroundAudio("");
        setBackgroundImage("");
    }

    @Override
    public void setupEntities() {

    }
}
