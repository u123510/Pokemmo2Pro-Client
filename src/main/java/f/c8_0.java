package f;

import cn.pokemmo.world.time.WorldTimeManager;

/**
 * 兼容垫片 (Shim) - WorldTimeManager
 * 职责: 大世界时间、光影阶段与四季总调度器
 * 原始混淆类: f.c8_0
 * 现代实现: cn.pokemmo.world.time.WorldTimeManager
 */
public final class c8_0 extends WorldTimeManager {
    public static final c8_0 JD0 = new c8_0();

    public static c8_0 A90() {
        return JD0;
    }
}
