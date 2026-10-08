package f;

import cn.pokemmo.ui.dialog.bubble.ConfirmRejectDialogBubble;

/**
 * 兼容垫片 (Shim) - 确认/拒绝交互对话气泡
 * 核心实现已迁移至 cn.pokemmo.ui.dialog.bubble.ConfirmRejectDialogBubble
 */
public final class OU extends ConfirmRejectDialogBubble {

    public OU(byte mode, String message) {
        super(mode, message);
    }
}
