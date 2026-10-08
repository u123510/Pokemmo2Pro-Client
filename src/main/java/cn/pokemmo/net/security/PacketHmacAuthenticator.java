package cn.pokemmo.net.security;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class PacketHmacAuthenticator {
    public final byte sG0;
    public final byte[] ee0;
    public final String xr;
    public final String Ec0;
    public final String WL0;
    public final List et0;

    public PacketHmacAuthenticator(byte type, String value) {
        this(type, value, "");
    }

    public PacketHmacAuthenticator(byte type, String value, String extra) {
        this.et0 = Collections.emptyList();
        String normalized = value.toLowerCase(Locale.ENGLISH);
        this.sG0 = type;
        this.xr = normalized;
        this.Ec0 = extra;
        this.WL0 = "";
        this.ee0 = WJ(normalized);
    }

    public PacketHmacAuthenticator(byte type, byte[] digest) {
        this.et0 = Collections.emptyList();
        this.sG0 = type;
        this.xr = "";
        this.Ec0 = null;
        this.WL0 = "";
        this.ee0 = digest;
    }

    public static byte[] WJ(String value) {
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        int offset = 0;
        int length = bytes.length;
        dl_1 ignoredState = tx_1.Sy0;

        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(bytes, offset, length);
            bytes = digest.digest();
        } catch (Exception ignored) {
            bytes = new byte[0];
        }

        return bytes;
    }

    @Override
    public final int hashCode() {
        int result = PacketHmacAuthenticator.class.hashCode() + this.sG0;
        result = Arrays.hashCode(this.ee0) + result;
        result = this.Ec0.hashCode() + result;
        return this.WL0.hashCode() + result;
    }

    @Override
    public final boolean equals(Object value) {
        if (!(value instanceof PacketHmacAuthenticator)) {
            return false;
        }

        PacketHmacAuthenticator other = (PacketHmacAuthenticator) value;
        if (this.sG0 != other.sG0) {
            return false;
        }
        if (!Arrays.equals(this.ee0, other.ee0)) {
            return false;
        }
        if (!this.Ec0.equals(other.Ec0)) {
            return false;
        }
        if (!this.WL0.equals(other.WL0)) {
            return false;
        }
        return true;
    }
}
