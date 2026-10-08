package cn.pokemmo.ui.dialog.base;

import f.BR;
import f.CH0;
import f.Qy0;
import f.S0;
import f.hg_2;
import f.iw_1;
import f.jm_1;
import f.kt_0;
import f.le0_2;
import f.tj0_0;
import f.tr_1;
import f.tw0_0;

/**
 * 所有对话框与交互气泡视窗的抽象基类 (Abstract Message Box)
 * 管理气泡视窗的生命周期、交互完成状态、响应回调与网络数据包发送。
 *
 * 原混淆类: f.iw_1
 */
public abstract class AbstractMessageBox extends le0_2 implements tr_1 {

    /** 对话框实例标识 ID (原 gB0) */
    public byte gB0;
    /** 对话框样式与行为枚举 (原 Qq0) */
    public jm_1 Qq0;
    /** 绑定的目标 NPC 或玩家实体 ID (原 Ye) */
    public CH0 Ye = hg_2.BD;
    /** 回调接口 (原 G3) */
    public S0 G3 = null;
    /** 是否已做出选择/回传响应 (原 RP) */
    public boolean RP = false;
    /** 是否已销毁关闭 (原 L10) */
    public boolean L10 = false;

    public AbstractMessageBox(byte by, jm_1 jm_12) {
        this.gB0 = by;
        this.Qq0 = jm_12;
    }

    /** 按键交互事件响应 (原 p3) */
    public abstract boolean p3(int keyCode);

    /** 滚动推进/下一页判定 (原 zn0) */
    public abstract boolean zn0();

    /** 是否允许挂载到目标头顶 (原 hy0) */
    public abstract boolean hy0();

    /** 更新气泡相对屏幕或角色的坐标 (原 Jh) */
    public abstract void Jh(int x, int y);

    /**
     * 提交对话框选项选择或向服务器回传响应 (原 m80)
     *
     * @param selection 选项索引或结果状态码
     */
    public void m80(byte selection) {
        BR client = tw0_0.rl;
        if (client == null || this.RP) {
            return;
        }
        this.RP = true;
        S0 callback = this.G3;
        if (callback != null) {
            callback.Dk(selection);
        } else if (this.Qq0 != null && !this.Qq0.Ms0) {
            client.ze0(this.gB0, selection);
        }
        if (this.Qq0 != null && this.Qq0.qP) {
            this.jJ0();
        } else {
            this.wQ();
        }
    }

    /** 气泡推进或下一状态处理 (原 jJ0) */
    public void jJ0() {
    }

    /**
     * 关闭并注销对话框 (原 wQ)
     */
    public final void wQ() {
        if (this.L10) {
            return;
        }
        this.L10 = true;
        if (this.Ye != null && !this.Ye.equals(hg_2.BD)) {
            tj0_0 nameplateManager = tw0_0.Tl0;
            if (nameplateManager != null && nameplateManager.k00.containsKey(this.Ye)) {
                nameplateManager.k00.remove(this.Ye);
            }
            if (Qy0.yI0 != null) {
                Qy0.yI0.u3(this);
            }
        }
        this.xe0();
    }

    /** 动态更新气泡数据包内容 (原 Vy) */
    public void Vy(kt_0 packet) {
        throw new UnsupportedOperationException();
    }

    /** 是否在渲染中显示额外提示箭头 (原 tE) */
    public boolean tE() {
        return false;
    }

    public void Y90(byte by) { this.m80(by); }
    public void xI(byte by) { this.m80(by); }
    public void py(byte by) { this.m80(by); }
    public void II0(byte by) { this.m80(by); }
    public void OL(byte by) { this.m80(by); }
    public void Py(byte by) { this.m80(by); }
    public void EB0(byte by) { this.m80(by); }
    public void Aw0(byte by) { this.m80(by); }
}
