package com.github.hanyaeger.isaaconthestreets.entities.knoppen;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.isaaconthestreets.IsaacOnTheStreets;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public  class Knop extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    public final IsaacOnTheStreets isaacOnTheStreets;

    public Knop(Coordinate2D initialLocation, String text, IsaacOnTheStreets isaacOnTheStreets) {
        super(initialLocation, text);
        this.isaacOnTheStreets = isaacOnTheStreets;
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
        isaacOnTheStreets.setActiveScene(1);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.BLACK);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
