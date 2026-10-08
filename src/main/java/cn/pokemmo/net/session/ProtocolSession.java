package cn.pokemmo.net.session;

import f.Cq0;
import f.HC;
import f.HC0;
import f.L4;
import f.ZF0;
import f.d50_0;
import f.dl_1;
import f.ej0_2;
import f.fk_1;
import f.gl0_2;
import f.ll_0;

import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.security.PublicKey;
import java.util.ArrayDeque;
import javax.crypto.ShortBufferException;

/**
 * 加密网络协议会话抽象基类 (Encrypted Protocol Session)
 * 封装客户端与服务器之间的非对称密钥握手、AES 数据流加密/解密、HMAC 校验和以及发送队列
 * 原混淆类: f.ky_2
 */
public abstract class ProtocolSession extends d50_0 {
    public static final dl_1 LOGGER = Cq0.E1(ProtocolSession.class);
    public static final dl_1 jn0 = LOGGER;

    /**
     * 是否由客户端发起握手 (Client initiated handshake)
     */
    public final boolean clientInitiatedHandshake;
    public final boolean const$;

    /**
     * 服务端公钥
     */
    public final PublicKey serverPublicKey;
    public final PublicKey Fg0;

    /**
     * 是否已开启加密模式
     */
    public boolean encrypted;
    public boolean Dm;

    /**
     * 握手是否已完成
     */
    public boolean handshakeCompleted;
    public boolean m50;

    /**
     * 待发送出站数据包队列
     */
    public ArrayDeque<ZF0> outgoingQueue;
    public ArrayDeque Cu;

    /**
     * AES 密码学套件 (包含加密/解密 Cipher 与 MAC 校验和)
     */
    public ej0_2 cryptoSuite;
    public ej0_2 m3;

    public ProtocolSession(SocketChannel channel, fk_1 worker, PublicKey serverPublicKey) {
        super(channel, worker);
        this.encrypted = false;
        this.Dm = false;
        this.handshakeCompleted = false;
        this.m50 = false;
        this.outgoingQueue = new ArrayDeque<>();
        this.Cu = this.outgoingQueue;
        this.clientInitiatedHandshake = true;
        this.const$ = true;
        this.serverPublicKey = serverPublicKey;
        this.Fg0 = serverPublicKey;
    }

    /**
     * 注册通道就绪监听并初始化连接握手
     */
    public final void connectAndRegister() {
        fk_1 fk = this.nioWorker != null ? this.nioWorker : this.Gn;
        SocketChannel ch = this.socketChannel != null ? this.socketChannel : this.vD;
        synchronized (fk.MK) {
            fk.ei0.wakeup();
            try {
                SelectionKey key = ch.register(fk.ei0, SelectionKey.OP_READ, this);
                this.selectionKey = key;
                this.ek0 = key;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (this.clientInitiatedHandshake || this.const$) {
            sendPacket(new HC());
        }
    }

    public final void IH() {
        connectAndRegister();
    }

    @Override
    public boolean processIncomingData(ByteBuffer buf) {
        byte type = buf.get();
        gl0_2 packet = null;
        if (type == 0) {
            if (!this.clientInitiatedHandshake && !this.handshakeCompleted) {
                packet = new HC0(type);
            }
            this.handshakeCompleted = true;
            this.m50 = true;
        } else if (type == 1) {
            if (this.clientInitiatedHandshake) {
                packet = new ll_0(type);
            }
        } else if (type == 2) {
            if (!this.clientInitiatedHandshake && this.handshakeCompleted) {
                packet = new L4(type);
            }
        }
        if (packet == null) {
            return false;
        }
        packet.Rj = buf;
        packet.buffer = buf;
        packet.uk = this;
        packet.connection = this;
        if (packet.iQ()) {
            packet.run();
        }
        return true;
    }

    @Override
    public boolean L30(ByteBuffer buf) {
        return processIncomingData(buf);
    }

    @Override
    public boolean writeOutgoingData(ByteBuffer buf) {
        synchronized (this.closeLock) {
            ZF0 packet = (ZF0) this.outgoingQueue.pollFirst();
            if (packet == null) {
                return false;
            }
            buf.putShort((short) 0);
            buf.put((byte) packet.L8);
            packet.Q80(buf);
            buf.flip();
            buf.putShort((short) buf.limit());
            buf.position(0);
            if (this.encrypted || this.Dm) {
                encryptOutgoingBuffer();
            }
            return true;
        }
    }

    @Override
    public boolean Sk(ByteBuffer buf) {
        return writeOutgoingData(buf);
    }

    /**
     * 校验数据包 HMAC 校验和并进行 AES 解密
     */
    public final boolean decryptAndVerifyChecksum(ByteBuffer buf) {
        ej0_2 crypto = this.cryptoSuite != null ? this.cryptoSuite : this.m3;
        if (crypto == null) {
            return false;
        }
        int remaining = buf.remaining();
        int pos = buf.position() + buf.arrayOffset();
        byte[] arr = buf.array();
        if (crypto.g9.Jm(arr, pos, remaining)) {
            try {
                crypto.sr.update(arr, pos, remaining - crypto.g9.jR(), arr, pos);
                buf.limit(buf.limit() - crypto.g9.jR());
                return true;
            } catch (ShortBufferException e) {
                ej0_2.If.error("", e);
            }
        }
        LOGGER.warn("Wrong checksum: {}", this);
        return false;
    }

    public final boolean this$(ByteBuffer buf) {
        return decryptAndVerifyChecksum(buf);
    }

    /**
     * 进行 AES 加密并追加 HMAC 签名
     */
    public final int encryptAndSign(ByteBuffer buf) {
        ej0_2 crypto = this.cryptoSuite != null ? this.cryptoSuite : this.m3;
        if (crypto == null) {
            return 0;
        }
        int len = buf.limit() - buf.position();
        int pos = buf.position() + buf.arrayOffset();
        byte[] arr = buf.array();
        try {
            crypto.ks0.update(arr, pos, len, arr, pos);
        } catch (ShortBufferException e) {
            ej0_2.If.error("", e);
        }
        crypto.Pb.SG(arr, pos, len);
        int totalLen = len + crypto.Pb.jR();
        if (crypto.zB0) {
            crypto.CD();
            crypto.zB0 = false;
        }
        return totalLen;
    }

    public final int UL(ByteBuffer buf) {
        return encryptAndSign(buf);
    }

    /**
     * 将出站包入队并请求写监听
     */
    public final void sendPacket(ZF0 packet) {
        synchronized (this.closeLock) {
            if (isClosed()) {
                return;
            }
            this.outgoingQueue.addLast(packet);
            enableWriteInterest();
        }
    }

    public final void v2(ZF0 packet) {
        sendPacket(packet);
    }

    /**
     * 对即将发出的缓冲区数据执行加密操作
     */
    public void encryptOutgoingBuffer() {
        jt0();
    }

    public void jt0() {
    }

    @Override
    public void disconnect() {
        close();
    }

    @Override
    public void Zw() {
        disconnect();
    }
}
