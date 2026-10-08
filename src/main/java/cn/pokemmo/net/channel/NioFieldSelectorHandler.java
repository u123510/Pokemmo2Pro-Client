/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.channel;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import f.lc0_0;
import f.rx_0;
import java.lang.reflect.Field;
import java.net.InetAddress;

public class NioFieldSelectorHandler
implements rx_0 {
    public static final Sr0 ZX = new Sr0();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object nx0(String string, Field field, String string2, String string3) {
        if (string.trim().isEmpty()) {
            return null;
        }
        try {
            return InetAddress.getByName(string);
        }
        catch (Exception exception) {
            throw new lc0_0(exception);
        }
    }
}

