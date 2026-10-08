package cn.pokemmo.ui.input;

public class LwjglMouseSystemInitializer {
    public static int Fz0;

    static {
        System.setProperty("org.lwjgl.input.Mouse.allowNegativeMouseCoords", "true");
    }

    public LwjglMouseSystemInitializer() {
    }
}
