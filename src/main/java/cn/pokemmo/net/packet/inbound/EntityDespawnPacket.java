/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.E90;
import f.EA0;
import f.GH;
import f.bi0_1;
import f.k20_0;
import f.tx_1;
import f.vl0_1;
import f.zv_2;
import java.nio.ByteBuffer;
import java.util.LinkedList;

public class EntityDespawnPacket
extends GH {
    public CH0 p4;
    public byte MR;

    public EntityDespawnPacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    @Override
    public final void Oj0() {
        EntityDespawnPacket dE = this;
        dE.p4 = dE.pE();
        dE.MR = dE.Rj.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void os0() {
        byte by;
        Object object = this.sr0().cJ0.ax(this.p4);
        if (object == null) {
            return;
        }
        if (this.MR == -1) {
            E90 e90 = this.sr0().cJ0.jB0;
            if (e90 == null) {
                return;
            }
            zv_2 zv_22 = ((bi0_1)object).ba0;
            short s = zv_22.B5;
            zv_2 zv_23 = e90.ba0;
            s = zv_23.Lq0;
            this.MR = tx_1.Zk(zv_22.Lq0, s, s, zv_23.B5);
        }
        if ((by = this.MR) < 0) return;
        if (by > 3) {
            return;
        }
        object = ((bi0_1)object).il0;
        LinkedList linkedList = ((EA0)object).BH0;
        synchronized (linkedList) {
            ((EA0)object).BH0.add(new vl0_1(by));
            return;
        }
    }
}

