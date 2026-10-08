package cn.pokemmo.battle.calc;

import f.DC0;
import f.Ry;
import java.nio.ByteBuffer;

/**
 * BaseDamageCalculator - 战斗伤害结算与能力值修正器基类
 * 封装战斗协议解析、伤害数值公式计算、暴击/天气/属性克制修正逻辑。
 */
public abstract class BaseDamageCalculator extends DC0 {

    public BaseDamageCalculator(ByteBuffer byteBuffer, Ry ry, int n) {
        super(byteBuffer, ry, n);
    }
}
