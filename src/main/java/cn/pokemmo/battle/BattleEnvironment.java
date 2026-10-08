package cn.pokemmo.battle;

/**
 * 战场环境与场地类型 (Battle Environment / Terrain)
 * 记录战斗发生的场景环境（草地、洞穴、水面、建筑内部、特殊道馆/锦标赛场地等）。
 *
 * 原混淆类: f.zg0_0
 */
public class BattleEnvironment {
    public final byte yd;
    public final boolean u;

    public BattleEnvironment(byte value, boolean enabled) {
        this.yd = value;
        this.u = enabled;
    }

    public byte getId() {
        return this.yd;
    }

    public boolean isSpecial() {
        return this.u;
    }

    public final boolean aB0() {
        return this.u;
    }
}
