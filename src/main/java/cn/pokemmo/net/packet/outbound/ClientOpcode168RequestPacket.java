package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;

public class ClientOpcode168RequestPacket extends RE {
    public final List<lj0_2> s6;
    public final boolean Xd;

    public ClientOpcode168RequestPacket(boolean flag, List<lj0_2> values) {
        super(168);
        this.s6 = values;
        this.Xd = flag;
        this.s6.sort(Comparator.comparing(lj0_2::ZG0));
    }

    @Override
    public final void ig0(k20_0 source, ByteBuffer buffer) {
        buffer.put((byte) (this.Xd ? 1 : 0));
        buffer.putShort((short) this.s6.size());
        if (this.s6.isEmpty()) {
            return;
        }
        long previous = this.s6.get(0).Zi0;
        buffer.putLong(previous);
        for (lj0_2 value : this.s6) {
            buffer.put(value.eL);
            long delta = value.Zi0 - previous;
            previous = delta;
            if (delta > 32767L) {
                buffer.putShort((short) -1);
                buffer.putLong(value.Zi0);
            } else {
                buffer.putShort((short) delta);
            }
            switch (value.eL) {
                case 0:
                case 1:
                    buffer.put(value.Ya0);
                    buffer.put(value.ka0);
                    break;
                case 2:
                case 3:
                    buffer.put(value.Ya0);
                    buffer.put(value.uu0);
                    buffer.putShort(value.lpT3);
                    buffer.putShort(value.Dl);
                    break;
                case 4:
                case 9:
                case 14:
                    buffer.putShort(value.lpT3);
                    buffer.putShort(value.Dl);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    buffer.put(value.ka0);
                    break;
                default:
                    break;
            }
        }
    }
}
