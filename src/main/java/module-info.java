module isaacOnTheStreets {
    requires hanyaeger;

    exports com.github.hanyaeger.isaaconthestreets;

    opens audio;
    opens backgrounds;
    opens sprites;

    exports com.github.hanyaeger.isaaconthestreets.entities;
    exports com.github.hanyaeger.isaaconthestreets.scenes;
    exports com.github.hanyaeger.isaaconthestreets.entities.knoppen;
    exports com.github.hanyaeger.isaaconthestreets.entities.mappen;
    exports com.github.hanyaeger.isaaconthestreets.entities.mappen.obstakels;
    exports com.github.hanyaeger.isaaconthestreets.entities.powerups;

}
