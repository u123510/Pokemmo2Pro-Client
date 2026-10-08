package cn.pokemmo.constant;

import java.io.File;

public abstract class FileSystemConstants {
    public static final char z2;

    static {
        Character.toString('.');
        z2 = File.separatorChar;
    }
}
