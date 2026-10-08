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


import java.net.InetSocketAddress;

public abstract class SocketDisconnectEventListener {
    public static boolean Cd0(Class clazz) {
        Class<InetSocketAddress> clazz2 = InetSocketAddress.class;
        if (clazz == InetSocketAddress.class) {
            return true;
        }
        if (clazz != null) {
            while (clazz != null) {
                if (clazz == clazz2) {
                    return true;
                }
                if (clazz2.isInterface()) {
                    Class<?>[] classArray = clazz.getInterfaces();
                    int n = classArray.length;
                    for (int j = 0; j < n; ++j) {
                        if (!SocketDisconnectEventListener.Cd0(classArray[j])) continue;
                        return true;
                    }
                }
                clazz = clazz.getSuperclass();
            }
            return false;
        }
        return false;
    }
}

