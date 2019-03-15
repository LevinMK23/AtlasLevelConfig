package com.acid.atlaslevelconfig.LevelUtility;

import android.graphics.drawable.Drawable;

public class Level {
    int id;
    int points;
    String name;
    int type;
    String continent;

    public Level(int id, int points, String continent) {
        this.id = id;
        this.points = points;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getContinent() {
        return continent;
    }
}
