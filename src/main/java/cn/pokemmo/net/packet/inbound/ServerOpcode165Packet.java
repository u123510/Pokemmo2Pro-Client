package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode165Packet extends GH {
    public byte Je;
    public Fd0 TL0;

    public ServerOpcode165Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.TL0 = null;
    }

    @Override
    public final void Oj0() {
        this.Je = this.Rj.get();
        byte flags = this.Rj.get();
        if (flags == 0) {
            return;
        }
        this.Rj.get();
        byte parameter = this.Rj.get();
        int stringId = -1;
        String text = "";
        if ((flags & 1) != 0) {
            stringId = this.Rj.getInt();
        }
        iz0_0[] arguments;
        if ((flags & 2) != 0) {
            byte count = this.Rj.get();
            arguments = new iz0_0[count];
            for (int i = 0; i < count; i++) {
                arguments[i] = this.vG();
            }
        } else {
            arguments = new iz0_0[0];
        }
        if ((flags & 4) != 0) {
            text = this.q60();
        }
        if (stringId != -1) {
            this.TL0 = new Fd0(this.Je, stringId, parameter, arguments);
        } else {
            this.TL0 = new Fd0(this.Je, text, parameter, arguments);
        }
    }

    @Override
    public final void os0() {
        Fd0 value = this.TL0;
        if (value != null) {
            int stringId = value.ai0;
            if (stringId != -1) {
                String translated = (String) sm0_0.cU.get(stringId);
                if (translated == null) {
                    translated = yr_1.pG("STRING_", stringId);
                } else {
                    translated = sm0_0.Qc0(sm0_0.X10(translated, value.bS));
                }
                value.EU = translated;
            } else {
                String translated = sm0_0.dd(value.EU);
                if (value.bS != null && value.bS.length > 0) {
                    translated = sm0_0.X10(translated, value.bS);
                }
                value.EU = translated;
            }
        }
        Ge0 session = this.sr0();
        synchronized (session.KE) {
            if (this.TL0 != null) {
                session.KE.gE0(this.Je, this.TL0);
            } else {
                session.KE.lz0(this.Je);
            }
        }
    }
}
