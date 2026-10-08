package cn.pokemmo.net.nio.worker;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.util.Set;

public class NetworkThroughputMonitor extends fk_1 {
    public NetworkThroughputMonitor() {
        super("Accept Dispatcher", null);
    }

    @Override
    public final void Ik0() {
        try {
            if (this.ei0.selectNow() == 0) {
                return;
            }
            Set<SelectionKey> keys = this.ei0.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isValid()) {
                    fk_1.aI(key);
                }
            }
        } catch (IOException error) {
            throw new RuntimeException(error);
        }
    }

    @Override
    public final void zu0(d50_0 connection) {
        throw new UnsupportedOperationException("This method should never be called!");
    }
}
