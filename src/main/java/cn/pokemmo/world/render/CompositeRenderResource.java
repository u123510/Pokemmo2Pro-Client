package cn.pokemmo.world.render;

import com.badlogic.gdx.graphics.Texture;
import f.fy0_0;
import f.na_0;
import f.ui_1;
import f.yl_0;

/**
 * 复合世界渲染资源
 * 原始类: f.xo0
 */
public class CompositeRenderResource implements fy0_0 {
    public na_0 Bp;
    public ui_1 Qe;
    public Texture gn;
    public boolean Ud;
    public yl_0 ql;

    public CompositeRenderResource() {
        this.Ud = false;
        this.ql = null;
    }

    @Override
    public final void dispose() {
        if (this.Bp != null) {
            this.Bp.dispose();
        }
        if (this.Qe != null) {
            this.Qe.dispose();
        }
        if (this.gn != null) {
            this.gn.dispose();
        }
    }
}
