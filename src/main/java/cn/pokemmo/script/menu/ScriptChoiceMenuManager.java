package cn.pokemmo.script.menu;

import f._case;
import f.a20;
import f.LG0;
import f.sm0_0;

/**
 * 脚本多选选项全局管理器 (Script Choice Menu Manager)
 * 维护并解析来自各个 ROM 版本及服务端脚本的多选选项菜单（电脑操作、商店买卖、百货电梯、NPC 问答等）。
 *
 * 原混淆类: f._case
 */
public class ScriptChoiceMenuManager {
    public final _case asBridge() {
        return (_case) (Object) this;
    }

    public static final String[] EMPTY_OPTIONS = new String[0];
    public static final String[] P2 = EMPTY_OPTIONS;
    public static _case P0;

    public final a20[] vm0;

    public ScriptChoiceMenuManager() {
        this.vm0 = new a20[11];
        for (int index = 0; index < this.vm0.length; ++index) {
            this.vm0[index] = new a20();
        }
    }

    public static _case DX() {
        return P0;
    }

    public static _case getInstance() {
        return P0;
    }

    /**
     * 根据索引与类型解析并生成对应的多选选项字符串列表 (原 COm1)
     */
    public final String[] COm1(byte index, byte type, String... values) {
        if (index < 0 || index >= this.vm0.length) {
            return P2;
        }
        a20 entry = this.vm0[index];
        if (entry == null) {
            return P2;
        }
        LG0 option = (LG0) entry.cT.BM(type);
        if (option == null) {
            return P2;
        }
        if (option.jv0 == null) {
            return option.wM != null ? option.wM : P2;
        }
        String[] result = new String[option.jv0.length];
        for (int i = 0; i < result.length; ++i) {
            result[i] = sm0_0.Bx(option.jv0[i], values);
        }
        return result;
    }

    /**
     * 获取指定单项选项文本 (原 tG)
     */
    public final String tG(byte index, byte type, int item) {
        String[] values = this.COm1(index, type, new String[0]);
        if (values.length <= item) {
            return "";
        }
        return values[item];
    }

    /**
     * 向自定义脚本菜单注册纯文本选项列表 (原 A)
     */
    public final void A(byte index, String... values) {
        a20.vh(this.vm0[10], new LG0(index, values));
    }

    /**
     * 向自定义脚本菜单注册本地化资源 ID 选项列表 (原 Yw)
     */
    public final void Yw(byte index, int... values) {
        a20.vh(this.vm0[10], new LG0(index, values));
    }
}
