package f;

import cn.pokemmo.collection.binary.BinaryRecordSequence;
import java.nio.ByteBuffer;
import java.util.function.Supplier;

public final class aux__1 extends BinaryRecordSequence {
    public aux__1(ByteBuffer buffer, Supplier supplier, int offset) {
        super(buffer, supplier, offset);
    }

    public aux__1(ByteBuffer buffer, Supplier supplier, int offset, int... positions) {
        super(buffer, supplier, offset, positions);
    }
}
