package f;

import cn.pokemmo.rom.nds.model.NdsNitroModelParser;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.nds.model.NdsNitroModelParser
 */
public class v80_0 extends NdsNitroModelParser {
    public v80_0() { super(); }
    public static v80_0 Cb0() {
        if (LPT1 == null) {
            LPT1 = new v80_0();
        }
        return (v80_0) LPT1;
    }
}
