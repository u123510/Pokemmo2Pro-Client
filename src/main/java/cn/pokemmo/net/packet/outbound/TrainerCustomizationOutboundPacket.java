package cn.pokemmo.net.packet.outbound;

import f.*;
import cn.pokemmo.net.packet.OutboundPacket;
import java.nio.ByteBuffer;

/**
 * 训练家形象与换装数据出站包基类 (Trainer Customization Outbound Packet)
 * 对应混淆类: f.so_2
 */
public abstract class TrainerCustomizationOutboundPacket extends OutboundPacket {

    public TrainerCustomizationOutboundPacket(int opcode) {
        super(opcode);
    }

    public TrainerCustomizationOutboundPacket() {
        super();
    }

    public static void writeCustomization(ByteBuffer byteBuffer, qe0_2 customization) {
        byte by;
        int n;
        byteBuffer.put(customization.Fw);
        short s = 0;
        q10_0[] q10_0Array = q10_0.Pn0;
        int n2 = q10_0.Pn0.length;
        for (n = 0; n < n2; ++n) {
            q10_0 q10_02 = q10_0Array[n];
            by = q10_02.iL;
            if (customization.pr[by] == qe0_2.kX[by] && customization.iu0[by] == 0) continue;
            s = (short) (s | 1 << by);
        }
        byteBuffer.putShort(s);
        q10_0Array = q10_0.Pn0;
        n2 = q10_0.Pn0.length;
        for (n = 0; n < n2; ++n) {
            by = q10_0Array[n].iL;
            if ((s & 1 << by) == 0) continue;
            short s2 = customization.pr[by];
            by = customization.iu0[by];
            byteBuffer.putShort((short) (s2 & 0x3FF | (by & 0x3F) << 10));
        }
    }

    public static void fb(ByteBuffer byteBuffer, qe0_2 customization) {
        writeCustomization(byteBuffer, customization);
    }
}
