package cn.pokemmo.net.packet.outbound.action;

import f.*;
import cn.pokemmo.net.packet.OutboundPacket;

/**
 * 对战行动出站数据包抽象基类 (Abstract Battle Action Packet)
 * 对应混淆类: f.Nt
 * 承载所有对战动作数据包 (共 151 个子类) 的通用标记位、源与目标玩家标识及有效性判定。
 */
public abstract class AbstractBattleActionPacket extends OutboundPacket {
    public byte pj0;
    public CH0 jA0;
    public CH0 fe0;

    public AbstractBattleActionPacket() {
        super();
        this.pj0 = 0;
        this.jA0 = CH0.j1;
        this.fe0 = CH0.j1;
    }

    public final boolean Ja0(byte value) {
        int current = this.pj0;
        return (value | current) == current;
    }

    public final void V5() {
        this.pj0 = (byte) (this.pj0 | 32);
    }

    public boolean Hm() {
        switch (this.BL0()) {
            case -32:
            case -30:
            case -29:
            case -24:
            case -23:
            case -18:
            case -16:
            case -9:
            case 12:
            case 17:
            case 28:
            case 29:
            case 51:
            case 81:
            case 97:
            case 101:
            case 103:
            case 104:
                return false;
            default:
                return true;
        }
    }

    public abstract byte BL0();

    // 现代 API 别名
    public final boolean hasFlag(byte flag) {
        return this.Ja0(flag);
    }

    public final void setExecutedFlag() {
        this.V5();
    }

    public final boolean requiresTarget() {
        return this.Hm();
    }

    public final byte getActionId() {
        return this.BL0();
    }
}
