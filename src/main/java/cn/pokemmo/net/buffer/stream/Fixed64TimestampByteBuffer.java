package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.util.Arrays;

public abstract class Fixed64TimestampByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient long[] q6;
    public final long E40;
    public boolean uL;

    public Fixed64TimestampByteBuffer() {
        super();
        this.E40 = km_2.Ug;
        if (this.E40 != 0L) {
            Arrays.fill(this.q6, this.E40);
        }
    }

    @Override
    public int La(int size) {
        int length = super.La(size);
        this.q6 = new long[length];
        return length;
    }

    @Override
    public void dx0(int index) {
        this.q6[index] = this.E40;
        super.dx0(index);
    }

    public final int Ma0(long key) {
        byte[] states = this.Ut;
        long[] values = this.q6;
        int length = states.length;
        int hash = (int) (key ^ (key >>> 32)) & Integer.MAX_VALUE;
        int slot = hash % length;
        byte state = states[slot];
        if (state == 0) {
            return -1;
        }
        if (state == 1 && values[slot] == key) {
            return slot;
        }
        int step = sj_0.oC0(values.length, 2, hash, 1);
        int index = slot;
        while (true) {
            index -= step;
            if (index < 0) index += values.length;
            state = states[index];
            if (state == 0) return -1;
            if (values[index] == key && state != 2) return index;
            if (index == slot) return -1;
        }
    }

    public final int COM3(long key) {
        int hash = (int) (key ^ (key >>> 32)) & Integer.MAX_VALUE;
        byte[] states = this.Ut;
        int slot = hash % states.length;
        byte state = states[slot];
        this.uL = false;
        if (state == 0) {
            this.uL = true;
            this.q6[slot] = key;
            states[slot] = 1;
            return slot;
        }
        if (state == 1 && this.q6[slot] == key) {
            return -slot - 1;
        }
        int length = this.q6.length;
        int step = sj_0.oC0(length, 2, hash, 1);
        int removed = -1;
        int index = slot;
        int current = state;
        while (true) {
            if (current == 2 && removed == -1) {
                removed = index;
            }
            int next = index - step;
            if (next < 0) next += length;
            byte nextState = states[next];
            if (nextState == 0) {
                if (removed != -1) {
                    this.q6[removed] = key;
                    states[removed] = 1;
                    return removed;
                }
                this.uL = true;
                this.q6[next] = key;
                states[next] = 1;
                return next;
            }
            if (nextState == 1 && this.q6[next] == key) {
                return -next - 1;
            }
            if (next == slot) {
                if (removed == -1) {
                    throw new IllegalStateException("No free or removed slots available. Key set full?!!");
                }
                this.q6[removed] = key;
                states[removed] = 1;
                return removed;
            }
            index = next;
            current = nextState;
        }
    }
}
