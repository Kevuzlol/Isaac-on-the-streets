package com.github.hanyaeger.isaaconthestreets.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ScoreText extends TextEntity {
    IsaacOnTheStreets isaacOnTheStreets;

    public ScoreText(Coordinate2D initialLocation, IsaacOnTheStreets isaacOnTheStreets){
        super(initialLocation);
        this.isaacOnTheStreets = isaacOnTheStreets;

        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        setFill(Color.WHITE);
    }

    public void showScore(){
        setText("Score " + isaacOnTheStreets.getScore());
    }
}
