package cn.pokemmo.rom.nds.model;

import f.Ts;
import f.tx_1;
import f.v50_0;
import f.w7_0;
import f.wm_1;
import java.nio.ByteBuffer;

public class NitroHeaderSubmeshTable {
    public final w7_0 com1;

    public NitroHeaderSubmeshTable(Ts v1) {
        this.com1 = new w7_0();
        wm_1 wm = v1.Vd0();
        ByteBuffer buf = wm.AO();
        tx_1.iY(buf, 705180424, 536927222, 1187006320);
        buf.position(buf.getInt() - wm.O7);
        for (int i = 0; i < 8; i++) {
            short s = (short) buf.getInt();
            int i5 = buf.getInt();
            this.com1.coM4(s, new v50_0(s, i5, wm));
        }
    }

    public v50_0 B5(short i1) {
        return (v50_0) this.com1.f5(i1);
    }
}
