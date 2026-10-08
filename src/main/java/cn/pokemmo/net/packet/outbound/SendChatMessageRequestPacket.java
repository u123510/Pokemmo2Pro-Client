package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class SendChatMessageRequestPacket extends RE {
    public final CH0 hp0;
    public final CH0 WX;
    public final String Lpt1;
    public final hb_2 lPt7;

    public SendChatMessageRequestPacket() {
        super(162);
        this.hp0 = CH0.j1;
        this.WX = CH0.j1;
        this.Lpt1 = null;
        this.lPt7 = hb_2.lf0;
    }

    public SendChatMessageRequestPacket(CH0 id, String text) {
        super(162);
        this.WX = CH0.j1;
        this.lPt7 = hb_2.gE0;
        this.hp0 = id;
        this.Lpt1 = text;
    }

    public SendChatMessageRequestPacket(CH0 first, CH0 second) {
        super(162);
        this.lPt7 = hb_2.Rq0;
        this.hp0 = first;
        this.WX = second;
        this.Lpt1 = null;
    }

    @Override
    public final void ig0(k20_0 connection, ByteBuffer buffer) {
        buffer.put(this.lPt7.uj0);
        int type;
        switch (this.lPt7.AI0) {
            case 1:
                type = 1;
                break;
            case 2:
                type = 2;
                break;
            default:
                type = 0;
                break;
        }
        if (type == 1) {
            buffer.putLong(this.hp0.Sa);
            bo_1.cK(this.Lpt1, buffer);
        } else if (type == 2) {
            buffer.putLong(this.hp0.Sa);
            buffer.putLong(this.WX.Sa);
        }
    }
}
