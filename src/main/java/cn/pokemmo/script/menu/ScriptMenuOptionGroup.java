package cn.pokemmo.script.menu;

import f.LG0;

/**
 * 脚本多选菜单选项条目 (Script Menu Option Group / Entry)
 * 封装一组菜单项的选项 ID、纯文本字符串列表或字串资源 ID 列表，以及默认选中的项索引。
 *
 * 原混淆类: f.LG0
 */
public class ScriptMenuOptionGroup {
    public final LG0 asBridge() {
        return (LG0) (Object) this;
    }

    /** 选项索引/类型 ID (原 w90) */
    public byte w90;
    /** 纯文本字符串列表 (原 wM) */
    public final String[] wM;
    /** 字符串本地化资源 ID 列表 (原 jv0) */
    public final int[] jv0;
    /** 默认选中的选项索引 (原 BQ)，默认为 0 */
    public int BQ = 0;

    public ScriptMenuOptionGroup(byte by, String[] stringArray) {
        this.w90 = by;
        this.wM = stringArray;
        this.jv0 = null;
    }

    public ScriptMenuOptionGroup(byte by, int[] nArray) {
        this.w90 = by;
        this.wM = null;
        this.jv0 = nArray;
    }

    public byte getMenuId() {
        return this.w90;
    }

    public String[] getRawOptions() {
        return this.wM;
    }

    public int[] getStringIdOptions() {
        return this.jv0;
    }

    public int getDefaultSelectionIndex() {
        return this.BQ;
    }

    public void setDefaultSelectionIndex(int index) {
        this.BQ = index;
    }
}
