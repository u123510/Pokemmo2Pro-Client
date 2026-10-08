package cn.pokemmo.battle;

import f.CH0;

/**
 * 对战中宝可梦出场概况 (Battle Pokemon Summary)
 * 记录战斗侧位中的宝可梦槽位、所属训练家/控制者、图鉴ID和HP/状态。
 *
 * 原混淆类: f.VF0
 */
public class BattlePokemonSummary {
    public final CH0 O8;
    public final short PA;
    public final short FY;
    public final byte XF0;

    public BattlePokemonSummary(byte slotIndex, CH0 controller, short speciesId, short hpOrStatus) {
        this.O8 = controller;
        this.PA = speciesId;
        this.FY = hpOrStatus;
        this.XF0 = slotIndex;
    }

    public byte getSlotIndex() {
        return this.XF0;
    }

    public CH0 getController() {
        return this.O8;
    }

    public short getSpeciesId() {
        return this.PA;
    }

    public short getHpOrStatus() {
        return this.FY;
    }
}
