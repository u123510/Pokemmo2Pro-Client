package cn.pokemmo.world.render.mesh;

import f.sk_1;
import java.nio.ByteBuffer;

/**
 * 网格索引表 (Mesh Index Table)
 * <p>
 * 从二进制流中批量加载并按 ID 检索 {@link MeshIndexEntry} 条目。
 * <p>
 * 原始混淆类: {@code f.CU}
 */
public class MeshIndexTable {
    public final sk_1[] a8;

    public MeshIndexTable(ByteBuffer buffer) {
        int count = buffer.getInt();
        this.a8 = new sk_1[count];
        for (int i = 0; i < count; i++) {
            this.a8[i] = new sk_1(buffer);
        }
    }

    public sk_1[] getEntries() {
        return this.a8;
    }

    public sk_1 findEntryById(short id) {
        for (sk_1 entry : this.a8) {
            if (entry.oe0 == id) {
                return entry;
            }
        }
        return null;
    }

    public sk_1 p80(short id) {
        return findEntryById(id);
    }
}
