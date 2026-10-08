package cn.pokemmo.net.packet.outbound.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.bo_1;
import f.lpt5__3;
import java.nio.ByteBuffer;

public class Action008OutboundPacket
extends BaseOutboundActionPacket {
    public final String Md0;

    public Action008OutboundPacket(String string) {
        super(8);
        this.Md0 = string;
    }

    @Override
    public final void Xn0(ByteBuffer byteBuffer) {
        bo_1.cK(this.Md0, byteBuffer);
    }
}
