package cn.pokemmo.rom.gba.sprite;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

public class GbaMapFieldEffectSpriteManager {
    public static GbaMapFieldEffectSpriteManager Eu;
    public AG0[] F9;
    public AG0[] v50;
    public Q20 zp;
    public int Gb;
    public qa0_1 A0;
    public final HashMap p10;

    public GbaMapFieldEffectSpriteManager() {
        this.p10 = new HashMap();
    }

    public static GbaMapFieldEffectSpriteManager eE0() {
        return getInstance();
    }

    public static GbaMapFieldEffectSpriteManager getInstance() {
        if (Eu == null) {
            Eu = new GbaMapFieldEffectSpriteManager();
        }
        return Eu;
    }

    public final void zT(qa0_1 archive) {
        if (archive.rt0() != 0) {
            return;
        }
        this.A0 = archive;
        ByteOrder order = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer table = archive.VL0.slice().order(order);
        table.position(archive.EZ.V(br_2.ti0));
        table.getInt();
        table.getInt();
        table.getInt();
        int base = G90.GF0(table.getInt());
        table.getInt();
        table.getInt();
        this.Gb = G90.GF0(table.getInt());
        this.zp = new Q20(base, 1, 1, XG0.hi0, archive.VL0.slice().order(order));

        table.position(archive.EZ.V(br_2.d1));
        int[] offsets = new int[10];
        for (int index = 0; index < offsets.length; index++) {
            offsets[index] = G90.GF0(table.getInt());
            table.getInt();
        }

        Q20 sprites = new Q20(offsets[0], 4, 28, XG0.hi0, archive.VL0.slice().order(ByteOrder.LITTLE_ENDIAN));
        Wr first = new Wr(new ul_0(archive, sprites, offsets));
        Wr second = new Wr(new jc0_1(archive, sprites, offsets));
        Wr third = new Wr(new dd0_1(archive, sprites, offsets));
        Wr fourth = new Wr(new gr0(archive, sprites, offsets));
        this.F9 = new AG0[7];
        this.F9[0] = new AG0(first, 0, 0, 32, 32);
        this.F9[1] = new AG0(first, 0, 32, 32, 32);
        this.F9[4] = new AG0(first, 0, 128, 32, 32);
        this.F9[2] = new AG0(second, 0, 64, 32, 32);
        this.F9[3] = new AG0(second, 0, 96, 32, 32);
        this.F9[6] = new AG0(third, 0, 192, 32, 32);
        this.F9[5] = new AG0(fourth, 0, 160, 32, 32);

        Wr bars = new Wr(new _extends(archive, offsets));
        this.v50 = new AG0[10];
        for (int index = 0; index < this.v50.length; index++) {
            this.v50[index] = new AG0(bars, index * 16, 0, 8, 16);
        }
    }

    public final AG0 e8(int index) { return this.F9[index]; }
    public final AG0 Mj0() { return this.v50[0]; }

    public final Wr Cd0(int count) {
        return this.Td(count > 0, count > 1, count > 1, count > 2, count > 2);
    }

    public final Wr Td(boolean first, boolean second, boolean third, boolean fourth, boolean fifth) {
        int key = second ? (first ? 1 : 0) | 2 : (first ? 1 : 0);
        if (third) key |= 4;
        if (fourth) key |= 8;
        if (fifth) key |= 16;
        if (!this.p10.containsKey(key)) {
            this.p10.put(key, new Wr(new GA0((c20_0) (Object) this, first, second, third, fourth, fifth)));
        }
        return (Wr)this.p10.get(key);
    }
}
