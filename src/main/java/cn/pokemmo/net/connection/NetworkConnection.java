package cn.pokemmo.net.connection;

import f.Cq0;
import f.LY;
import f.dl_1;
import f.fk_1;
import f.k6_0;
import f.r80;
import f.ineter.pm_1;

import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/**
 * 物理网络连接抽象基类 (Network Connection)
 * 管理底层 SocketChannel、24KB 读写双缓冲与 NIO SelectionKey
 * 原混淆类: f.d50_0
 */
public abstract class NetworkConnection {
    public static final dl_1 LOGGER = Cq0.E1(NetworkConnection.class);
    public static final dl_1 bF0 = LOGGER;
    public static final pm_1 DEFAULT_ADDRESS = r80.Aq0.Iv.iG0;
    public static final pm_1 Bw = DEFAULT_ADDRESS;

    /**
     * 底层 Socket 通道
     */
    public final SocketChannel socketChannel;
    public final SocketChannel vD;

    /**
     * 所属 NIO Worker 线程
     */
    public final fk_1 nioWorker;
    public final fk_1 Gn;

    /**
     * NIO 选择键
     */
    public SelectionKey selectionKey;
    public SelectionKey ek0;

    /**
     * 连接是否已关闭
     */
    public boolean closed;
    public boolean volatile$;

    /**
     * 关闭与同步互斥锁
     */
    public final Object closeLock = new Object();
    public final Object wK0 = this.closeLock;

    /**
     * 24KB 读缓冲区
     */
    public final ByteBuffer readBuffer;
    public final ByteBuffer jj;

    /**
     * 24KB 写缓冲区
     */
    public final ByteBuffer writeBuffer;
    public final ByteBuffer br;

    /**
     * 写缓冲副本 (用于并发或分片写入)
     */
    public final ByteBuffer duplicateWriteBuffer;
    public final ByteBuffer jY;

    /**
     * 远端 IP 地址
     */
    public final LY remoteAddress;
    public final LY ZM;

    /**
     * 写入状态标识
     */
    public boolean isWriting;
    public boolean ED0;

    /**
     * 连接建立时间戳
     */
    public final long createTime;
    public final long eq;

    public NetworkConnection(SocketChannel socketChannel, fk_1 nioWorker) {
        this.isWriting = false;
        this.ED0 = false;
        this.createTime = System.currentTimeMillis();
        this.eq = this.createTime;
        this.socketChannel = socketChannel;
        this.vD = socketChannel;
        this.nioWorker = nioWorker;
        this.Gn = nioWorker;

        ByteBuffer allocate = ByteBuffer.allocate(24576);
        this.readBuffer = allocate;
        this.jj = allocate;
        allocate.flip();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.readBuffer.order(byteOrder);

        ByteBuffer allocate2 = ByteBuffer.allocate(24576);
        this.writeBuffer = allocate2;
        this.br = allocate2;
        allocate2.order(byteOrder);

        ByteBuffer duplicate = this.writeBuffer.duplicate();
        this.duplicateWriteBuffer = duplicate;
        this.jY = duplicate;
        duplicate.order(byteOrder);

        if (socketChannel != null && socketChannel.socket() != null && socketChannel.socket().getInetAddress() != null) {
            Socket socket = socketChannel.socket();
            this.remoteAddress = LY.Fu0(socket.getInetAddress());
            this.ZM = this.remoteAddress;
            LY.Fu0(socket.getLocalAddress());
        } else {
            this.remoteAddress = DEFAULT_ADDRESS;
            this.ZM = DEFAULT_ADDRESS;
        }
    }

    /**
     * 注册/启用写就绪监听 (OP_WRITE)
     */
    public final void enableWriteInterest() {
        SelectionKey key = this.selectionKey != null ? this.selectionKey : this.ek0;
        if (key != null && key.isValid()) {
            int interestOps = key.interestOps();
            if ((interestOps & SelectionKey.OP_WRITE) == 0) {
                key.interestOps(interestOps | SelectionKey.OP_WRITE);
                if (this.nioWorker instanceof k6_0) {
                    key.selector().wakeup();
                }
            }
        }
    }

    public final void ht0() {
        enableWriteInterest();
    }

    /**
     * 解包并处理接收到的字节流
     */
    public boolean processIncomingData(ByteBuffer buffer) {
        return L30(buffer);
    }

    public boolean L30(ByteBuffer byteBuffer) {
        return false;
    }

    /**
     * 组装待发送的出站字节流
     */
    public boolean writeOutgoingData(ByteBuffer buffer) {
        return Sk(buffer);
    }

    public boolean Sk(ByteBuffer byteBuffer) {
        return false;
    }

    /**
     * 检查是否有待发送的数据
     */
    public boolean hasPendingWrites() {
        return fc0();
    }

    public boolean fc0() {
        return false;
    }

    /**
     * 连接被断开/关闭时的回调
     */
    public void onClosed() {
        dg0();
    }

    public void dg0() {
    }

    /**
     * 主动断开物理连接
     */
    public void disconnect() {
        Zw();
    }

    public void Zw() {
    }

    /**
     * 空闲/心跳超时检查
     */
    public void checkIdle() {
        ij0();
    }

    public void ij0() {
    }

    /**
     * 异步请求关闭当前连接
     */
    public final void close() {
        synchronized (this.closeLock) {
            if (!this.closed && !this.volatile$) {
                if (this.nioWorker != null) {
                    this.nioWorker.zu0((f.d50_0) (Object) this);
                }
            }
        }
    }

    public final void yK0() {
        close();
    }

    public boolean isClosed() {
        return this.closed || this.volatile$;
    }

    @Override
    public final String toString() {
        return getClass().getSimpleName() + "[" + this.remoteAddress + ",age=" + ((System.currentTimeMillis() - this.createTime) / 1000L) + ",closed=" + isClosed() + "]";
    }
}
