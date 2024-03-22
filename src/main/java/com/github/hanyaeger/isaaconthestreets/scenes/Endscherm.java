package com.github.hanyaeger.isaaconthestreets.scenes;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;

public class Endscherm extends DynamicScene {
    private IsaacOnTheStreets isaacOnTheStreets;

    public Endscherm(IsaacOnTheStreets isaacOnTheStreets) {
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
