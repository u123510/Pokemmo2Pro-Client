package f;

import cn.pokemmo.constant.enums.MoveLearnerCategory;

public enum Wx0 {
    EGG_MOVES((byte) 0),
    MOVE_TUTOR((byte) 1),
    SPECIAL_MOVES((byte) 2),
    PREVO_MOVES((byte) 3),
    MOVE_LEARNER_TOOLS((byte) 4),
    SPECIAL_EGG((byte) 5),
    ON_EVOLUTION((byte) 6);

    public static final Wx0 zE0;
    public static final Wx0 Ps;
    public static final Wx0 ly0;
    public static final Wx0 Z8;
    public static final Wx0 rz;
    public static final Wx0 wy;
    public static final Wx0 const$;
    public static final Wx0[] h90;
    public static final bm0_1 NH;
    public static final Wx0[] lt0;
    public final byte Jn;

    Wx0(byte code) {
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
        for (Wx0 value : h90) {
            NH.gE0(value.Jn, value);
        }
    }

    public MoveLearnerCategory asModern() {
        return MoveLearnerCategory.valueOf(name());
    }
}