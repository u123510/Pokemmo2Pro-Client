package pro.pokemmo2.redeem;

import f.cg_0;
import f.cn_0;
import f.lg_0;
import f.pa0_0;
import f.tk0_0;
import f.xe_1;
import f.zk0_1;
import pro.pokemmo2.core.BaseWindow;

/**
 * 卡密 / 礼包码兑换窗口（全部内容文字与控件水平居中）。
 */
public class RedeemWindow extends BaseWindow {
    private final cg_0 inputField;
    private final cn_0 promptLabel;
    private final cn_0 statusLabel;

    public RedeemWindow() {
        super("卡密 / 礼包码兑换");

        // 1. 设置窗口初始尺寸
        this.setWindowSize(380, 220);

        // 2. 提示文字（居中，下方留间距 10px）
        this.promptLabel = new cn_0("请输入您的卡密或礼包兑换码：");
        this.promptLabel.qF0(pa0_0.CENTER);
        this.table.vx0(this.promptLabel).Yt().dw0().ru().ys0(10.0f).im0();

        // 3. 卡密输入框（固定宽度 280px，居中放置，下方留间距 12px）
        this.inputField = new cg_0();
        this.inputField.ef0(32); // 最大限制 32 字符
        this.table.vx0(this.inputField).Pt(280.0f).ru().ys0(12.0f).im0();

        // 键盘监听：回车键 (Key Code 66) 快捷提交，ESC 键 (Key Code 111) 关闭
        this.inputField.Ii(keyCode -> {
            if (keyCode == 66) { // Enter 键
                this.doRedeem();
            } else if (keyCode == 111) { // ESC 键
                this.close();
            }
        });

        // 4. 状态/结果反馈提示标签（文字居中，下方留间距 16px）
        this.statusLabel = new cn_0("提示：输入卡密后点击兑换或直接按回车");
        this.statusLabel.qF0(pa0_0.CENTER);
        this.table.vx0(this.statusLabel).Yt().dw0().ru().ys0(16.0f).im0();

        // 5. 操作按钮栏（两个按钮居中排列）
        tk0_0 buttonBar = new tk0_0();
        xe_1 submitBtn = new xe_1("立即兑换");
        submitBtn.qF0(pa0_0.CENTER);
        submitBtn.RR(this::doRedeem);

        xe_1 closeBtn = new xe_1("取消关闭");
        closeBtn.qF0(pa0_0.CENTER);
        closeBtn.RR(this::close);

        buttonBar.gg0.vx0(submitBtn).Pt(110.0f).pK0(15.0f);
        buttonBar.gg0.vx0(closeBtn).Pt(110.0f);

        this.table.vx0(buttonBar).ru().im0();

        // 6. 居中显示
        this.center();
    }

    /**
     * 预填卡密内容
     * @param code 卡密字符串
     */
    public void setCode(String code) {
        if (code != null) {
            this.inputField.mm(code);
        }
    }

    /**
     * 执行兑换逻辑
     */
    public void doRedeem() {
        String code = getInputText(this.inputField).trim();
        if (code.isEmpty()) {
            this.statusLabel.Sk("请输入卡密后再进行兑换！");
            return;
        }

        this.statusLabel.Sk("正在处理中，请稍候...");

        // 调用兑换服务
        RedeemService.redeemCode(code, (success, message) -> {
            this.statusLabel.Sk(message);
            if (success) {
                // 兑换成功后清空输入框
                this.inputField.mm("");
            }
        });
    }

    /**
     * 窗口加载至界面时自动获取输入焦点
     */
    @Override
    public void C(zk0_1 zk0_1) {
        super.C(zk0_1);
        if (lg_0.k != null) {
            lg_0.k.lPT5(this.inputField::BL);
        }
    }
}
