package cn.pokemmo.world.render.mesh;

import f.BP;
import f.wm_1;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/**
 * 网格子网格数据容器 (Mesh Submesh Container)
 * <p>
 * 原始混淆类: {@code f.v50_0}
 */
public class MeshSubmeshContainer {
    public final ArrayList<BP> gq = new ArrayList<>();

    public MeshSubmeshContainer(short s, int n, wm_1 wm_12) {
        int n2;
        ByteBuffer byteBuffer = wm_12.AO();
        byteBuffer.position(n - wm_12.O7);
        for (int i = 0; i < 20 && (n2 = byteBuffer.getInt()) != 0; ++i) {
            BP bP2 = new BP(n2, wm_12);
            this.nUl(bP2);
        }
    }

    public ArrayList<BP> pp0() {
        return this.gq;
    }

    public void nUl(BP bP) {
        this.gq.add(bP);
    }
}
