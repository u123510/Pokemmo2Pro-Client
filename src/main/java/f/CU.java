package f;

import cn.pokemmo.world.render.mesh.MeshIndexTable;
import java.nio.ByteBuffer;

/**
 * Shim: CU -> MeshIndexTable
 * @see cn.pokemmo.world.render.mesh.MeshIndexTable
 */
public final class CU extends MeshIndexTable {
    public CU(ByteBuffer var1) {
        super(var1);
    }
}
