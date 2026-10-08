/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.BitSet;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;

/*
 * Renamed from f.k5
 */
public class SecureNonceGenerator {
    public static final MessageDigest Ic;
    public final BitSet We0;
    public final int eM0;
    public final int Tw;

    public SecureNonceGenerator(int n, int n2, BitSet bitSet) {
        this.Tw = n2;
        this.eM0 = n;
        this.We0 = bitSet;
    }

    public static BitSet Tc(byte[] byArray) {
        BitSet bitSet2 = new BitSet(byArray.length * 8);
        for (int j = 0; j < byArray.length * 8; ++j) {
            if ((byArray[j / 8] & 1 << j % 8) == 0) continue;
            bitSet2.set(j);
        }
        return bitSet2;
    }

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            messageDigest = null;
        }
        Ic = messageDigest;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zr0(byte[] byArray) {
        int n = this.Tw;
        int[] nArray = new int[n];
        int n2 = 0;
        byte by = 0;
        while (n2 < n) {
            byte[] byArray2;
            MessageDigest messageDigest = Ic;
            synchronized (messageDigest) {
                messageDigest.update(by);
                by = (byte)(by + 1);
                {
                    byArray2 = messageDigest.digest(byArray);
                }
            }
            for (int j = 0; j < byArray2.length / 4 && n2 < n; ++n2, ++j) {
                int n3;
                int n4 = 0;
                for (int k = n3 = j * 4; k < n3 + 4; ++k) {
                    n4 = n4 << 8 | byArray2[k] & 0xFF;
                }
                nArray[n2] = n4;
            }
        }
        int n5 = 0;
        while (n5 < n) {
            n2 = nArray[n5];
            if (!this.We0.get(Math.abs(n2 % this.eM0))) {
                return false;
            }
            ++n5;
        }
        return true;
    }
}

