package cn.pokemmo.script.action;

import f.Wm0;
import f.oc0_0;
import f.xr_2;

/**
 * 地图脚本变量与动作执行器基类
 * 对应混淆基类: f.oc0_0 (实现 f.xr_2)
 * 负责地图脚本指令解析、变量状态存取、条件判断与游戏状态联动。
 */
public abstract class BaseScriptAction extends oc0_0 implements xr_2 {

    public BaseScriptAction() {
        super();
    }

    @SuppressWarnings("unchecked")
    public final <T extends oc0_0> T asBridge() {
        return (T) (Object) this;
    }
}
