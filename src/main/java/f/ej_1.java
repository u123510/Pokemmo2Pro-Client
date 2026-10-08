package f;

import cn.pokemmo.battle.BattleTurnStatusRecord;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.ej_1
 * 核心实现已迁移至 {@link cn.pokemmo.battle.BattleTurnStatusRecord}
 */
public final class ej_1 extends BattleTurnStatusRecord {
    public static final ej_1 RR;
    public static final Wr[] QC0;
    public static final int[] J4;
    public static final int[] sk0;
    public static final int[] throws$;

    public ej_1(ByteBuffer buffer) {
        super(buffer);
    }

    public ej_1(byte type, short value, short secondaryValue) {
        super(type, value, secondaryValue);
    }

    public ej_1() {
        super();
    }

    static {

        RR = new ej_1();
        QC0 = new Wr[0];
        J4 = new int[]{0, 1, 0, 2};
        sk0 = new int[]{0, 2};
        throws$ = new int[]{0, 1, 3, 2, 3, 1};
        BattleTurnStatusRecord.RR = RR;
        BattleTurnStatusRecord.QC0 = QC0;
        BattleTurnStatusRecord.J4 = J4;
        BattleTurnStatusRecord.sk0 = sk0;
        BattleTurnStatusRecord.throws$ = throws$;
    }
}
