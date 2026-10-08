package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.util.Arrays;

public abstract class RawByteArrayByteBuffer extends BaseNetworkByteBuffer {
    static final long serialVersionUID = 1L;
    public transient byte[] MO;
    public byte st;
    public boolean IF;

    public RawByteArrayByteBuffer() {
        super();
        this.st = km_2.Qz;
        if (this.st != 0) Arrays.fill(this.MO, this.st);
    }

    public RawByteArrayByteBuffer(int capacity) {
        super(capacity);
        this.st = km_2.Qz;
        if (this.st != 0) Arrays.fill(this.MO, this.st);
    }

    public RawByteArrayByteBuffer(int capacity, int ignored) {
        super(capacity, 0);
        this.st = km_2.Qz;
        if (this.st != 0) Arrays.fill(this.MO, this.st);
    }

    @Override
    public int La(int index) {
        int result = super.La(index);
        this.MO = new byte[result];
        return result;
    }

    public final boolean dg(byte key) { return Q80(key) >= 0; }

    @Override
    public void dx0(int index) {
        this.MO[index] = this.st;
        super.dx0(index);
    }

    public final int Q80(byte key) {
        byte[] used = this.Ut;
        byte[] values = this.MO;
        int length = values.length;
        int hash = Integer.MAX_VALUE & key;
        int slot = hash % length;
        int state = used[slot];
        if (state == 0) return -1;
        if (state == 1 && values[slot] == key) return slot;
        int step = sj_0.oC0(length, 2, hash, 1);
        int current = slot;
        while (true) {
            current -= step;
            if (current < 0) current += length;
            int marker = used[current];
            if (marker == 0) return -1;
            if (key == values[current] && marker != 2) return current;
            if (current == slot) return -1;
        }
    }

    public final int lpT8(byte key) {
        int hash = Integer.MAX_VALUE & key;
        byte[] used = this.Ut;
        int slot = hash % used.length;
        int marker = used[slot];
        this.IF = false;
        if (marker == 0) {
            used[slot] = 1;
            this.MO[slot] = key;
            this.IF = true;
            return slot;
        }
        if (marker == 1 && this.MO[slot] == key) return -slot - 1;
        int step = sj_0.oC0(this.MO.length, 2, hash, 1);
        int removed = -1;
        int current = slot;
        while (true) {
            if (marker == 2 && removed == -1) removed = current;
            int next = current - step;
            if (next < 0) next += this.MO.length;
            current = next;
            marker = used[current];
            if (marker == 0) {
                int target = removed == -1 ? current : removed;
                used[target] = 1;
                this.MO[target] = key;
                if (removed == -1) this.IF = true;
                return target;
            }
            if (marker == 1 && this.MO[current] == key) return -current - 1;
            if (current == slot) {
                if (removed != -1) {
                    used[removed] = 1;
                    this.MO[removed] = key;
                    return removed;
                }
                throw new IllegalStateException("No free or removed slots available. Key set full?!!");
            }
        }
    }

    public boolean I0(byte key) { return dg(key); }
}
