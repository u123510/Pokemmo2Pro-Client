package cn.pokemmo.net.packet;

import f.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 现代化重构类 - 原始混淆类: f.V6
 */
public class Modern_Net_V6
extends Jh {

    public Modern_Net_V6(byte by, con__6 con__62, sv_2[] sv_2Array, byte by2) {
        super(by, con__62, sv_2Array, by2);
    }

    public static String og0(sv_2 sv_22) {
        return sv_22.Uf0.zn();
    }

    @Override
    public final String T8(a10_0 a10_02) {
        List<String> list = this.l40.values().stream().map(V6::og0).collect(Collectors.toList());
        if (list.size() <= 2) {
            return super.T8(a10_02);
        }
        return sm0_0.yN(list.size() == 3 ? 5073 : 5074, list.toArray(new String[0]));
    }
}


