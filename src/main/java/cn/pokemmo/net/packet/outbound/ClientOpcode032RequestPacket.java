/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ClientOpcode032RequestPacket
extends RE {
    private static final java.lang.reflect.Field HE_FIELD;
    static {
        java.lang.reflect.Field f = null;
        try {
            f = qt0_0.class.getField("He");
        }
        catch (Exception exception) {
            f = null;
        }
        HE_FIELD = f;
    }

    public ClientOpcode032RequestPacket() {
        super(32);
    }

    @Override
    public final void ig0(k20_0 k20_0_, ByteBuffer byteBuffer) {
        long l = System.currentTimeMillis();
        Yo0 yo0 = tw0_0.iE;
        yo0.pJ0 = 0;
        yo0.YH = 0.0;
        int[] nArray = new int[10];
        int n = 0;
        synchronized (yo0.Ce) {
            qt0_0 qt0_0_ = new qt0_0(yo0.Ce, yo0.Ce);
            while (qt0_0_.hasNext()) {
                qt0_0_.aA();
                YI he = yo0.Ce;
                try {
                    he = (YI)HE_FIELD.get(qt0_0_);
                }
                catch (Exception exception) {
                    he = yo0.Ce;
                }
                if (System.currentTimeMillis() - he.Mu0[qt0_0_.gH0] > 180000L) {
                    qt0_0_.remove();
                }
            }
            YI yi = yo0.Ce;
            int n10 = yi.Rv;
            if (n10 > 150) {
                long[] lArray = new long[n10];
                byte[] ut = yi.Ut;
                int n13 = 0;
                for (int n12 = ut.length - 1; n12 >= 0; n12--) {
                    if (ut[n12] == 1) {
                        lArray[n13++] = yi.Mu0[n12];
                    }
                }
                Arrays.sort(lArray);
                for (long l2 = 0L; l2 < 150L; l2++) {
                    int n14 = yi.xh0(lArray[n10 - 1 - (int)l2]);
                    int n15 = n14 >= 0 ? yi.v50[n14] : yi.Pb;
                    int n16 = n + 1;
                    if (nArray.length <= n16) {
                        nArray = new int[Math.max(nArray.length * 2, n16)];
                    }
                    nArray[n] = n15;
                    n = n16;
                }
            }
            else {
                int[] nArray2 = new int[n10];
                byte[] ut = yi.Ut;
                int n13 = 0;
                for (int n12 = ut.length - 1; n12 >= 0; n12--) {
                    if (ut[n12] == 1) {
                        nArray2[n13++] = yi.v50[n12];
                    }
                }
                if (n10 > 10) {
                    nArray = new int[Math.max(20, n10)];
                }
                System.arraycopy(nArray2, 0, nArray, n, n10);
            }
        }
        int[] nArray2 = new int[n];
        if (n != 0) {
            System.arraycopy(nArray, 0, nArray2, 0, n);
        }
        ld_0 ld_0_ = new ld_0();
        for (int n6 = n - 1; n6 >= 0; n6--) {
            ld_0_.Vn(nArray2[n6]);
        }
        yo0.YH = (double)ld_0_.Rv;
        int[] nArray3 = ld_0_.toArray();
        for (int n9 = 0; n9 < nArray3.length; n9++) {
            yo0.pJ0 += nArray3[n9];
        }
        int n5 = ld_0_.Rv;
        if (n5 > 0) {
            int n6 = yo0.pJ0;
            if (n6 > 0) {
                yo0.pJ0 = n6 / n5;
            }
        }
        yo0.u = 0;
        n5 = yo0.pJ0;
        if (n5 > 150) {
            n5 = n5 / 15;
            yo0.pJ0 = n5;
            yo0.u = n5;
            if (n5 > 100) {
                yo0.u = 100;
            }
        }
        yo0.RB0 = n;
        if (n < 30) {
            yo0.vl0 = -1;
            yo0.dH0 = -1;
            yo0.z00 = -1;
            yo0.h40 = -1;
        }
        else {
            double d = yo0.YH / (double)n;
            double d2 = d * 100.0;
            yo0.vl0 = (byte)(100.0 - d2);
            if (yo0.vl0 < 10) {
                yo0.vl0 = (byte)Math.min(d * 0.1, 10.0);
            }
            double d3 = (double)yo0.Wi / (double)yo0.dq0 * 100.0;
            yo0.dH0 = (byte)d3;
            yo0.z00 = (byte)((double)yo0.NuL / d * 100.0);
            if (yo0.u < 1) {
                yo0.h40 = yo0.vl0;
            }
            else {
                double d4 = 0.0;
                for (int n8 = 0; n8 < n; n8++) {
                    int n9 = nArray2[n8];
                    int n11 = 0;
                    for (int n12 = 0; n12 < n; n12++) {
                        int n13 = nArray2[n12];
                        if (n13 == n9 || (n13 < n9 + yo0.u && n13 > n9 - yo0.u)) {
                            n11++;
                        }
                    }
                    d4 = Math.max(d4, (double)n11);
                }
                yo0.h40 = (byte)(d4 / (double)yo0.RB0 * 100.0);
            }
        }
        yo0.dq0 = 0;
        yo0.NuL = 0;
        yo0.Wi = 0;
        byte[] byArray = new byte[4];
        byArray[0] = yo0.vl0;
        byArray[1] = yo0.dH0;
        byArray[2] = yo0.z00;
        byArray[3] = yo0.h40;
        int flags = 0;
        if (Gf.TJ() != 1118) {
            flags = Integer.MIN_VALUE;
        }
        BR br = tw0_0.rl;
        if (br != null && br.sf) {
            flags |= 0x40000000;
        }
        if (jn_0.qD) {
            flags |= 0x100000;
        }
        if (!ea0_1.oR) {
            if (Gf.dH()) {
                flags |= 0x10000;
            }
            if (Gf.Vb()) {
                flags |= 0x20000;
            }
            if (Gf.pH()) {
                flags |= 0x80000;
            }
            if (Gf.mb()) {
                flags |= 0x40000;
            }
        }
        byteBuffer.putInt(flags);
        byteBuffer.put(byArray[0]);
        byteBuffer.put(byArray[1]);
        byteBuffer.put(byArray[2]);
        byteBuffer.put(byArray[3]);
        byteBuffer.putShort((short)Math.min(tw0_0.iE.RB0, 32767));
        byteBuffer.putLong(l);
        byteBuffer.putLong(System.nanoTime());
        byte[] localAddr;
        Socket socket = k20_0_.vD.socket();
        if (socket != null && !socket.isClosed()) {
            localAddr = tx_1.PrN(socket.getLocalAddress());
        }
        else {
            localAddr = tx_1.PrN((InetAddress)null);
        }
        byteBuffer.put(localAddr);
        Ge0 ge0 = k20_0_.uH0;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = Collections.emptyList().iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = null;
            if (object2 == null) {
                if (ge0.cb0.add(object2)) {
                    arrayList.add(object2);
                }
            }
            else {
                throw new ClassCastException();
            }
        }
        byteBuffer.put((byte)arrayList.size());
        if (arrayList.iterator().hasNext()) {
            throw new ClassCastException();
        }
    }
}
