package cn.pokemmo.io.binary;

import f.RB;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;
import java.util.zip.InflaterInputStream;

public class CompressedBitmaskTilemapLoader {
    public final BitSet[] bitsets;
    public final RB[] sparseMaps;
    public final Object lock;

    public CompressedBitmaskTilemapLoader() {
        this.bitsets = new BitSet[4];
        this.sparseMaps = new RB[4];
        this.lock = new Object();
        for (int index = 0; index < 4; index++) {
            this.bitsets[index] = new BitSet();
            this.sparseMaps[index] = new RB();
        }
    }

    public void loadCompressed(byte index, byte[] compressed) {
        if (compressed.length <= 0) {
            this.bitsets[index] = new BitSet();
            this.sparseMaps[index] = new RB();
            return;
        }

        try {
            InflaterInputStream inflater = new InflaterInputStream(new ByteArrayInputStream(compressed));
            DataInputStream input = new DataInputStream(inflater);
            byte[] bits = new byte[input.readShort()];
            input.read(bits);
            this.bitsets[index] = BitSet.valueOf(bits);

            byte entryCount = input.readByte();
            RB values = new RB(entryCount);
            for (int entry = 0; entry < entryCount; entry++) {
                short key = input.readShort();
                values.JF0(input.readInt(), key);
            }
            this.sparseMaps[index] = values;
            input.close();
            inflater.close();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public boolean testBit(byte index, short value) {
        synchronized (this.lock) {
            return this.bitsets[index].get(value);
        }
    }

    public boolean testSparseBit(byte index, int bit, short value) {
        synchronized (this.lock) {
            return (this.sparseMaps[index].mk(value) & (1 << bit)) != 0;
        }
    }

    public void setSparseBit(byte index, int bit, short value) {
        synchronized (this.lock) {
            int current = this.sparseMaps[index].mk(value);
            int mask = 1 << bit;
            if ((current & mask) != 0) {
                return;
            }
            this.sparseMaps[index].JF0(current | mask, value);
        }
    }

    public int countSparseBits(short value) {
        synchronized (this.lock) {
            return Integer.bitCount(this.sparseMaps[0].mk(value));
        }
    }
}
