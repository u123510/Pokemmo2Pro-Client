package f;

import cn.pokemmo.constant.enums.AudioQuality;

public enum ME {
    HIGH(37190, 37190, 37190, 37190),
    MEDIUM(37191, 37191, 37191, 37191),
    LOW(37192, 37192, 37192, 37192),
    NOTIFICATION(33387, 33387, -1, -1);

    public static final ME OH = NOTIFICATION;
    public final int q3;
    public final int fs;
    public final int C90;
    public final int PH0;

    ME(int first, int second, int third, int fourth) {
        this.q3 = first;
        this.fs = second;
        this.C90 = third;
        this.PH0 = fourth;
    }

    public AudioQuality asModern() {
        return AudioQuality.valueOf(name());
    }
}