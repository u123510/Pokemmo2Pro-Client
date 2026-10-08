package cn.pokemmo.net.nio;

import cn.pokemmo.net.connection.NetworkConnection;
import f.Cq0;
import f.d50_0;
import f.dl_1;
import f.fk_1;
import f.wz_1;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * NIO 读写事件循环工作线程 (Read/Write Worker Thread)
 * 执行 Selector.select() 并分发 OP_READ、OP_WRITE 以及关闭连接队列
 * 原混淆类: f.ED0
 */
public class NioReadWriteWorker extends fk_1 {
    public static final dl_1 LOGGER = Cq0.E1(NioReadWriteWorker.class);
    public static final dl_1 BB = LOGGER;

    public final ArrayList<NetworkConnection> pendingCloseConnections = new ArrayList<>();
    public final ArrayList n6 = this.pendingCloseConnections;

    public NioReadWriteWorker(String name, wz_1 configuration) {
        super(name, configuration);
    }

    @Override
    public void Ik0() {
        int selected;
        try {
            selected = this.selector.select((long) this.selectTimeout);
        } catch (IOException exception) {
            throw NioReadWriteWorker.<RuntimeException>sneakyThrow(exception);
        }

        synchronized (this.pendingCloseConnections) {
            Iterator<NetworkConnection> iterator = this.pendingCloseConnections.iterator();
            while (iterator.hasNext()) {
                this.closeConnection(iterator.next());
            }
            this.pendingCloseConnections.clear();
        }

        if (selected == 0) {
            return;
        }

        Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
        while (iterator.hasNext()) {
            SelectionKey key = iterator.next();
            iterator.remove();

            if (!key.isValid()) {
                if (key.attachment() instanceof NetworkConnection) {
                    this.closeConnection((NetworkConnection) key.attachment());
                }
                continue;
            }

            int readyOps = key.readyOps();
            if (readyOps == SelectionKey.OP_READ) {
                this.readChannel(key);
            } else if (readyOps == SelectionKey.OP_WRITE) {
                this.writeChannel(key);
            } else if (readyOps == (SelectionKey.OP_READ | SelectionKey.OP_WRITE)) {
                this.readChannel(key);
                if (key.isValid()) {
                    this.writeChannel(key);
                }
            } else if (readyOps == SelectionKey.OP_CONNECT) {
                AbstractNioWorker.acceptConnection(key);
            } else if (readyOps == (SelectionKey.OP_CONNECT | SelectionKey.OP_READ)) {
                AbstractNioWorker.acceptConnection(key);
                if (key.isValid()) {
                    this.readChannel(key);
                }
            } else {
                LOGGER.info("Unsupported readyOps {}", Integer.valueOf(key.readyOps()));
            }
        }
    }

    @Override
    public void scheduleClose(NetworkConnection connection) {
        synchronized (this.pendingCloseConnections) {
            this.pendingCloseConnections.add(connection);
        }
    }

    @Override
    public void zu0(d50_0 connection) {
        scheduleClose(connection);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
