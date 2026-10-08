/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.net.packet.protocol;

import f.*;

import f.CE;
import f.Mg;
import f.cq_0;
import java.nio.ByteBuffer;

/*
 * Renamed from f.af0
 */
public class AuthChallengePacket
extends BaseSystemProtocolPacket {
    public AuthChallengePacket() {
        super((byte)21);
    }

    @Override
    public final boolean Ev0(CE cE, cq_0 object) {
        short s;
        cq_0 cq_02 = ((cq_0)object).ng;
        if (cq_02 != null) {
            object = cq_02;
        }
        return ((cq_0)object).N80((byte)0) || ((cq_0)object).N80((byte)-1) || (s = ((cq_0)object).dR) == 29 || s == 314;
    }

    @Override
    public final void hG(ByteBuffer byteBuffer) {
        byteBuffer.put(this.mG);
    }
}

