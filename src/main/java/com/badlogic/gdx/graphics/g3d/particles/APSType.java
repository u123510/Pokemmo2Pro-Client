package com.badlogic.gdx.graphics.g3d.particles;

public enum APSType {
    DEFAULT(0),
    SIDE(1),
    CUSTOM(2);

    private int id;

    private APSType(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }
}
