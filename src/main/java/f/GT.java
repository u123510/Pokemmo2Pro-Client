package f;

import cn.pokemmo.io.stream.QuadShortHeaderParser;
import java.nio.ByteBuffer;

public final class GT extends QuadShortHeaderParser {
    public GT(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
