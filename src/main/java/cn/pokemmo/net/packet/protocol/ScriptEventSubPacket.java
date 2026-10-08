package cn.pokemmo.net.packet.protocol;

import f.*;

public class ScriptEventSubPacket extends BaseSubProtocolPacket {
    public final QL Jx0;

    public ScriptEventSubPacket(QL v1) {
        super((byte) 12, v1.Ex());
        this.Jx0 = v1;
    }

    public final boolean Ev0(CE v1, cq_0 v2) {
        QL q = this.Jx0;
        if (q == QL.Ll) {
            return (byte) (v1.bG0.length + (v1.I() ? 1 : 0)) > 0;
        } else if (q == QL.lQ) {
            return (byte) (v1.bG0.length + (v1.I() ? 1 : 0)) == 0;
        } else {
            return v1.dO(q);
        }
    }

    public final boolean L6() {
        return !this.Jx0.Nw();
    }
}
