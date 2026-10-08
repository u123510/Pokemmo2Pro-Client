package cn.pokemmo.ui.dialog.base;

import f.bm0_1;
import f.jm_1;

/**
 * 对话气泡样式与交互行为类型定义 (Message Box Type & Style)
 * 对应服务端下发的各类 NPC 交互、多选菜单、打字机速度与关闭行为配置。
 *
 * 原混淆类: f.jm_1
 */
public class MessageBoxType {
    public final jm_1 asBridge() {
        return (jm_1) (Object) this;
    }

    public final byte KE;
    public final boolean qP;
    public final boolean Ms0;
    public final int an;

    public MessageBoxType(int an, int ke, boolean qp, boolean ms0) {
        this.an = an;
        this.KE = (byte) ke;
        this.qP = qp;
        this.Ms0 = ms0;
    }

    public final boolean pS() {
        return this.qP;
    }

    public final int PB() {
        return this.an;
    }

    public byte getTypeKey() {
        return this.KE;
    }

    public boolean isQuickPaging() {
        return this.qP;
    }

    public boolean isModalState() {
        return this.Ms0;
    }

    public int getActionId() {
        return this.an;
    }
}
