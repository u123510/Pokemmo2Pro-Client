package pro.pokemmo2.redeem;

import f.lg_0;
import f.prn__2;
import f.tw0_0;
import f.zo_0;
import pro.pokemmo2.UIManager;

/**
 * 卡密兑换命令：支持通过聊天栏指令唤出卡密兑换窗口。
 * 支持用法：
 *   /redeem
 *   /redeem <code>
 *   /cdkey
 *   /km
 */
public class RedeemCommand extends prn__2 {

    public RedeemCommand() {
        this("/redeem");
    }

    public RedeemCommand(String commandName) {
        super(commandName, true);
    }

    @Override
    public void sr0(String[] args) {
        String initialCode = "";
        if (args != null && args.length > 1) {
            initialCode = args[1].trim();
        }

        final String codeToOpen = initialCode;
        System.out.println("[PokeMMO2] 收到卡密兑换指令: " + (args != null && args.length > 0 ? args[0] : "/redeem")
                + ", 参数: [" + codeToOpen + "]");

        // 投递至 UI 渲染主线程打开窗口
        if (lg_0.k != null) {
            lg_0.k.lPT5(() -> UIManager.openRedeemWindow(codeToOpen));
        } else {
            UIManager.openRedeemWindow(codeToOpen);
        }

        if (tw0_0.rl != null) {
            tw0_0.rl.jC("已打开卡密兑换窗口", zo_0.rr0);
        }
    }
}
