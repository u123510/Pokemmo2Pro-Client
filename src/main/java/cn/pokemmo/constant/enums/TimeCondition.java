package cn.pokemmo.constant.enums;

import f.*;

public enum TimeCondition {
    DAY((byte) 0),
    NIGHT((byte) 1),
    MORNING((byte) 2),
    DAY_OF_WEEK((byte) 3),
    SEASON((byte) 4),
    NOT_SEASON((byte) 5),
    EVENT_PHASE((byte) 6);

    public static final bm0_1 Cz = new bm0_1();
    public static final TimeCondition jw0 = DAY;
    public static final TimeCondition Ih0 = NIGHT;
    public static final TimeCondition Pw = MORNING;
    public static final TimeCondition zZ = EVENT_PHASE;
    public final byte fj0;

    TimeCondition(byte value) {
        this.fj0 = value;
    }

    public static int qL(TimeCondition value) {
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
        for (TimeCondition value : values()) {
            Cz.gE0(value.fj0, value);
        }
    }

    public f.ZJ0 toLegacy() {
        return f.ZJ0.valueOf(name());
    }
}