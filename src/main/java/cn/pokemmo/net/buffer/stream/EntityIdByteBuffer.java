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

public abstract class EntityIdByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient short[] bS;
    public short Xq0;
    public int ik0;
    public boolean Lz0;

    public EntityIdByteBuffer() {
        super();
        this.Xq0 = 0;
        this.ik0 = 0;
    }

    public EntityIdByteBuffer(int size) {
        super(size);
        this.Xq0 = 0;
        this.ik0 = 0;
    }

    @Override
    public int La(int size) {
        int capacity = super.La(size);
        this.bS = new short[capacity];
        return capacity;
    }

    @Override
    public void dx0(int index) {
        this.bS[index] = this.Xq0;
        super.dx0(index);
    }

    public final int Dz0(short key) {
        byte[] states = this.Ut;
        short[] keys = this.bS;
        int length = keys.length;
        int hash = key & Integer.MAX_VALUE;
        int start = hash % length;
        byte state = states[start];
        if (state == 0) {
            return -1;
        }
        if (state == 1 && keys[start] == key) {
            return start;
        }
        int step = sj_0.oC0(length, 2, hash, 1);
        int index = start;
        do {
            index -= step;
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

    public final int zJ(short key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int start = hash % states.length;
        byte state = states[start];
        this.Lz0 = false;
        if (state == 0) {
            this.Lz0 = true;
            this.bS[start] = key;
            states[start] = 1;
            return start;
        }
        if (state == 1 && this.bS[start] == key) {
            return -start - 1;
        }

        int length = this.bS.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = start;
        while (true) {
            if (state == 2 && removed == -1) {
                removed = index;
            }
            int next = index - step;
            if (next < 0) {
                next += length;
            }
            byte nextState = states[next];
            if (nextState == 0) {
                if (removed != -1) {
                    this.bS[removed] = key;
                    states[removed] = 1;
                    return removed;
                }
                this.Lz0 = true;
                this.bS[next] = key;
                states[next] = 1;
                return next;
            }
            if (nextState == 1 && this.bS[next] == key) {
                return -next - 1;
            }
            if (next == start) {
                if (removed == -1) {
                    throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                }
                this.bS[removed] = key;
                states[removed] = 1;
                return removed;
            }
            index = next;
            state = nextState;
        }
    }

    @Override
    public void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            output.writeByte(0);
            output.writeFloat(this.na0);
            output.writeFloat(this.yk0);
            output.writeShort(this.Xq0);
            output.writeInt(this.ik0);
        } catch (IOException error) {
            EntityIdByteBuffer.<RuntimeException>rethrowUnchecked(error);
        }
    }

    @Override
    public void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            this.Xq0 = input.readShort();
            this.ik0 = input.readInt();
        } catch (ClassNotFoundException | IOException error) {
            EntityIdByteBuffer.<RuntimeException>rethrowUnchecked(error);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void rethrowUnchecked(Throwable error) throws T {
        throw (T)error;
    }
}
