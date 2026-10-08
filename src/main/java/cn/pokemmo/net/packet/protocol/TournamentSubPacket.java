package cn.pokemmo.net.packet.protocol;

import f.*;

public class TournamentSubPacket extends BaseSubProtocolPacket {
    public TournamentSubPacket(byte b) {
        super((byte) 8, b);
    }

    @Override
    public final boolean Ev0(CE ce, cq_0 cq_0) {
        if (ce == null) {
            return false;
        }
        switch (this.HU) {
            case 0:
                return ce.I();
            case 1:
                if (!ce.I() || !ce.u3()) {
                    return false;
                }
                return true;
            case 2:
                if (!ce.I() || ce.u3()) {
                    return false;
                }
                return true;
            case 3:
                return !ce.I();
            default:
                return true;
        }
    }
}
