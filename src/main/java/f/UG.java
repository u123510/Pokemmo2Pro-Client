package f;

import cn.pokemmo.rom.nds.bw.BwMapZoneEvents;

/**
 * 黑白地图事件解包器垫片
 * 现代化实现: cn.pokemmo.rom.nds.bw.BwMapZoneEvents
 */
public final class UG extends F90 {
    public UG(Ae ae) {
        super();
        BwMapZoneEvents modern = new BwMapZoneEvents(ae);
        this.pJ0 = modern.pJ0;
        this.K1 = modern.K1;
        this.Ct0 = modern.Ct0;
        this.wn0 = modern.wn0;
    }
}
