/*
 * Reconstructed from bytecode (javap -c -p). CFR 0.152 failed: "Back jump on a try block".
 */
package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;

public abstract class TlsCertificateVerifier {
    public static final dl_1 ZM = Cq0.E1(TlsCertificateVerifier.class);

    public static boolean wQ(VE ve) {
        try {
            return ls(ve.zs0(FileChannel.MapMode.READ_ONLY).order(ByteOrder.LITTLE_ENDIAN));
        }
        catch (Exception exception) {
            ZM.error("", exception);
            return false;
        }
    }

    public static boolean ls(ByteBuffer byteBuffer) {
        try {
            String string = "HASH DON'T MATCH ";
            if (byteBuffer.limit() < 22) {
                return false;
            }
            byte[] hash = new byte[20];
            byteBuffer.position(byteBuffer.limit() - 20);
            byteBuffer.get(hash);
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.limit() - 20);
            ByteBuffer byteBuffer2 = byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
            byte[] sha1;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                messageDigest.update(byteBuffer2);
                sha1 = messageDigest.digest();
            }
            catch (Exception exception) {
                sha1 = new byte[0];
            }
            if (!Arrays.equals(sha1, hash)) {
                byteBuffer2.position(0);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    messageDigest.update(byteBuffer2);
                    System.out.println(new StringBuilder(string).append(messageDigest.digest()).append(" != ").append(hash).toString());
                }
                catch (Exception exception) {
                    /* new byte[0] unused */
                }
                return false;
            }
            byteBuffer2.position(10);
            int n0 = byteBuffer2.get();
            q10_0.pB = new X90[n0];
            for (int n1 = 0; n1 < n0; n1++) {
                X90 x90 = new X90(null, (short)n1, "", 0, new short[0][0], 1);
                q10_0.pB[n1] = x90;
                ew0_0[] ew0Array = ew0_0.Fh0;
                for (int n6 = 0; n6 < ew0Array.length; n6++) {
                    ew0_0 ew0_0_ = ew0Array[n6];
                    int n8 = byteBuffer2.get();
                    x90.vf0[0][ew0_0_.Bu0] = new z3_0(x90, ew0_0_, (byte)n8);
                    z3_0 z3_0_ = x90.vf0[0][ew0_0_.Bu0];
                    for (byte n9 = 0; n9 < n8; n9++) {
                        z3_0_.ku0[n9].AJ0 = (byte)1;
                        int n10 = byteBuffer2.getInt();
                        int n11 = byteBuffer2.position();
                        z3_0_.ku0[n9].aY[0] = new NJ0((byte)0, n11, n10, false);
                        byteBuffer2.position(byteBuffer2.position() + n10);
                    }
                }
            }
            int n0b = byteBuffer2.getInt();
            for (int n1b = 0; n1b < n0b; n1b++) {
                short n3 = byteBuffer2.getShort();
                q10_0 q10_0_ = q10_0.Pt0(byteBuffer2.get());
                byte[] nameBytes = new byte[byteBuffer2.get()];
                byteBuffer2.get(nameBytes);
                String name = new String(nameBytes).trim();
                int n6 = byteBuffer2.getInt();
                byte n7 = byteBuffer2.get();
                short[][] n8 = new short[n7][];
                for (byte n9 = 0; n9 < n7; n9++) {
                    n8[n9] = new short[byteBuffer2.getShort()];
                    for (int n10 = 0; n10 < n8[n9].length; n10++) {
                        n8[n9][n10] = byteBuffer2.getShort();
                    }
                }
                byte n7b = byteBuffer2.get();
                X90 x90 = new X90(q10_0_, n3, name, n6, n8, n7b);
                if (!"UNUSED".equals(name)) {
                    q10_0_.Fk.coM4(n3, x90);
                }
                byte n3b = byteBuffer2.get();
                k2[] k2Array = new k2[n3b];
                for (byte n5 = 0; n5 < n3b; n5++) {
                    k2Array[n5] = new k2(byteBuffer2);
                }
                k2[] k2Array2 = new k2[2];
                for (int n6b = 0; n6b < n3b; n6b++) {
                    k2 k2_ = k2Array[n6b];
                    if (k2_.n7 != io_0.L0) {
                        k2Array2[k2_.n7.t8 - 1] = k2_;
                    }
                }
                x90.yh0 = k2Array2;
                for (byte n3c = 0; n3c < n7b; n3c++) {
                    ew0_0[] ew0Array = ew0_0.Fh0;
                    for (int n6c = 0; n6c < ew0Array.length; n6c++) {
                        ew0_0 ew0_0_ = ew0Array[n6c];
                        int n10 = byteBuffer2.get();
                        x90.vf0[n3c][ew0_0_.Bu0] = new z3_0(x90, ew0_0_, (byte)n10);
                        z3_0 z3_0_ = x90.vf0[n3c][ew0_0_.Bu0];
                        for (byte n12 = 0; n12 < n10; n12++) {
                            byte n13 = byteBuffer2.get();
                            z3_0_.ku0[n12].AJ0 = n13;
                            for (byte n14 = 0; n14 < n13; n14++) {
                                boolean n15 = false;
                                if (ew0_0_ == ew0_0.C1) {
                                    n15 = byteBuffer2.get() != 0;
                                }
                                byte n16 = byteBuffer2.get();
                                if (n15) {
                                    byte n17 = (byte)byteBuffer2.getInt();
                                    int n18 = byteBuffer2.getInt();
                                    int n19 = byteBuffer2.getInt();
                                    z3_0_.ku0[n12].aY[n14] = new NJ0(n15, n16, n17, n18, n19);
                                }
                                else {
                                    int n17 = byteBuffer2.getInt();
                                    int n18 = byteBuffer2.position();
                                    z3_0_.ku0[n12].aY[n14] = new NJ0(n16, n18, n17, n15);
                                    byteBuffer2.position(byteBuffer2.position() + n17);
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        catch (Exception exception) {
            ZM.error("", exception);
            return false;
        }
    }
}
