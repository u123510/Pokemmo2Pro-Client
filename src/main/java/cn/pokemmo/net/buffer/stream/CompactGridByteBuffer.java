package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.util.Arrays;

public abstract class CompactGridByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient short[] L1;
    public short Tn0;
    public boolean EH;

    public CompactGridByteBuffer() {
        super();
        this.Tn0 = km_2.TI0;
        if (this.Tn0 != 0) {
            Arrays.fill(this.L1, this.Tn0);
        }
    }

    public CompactGridByteBuffer(int capacity) {
        super(capacity);
        this.Tn0 = km_2.TI0;
        if (this.Tn0 != 0) {
            Arrays.fill(this.L1, this.Tn0);
        }
    }

    @Override
    public int La(int size) {
        int result = super.La(size);
        this.L1 = new short[result];
        return result;
    }

    public final boolean bL0(short key) {
        return this.Ye0(key) >= 0;
    }

    @Override
    public void dx0(int index) {
        this.L1[index] = this.Tn0;
        super.dx0(index);
    }

    public final int Ye0(short key) {
        byte[] states = this.Ut;
        short[] values = this.L1;
        int hash = key & Integer.MAX_VALUE;
        int slot = hash % values.length;
        byte state = states[slot];
        if (state == 0) {
            return -1;
        }
        if (state == 1 && values[slot] == key) {
            return slot;
        }
        int length = values.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int index = slot;
        while (true) {
            index -= step;
            if (index < 0) {
                index += length;
            }
            state = states[index];
            if (state == 0) {
                return -1;
            }
            if (values[index] == key && state != 2) {
                return index;
            }
            if (index == slot) {
                return -1;
            }
        }
    }

    public final int D10(short key) {
        int hash = key & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int slot = hash % states.length;
        byte state = states[slot];
        this.EH = false;
        if (state == 0) {
            this.EH = true;
            this.L1[slot] = key;
            states[slot] = 1;
            return slot;
        }
        if (state == 1 && this.L1[slot] == key) {
            return -slot - 1;
        }

        int length = this.L1.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removedSlot = -1;
        int index = slot;
        if (state == 2) {
            removedSlot = index;
        }
        while (true) {
            index -= step;
            if (index < 0) {
                index += length;
            }
            state = states[index];
            if (state == 0) {
                if (removedSlot != -1) {
                    states[removedSlot] = 1;
                    this.L1[removedSlot] = key;
                    return removedSlot;
                }
                this.EH = true;
                this.L1[index] = key;
                states[index] = 1;
                removedSlot = index;
                return removedSlot;
            }
            if (state == 1 && this.L1[index] == key) {
                return -index - 1;
            }
            if (index == slot) {
                if (removedSlot != -1) {
                    states[removedSlot] = 1;
                    this.L1[removedSlot] = key;
                    return removedSlot;
                }
                throw new IllegalStateException("No free or removed slots available. Key set full?!!");
            }
        }
    }

    public boolean dq0(short key) {
        return this.bL0(key);
    }
}
