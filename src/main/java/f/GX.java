package f;

import cn.pokemmo.net.buffer.stream.IntegerIndexByteBuffer;
import cn.pokemmo.net.buffer.stream.BaseNetworkByteBuffer;

public abstract class GX extends IntegerIndexByteBuffer {
    public GX() {
        super();
    }
    public GX(int size) {
        super(size);
    }
}
