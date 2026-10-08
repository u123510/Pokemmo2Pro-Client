package f;

import cn.pokemmo.world.camera.WorldCameraAngleSettings;
import java.nio.ByteBuffer;

/**
 * Shim: w20_0 -> WorldCameraAngleSettings
 * @see cn.pokemmo.world.camera.WorldCameraAngleSettings
 */
public final class w20_0 extends WorldCameraAngleSettings {
    public w20_0(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }
}
