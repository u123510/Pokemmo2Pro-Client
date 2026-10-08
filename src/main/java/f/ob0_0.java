package f;

import cn.pokemmo.rom.nds.bw.BwBadgeModelLoader;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.bw.BwBadgeModelLoader
 */
public class ob0_0 extends BwBadgeModelLoader {
    public ob0_0() { super(); }
    public static final dl_1 fo0 = BwBadgeModelLoader.fo0;
    public static ob0_0 Ui0() {
        if (sr == null) {
            sr = new ob0_0();
        }
        return sr;
    }
}
