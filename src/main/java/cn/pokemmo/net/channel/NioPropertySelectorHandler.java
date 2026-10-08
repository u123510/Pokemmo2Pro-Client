package cn.pokemmo.net.channel;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class NioPropertySelectorHandler implements rx_0 {
    public static final T2 rZ = new T2();

    public NioPropertySelectorHandler() {
    }

    public final Object nx0(String value, Field field, String property, String argument) {
        if (value.trim().isEmpty()) {
            return null;
        }
        String[] parts = value.split(":");
        if (parts.length != 2) {
            throw new lc0_0("Can't transform property, must be in format \"address:port\"");
        }
        try {
            if ("*".equals(parts[0])) {
                return new InetSocketAddress(Integer.parseInt(parts[1]));
            }
            return new InetSocketAddress(InetAddress.getByName(parts[0]), Integer.parseInt(parts[1]));
        } catch (Exception exception) {
            throw new lc0_0(exception);
        }
    }
}
