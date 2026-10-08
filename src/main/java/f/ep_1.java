package f;

import cn.pokemmo.rom.nds.dppt.DpptMapZoneEvents;

/**
 * 珍钻/白金地图事件解包器垫片
 * 现代化实现: cn.pokemmo.rom.nds.dppt.DpptMapZoneEvents
 */
public final class ep_1 extends F90 {
    public ep_1(Ae ae) {
        super();
        DpptMapZoneEvents modern = new DpptMapZoneEvents(ae);
        this.pJ0 = modern.pJ0;
        this.K1 = modern.K1;
        this.Ct0 = modern.Ct0;
        this.wn0 = modern.wn0;
    }
}
