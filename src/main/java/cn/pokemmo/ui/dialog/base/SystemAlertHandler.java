package cn.pokemmo.ui.dialog.base;

import f.*;

/**
 * 系统模态警报与确认弹窗抽象处理器 (System Alert Handler)
 * 提供全屏阻断式错误警报提示框与二选一确认操作的通用调用接口。
 *
 * 原混淆类: f.ss_2
 */
public abstract class SystemAlertHandler {
    public SystemAlertHandler() {
    }

    public final void Ns0(String str, Runnable runnable) {
        Ef0("Error", str, UE.iC, runnable, false);
    }

    public abstract void Ef0(String str, String str2, UE ue, Runnable runnable, boolean z);

    public abstract void Qu(String str, String str2, UE ue, Runnable runnable, Runnable runnable2, boolean z);
}
