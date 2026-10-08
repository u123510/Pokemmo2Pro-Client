package cn.pokemmo.net.session;

import f.*;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/**
 * 游戏世界主网络会话 (Main Game Session)
 * 负责客户端与游戏世界服务器之间的场景同步、实体移动、聊天、战斗与交互数据流
 * 原混淆类: f.TX
 */
public class GameSession extends ky_2 {
    public static final dl_1 LOGGER = Cq0.E1(GameSession.class);

    public final ArrayDeque<lpt4__2> gameOutgoingQueue;
    public final ArrayDeque hE0;

    public final Inflater inflater;
    public final Inflater PQ;

    public int nV;

    public int getSessionState() {
        return this.nV;
    }

    public void setSessionState(int sessionState) {
        this.nV = sessionState;
    }

    public final Ge0 gameClient;
    public final Ge0 Bu;

    public ScheduledFuture pingFuture;
    public ScheduledFuture tu;

    public final dx_1 networkHandler;
    public final dx_1 k6;

    public GameSession(SocketChannel channel, fk_1 worker, Ge0 gameClient, dx_1 networkHandler) {
        super(channel, worker, YB0.XP());
        this.gameOutgoingQueue = new ArrayDeque<>();
        this.hE0 = this.gameOutgoingQueue;
        this.inflater = new Inflater(true);
        this.PQ = this.inflater;
        this.nV = 1;
        this.cryptoSuite = new ej0_2((byte) 2);
        this.m3 = this.cryptoSuite;
        this.gameClient = gameClient;
        this.Bu = gameClient;
        this.networkHandler = networkHandler;
        this.k6 = networkHandler;
        this.connectAndRegister();
    }

    private static int Qj(int n) {
        if (n != 0) {
            return n - 1;
        }
        throw null;
    }

    @Override
    public boolean processIncomingData(ByteBuffer var1) {
        if (this.nV == 1) {
            return super.processIncomingData(var1);
        }

        if (!this.decryptAndVerifyChecksum(var1)) {
            this.close();
            return false;
        }

        int packetId = var1.get() & 255;
        if (var1.get() == 1) {
            ByteBuffer compressed = x80_0.NJ0;
            compressed.clear();
            compressed.put(var1);
            compressed.putInt(-65536);
            this.inflater.setInput(compressed.array(), 0, compressed.position());
            try {
                ByteBuffer decompressed = x80_0.Vx0;
                decompressed.limit(this.inflater.inflate(decompressed.array()));
                decompressed.position(0);
                var1 = decompressed;
            } catch (DataFormatException exception) {
                exception.printStackTrace();
                return true;
            }
        }

        Ey0 packet = null;
        int state = this.nV;
        switch (Qj(state)) {
            case 1:
                if (packetId == 0) {
                    packet = new rv_1((TX) this, var1);
                } else if (packetId == 1) {
                    packet = new fg0_0((TX) this, var1);
                } else {
                    x80_0.dM0(state, packetId, var1);
                }
                break;
            case 2:
                if (packetId == 0) {
                    packet = new rv_1((TX) this, var1);
                } else if (packetId == 2) {
                    packet = new O90((TX) this, var1);
                } else {
                    x80_0.dM0(state, packetId, var1);
                }
                break;
            default:
                x80_0.dM0(state, packetId, var1);
                break;
        }

        if (packet != null) {
            packet.L8 = packetId;
            if (packet.iQ()) {
                try {
                    packet.iw0();
                } catch (Throwable throwable) {
                    Ey0.kn0.warn(packet.toString(), throwable);
                }
                lg_0.k.lPT5(packet);
            }
        }
        return true;
    }

    @Override
    public boolean writeOutgoingData(ByteBuffer param1) {
        synchronized (this.closeLock) {
            if (this.nV == 1) {
                return super.writeOutgoingData(param1);
            }

            lpt4__2 packet = (lpt4__2) this.gameOutgoingQueue.pollFirst();
            if (packet == null) {
                return false;
            }

            param1.putShort((short) 0);
            param1.put((byte) packet.L8);
            packet.pH0((TX) this, param1);
            param1.flip();
            param1.putShort((short) 0);
            short length = (short) (this.encryptAndSign(param1) + 2);
            param1.putShort(0, length);
            param1.position(0);
            param1.limit(length);
            return true;
        }
    }

    @Override
    public boolean hasPendingWrites() {
        if (this.nV == 1) {
            return super.outgoingQueue != null && !super.outgoingQueue.isEmpty();
        }
        return !this.gameOutgoingQueue.isEmpty();
    }

    @Override
    public void onClosed() {
        ScheduledFuture scheduledfuture = this.pingFuture != null ? this.pingFuture : this.tu;
        if (scheduledfuture != null) {
            scheduledfuture.cancel(false);
            this.pingFuture = null;
            this.tu = null;
        }

        this.inflater.end();
        if (this.nV == 1) {
            this.networkHandler.ds0((TX) this);
        } else {
            this.gameClient.NG((TX) this);
        }
    }

    /**
     * 发送游戏主世界出站数据包
     */
    public final void sendGamePacket(lpt4__2 packet) {
        synchronized (this.closeLock) {
            if (isClosed()) {
                return;
            }
            this.gameOutgoingQueue.addLast(packet);
            this.enableWriteInterest();
        }
    }

    public final void fl(lpt4__2 param1) {
        sendGamePacket(param1);
    }

    @Override
    public void checkIdle() {
    }

    @Override
    public void encryptOutgoingBuffer() {
        super.outgoingQueue = null;
        super.Cu = null;
        this.nV = 2;
        sendGamePacket(new J00());
        ScheduledFuture scheduled = lpt5__5.hL.AH0(this::sendHeartbeatPing, 60000L);
        this.pingFuture = scheduled;
        this.tu = scheduled;
    }

    public final void sendHeartbeatPing() {
        if (isClosed()) {
            ScheduledFuture scheduledfuture = this.pingFuture != null ? this.pingFuture : this.tu;
            if (scheduledfuture != null) {
                scheduledfuture.cancel(false);
                this.pingFuture = null;
                this.tu = null;
            }
        } else {
            if (this.nV != 1) {
                sendGamePacket(new bg0_0());
                System.currentTimeMillis();
            }
        }
    }

    public final void Us0() {
        sendHeartbeatPing();
    }
}
