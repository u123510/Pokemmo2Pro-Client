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

public abstract class Fixed32StreamByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient int[] E70;
    public int PP;
    public float DM;
    public boolean Uq;

    public Fixed32StreamByteBuffer() {
        super();
        this.PP = 0;
        this.DM = 0.0F;
    }

    public Fixed32StreamByteBuffer(int size) {
        super(size, 0);
        this.PP = 0;
        this.DM = -10.0F;
    }

    @Override
    public int La(int size) {
        int length = super.La(size);
        this.E70 = new int[length];
        return length;
    }

    @Override
    public void dx0(int index) {
        this.E70[index] = this.PP;
        super.dx0(index);
    }

    public final int bf0(int key) {
        byte[] states = this.Ut;
        int[] keys = this.E70;
        int length = keys.length;
        int hash = key & Integer.MAX_VALUE;
        int start = hash % length;
        byte state = states[start];
        if (state == 0) return -1;
        if (state == 1 && keys[start] == key) return start;
        int step = sj_0.oC0(length, 2, hash, 1);
        int index = start;
        while (true) {
            index -= step;
            if (index < 0) index += length;
            state = states[index];
            if (state == 0) return -1;
            if (key == keys[index] && state != 2) return index;
            if (index == start) return -1;
        }
    }

    public final int Lq0(int key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int start = hash % states.length;
        byte state = states[start];
        this.Uq = false;
        if (state == 0) {
            this.Uq = true;
            this.E70[start] = key;
            states[start] = 1;
            return start;
        }
        if (state == 1 && this.E70[start] == key) return -start - 1;

        int length = this.E70.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = start;
        while (true) {
            if (state == 2 && removed == -1) removed = index;
            int next = index - step;
            if (next < 0) next += length;
            byte nextState = states[next];
            if (nextState == 0) {
                if (removed != -1) {
                    this.E70[removed] = key;
                    states[removed] = 1;
                    return removed;
                }
                this.Uq = true;
                this.E70[next] = key;
                states[next] = 1;
                return next;
            }
            if (nextState == 1 && this.E70[next] == key) return -next - 1;
            if (next == start) {
                if (removed == -1) throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                this.E70[removed] = key;
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
            output.writeInt(this.PP);
            output.writeFloat(this.DM);
        } catch (IOException error) {
            Fixed32StreamByteBuffer.<RuntimeException>throwUnchecked(error);
        }
    }

    @Override
    public void readExternal(ObjectInput input) {
        try {
            input.readByte();
            super.readExternal(input);
            this.PP = input.readInt();
            this.DM = input.readFloat();
        } catch (ClassNotFoundException | IOException error) {
            Fixed32StreamByteBuffer.<RuntimeException>throwUnchecked(error);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void throwUnchecked(Throwable error) throws T {
        throw (T)error;
    }
}
