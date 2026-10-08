package cn.pokemmo.net.session;

import f.*;
import pro.pokemmo2.shop.service.ShopClient;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.Inflater;

/**
 * 商城与增值服务网络会话 (Shop Service Session)
 * 负责客户端与游戏商城、点券充值及 GTL 交易服务的加密通讯
 * 原混淆类: f.k20_0
 */
public class ShopSession extends ky_2 {
    public static final dl_1 LOGGER = Cq0.E1(ShopSession.class);

    public final ArrayDeque<RE> shopOutgoingQueue;
    public final ArrayDeque yq;

    public final Inflater inflater;
    public final Inflater Oo0;

    public int Co0;

    public int getSessionState() {
        return this.Co0;
    }

    public void setSessionState(int sessionState) {
        this.Co0 = sessionState;
    }

    public final Ge0 gameClient;
    public final Ge0 uH0;

    public ScheduledFuture pingFuture;
    public ScheduledFuture Ge;

    public final dx_1 networkHandler;
    public final dx_1 NU;

    public ShopSession(SocketChannel socketChannel, fk_1 worker, Ge0 gameClient, dx_1 networkHandler) {
        super(socketChannel, worker, YB0.au());
        this.shopOutgoingQueue = new ArrayDeque<>();
        this.yq = this.shopOutgoingQueue;
        this.inflater = new Inflater(true);
        this.Oo0 = this.inflater;
        this.Co0 = 1;
        this.cryptoSuite = new ej0_2((byte) 4);
        this.m3 = this.cryptoSuite;
        this.gameClient = gameClient;
        this.uH0 = gameClient;
        this.networkHandler = networkHandler;
        this.NU = networkHandler;
        this.connectAndRegister();
    }

    @Override
    public boolean processIncomingData(ByteBuffer byteBuffer) {
        if (this.Co0 == 1) {
            return super.processIncomingData(byteBuffer);
        }
        if (!this.decryptAndVerifyChecksum(byteBuffer)) {
            this.close();
            return false;
        }
        GH tS = ho_1.tS(byteBuffer, (k20_0) this, false);
        if (tS != null && tS.iQ()) {
            try {
                tS.km();
            } catch (Throwable th) {
                GH.ob0.warn(tS.toString(), th);
            }
            lg_0.k.lPT5(tS);
        }
        return true;
    }

    @Override
    public boolean writeOutgoingData(ByteBuffer byteBuffer) {
        synchronized (this.closeLock) {
            if (this.Co0 == 1) {
                return super.writeOutgoingData(byteBuffer);
            }
            RE re = (RE) this.shopOutgoingQueue.pollFirst();
            if (re == null) {
                return false;
            }
            byteBuffer.putShort((short) 0);
            byteBuffer.put((byte) re.L8);
            re.ig0((k20_0) this, byteBuffer);
            byteBuffer.flip();
            byteBuffer.putShort((short) 0);
            short s = (short) (encryptAndSign(byteBuffer) + 2);
            byteBuffer.putShort(0, s);
            byteBuffer.position(0);
            byteBuffer.limit(s);
            return true;
        }
    }

    @Override
    public boolean hasPendingWrites() {
        if (this.Co0 == 1) {
            return super.outgoingQueue != null && !super.outgoingQueue.isEmpty();
        }
        return !this.shopOutgoingQueue.isEmpty();
    }

    @Override
    public void onClosed() {
        ScheduledFuture scheduledFuture = this.pingFuture != null ? this.pingFuture : this.Ge;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.pingFuture = null;
            this.Ge = null;
        }
        this.inflater.end();
        ShopClient.onGameConnectionClosed((k20_0) this);
        if (this.Co0 == 1) {
            this.networkHandler.ds0((k20_0) this);
        } else {
            this.gameClient.Qw = true;
        }
    }

    /**
     * 发送商城请求数据包
     */
    public final void sendShopPacket(RE re) {
        if (lpt3__1.rm0 > 0) {
            lpt5__5.hL.ZD(() -> this.internalEnqueue(re), (long) lpt3__1.rm0);
            return;
        }
        internalEnqueue(re);
    }

    public final void uQ(RE re) {
        sendShopPacket(re);
    }

    private void internalEnqueue(RE re) {
        synchronized (this.closeLock) {
            if (!isClosed()) {
                this.shopOutgoingQueue.addLast(re);
                this.enableWriteInterest();
            }
        }
    }

    public final void ga0(RE re) {
        internalEnqueue(re);
    }

    @Override
    public void checkIdle() {
    }

    @Override
    public void encryptOutgoingBuffer() {
        super.outgoingQueue = null;
        super.Cu = null;
        this.Co0 = 2;
        ShopClient.onGameConnectionReady((k20_0) this);
        sendShopPacket(new Pp0());
        ScheduledFuture scheduled = lpt5__5.hL.AH0(this::sendHeartbeatPing, 60000L);
        this.pingFuture = scheduled;
        this.Ge = scheduled;
    }

    public final void sendHeartbeatPing() {
        if (isClosed()) {
            ScheduledFuture scheduledFuture = this.pingFuture != null ? this.pingFuture : this.Ge;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.pingFuture = null;
                this.Ge = null;
            }
            return;
        }
        if (this.Co0 != 1) {
            sendShopPacket(new ry0_0());
            System.currentTimeMillis();
        }
    }

    public final void Ym0() {
        sendHeartbeatPing();
    }
}
