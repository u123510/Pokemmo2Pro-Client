package cn.pokemmo.net.buffer.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

import java.util.Arrays;

public abstract class IntegerIndexByteBuffer extends BaseNetworkByteBuffer {
    private static final long serialVersionUID = 1L;
    public transient int[] dH;
    public int Tw;
    public boolean pRN;

    public IntegerIndexByteBuffer() {
        super();
        this.Tw = km_2.Lo0;
        if (this.Tw != 0) {
            Arrays.fill(this.dH, this.Tw);
        }
    }

    public IntegerIndexByteBuffer(int size) {
        super(size);
        this.Tw = km_2.Lo0;
        if (this.Tw != 0) {
            Arrays.fill(this.dH, this.Tw);
        }
    }

    @Override
    public int La(int size) {
        int result = super.La(size);
        this.dH = new int[result];
        return result;
    }

    public final boolean l90(int key) {
        return this.bY(key) >= 0;
    }

    @Override
    public void dx0(int index) {
        this.dH[index] = this.Tw;
        super.dx0(index);
    }

    public final int bY(int key) {
        byte[] states = this.Ut;
        int[] values = this.dH;
        int mask = Integer.MAX_VALUE & key;
        int slot = mask % values.length;
        byte state = states[slot];
        if (state == 0) {
            return -1;
        }
        if (state == 1 && values[slot] == key) {
            return slot;
        }
        int length = values.length;
        int step = sj_0.oC0(length, 2, mask, 1);
        int candidate = slot;
        while (true) {
            candidate -= step;
            if (candidate < 0) {
                candidate += length;
            }
            byte candidateState = states[candidate];
            if (candidateState == 0) {
                return -1;
            }
            if (values[candidate] == key && candidateState != 2) {
                return candidate;
            }
            if (candidate == slot) {
                return -1;
            }
        }
    }

    public final int yw0(int key) {
        int mask = Integer.MAX_VALUE & key;
        byte[] states = this.Ut;
        int slot = mask % states.length;
        byte state = states[slot];
        this.pRN = false;
        if (state == 0) {
            this.dH[slot] = key;
            states[slot] = 1;
            return slot;
        }
        if (state == 1 && this.dH[slot] == key) {
            return -slot - 1;
        }
        int length = this.dH.length;
        int step = sj_0.oC0(length, 2, mask, 1);
        int removed = -1;
        int candidate = slot;
        while (true) {
            if (state == 2 && removed == -1) {
                removed = candidate;
            }
            candidate -= step;
            if (candidate < 0) {
                candidate += length;
            }
            state = states[candidate];
            if (state == 0) {
                if (removed != -1) {
                    states[removed] = 1;
                    this.dH[removed] = key;
                    return removed;
                }
                this.pRN = true;
                this.dH[candidate] = key;
                states[candidate] = 1;
                return candidate;
            }
            if (state == 1 && this.dH[candidate] == key) {
                return -candidate - 1;
            }
            if (candidate == slot) {
                if (removed != -1) {
                    states[removed] = 1;
                    this.dH[removed] = key;
                    return removed;
                }
                throw new IllegalStateException("No free or removed slots available. Key set full?!!");
            }
        }
    }

    public boolean COm1(int key) {
        return this.l90(key);
    }
}
