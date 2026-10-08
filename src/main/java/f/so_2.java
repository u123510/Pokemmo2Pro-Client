package f;

import cn.pokemmo.net.packet.outbound.TrainerCustomizationOutboundPacket;

/**
 * 训练家形象出站包兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.outbound.TrainerCustomizationOutboundPacket
 */
public abstract class so_2 extends TrainerCustomizationOutboundPacket {

    public so_2(int opcode) {
        super(opcode);
    }

    public so_2() {
        super();
    }
}
