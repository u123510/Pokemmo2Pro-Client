package cn.pokemmo.net.packet;

import f.*;
import java.nio.ByteBuffer;

public class ServerPacketAckTracker {
    public final wm_1 KF;
    public final int zA;
    public final int vO;
    public final UD[] Ju;
    public final es_1 C30;

    public ServerPacketAckTracker(wm_1 resource, int offset) {
        this.C30 = new es_1();
        this.KF = resource;

        ByteBuffer buffer = resource.AO();
        buffer.position(offset);
        int firstOffset = buffer.getInt();
        int secondOffset = buffer.getInt();
        buffer.getInt();
        this.zA = buffer.getInt();
        this.vO = buffer.getInt();
        this.Ju = new UD[this.vO];

        buffer.position(firstOffset - this.KF.O7);
        buffer.getShort();
        buffer.position(secondOffset - this.KF.O7);

        for (int index = 0; index < 1000; index++) {
            dj0_2 entry = new dj0_2(buffer);
            if (entry.oq == 18) {
                break;
            }
            this.C30.Ue0(entry);
        }

        buffer.position(this.zA - this.KF.O7);
        for (int index = 0; index < this.vO; index++) {
            int address = buffer.getInt();
            short count = buffer.getShort();
            buffer.getShort();
            UD value = new UD((ah0_1) (Object) this, address, count);
            this.Ju[index] = value;
            value.MY();
        }
    }

    public final es_1 lY() {
        return this.C30;
    }
}
