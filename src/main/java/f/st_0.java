package f;

import cn.pokemmo.command.slash.SlashCommandManager;
import java.util.ArrayList;

/**
 * 兼容垫片 (Shim) - SlashCommandManager
 * 职责: 聊天框 Slash 命令注册总线
 * 原始混淆类: f.st_0
 * 现代实现: cn.pokemmo.command.slash.SlashCommandManager
 */
public final class st_0 {
    public static final st_0 my;
    public final ArrayList x5;

    public st_0() {
        this.x5 = (ArrayList) SlashCommandManager.getInstance().getCommands();
    }

    static {
        my = new st_0();
    }
}
