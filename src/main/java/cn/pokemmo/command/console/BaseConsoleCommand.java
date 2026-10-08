package cn.pokemmo.command.console;

import f.WY;
import f.zy0_0;

/**
 * 控制台与管理员调试指令基类
 *
 * 职责: 封装客户端控制台输出管道、语法提示与指令参数执行分发。
 * 原混淆基类: f.WY
 */
public abstract class BaseConsoleCommand extends WY {

    public BaseConsoleCommand(String commandName) {
        super(commandName);
    }

    public BaseConsoleCommand(String commandName, int flags) {
        super(commandName, flags);
    }

    /**
     * 获取命令名称
     */
    public String getCommandName() {
        return this.K0;
    }

    /**
     * 向控制台输出默认日志信息
     */
    public static void log(String message) {
        WY.Ba0(message);
    }

    /**
     * 向控制台输出带样式的文本
     */
    public static void logStyled(String message, String style) {
        zy0_0 console = zy0_0.CF0;
        if (console != null) {
            synchronized (console) {
                console.Xt(message, style);
            }
        }
    }

    /**
     * 现代命令执行入口
     */
    public abstract void execute(String[] args);

    @Override
    public void Hh(String[] args) {
        this.execute(args);
    }
}
