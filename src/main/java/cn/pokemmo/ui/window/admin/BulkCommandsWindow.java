package cn.pokemmo.ui.window.admin;

import f.*;

/**
 * 批量GM指令执行窗口
 *
 * 原混淆类: f.lpt9__0
 */
public class BulkCommandsWindow extends yz_1 {
    public BulkCommandsWindow(xn0_0 owner) {
        super(true);
        this.ff0(1);
        this.uf("bulk-commands");
        this.Hy("Bulk Commands");
        this.Pb0(() -> this.Ow(owner));
        cg_0 input = new cg_0();
        input.c2();
        xe_1 submit = new xe_1("Submit");
        submit.RR(() -> hY(input));
        lo0_0 scroll = new lo0_0(input);
        tk0_0 layout = new tk0_0();
        layout.SL(scroll);
        layout.Nu();
        layout.SL(scroll);
        this.SL(layout);
    }

    public static void hY(cg_0 input) {
        String[] lines = ((wn0_0)input.dI0).YA.toString().split("\n");
        for (String line : lines) {
            String command = line.trim();
            if (!command.isEmpty() && command.startsWith("/")) {
                tw0_0.rl.Cp(zo_0.Pk, command, "", true);
            }
        }
    }

    public final void Ow(xn0_0 owner) {
        owner.u3(this);
    }
}
