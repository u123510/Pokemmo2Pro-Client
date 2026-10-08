package cn.pokemmo.battle;

import f.HU;
import f.fa_0;
import f.ib0_0;
import f.l4_0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * 战斗动作/效果载荷数据 (Battle Action Payload)
 * <p>
 * 原始混淆类: {@code f.M3}
 */
public class BattleActionPayload {
    public static final byte[] f70 = new byte[0];
    public byte V1;
    public ib0_0 throws$;
    public byte[] iQ;

    public BattleActionPayload(ByteBuffer data) {
        this.V1 = data.get();
        this.throws$ = ib0_0.NV(data.get());
        data.get();
        fa_0 entries = new fa_0();
        for (int index = 0; index < 3; index++) {
            byte value = data.get();
            if (value != 0) {
                entries.nf0(value);
            }
        }
        this.iQ = entries.Jh0();
        data.position(data.position() + 2);
        this.cC();
    }

    public BattleActionPayload(ib0_0 type, byte[] values) {
        this.V1 = 0;
        this.throws$ = type;
        this.iQ = values;
        this.cC();
    }

    public HU zB0() {
        return (HU) l4_0.Py0.Lk0.BM(this.V1);
    }

    public void cC() {
        Arrays.sort(this.iQ);
    }
}
