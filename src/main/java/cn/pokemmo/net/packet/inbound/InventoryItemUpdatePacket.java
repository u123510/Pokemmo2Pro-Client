/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.GH;
import f.a10_0;
import f.ap_0;
import f.k20_0;
import f.tw0_0;
import java.nio.ByteBuffer;

public class InventoryItemUpdatePacket
extends GH {
    public byte xY;
    public short iE;
    public byte an0;

    public InventoryItemUpdatePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        InventoryItemUpdatePacket pV = this;
        pV.xY = pV.Rj.get();
        pV.iE = pV.Rj.getShort();
        pV.an0 = pV.Rj.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void os0() {
        Object object;
        if (this.sr0() != null && this.sr0().tp0 != null) {
            short s;
            block9: {
                InventoryItemUpdatePacket pV = this;
                object = pV.sr0().tp0;
                s = pV.xY;
                short s2 = pV.iE;
                if (s2 >= 1000) {
                    object.getClass();
                } else {
                    block8: {
                        Object object2 = object;
                        Object object3 = ((ap_0)object2).co0;
                        // MONITORENTER : object3
                        if (!((ap_0)object2).yA0[s].get(s2)) break block8;
                        // MONITOREXIT : object3
                        break block9;
                    }
                    ((ap_0)object).yA0[s].set(s2);
                    // MONITOREXIT : object3
                }
            }
            if (this.an0 >= 0) {
                InventoryItemUpdatePacket pV = this;
                byte by = pV.xY;
                s = pV.iE;
                this.sr0().tp0.iH0(by, pV.an0, s);
            }
        }
        if ((object = tw0_0.PK0) == null) return;
        short s = this.iE;
        ((a10_0)object).R60.TI0(s);
    }
}

