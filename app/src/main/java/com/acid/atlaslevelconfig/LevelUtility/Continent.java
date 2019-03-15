package com.acid.atlaslevelconfig.LevelUtility;

public class Continent {
    String continent;
    boolean isPaint;

    public Continent(String continent) {
        this.continent = continent;
        isPaint = false;
    }

    public String getContinent() {
        return continent;
    }

    public boolean isPaint() {
        return isPaint;
    }
}
