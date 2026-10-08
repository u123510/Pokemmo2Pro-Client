/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import f.CH0;
import f.Cq0;
import f.E90;
import f.GH;
import f.MO;
import f.RL0;
import f.U8;
import f.bi0_1;
import f.cd0_2;
import f.d40;
import f.ec0_1;
import f.g70_0;
import f.hu0;
import f.k20_0;
import f.lm_1;
import f.tw0_0;
import f.yt_1;
import f.zv_2;
import java.nio.ByteBuffer;

/*
 * Renamed from f.b0
 */
public class TradeCompletePacket
extends GH {
    public CH0 Eo;
    public byte Lj;
    public short Uk;
    public byte c0;
    public byte Pu;
    public byte ze;
    public byte AB0;
    public byte Cv0 = (byte)-1;
    public byte Zv = (byte)-1;
    public zv_2 g3;
    public short b20;
    public byte Oq0;
    public boolean Y10;
    public boolean ya = false;
    public boolean hl = false;
    public boolean Vg = false;
    public boolean gr0 = false;
    public boolean Ep = false;
    public boolean y8 = false;
    public short AP = (short)-1;
    public cd0_2 M70 = null;
    public short G60 = (short)-1;
    public byte tr0;
    public boolean fM0;
    public float hp0 = 1.0f;
    public d40 zK = null;

    public TradeCompletePacket(k20_0 k20_02, ByteBuffer byteBuffer) {
        super(k20_02, byteBuffer);
    }

    static {
        Cq0.E1(TradeCompletePacket.class);
    }

    @Override
    public final void Oj0() {
        this.Eo = this.pE();
        this.Lj = this.Rj.get();
        this.Uk = this.Rj.getShort();
        this.c0 = this.Rj.get();
        this.Pu = this.Rj.get();
        this.ze = this.Rj.get();
        this.AB0 = this.Rj.get();
        short s = this.Rj.get();
        byte by = this.Rj.get();
        byte by2 = this.Rj.get();
        short s2 = this.Rj.getShort();
        short s3 = this.Rj.getShort();
        byte by3 = this.Rj.get();
        byte by4 = this.Rj.get();
        byte by5 = (byte)(by4 & 3);
        boolean bl = (by4 & 8) != 0;
        this.g3 = new zv_2((byte)s, by, by2, bl, s2, s3, by3, by5);
        s = this.Rj.getShort();
        if ((s & 1) != 0) {
            this.b20 = this.Rj.getShort();
            this.Oq0 = this.Rj.get();
            this.Y10 = (this.Rj.get() & 0xFF) != 0;
        }
        this.ya = (s & 2) != 0;
        this.hl = (s & 0x40) != 0;
        if ((s & 4) != 0) {
            this.Cv0 = this.Rj.get();
            this.Zv = this.Rj.get();
        }
        this.Vg = (s & 8) != 0;
        this.gr0 = (s & 0x10) != 0;
        this.Ep = (s & 0x20) != 0;
        this.y8 = (s & 0x80) != 0;
        if ((s & 0x100) != 0) {
            this.AP = this.Rj.getShort();
        }
        if ((s & 0x200) != 0) {
            this.M70 = this.h80();
        }
        if ((s & 0x400) != 0) {
            this.G60 = this.Rj.getShort();
            this.tr0 = this.Rj.get();
        }
        if ((s & 0x1000) != 0) {
            this.hp0 = this.Rj.getFloat();
        }
        if ((s & 0x2000) != 0) {
            this.zK = new d40(this.Rj.get(), this.ki());
        }
        this.fM0 = (s & 0x800) != 0;
    }

    @Override
    public final void os0() {
        if (this.sr0() != null && this.sr0().cJ0 != null) {
            float f;
            short s;
            MO mO;
            yt_1 world = this.sr0().cJ0;
            CH0 id = this.Eo;
            byte by = this.Lj;
            short s2 = this.Uk;
            byte by2 = this.c0;
            byte by3 = this.Pu;
            byte by4 = this.ze;
            byte by5 = this.AB0;
            byte by6 = this.Cv0;
            byte by7 = this.Zv;
            zv_2 zv_22 = this.g3;
            short s3 = this.b20;
            byte by8 = this.Oq0;
            boolean bl = this.Y10;
            boolean bl2 = this.ya;
            boolean bl3 = this.Vg;
            boolean bl4 = this.hl;
            cd0_2 cd0_22 = this.M70;
            short s4 = this.G60;
            byte by9 = this.tr0;
            world.getClass();
            zv_22.OL0();
            bi0_1 bi0_12 = (bi0_1)world.pn0.get(id);
            if (bi0_12 == null) {
                if (bl2) {
                    mO = new U8(id, by, s2, by2, by3, by4, by5, by6, by7, zv_22, s3, by8, bl, bl3, cd0_22, s4);
                } else if (bl4) {
                    mO = new hu0(id, by, s2, by2, by3, by4, by5, by6, by7, zv_22, s3, by8, bl, bl3, cd0_22, s4);
                } else {
                    mO = new MO(id, by, s2, by2, by3, by4, by5, by6, by7, zv_22, s3, by8, bl, bl3, cd0_22, s4);
                }
                world.pn0.put(id, mO);
            } else if (bi0_12 instanceof MO) {
                mO = (MO)bi0_12;
                bi0_12.ba0.V2(zv_22);
                mO.transient$ = cd0_22;
                mO.f8 = s4;
                ((MO)bi0_12).xq = by9;
            } else {
                mO = null;
            }
            if (mO == null) {
                return;
            }
            mO.O90 = this.gr0;
            E90 manager = this.sr0().cJ0.jB0;
            if (manager == null) {
                return;
            }
            if (this.Ep) {
                manager.sE0(mO, true);
            }
            if (this.y8) {
                RL0 rl0 = RL0.mD;
                bi0_1 bi0_13 = this.sr0().cJ0.ax(id);
                if (bi0_13 != null) {
                    bi0_13.PC0(rl0);
                    g70_0 g70 = (g70_0)tw0_0.Tl0.B1.get(id);
                    if (g70 != null) {
                        g70.D70(rl0);
                    }
                }
            }
            if ((s = this.AP) > 0) {
                mO.ql(s, (byte)0, false);
            }
            if ((f = this.hp0) != 1.0f) {
                mO.coM6 = f;
            }
            mO.I80 = this.fM0;
            d40 d402 = this.zK;
            if (d402 != null) {
                mO.cs0 = new ec0_1(d402.Lpt5, d402.Xb);
                mO.hj = new lm_1(mO);
            } else {
                mO.cs0 = null;
                mO.hj = mO.at();
            }
            return;
        }
    }
}
