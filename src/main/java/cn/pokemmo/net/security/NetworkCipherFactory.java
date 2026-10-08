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


import f.Cq0;
import f.dl_1;
import f.tx_1;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class NetworkCipherFactory {
    public static final dl_1 Com4 = Cq0.E1(NetworkCipherFactory.class);

    public static String w4(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(string.getBytes(StandardCharsets.UTF_8));
            return tx_1.SH0(messageDigest.digest());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            Com4.error("Exception while encoding password");
            throw new Error(noSuchAlgorithmException);
        }
    }
}

