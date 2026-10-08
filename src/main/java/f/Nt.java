package f;

import cn.pokemmo.net.packet.outbound.action.AbstractBattleActionPacket;

/**
 * 对战动作数据包基类兼容门面
 * 核心实现已迁移至 cn.pokemmo.net.packet.outbound.action.AbstractBattleActionPacket
 */
public abstract class Nt extends AbstractBattleActionPacket {

    public Nt() {
        super();
    }
}
