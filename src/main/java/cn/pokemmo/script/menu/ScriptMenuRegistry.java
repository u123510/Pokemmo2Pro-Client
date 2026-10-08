package cn.pokemmo.script.menu;

import f.a20;
import f.bm0_1;
import f.LG0;

/**
 * 脚本多选菜单注册表 (Script Menu Registry / Option Table)
 * 维护 byte 类型 ID 到 ScriptMenuOptionGroup (LG0) 的映射缓存。
 *
 * 原混淆类: f.a20
 */
public class ScriptMenuRegistry {
    public final a20 asBridge() {
        return (a20) (Object) this;
    }

    public final bm0_1 cT;
    public final bm0_1 Fm0;

    public ScriptMenuRegistry() {
        this.cT = new bm0_1();
        this.Fm0 = new bm0_1();
    }

    public static void vh(a20 registry, LG0 option) {
        registry.cT.gE0(option.w90, option);
    }

    public void registerOption(ScriptMenuOptionGroup option) {
        this.cT.gE0(option.w90, option);
    }

    public ScriptMenuOptionGroup getOption(byte type) {
        return (ScriptMenuOptionGroup) this.cT.BM(type);
    }
}
