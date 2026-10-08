package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PacketSignatureValidator extends PC {
    public static final dl_1 If;
    public static final byte[] lc;
    public static final byte[] ZL;
    public static final byte[] x40;
    public byte[] mn0;
    public byte[] Pt;
    public boolean zB0;
    public en_0 Pb;
    public en_0 g9;
    public Cipher ks0;
    public Cipher sr;
    public byte Jz;

    static {
        If = Cq0.E1(PacketSignatureValidator.class);
        lc = new byte[] { 73, 86, 68, 69, 82, 73, 86 };
        ZL = new byte[] { 75, 101, 121, 83, 97, 108, 116, 1 };
        x40 = new byte[] { 75, 101, 121, 83, 97, 108, 116, 2 };
    }

    public PacketSignatureValidator(byte b) {
        this.Pt = new byte[] { 31, -102, -128, 60, -103, 38, 10, -117, -105, -50, 2, 116, -83, 57, 39, -76 };
        this.mn0 = new byte[] { 63, 24, -15, 98, 114, 7, 68, 24, -12, 109, -111, -105, 66, -96, -2, -55 };
        this.zB0 = false;
        this.Jz = b;
        CD();
    }

    public static byte[] XH0(byte[] bArr, byte[] bArr2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr2);
            messageDigest.update(bArr);
            messageDigest.update(bArr2);
            return Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void CD() {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.ks0 = cipher;
            cipher.init(1, new SecretKeySpec(this.mn0, "AES"), new IvParameterSpec(XH0(this.mn0, lc)));
            Cipher cipher2 = Cipher.getInstance("AES/CTR/NoPadding");
            this.sr = cipher2;
            cipher2.init(2, new SecretKeySpec(this.Pt, "AES"), new IvParameterSpec(XH0(this.Pt, lc)));
            byte b = this.Jz;
            if (b == 0) {
                bz0_0 bz0_0Var = bz0_0.Xs;
                this.Pb = bz0_0Var;
                this.g9 = bz0_0Var;
            } else if (b == 2) {
                Po0 po0 = Po0.uu;
                this.Pb = po0;
                this.g9 = po0;
            } else {
                this.Pb = new bb_1(this.mn0, this.Jz);
                this.g9 = new bb_1(this.Pt, this.Jz);
            }
        } catch (Exception e) {
            If.error("", e);
        }
    }
}
