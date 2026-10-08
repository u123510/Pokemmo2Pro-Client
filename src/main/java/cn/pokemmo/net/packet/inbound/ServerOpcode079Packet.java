package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ServerOpcode079Packet extends GH {
    public final HashMap RF;
    public final HashMap mn0;

    public ServerOpcode079Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.RF = new HashMap();
        this.mn0 = new HashMap();
    }

    @Override
    public final void Oj0() {
        int typeCount = this.Rj.getShort() & 65535;
        for (int index = 0; index < typeCount; ++index) {
            this.RF.put(Short.valueOf(this.Rj.getShort()), N2.FW(this.Rj.get()));
        }

        int ruleCount = this.Rj.get() & 255;
        for (int index = 0; index < ruleCount; ++index) {
            N2 type = N2.FW(this.Rj.get());
            wx_2 rules = new wx_2();
            this.mn0.put(type, rules);
            int valueCount = this.Rj.getShort() & 65535;
            for (int valueIndex = 0; valueIndex < valueCount; ++valueIndex) {
                rules.TI0(this.Rj.getShort());
            }
        }
    }

    @Override
    public final void os0() {
        for (Object value : mp_1.vf0().k2.values()) {
            cq_0 record = (cq_0) value;
            N2 primaryType = (N2) this.RF.get(Short.valueOf(record.dR));
            if (primaryType == null) {
                primaryType = N2.J8;
            }
            record.gq0 = primaryType;
            record.lD.clear();

            for (N2 type : N2.ar0) {
                wx_2 rules = (wx_2) this.mn0.get(type);
                if (rules.bL0(record.dR)) {
                    record.lD.add(type);
                }
            }
        }

        BU interfaceState = ((BR) this.sr0()).lZ.zK0;
        if (interfaceState != null) {
            fd0_0 panel = interfaceState.le;
            if (panel != null) {
                panel.Ub0();
            }
        }
    }
}
