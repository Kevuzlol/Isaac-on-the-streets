package com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Verkeersbord extends Obstakels{


    public Verkeersbord(final Coordinate2D location, final Size size, final String resource) {
        super(location, (new Size(size.width(), size.height() * 2)), resource);



    }
}
