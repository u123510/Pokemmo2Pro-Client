package cn.pokemmo.collection.binary;

import f.be0_1;
import f.es_1;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.function.Supplier;

public class BinaryRecordSequence implements Iterable {
    public final short XU;
    public final es_1 Ks;

    public BinaryRecordSequence(ByteBuffer buffer, Supplier supplier, int offset) {
        this(buffer, supplier, offset, new int[]{0});
    }

    public BinaryRecordSequence(ByteBuffer buffer, Supplier supplier, int offset, int... positions) {
        buffer.get();
        short count = (short)(buffer.get() & 0xFF);
        this.XU = count;
        buffer.getShort();
        buffer.getShort();
        buffer.getShort();
        buffer.getInt();
        this.Ks = new es_1(count);
        if (count <= 0) {
            return;
        }
        for (int i = 0; i < this.XU; ++i) {
            buffer.getInt();
        }
        buffer.getShort();
        buffer.getShort();
        for (int i = 0; i < this.XU; ++i) {
            be0_1 entry = (be0_1)supplier.get();
            entry.getClass();
            entry.pH(buffer, positions);
            this.Ks.Ue0(entry);
        }
        for (int i = 0; i < this.XU; ++i) {
            byte[] name = new byte[16];
            buffer.get(name);
            ((be0_1)this.Ks.get(i)).QW = new String(name).trim();
        }
        int position = buffer.position();
        for (int i = 0; i < this.XU; ++i) {
            be0_1 entry = (be0_1) this.Ks.get(i);
            if (entry.a00 >= 0) {
                entry.a00 += offset;
                buffer.position(entry.a00);
                entry.vD(buffer);
            }
        }
        buffer.position(position);
    }

    @Override
    public Iterator iterator() {
        return this.Ks.ZD();
    }

    public final be0_1 k00(int index) {
        return (be0_1)this.Ks.get(index);
    }

    public final int size() {
        return this.Ks.KB;
    }
}
