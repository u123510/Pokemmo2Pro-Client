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

public abstract class ShortBlockByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient short[] zp0;
    public short Hu0;
    public short Uf;
    public boolean L0;

    public ShortBlockByteBuffer() {
        super();
        this.Hu0 = 0;
        this.Uf = 0;
    }

    public final short fW() {
        return this.Uf;
    }

    @Override
    public int La(int capacity) {
        int size = super.La(capacity);
        this.zp0 = new short[size];
        return size;
    }

    public final boolean bL0(short key) {
        return this.aq0(key) >= 0;
    }

    @Override
    public void dx0(int index) {
        this.zp0[index] = this.Hu0;
        super.dx0(index);
    }

    public final int aq0(short key) {
        byte[] states = this.Ut;
        short[] keys = this.zp0;
        int length = states.length;
        int hash = key & Integer.MAX_VALUE;
        int start = hash % length;
        byte state = states[start];
        if (state == 0) {
            return -1;
        }
        if (state == 1 && keys[start] == key) {
            return start;
        }

        int probe = sj_0.oC0(keys.length, 2, hash, 1);
        int index = start;
        do {
            index -= probe;
            if (index < 0) {
                index += length;
            }
            state = states[index];
            if (state == 0) {
                return -1;
            }
            if (state != 2 && keys[index] == key) {
                return index;
            }
        } while (index != start);
        return -1;
    }

    public final int O50(short key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int start = hash % states.length;
        byte state = states[start];
        this.L0 = false;
        if (state == 0) {
            this.L0 = true;
            this.zp0[start] = key;
            states[start] = 1;
            return start;
        }
        if (state == 1 && this.zp0[start] == key) {
            return -start - 1;
        }

        int length = this.zp0.length;
        int probe = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = start;
        while (true) {
            if (state == 2 && removed == -1) {
                removed = index;
            }
            index -= probe;
            if (index < 0) {
                index += length;
            }
            byte nextState = states[index];
            if (nextState == 0) {
                int target = removed == -1 ? index : removed;
                if (removed == -1) {
                    this.L0 = true;
                }
                this.zp0[target] = key;
                states[target] = 1;
                return target;
            }
            if (nextState == 1 && this.zp0[index] == key) {
                return -index - 1;
            }
            if (index == start) {
                if (removed == -1) {
                    throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                }
                this.zp0[removed] = key;
                states[removed] = 1;
                return removed;
            }
            state = nextState;
        }
    }

    @Override
    public void writeExternal(ObjectOutput output) throws IOException {
        output.writeByte(0);
        output.writeByte(0);
        output.writeFloat(this.na0);
        output.writeFloat(this.yk0);
        output.writeShort(this.Hu0);
        output.writeShort(this.Uf);
    }

    @Override
    public void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            this.Hu0 = input.readShort();
            this.Uf = input.readShort();
        } catch (ClassNotFoundException | IOException exception) {
            ShortBlockByteBuffer.<RuntimeException>sneakyThrow(exception);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow(Throwable throwable) throws T {
        throw (T)throwable;
    }
}
