package cn.pokemmo.graphics.gl;

import f.Aa;
import f.u20_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DirectBufferResource extends u20_0 implements Aa {
    static {
        ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder());
    }
}
