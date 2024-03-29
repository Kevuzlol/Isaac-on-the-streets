package com.github.hanyaeger.isaaconthestreets.entities.text;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SchildText extends TextEntity {
    public SchildText(Coordinate2D initialLocation){
        super(initialLocation);

        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        setFill(Color.BLUE);
    }

    public void setText(final int schild) {
        setText("" + schild);
    }
}
