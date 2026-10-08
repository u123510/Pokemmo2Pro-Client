package f;

import cn.pokemmo.rom.map.TownMapLocationDescriptor;

/**
 * 垫片类 (Backward compatibility shim)
 * 现代化实现: cn.pokemmo.rom.map.TownMapLocationDescriptor
 */
public class vf_0 extends TownMapLocationDescriptor {
    public vf_0(int... nArray) { super(nArray); }
    public vf_0(yi_0 yi_02, byte b, byte b2, byte b3, int i) { super(yi_02, b, b2, b3, i); }
    public vf_0(yi_0 yi_02, byte b, byte b2, byte b3, int i, ro_0 ro_02, byte b4) { super(yi_02, b, b2, b3, i, ro_02, b4); }
    public vf_0(yi_0 yi_02, byte b, byte b2, byte b3, int i, ro_0 ro_02, byte b4, byte b5, byte b6) { super(yi_02, b, b2, b3, i, ro_02, b4, b5, b6); }
    public static final int[] RD0 = TownMapLocationDescriptor.RD0;
}
