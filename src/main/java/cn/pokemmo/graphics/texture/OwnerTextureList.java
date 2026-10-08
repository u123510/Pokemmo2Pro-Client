package cn.pokemmo.graphics.texture;

import com.badlogic.gdx.graphics.Texture;
import f.Dn0;
import f.fy0_0;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 持有者纹理生命周期托管列表
 * 原始类: f.O50
 */
public class OwnerTextureList implements fy0_0 {
    public final Dn0 E3;
    public final ArrayList mO;

    public OwnerTextureList(Dn0 owner) {
        this.mO = new ArrayList();
        this.E3 = owner;
    }

    @Override
    public final void dispose() {
        Iterator iterator = this.mO.iterator();
        while (iterator.hasNext()) {
            ((Texture) iterator.next()).dispose();
        }
        this.mO.clear();
    }
}
