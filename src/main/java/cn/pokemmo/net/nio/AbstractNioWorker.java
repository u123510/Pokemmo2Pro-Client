package cn.pokemmo.net.nio;

import cn.pokemmo.net.connection.NetworkConnection;
import f.Cq0;
import f.d50_0;
import f.dl_1;
import f.k6_0;
import f.lpt5__5;
import f.wz_1;
import f.BL;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * NIO 事件循环工作线程抽象基类 (Abstract NIO Worker)
 * 管理 AbstractSelector，负责连接事件的分发、数据读写和超时维护
 * 原混淆类: f.fk_1
 */
public abstract class AbstractNioWorker extends Thread {
    public static final dl_1 LOGGER = Cq0.E1(AbstractNioWorker.class);
    public static final dl_1 DC = LOGGER;

    public final AbstractSelector selector;
    public final AbstractSelector ei0;

    public final wz_1 config;
    public final wz_1 HD;

    public final Object lock = new Object();
    public final Object MK = this.lock;

    public final int sleepMillis;
    public final int Zl;

    public final int selectTimeout;
    public final int W30;

    public boolean stopped;
    public boolean t90;

    public long nextCheckTime;
    public long ih;

    public AbstractNioWorker(String threadName, wz_1 config) {
        super(threadName);
        this.sleepMillis = 1;
        this.Zl = 1;
        this.selectTimeout = 50;
        this.W30 = 50;
        this.stopped = false;
        this.t90 = false;
        this.nextCheckTime = 0L;
        this.ih = 0L;
        try {
            this.selector = SelectorProvider.provider().openSelector();
            this.ei0 = this.selector;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.config = config;
        this.HD = config;
    }

    public static void acceptConnection(SelectionKey key) {
        try {
            if (key.attachment() == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (Exception ex) {
            LOGGER.error("Error while accepting connection:", ex);
        }
    }

    public static void aI(SelectionKey v0) {
        acceptConnection(v0);
    }

    public abstract void zu0(d50_0 connection);

    public void scheduleClose(NetworkConnection connection) {
        if (connection instanceof d50_0) {
            zu0((d50_0) connection);
        }
    }

    public abstract void Ik0();

    public void selectLoop() {
        Ik0();
    }

    @Override
    public final void run() {
        while (!this.stopped && !this.t90) {
            try {
                Ik0();
                if (!(this instanceof k6_0)) {
                    try {
                        Thread.sleep((long) this.sleepMillis);
                    } catch (InterruptedException ignored) {
                    }
                }
                synchronized (this.lock) {
                    if (this.nextCheckTime < System.currentTimeMillis()) {
                        checkIdleConnections();
                        this.nextCheckTime = System.currentTimeMillis() + 60000L;
                        this.ih = this.nextCheckTime;
                    }
                }
            } catch (Exception ex) {
                LOGGER.error("Dispatch error", ex);
            }
        }
    }

    public final void readChannel(SelectionKey key) {
        SocketChannel channel = (SocketChannel) key.channel();
        NetworkConnection conn = (NetworkConnection) key.attachment();
        ByteBuffer writeBuf = conn.writeBuffer;
        ByteBuffer dupWriteBuf = conn.duplicateWriteBuffer;

        int bytesRead;
        try {
            bytesRead = channel.read(writeBuf);
        } catch (IOException e) {
            closeConnection(conn);
            return;
        }

        if (bytesRead == -1) {
            closeConnection(conn);
            return;
        }
        if (bytesRead == 0) {
            closeConnection(conn);
            LOGGER.info("Read 0 {}", conn.remoteAddress);
            return;
        }

        writeBuf.flip();
        if (!conn.isWriting && !conn.ED0) {
            conn.isWriting = true;
            conn.ED0 = true;
        }

        while (writeBuf.remaining() > 2 && writeBuf.remaining() >= writeBuf.getShort(writeBuf.position())) {
            short packetSize = 0;
            try {
                packetSize = writeBuf.getShort();
                if (packetSize > 1) {
                    packetSize = (short) (packetSize - 2);
                }
                if (packetSize < 1) {
                    NetworkConnection.LOGGER.warn("Invalid packet size from client : {} packet size: {} real size:{}",
                            new Object[]{conn, Short.valueOf(packetSize), Integer.valueOf(writeBuf.remaining())});
                    closeConnection(conn);
                    break;
                }
                dupWriteBuf.limit(writeBuf.position() + packetSize);
                dupWriteBuf.position(writeBuf.position());
                writeBuf.position(writeBuf.position() + packetSize);
                if (!conn.processIncomingData(dupWriteBuf)) {
                    closeConnection(conn);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                NetworkConnection.LOGGER.warn("Error on parsing input from client1 : {} packet size: {} real size:{}",
                        new Object[]{conn, Short.valueOf(packetSize), Integer.valueOf(writeBuf.remaining()), e});
                closeConnection(conn);
                break;
            } catch (IllegalArgumentException e) {
                NetworkConnection.LOGGER.warn("Error on parsing input from client2 : {} packet size: {} real size:{}",
                        new Object[]{conn, Short.valueOf(packetSize), Integer.valueOf(writeBuf.remaining()), e});
                closeConnection(conn);
                break;
            } catch (Exception e) {
                NetworkConnection.LOGGER.error("Error on parsing input from client3 : {} packet size: {} real size:{}",
                        new Object[]{conn, Short.valueOf(packetSize), Integer.valueOf(writeBuf.remaining()), e});
                closeConnection(conn);
                break;
            }
        }

        if (writeBuf.hasRemaining()) {
            conn.writeBuffer.compact();
        } else {
            writeBuf.clear();
        }
    }

    public final void CC0(SelectionKey v1) {
        readChannel(v1);
    }

    public final void writeChannel(SelectionKey key) {
        SocketChannel channel = (SocketChannel) key.channel();
        NetworkConnection conn = (NetworkConnection) key.attachment();
        ByteBuffer readBuf = conn.readBuffer;

        if (readBuf.hasRemaining()) {
            try {
                if (channel.write(readBuf) == 0) {
                    return;
                }
            } catch (IOException e) {
                closeConnection(conn);
                return;
            }
            if (readBuf.hasRemaining()) {
                return;
            }
        }

        while (true) {
            readBuf.clear();
            boolean notDone;
            try {
                notDone = !conn.writeOutgoingData(readBuf);
            } catch (StackOverflowError | Exception e) {
                LOGGER.error("Write Error: {}", conn.remoteAddress, e);
                break;
            }
            if (notDone) {
                break;
            }
            try {
                if (channel.write(readBuf) == 0) {
                    return;
                }
            } catch (IOException e) {
                closeConnection(conn);
                return;
            }
            if (readBuf.hasRemaining()) {
                return;
            }
        }

        readBuf.limit(0);
        synchronized (conn.closeLock) {
            if (!conn.hasPendingWrites()) {
                key.interestOps(key.interestOps() & ~SelectionKey.OP_WRITE);
            }
        }
    }

    public final void xT(SelectionKey v1) {
        writeChannel(v1);
    }

    public final void closeConnection(NetworkConnection conn) {
        synchronized (conn.closeLock) {
            if (conn.closed || conn.volatile$) {
                LOGGER.error("Closing connection {} Fail", conn.remoteAddress);
                return;
            }
            try {
                if (conn.socketChannel != null && conn.socketChannel.isOpen()) {
                    conn.socketChannel.close();
                }
                SelectionKey key = conn.selectionKey != null ? conn.selectionKey : conn.ek0;
                if (key != null) {
                    key.attach(null);
                    key.cancel();
                }
                conn.closed = true;
                conn.volatile$ = true;
            } catch (IOException e) {
                NetworkConnection.LOGGER.warn(e.getMessage());
            }
        }

        if (this.config instanceof lpt5__5) {
            lpt5__5 conf = (lpt5__5) this.config;
            d50_0 dConn = conn instanceof d50_0 ? (d50_0) conn : null;
            if (dConn != null) {
                conf.Com4.schedule(new BL(dConn), 0L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void SM(d50_0 v1) {
        closeConnection(v1);
    }

    public final void closeAll() {
        synchronized (this.lock) {
            Iterator<SelectionKey> it = this.selector.keys().iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                if (key.attachment() instanceof NetworkConnection) {
                    ((NetworkConnection) key.attachment()).disconnect();
                }
            }
        }
    }

    public final void B0() {
        closeAll();
    }

    public final void checkIdleConnections() {
        try {
            Iterator<SelectionKey> it = this.selector.keys().iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                if (key.isValid() && key.attachment() instanceof NetworkConnection) {
                    ((NetworkConnection) key.attachment()).checkIdle();
                }
            }
        } catch (ConcurrentModificationException e) {
            LOGGER.error("disconnectTask Error", e);
        }
    }

    public final void nm0() {
        checkIdleConnections();
    }
}
