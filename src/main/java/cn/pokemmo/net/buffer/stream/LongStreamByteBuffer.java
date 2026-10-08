/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import f.kd_1;
import f.sj_0;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * Renamed from f.c60
 */
public abstract class LongStreamByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient long[] Mu0;
    public long eM0 = 0L;
    public int Pb = 0;
    public boolean ao;

    public int La(int n) {
        int n2 = super.La(n);
        this.Mu0 = new long[n2];
        return n2;
    }

    public void dx0(int n) {
        this.Mu0[n] = this.eM0;
        super.dx0(n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int xh0(long l) {
        byte[] byArray = this.Ut;
        long l2 = l;
        long[] lArray = this.Mu0;
        int n = byArray.length;
        int n2 = (int)(l2 ^ l2 >>> 32) & Integer.MAX_VALUE;
        int n3 = this.Ut[n = n2 % n];
        if (n3 == 0) {
            return -1;
        }
        if (n3 == 1 && lArray[n] == l) {
            return n;
        }
        int n4 = lArray.length;
        n2 = sj_0.oC0(n4, 2, n2, 1);
        n3 = n;
        do {
            byte by;
            if ((n3 -= n2) < 0) {
                n3 += n4;
            }
            if ((by = this.Ut[n3]) == 0) {
                return -1;
            }
            if (l == this.Mu0[n3] && by != 2) return n3;
        } while (n3 != n);
        return -1;
    }

    public final int TZ(long l) {
        long l2 = l;
        int n = (int)(l2 ^ l2 >>> 32) & Integer.MAX_VALUE;
        byte[] byArray = this.Ut;
        int n2 = n % byArray.length;
        int n3 = this.Ut[n2];
        this.ao = false;
        if (n3 == 0) {
            this.ao = true;
            this.Mu0[n2] = l;
            byArray[n2] = 1;
            return n2;
        }
        if (n3 == 1 && this.Mu0[n2] == l) {
            return -n2 - 1;
        }
        int n4 = this.Mu0.length;
        n = sj_0.oC0(n4, 2, n, 1);
        int n5 = -1;
        int n6 = n2;
        while (true) {
            int n7;
            block13: {
                block14: {
                    block11: {
                        block12: {
                            block10: {
                                if (n3 == 2 && n5 == -1) {
                                    n5 = n6;
                                }
                                if ((n3 = n6 - n) < 0) {
                                    n3 += n4;
                                }
                                byte[] byArray2 = this.Ut;
                                n7 = this.Ut[n3];
                                if (n7 != 0) break block10;
                                if (n5 != -1) {
                                    this.Mu0[n5] = l;
                                    byArray2[n5] = 1;
                                } else {
                                    this.ao = true;
                                    this.Mu0[n3] = l;
                                    byArray2[n3] = 1;
                                    n5 = n3;
                                }
                                break block11;
                            }
                            if (n7 != 1 || this.Mu0[n3] != l) break block12;
                            n5 = -n3 - 1;
                            break block11;
                        }
                        if (n3 != n2) break block13;
                        if (n5 == -1) break block14;
                        this.Mu0[n5] = l;
                        this.Ut[n5] = 1;
                    }
                    return n5;
                }
                throw new IllegalStateException("No free or removed slots available. Key set full?!!");
            }
            n6 = n3;
            n3 = n7;
        }
    }

    public void writeExternal(ObjectOutput objectOutput) {
        try {
            objectOutput.writeByte(0);
            objectOutput.writeByte(0);
            objectOutput.writeFloat(this.na0);
            objectOutput.writeFloat(this.yk0);
            objectOutput.writeLong(this.eM0);
            objectOutput.writeInt(this.Pb);
        } catch (IOException exception) {
            LongStreamByteBuffer.<RuntimeException>throwUnchecked(exception);
        }
    }

    public void readExternal(ObjectInput objectInput) {
        try {
            objectInput.readByte();
            super.readExternal(objectInput);
            this.eM0 = objectInput.readLong();
            this.Pb = objectInput.readInt();
        } catch (ClassNotFoundException | IOException exception) {
            LongStreamByteBuffer.<RuntimeException>throwUnchecked(exception);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable throwable) throws T {
        throw (T)throwable;
    }
}
