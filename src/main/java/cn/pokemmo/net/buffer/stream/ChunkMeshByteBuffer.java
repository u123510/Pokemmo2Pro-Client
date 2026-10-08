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

public abstract class ChunkMeshByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient int[] vW;
    public int n30;
    public short XQ;
    public boolean vx;

    public ChunkMeshByteBuffer() {
        super();
        this.n30 = 0;
        this.XQ = 0;
    }

    @Override
    public int La(int size) {
        int length = super.La(size);
        this.vW = new int[length];
        return length;
    }

    @Override
    public void dx0(int index) {
        this.vW[index] = this.n30;
        super.dx0(index);
    }

    public final int uw(int key) {
        byte[] states = this.Ut;
        int[] keys = this.vW;
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
        while (true) {
            index -= step;
            if (index < 0) {
                index += length;
            }
            state = states[index];
            if (state == 0) {
                return -1;
            }
            if (key == keys[index] && state != 2) {
                return index;
            }
            if (index == start) {
                return -1;
            }
        }
    }

    public final int at0(int key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int start = hash % states.length;
        byte state = states[start];
        this.vx = false;
        if (state == 0) {
            this.vx = true;
            this.vW[start] = key;
            states[start] = 1;
            return start;
        }
        if (state == 1 && this.vW[start] == key) {
            return -start - 1;
        }

        int length = this.vW.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = start;
        int currentState = state;
        while (true) {
            if (currentState == 2 && removed == -1) {
                removed = index;
            }
            int next = index - step;
            if (next < 0) {
                next += length;
            }
            byte nextState = states[next];
            if (nextState == 0) {
                if (removed != -1) {
                    this.vW[removed] = key;
                    states[removed] = 1;
                    return removed;
                }
                this.vx = true;
                this.vW[next] = key;
                states[next] = 1;
                return next;
            }
            if (nextState == 1 && this.vW[next] == key) {
                return -next - 1;
            }
            if (next == start) {
                if (removed == -1) {
                    throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                }
                this.vW[removed] = key;
                states[removed] = 1;
                return removed;
            }
            index = next;
            currentState = nextState;
        }
    }

    @Override
    public void writeExternal(ObjectOutput output) {
        try {
            output.writeByte(0);
            output.writeByte(0);
            output.writeFloat(this.na0);
            output.writeFloat(this.yk0);
            output.writeInt(this.n30);
            output.writeShort(this.XQ);
        } catch (IOException error) {
            ChunkMeshByteBuffer.<RuntimeException>throwUnchecked(error);
        }
    }

    @Override
    public void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            this.n30 = input.readInt();
            this.XQ = input.readShort();
        } catch (ClassNotFoundException | IOException error) {
            ChunkMeshByteBuffer.<RuntimeException>throwUnchecked(error);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T) error;
    }
}
