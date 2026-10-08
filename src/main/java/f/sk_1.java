package f;

import cn.pokemmo.world.render.mesh.MeshIndexEntry;
import java.nio.ByteBuffer;

/**
 * Shim: sk_1 -> MeshIndexEntry
 * @see cn.pokemmo.world.render.mesh.MeshIndexEntry
 */
public final class sk_1 extends MeshIndexEntry {
    public sk_1(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    public sk_1(short id, short meshIndex) {
        super(id, meshIndex);
    }
}
