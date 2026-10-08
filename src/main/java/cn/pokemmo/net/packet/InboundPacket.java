package cn.pokemmo.net.packet;

import f.*;
import f.ineter.pm_1;
import f.ineter.qb0_1;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.time.Instant;

/**
 * 客户端入站数据包抽象基类 (Clientbound Inbound Packet)
 * 原混淆类: f.gl0_2
 */
public abstract class InboundPacket extends JM implements Runnable {
    public static final dl_1 LOGGER = Cq0.E1(InboundPacket.class);
    public static final dl_1 Iq = LOGGER;

    public d50_0 connection;
    public ByteBuffer buffer;

    // 兼容混淆字段别名
    public d50_0 uk;
    public ByteBuffer Rj;

    public InboundPacket(ByteBuffer byteBuffer, int opcode) {
        this(opcode);
        this.buffer = byteBuffer;
        this.Rj = byteBuffer;
    }

    public InboundPacket(int opcode) {
        super(Mu0.py0, opcode);
    }

    public final void setConnection(d50_0 connection) {
        this.connection = connection;
        this.uk = connection;
    }

    public final void VR(d50_0 d50_0) {
        setConnection(d50_0);
    }

    public final boolean decode() {
        return iQ();
    }

    public final boolean iQ() {
        try {
            this.Oj0();
            return true;
        } catch (BufferUnderflowException e) {
            String methodName = null;
            int lineNo = -1;
            StackTraceElement[] stack = e.getStackTrace();
            for (StackTraceElement elem : stack) {
                if (methodName == null && elem.getClassName().equals(InboundPacket.class.getName())) {
                    methodName = elem.getMethodName();
                }
                if (lineNo < 0 && elem.getClassName().equals(this.getClass().getName())) {
                    lineNo = elem.getLineNumber();
                }
                if (methodName != null && lineNo != -1) {
                    break;
                }
            }
            if (methodName != null && lineNo != -1) {
                Iq.error("Buffer underflow for {} {}:{} from {}", methodName, this, Integer.valueOf(lineNo), this.uk);
            } else {
                Iq.error("Buffer underflow for packet ({}) from {}", this, this.uk, e);
            }
            return false;
        } catch (Exception e) {
            Iq.error("Reading failed for packet {} from {}", this, this.uk, e);
            return false;
        }
    }

    public abstract void decodePayload();

    public void Oj0() {
        decodePayload();
    }

    public final byte readByte() {
        return this.Rj.get();
    }

    public final byte throws$() {
        return readByte();
    }

    public final short readShort() {
        return this.Rj.getShort();
    }

    public final short mC0() {
        return readShort();
    }

    public final String readString() {
        StringBuilder sb = new StringBuilder();
        char c;
        while ((c = this.Rj.getChar()) != 0) {
            sb.append(c);
        }
        return sb.toString();
    }

    public final String q60() {
        return readString();
    }

    public final LY readAddress() {
        if ((this.Rj.get() & 0xFF) == 4) {
            return new pm_1(this.Rj.getInt());
        }
        return new qb0_1(this.Rj.getLong(), this.Rj.getLong());
    }

    public final LY NK() {
        return readAddress();
    }

    public final Instant readTimestamp() {
        return Instant.ofEpochMilli(this.Rj.getLong());
    }

    public final Instant IK() {
        return readTimestamp();
    }

    public abstract void execute();

    public void os0() {
        execute();
    }

    @Override
    public void run() {
        os0();
    }
}
