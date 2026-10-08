package cn.pokemmo.pokemon.move;

import f.bm0_1;
import f.sm0_0;
import f.yw_0;

/**
 * 招式伤害分类 (Move Damage Category)
 * 标识招式属于 物理伤害 (Physical)、特殊伤害 (Special) 还是 变化状态 (Status)
 * 原混淆类: f.yw_0
 */
public class MoveDamageCategory {
    public static final yw_0 PHYSICAL = yw_0.c0;
    public static final yw_0 SPECIAL = yw_0.pi0;
    public static final yw_0 STATUS = yw_0.Jy;

    public final byte categoryId;
    public final byte RA0;

    public final int index;
    public final int yG0;

    public MoveDamageCategory(byte type, int value) {
        this.categoryId = type;
        this.RA0 = type;
        this.index = value;
        this.yG0 = value;
    }

    public boolean isPhysical() {
        return this.categoryId == 0;
    }

    public boolean isSpecial() {
        return this.categoryId == 1;
    }

    public boolean isStatus() {
        return this.categoryId == 2;
    }

    @Override
    public String toString() {
        int messageId;
        int mapped = new int[]{1, 2, 3}[this.yG0];
        switch (mapped) {
            case 2:
                messageId = 511;
                break;
            case 3:
                messageId = 512;
                break;
            default:
                messageId = 510;
                break;
        }
        if (!sm0_0.cU.l90(messageId)) {
            return super.toString();
        }
        return sm0_0.c0(messageId);
    }
}
