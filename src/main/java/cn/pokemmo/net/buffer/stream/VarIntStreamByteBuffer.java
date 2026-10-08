package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public abstract class VarIntStreamByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient short[] jA0;
    public short qy;
    public byte SH;
    public boolean H6;

    public VarIntStreamByteBuffer() {
        super();
        this.qy = 0;
        this.SH = 0;
    }

    @Override public int La(int size) {
        int result = super.La(size);
        this.jA0 = new short[result];
        return result;
    }

    @Override public void dx0(int index) {
        this.jA0[index] = this.qy;
        super.dx0(index);
    }

    public final int lpt2(short key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int slot = hash % states.length;
        byte state = states[slot];
        this.H6 = false;
        if (state == 0) {
            this.H6 = true;
            this.jA0[slot] = key;
            states[slot] = 1;
            return slot;
        }
        if (state == 1 && this.jA0[slot] == key) return -slot - 1;
        int length = this.jA0.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = slot;
        while (true) {
            if (state == 2 && removed == -1) removed = index;
            index -= step;
            if (index < 0) index += length;
            byte next = states[index];
            if (next == 0) {
                int target = removed == -1 ? index : removed;
                if (removed == -1) this.H6 = true;
                this.jA0[target] = key;
                states[target] = 1;
                return target;
            }
            if (next == 1 && this.jA0[index] == key) return -index - 1;
            if (index == slot) {
                if (removed == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                this.jA0[removed] = key;
                states[removed] = 1;
                return removed;
            }
            state = next;
        }
    }

    @Override public void writeExternal(ObjectOutput out) throws IOException {
        out.writeByte(0);
        out.writeByte(0);
        out.writeFloat(this.na0);
        out.writeFloat(this.yk0);
        out.writeShort(this.qy);
        out.writeByte(this.SH);
    }

    @Override public void readExternal(ObjectInput in) {
        try {
            in.readByte();
            super.readExternal(in);
            this.qy = in.readShort();
            this.SH = in.readByte();
        } catch (ClassNotFoundException | IOException e) {
            VarIntStreamByteBuffer.<RuntimeException>sneakyThrow(e);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow(Throwable t) throws T { throw (T) t; }
}
