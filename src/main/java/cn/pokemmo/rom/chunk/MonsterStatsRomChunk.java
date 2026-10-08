/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.rom.chunk;

import f.*;

import com.badlogic.gdx.graphics.Color;
import f.Cq0;
import f.be0_1;
import f.dl_1;
import f.px_1;
import java.nio.ByteBuffer;

public class MonsterStatsRomChunk
extends BaseRomResourceChunk {
    public static final dl_1 Gx = Cq0.E1(MonsterStatsRomChunk.class);
    public long Pq0;
    public long Fr0;
    public long k2;
    public long jo;
    public int gp;
    public int UU;
    public int UL;
    public float Tu0 = 1.0f;
    public float gc = 1.0f;
    public float[] Jc;
    public int CoM6;
    public int tK;
    public int vX = 0;
    public int vD0 = 515;
    public Color OK0;
    public boolean dk0;
    public boolean zr;
    public float J00;
    public String nf0;
    public String kc0;
    public int Qu0;
    public int hr;

    @Override
    public final void pH(ByteBuffer byteBuffer, int ... nArray) {
        this.a00 = byteBuffer.getInt();
    }

    @Override
    public final void vD(ByteBuffer byteBuffer) {
        long l;
        byteBuffer.getShort();
        byteBuffer.getShort();
        this.Pq0 = l = (long)byteBuffer.getInt() & 0xFFFFFFFFL;
        this.Fr0 = l = (long)byteBuffer.getInt() & 0xFFFFFFFFL;
        this.k2 = l = (long)byteBuffer.getInt() & 0xFFFFFFFFL;
        byteBuffer.getInt();
        this.jo = l = (long)byteBuffer.getInt() & 0xFFFFFFFFL;
        byteBuffer.getInt();
        byteBuffer.getShort();
        this.gp = byteBuffer.getShort() & 0xFFFF;
        this.UU = byteBuffer.getShort() & 0xFFFF;
        this.UL = byteBuffer.getShort() & 0xFFFF;
        byteBuffer.getInt();
        byteBuffer.getInt();
        long l2 = this.jo;
        this.CoM6 = (int)(l2 >> 18 & 1L);
        this.tK = (int)(l2 >> 19 & 1L);
        l = this.k2;
        this.J00 = (float)(l >> 16 & 0x1FL) / 31.0f;
        switch ((int)(l >> 6 & 3L)) {
            default: {
                break;
            }
            case 3: {
                this.vX = 0;
                break;
            }
            case 2: {
                this.vX = 1029;
                break;
            }
            case 1: {
                this.vX = 1028;
                break;
            }
            case 0: {
                this.vX = 1032;
            }
        }
        int n = (int)(l >> 4 & 1L);
        if (n != 0) {
            if (n == 1) {
                this.vD0 = 514;
            }
        } else {
            this.vD0 = 513;
        }
        if ((this.gp & 2) == 0) {
            this.Tu0 = px_1.Ei0(byteBuffer.getInt());
            this.gc = px_1.Ei0(byteBuffer.getInt());
        }
        if ((this.gp & 4) == 0) {
            px_1.dg(byteBuffer.getShort(), 3, 12);
            px_1.dg(byteBuffer.getShort(), 3, 12);
        }
        if ((this.gp & 8) == 0) {
            byteBuffer.getInt();
            byteBuffer.getInt();
        }
        if ((this.gp & 0x2000) == 8192) {
            this.Jc = new float[16];
            for (n = 0; n < 16; ++n) {
                this.Jc[n] = px_1.Ei0(byteBuffer.getInt());
            }
        }
        if ((this.gp & 0x40) == 64) {
            px_1.ep0((int)this.Pq0 >> 16 & Short.MAX_VALUE);
        }
        if ((this.gp & 0x80) == 128) {
            px_1.ep0((int)this.Pq0 >> 16 & Short.MAX_VALUE);
        }
        if ((this.gp & 0x200) == 512) {
            px_1.ep0((int)this.Fr0 & Short.MAX_VALUE);
        }
        if ((this.gp & 0x400) == 1024) {
            this.OK0 = px_1.ep0((int)this.Fr0 >> 16 & Short.MAX_VALUE);
            this.dk0 = true;
        }
    }
}

