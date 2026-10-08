package f;

import cn.pokemmo.graphics.model.ModelBoneTransformRecord;
import java.nio.ByteBuffer;

/**
 * Shim: qa0_0 -> ModelBoneTransformRecord
 * @see cn.pokemmo.graphics.model.ModelBoneTransformRecord
 */
public final class qa0_0 extends ModelBoneTransformRecord {
    public qa0_0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public qa0_0(short x, short y, short z, short w) {
        super(x, y, z, w);
    }
}
