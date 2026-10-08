package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterPartyListPacket extends S20 {
    public _volatile m8;
    public boolean lP;
    public boolean Sy0;
    public VU[] OV;

    public MonsterPartyListPacket(k20_0 source, ByteBuffer data) {
        super(data, source);
    }

    public final void Oj0() {
        this.m8 = (_volatile) _volatile.zs0.BM(this.Rj.get());

        byte flags = this.Rj.get();
        this.lP = (flags & 1) != 0;
        this.Sy0 = (flags & 2) != 0;
        if (this.Sy0) {
            this.OV = new VU[0];
            return;
        }

        int count = this.Rj.get() & 0xFF;
        this.OV = new VU[count];
        for (int i = 0; i < this.OV.length; i++) {
            this.OV[i] = new VU(this.Lr0());
        }
    }

    public final void os0() {
        Ge0 game = this.sr0();
        switch (this.m8.Hf) {
            case 1: {
                if (this.lP) {
                    Mj modifier = new V70();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.BV).sH(value);
                }
                game.nl();
                return;
            }
            case 0: {
                if (this.lP) {
                    Mj modifier = new ud0_0();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.Bf0).sH(value);
                }
                return;
            }
            case 10: {
                if (this.lP) {
                    Mj modifier = new fW();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.Kb).sH(value);
                }
                return;
            }
            case 3: {
                if (this.lP) {
                    Mj modifier = new nz_1();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.JR).sH(value);
                }
                return;
            }
            case 11: {
                if (this.lP) {
                    Mj modifier = new BX();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.cN).sH(value);
                }
                return;
            }
            case 4: {
                if (this.lP) {
                    Mj modifier = new lh_0();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.kA0).sH(value);
                }
                game.nl();
                return;
            }
            case 9: {
                if (this.lP) {
                    Mj modifier = new n40_0();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.CG0).sH(value);
                }
                game.nl();
                return;
            }
            case 12: {
                if (!this.lP) {
                    return;
                }
                if (this.Sy0) {
                    game.lm0(_volatile.Nk0, null);
                    Mj marker = game.r1(_volatile.BV);
                    marker.rr0 = true;
                    marker.jf = false;
                } else {
                    Mj modifier = new jr_1();
                    game.lm0(modifier.Jn0, modifier);
                }
                for (VU value : this.OV) {
                    game.r1(_volatile.Nk0).sH(value);
                }
                game.nl();
                return;
            }
            default:
                throw new IllegalArgumentException();
        }
    }
}
