package f;

import cn.pokemmo.constant.enums.TimeCondition;

public enum ZJ0 {
    DAY((byte) 0),
    NIGHT((byte) 1),
    MORNING((byte) 2),
    DAY_OF_WEEK((byte) 3),
    SEASON((byte) 4),
    NOT_SEASON((byte) 5),
    EVENT_PHASE((byte) 6);

    public static final bm0_1 Cz = new bm0_1();
    public static final ZJ0 jw0 = DAY;
    public static final ZJ0 Ih0 = NIGHT;
    public static final ZJ0 Pw = MORNING;
    public static final ZJ0 zZ = EVENT_PHASE;
    public final byte fj0;

    ZJ0(byte value) {
        this.fj0 = value;
    }

    public static int qL(ZJ0 value) {
        switch (value.ordinal()) {
            case 0:
                return 1771;
            case 1:
                return 1772;
            case 2:
                return 1770;
            case 3:
                return 1769;
            case 4:
                return 1768;
            default:
                return 0;
        }
    }

    @Override
    public final String toString() {
        int textId = qL(this);
        if (textId > 0 && sm0_0.cU.l90(textId)) {
            return sm0_0.c0(textId);
        }
        switch (this) {
            case DAY:
                return "白天";
            case NIGHT:
                return "夜晚";
            case MORNING:
                return "早晨";
            case DAY_OF_WEEK:
                return "星期几";
            case SEASON:
                return "季节";
            case NOT_SEASON:
                return "非该季节";
            case EVENT_PHASE:
                return "活动阶段";
            default:
                return name();
        }
    }

    static {
        for (ZJ0 value : values()) {
            Cz.gE0(value.fj0, value);
        }
    }

    public TimeCondition asModern() {
        return TimeCondition.valueOf(name());
    }
}