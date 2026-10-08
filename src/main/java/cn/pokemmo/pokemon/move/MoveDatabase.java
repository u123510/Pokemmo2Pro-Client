package cn.pokemmo.pokemon.move;

import f.*;

/**
 * 技能数据库管理类 (Move Database)
 * 管理并提供所有宝可梦技能的查询接口。
 *
 * 原混淆类: f.ec0_2
 */
public class MoveDatabase {
    protected static MoveDatabase instance;
    public final w7_0 f4;

    public MoveDatabase() {
        this.f4 = new w7_0();
    }

    public static MoveDatabase getInstance() {
        if (instance == null) {
            instance = ec0_2.Sx();
        }
        return instance;
    }

    public final vk0_1 SX(short key) {
        return (vk0_1) this.f4.f5(key);
    }

    public final vk0_1 getMove(short key) {
        return SX(key);
    }

    public final M Com6() {
        return new M(this.f4);
    }

    public final M getAllMoves() {
        return Com6();
    }

    public final vk0_1 Pc0(String name) {
        if (name == null) {
            return null;
        }
        String target = name.toLowerCase();
        V3 iterator = new V3(this.f4);
        while (iterator.hasNext()) {
            vk0_1 value = (vk0_1) iterator.u7();
            if (sm0_0.c0(value.bt).toLowerCase().equals(target)) {
                return value;
            }
        }
        return null;
    }

    public final vk0_1 findByName(String name) {
        return Pc0(name);
    }

    public final vk0_1 Pu0(String name) {
        if (name == null) {
            return null;
        }
        String target = name.toLowerCase().replaceAll("[-_\\s]", "");
        V3 iterator = new V3(this.f4);
        while (iterator.hasNext()) {
            vk0_1 value = (vk0_1) iterator.u7();
            String candidate = sm0_0.c0(value.bt).toLowerCase().replaceAll("[-_\\s]", "");
            if (candidate.equals(target)) {
                return value;
            }
        }
        return null;
    }

    public final vk0_1 findByNormalizedName(String name) {
        return Pu0(name);
    }
}
