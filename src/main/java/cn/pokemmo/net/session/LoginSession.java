package cn.pokemmo.net.session;

import f.*;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayDeque;

/**
 * 登录认证网络会话 (Login Authentication Session)
 * 负责客户端与登录服务器之间的握手、加密鉴权、服务器列表以及角色选择
 * 原混淆类: f.Ry
 */
public class LoginSession extends ky_2 {
    public final ArrayDeque<lpt5__3> loginOutgoingQueue;
    public final ArrayDeque DC0;

    public int gv0;

    public int getSessionState() {
        return this.gv0;
    }

    public void setSessionState(int sessionState) {
        this.gv0 = sessionState;
    }

    public final uc_2 loginController;
    public final uc_2 Al0;

    public final dx_1 networkHandler;
    public final dx_1 static$;

    public LoginSession(SocketChannel channel, fk_1 worker, uc_2 loginController, dx_1 networkHandler) {
        super(channel, worker, YB0.au());
        this.loginOutgoingQueue = new ArrayDeque<>();
        this.DC0 = this.loginOutgoingQueue;
        this.gv0 = 1;
        this.cryptoSuite = new ej0_2((byte) 16);
        this.m3 = this.cryptoSuite;
        this.loginController = loginController;
        this.Al0 = loginController;
        this.networkHandler = networkHandler;
        this.static$ = networkHandler;
        this.connectAndRegister();
    }

    @Override
    public boolean processIncomingData(ByteBuffer var1) {
        if (this.gv0 == 1) {
            return super.processIncomingData(var1);
        }

        if (!this.decryptAndVerifyChecksum(var1)) {
            this.loginController.GG0(zq_2.XG0, 0);
            this.close();
            return false;
        }

        dl_1 ignored = th0_0.X70;
        DC0 packet = null;
        int state = this.gv0;
        int opcode = var1.get() & 255;
        switch (J90.Qj(state)) {
            case 3:
                switch (opcode) {
                    case 1:
                        packet = new sb_0((Ry) this, var1);
                        break;
                    case 3:
                        packet = new pr0_0((Ry) this, var1);
                        break;
                    case 4:
                    case 20:
                        packet = new ca0_2((Ry) this, var1);
                        break;
                    case 7:
                        packet = new cn_1((Ry) this, var1);
                        break;
                    case 9:
                        packet = new jh0_1((Ry) this, var1);
                        break;
                    case 2:
                    case 18:
                    case 34:
                        packet = new GP(var1, (Ry) this, opcode);
                        break;
                    default:
                        th0_0.St0(state, opcode, var1);
                        break;
                }
                break;
            case 2:
                switch (opcode) {
                    case 1:
                        packet = new sb_0((Ry) this, var1);
                        break;
                    case 8:
                        packet = new com3__0((Ry) this, var1);
                        break;
                    case 9:
                        packet = new jh0_1((Ry) this, var1);
                        break;
                    default:
                        th0_0.St0(state, opcode, var1);
                        break;
                }
                break;
            case 1:
                switch (opcode) {
                    case 1:
                        packet = new sb_0((Ry) this, var1);
                        break;
                    case 5:
                        packet = new xq_0((Ry) this, var1);
                        break;
                    case 6:
                    case 38:
                        packet = new sq_1(var1, (Ry) this, opcode);
                        break;
                    case 7:
                        packet = new cn_1((Ry) this, var1);
                        break;
                    case 8:
                        packet = new com3__0((Ry) this, var1);
                        break;
                    case 9:
                        packet = new jh0_1((Ry) this, var1);
                        break;
                    default:
                        th0_0.St0(state, opcode, var1);
                        break;
                }
                break;
            default:
                th0_0.St0(state, opcode, var1);
                break;
        }

        if (packet != null && packet.iQ()) {
            packet.pF0();
            lg_0.k.lPT5(packet);
        }
        return true;
    }

    @Override
    public boolean writeOutgoingData(ByteBuffer buffer) {
        synchronized (this.closeLock) {
            if (this.gv0 == 1) {
                return super.writeOutgoingData(buffer);
            }

            lpt5__3 packet = (lpt5__3) this.loginOutgoingQueue.pollFirst();
            if (packet == null) {
                return false;
            }

            buffer.putShort((short) 0);
            buffer.put((byte) packet.L8);
            packet.Xn0(buffer);
            buffer.flip();
            buffer.putShort((short) 0);
            short length = (short) (super.encryptAndSign(buffer) + 2);
            buffer.putShort(0, length);
            buffer.position(0);
            buffer.limit(length);
            return true;
        }
    }

    @Override
    public boolean hasPendingWrites() {
        if (this.gv0 == 1) {
            return super.outgoingQueue != null && !super.outgoingQueue.isEmpty();
        }
        return !this.loginOutgoingQueue.isEmpty();
    }

    @Override
    public void onClosed() {
        if (this.gv0 == 1) {
            this.networkHandler.ds0((Ry) this);
        }
    }

    /**
     * 发送登录出站数据包
     */
    public final void sendLoginPacket(lpt5__3 packet) {
        synchronized (this.closeLock) {
            if (isClosed()) {
                return;
            }
            this.loginOutgoingQueue.addLast(packet);
            this.enableWriteInterest();
        }
    }

    public final void E8(lpt5__3 packet) {
        sendLoginPacket(packet);
    }

    @Override
    public void checkIdle() {
    }

    @Override
    public void encryptOutgoingBuffer() {
        super.outgoingQueue = null;
        super.Cu = null;
        this.gv0 = 2;
        uc_2 state = this.loginController;
        if (state.RO == MC0.DL0) {
            state.RO = MC0.rY;
            state.cp0.E8(new Hg0(state.Ik0, state.T2, false, state.QO, state.E3));
        }
    }
}
