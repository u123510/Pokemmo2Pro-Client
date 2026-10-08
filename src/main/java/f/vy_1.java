package f;

import cn.pokemmo.constant.enums.AudioChannelType;

public enum vy_1 {
    PJ0,
    C00,
    AZ,
    COM5;

    public AudioChannelType asModern() {
        return AudioChannelType.valueOf(name());
    }
}