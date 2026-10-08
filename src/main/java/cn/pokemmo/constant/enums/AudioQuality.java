package cn.pokemmo.constant.enums;

import f.*;

public enum AudioQuality {
    HIGH(37190, 37190, 37190, 37190),
    MEDIUM(37191, 37191, 37191, 37191),
    LOW(37192, 37192, 37192, 37192),
    NOTIFICATION(33387, 33387, -1, -1);

    public static final AudioQuality OH = NOTIFICATION;
    public final int q3;
    public final int fs;
    public final int C90;
    public final int PH0;

    AudioQuality(int first, int second, int third, int fourth) {
        this.q3 = first;
        this.fs = second;
        this.C90 = third;
        this.PH0 = fourth;
    }

    public f.ME toLegacy() {
        return f.ME.valueOf(name());
    }
}