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

public abstract class FloatVectorByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient short[] r7;
    public short wi0;
    public float GE0;
    public boolean My;

    public FloatVectorByteBuffer() {
        super();
        this.wi0 = 0;
        this.GE0 = 0.0f;
    }

    @Override
    public int La(int capacity) {
        int size = super.La(capacity);
        this.r7 = new short[size];
        return size;
    }

    @Override
    public void dx0(int index) {
        this.r7[index] = this.wi0;
        super.dx0(index);
    }

    public final int pL0(short key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int start = hash % states.length;
        byte state = states[start];
        this.My = false;
        if (state == 0) {
            this.My = true;
            this.r7[start] = key;
            states[start] = 1;
            return start;
        }
        if (state == 1 && this.r7[start] == key) {
            return -start - 1;
        }
        int length = this.r7.length;
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
                    this.My = true;
                }
                this.r7[target] = key;
                states[target] = 1;
                return target;
            }
            if (nextState == 1 && this.r7[index] == key) {
                return -index - 1;
            }
            if (index == start) {
                if (removed == -1) {
                    throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                }
                this.r7[removed] = key;
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
        output.writeShort(this.wi0);
        output.writeFloat(this.GE0);
    }

    @Override
    public void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            this.wi0 = input.readShort();
            this.GE0 = input.readFloat();
        } catch (ClassNotFoundException | IOException exception) {
            FloatVectorByteBuffer.<RuntimeException>sneakyThrow(exception);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> T sneakyThrow(Throwable throwable) throws T {
        throw (T)throwable;
    }
}
