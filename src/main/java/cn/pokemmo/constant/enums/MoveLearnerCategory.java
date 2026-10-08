package cn.pokemmo.constant.enums;

import f.*;

public enum MoveLearnerCategory {
    EGG_MOVES((byte) 0),
    MOVE_TUTOR((byte) 1),
    SPECIAL_MOVES((byte) 2),
    PREVO_MOVES((byte) 3),
    MOVE_LEARNER_TOOLS((byte) 4),
    SPECIAL_EGG((byte) 5),
    ON_EVOLUTION((byte) 6);

    public static final MoveLearnerCategory zE0;
    public static final MoveLearnerCategory Ps;
    public static final MoveLearnerCategory ly0;
    public static final MoveLearnerCategory Z8;
    public static final MoveLearnerCategory rz;
    public static final MoveLearnerCategory wy;
    public static final MoveLearnerCategory const$;
    public static final MoveLearnerCategory[] h90;
    public static final bm0_1 NH;
    public static final MoveLearnerCategory[] lt0;
    public final byte Jn;

    MoveLearnerCategory(byte code) {
        this.Jn = code;
    }

    static {
        zE0 = EGG_MOVES;
        Ps = MOVE_TUTOR;
        ly0 = SPECIAL_MOVES;
        Z8 = PREVO_MOVES;
        rz = MOVE_LEARNER_TOOLS;
        wy = SPECIAL_EGG;
        const$ = ON_EVOLUTION;
        lt0 = values();
        h90 = values();
        NH = new bm0_1();
        for (MoveLearnerCategory value : h90) {
            NH.gE0(value.Jn, value);
        }
    }

    public f.Wx0 toLegacy() {
        return f.Wx0.valueOf(name());
    }
}