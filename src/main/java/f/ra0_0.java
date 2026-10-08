package f;

import cn.pokemmo.rom.nds.model.NdsModelArchiveManager;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.model.NdsModelArchiveManager
 */
public class ra0_0 extends NdsModelArchiveManager {
    public ra0_0() {
        super();
        Kr = this;
    }
    public static ra0_0 Ao0() { return Kr; }
    public static Ou0 UT(int i0) { return NdsModelArchiveManager.UT(i0); }
    public static Ou0 R1(int i0) { return NdsModelArchiveManager.R1(i0); }
}
