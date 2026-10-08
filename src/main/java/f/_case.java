package f;

import cn.pokemmo.script.menu.ScriptChoiceMenuManager;

/**
 * 脚本多选选项全局管理器 兼容垫片
 * 核心实现已迁移至 cn.pokemmo.script.menu.ScriptChoiceMenuManager
 */
public final class _case extends ScriptChoiceMenuManager {

    public static final _case P0;

    static {
        P0 = new _case();
        ScriptChoiceMenuManager.P0 = P0;
    }

    public _case() {
        super();
    }
}
