package f;

import cn.pokemmo.rom.nds.camera.CameraBoundaryData;
import java.nio.ByteBuffer;

/**
 * Shim: M90 -> CameraBoundaryData
 * @see cn.pokemmo.rom.nds.camera.CameraBoundaryData
 */
public final class M90 extends CameraBoundaryData {
    public M90(short region, ByteBuffer data) {
        super(region, data);
    }
}
