package f;

import cn.pokemmo.rom.nds.model.NdsField3DModelManager;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.model.NdsField3DModelManager
 */
public final class fi_0 extends NdsField3DModelManager {
    public fi_0() {
        super();
        Vf0 = this;
        instance = this;
    }
    public static fi_0 Vf0;
    public static fi_0 xL() {
        if (Vf0 == null) {
            Vf0 = new fi_0();
            instance = Vf0;
        }
        return Vf0;
    }
}
