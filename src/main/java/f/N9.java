package f;

import cn.pokemmo.command.console.ConsoleCommandManager;
import java.util.ArrayList;

/**
 * 兼容垫片 (Shim) - ConsoleCommandManager
 * 职责: 控制台与管理员指令注册总线
 * 原始混淆类: f.N9
 * 现代实现: cn.pokemmo.command.console.ConsoleCommandManager
 */
public final class N9 {
    public static final N9 HK0 = new N9();
    public final ArrayList md0;

    public N9() {
        this.md0 = (ArrayList) ConsoleCommandManager.getInstance().getCommands();
    }

    public final void de() {
        ConsoleCommandManager.getInstance().registerDefaultCommands();
    }
}
