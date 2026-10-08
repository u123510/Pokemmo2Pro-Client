package cn.pokemmo.battle;

import f.OJ;
import f.YL0;
import f.bm0_1;
import f.com9__2;
import f.jx_2;
import f.tu_0;
import java.util.Collection;
import java.util.stream.Collectors;

public class ActiveBattleEntryFilter {
    public static final ActiveBattleEntryFilter ZG = new ActiveBattleEntryFilter();
    public final bm0_1 kg;

    public ActiveBattleEntryFilter() {
        this.kg = new bm0_1();
    }

    public static boolean dD0(OJ entry) {
        tu_0 type = entry.u;
        if (type == tu_0.M4) {
            return true;
        }
        return ((jx_2) com9__2.Om.go.get(type)).Be();
    }

    public Collection instanceof$() {
        return (Collection) new YL0(this.kg).stream()
            .filter(item -> dD0((OJ) item))
            .collect(Collectors.toList());
    }
}
