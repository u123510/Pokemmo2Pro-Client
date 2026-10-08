package cn.pokemmo.ui.dialog.base;

import f.S0;

/**
 * 对话框交互完成选择回调接口 (Message Box Selection Callback)
 *
 * 原混淆接口: f.S0
 */
@FunctionalInterface
public interface MessageBoxCallback extends S0 {

    /**
     * 当用户做出选择或对话框关闭时触发回调
     *
     * @param selection 选择的选项索引或状态码 (原 var1)
     */
    @Override
    void Dk(byte selection);
}
