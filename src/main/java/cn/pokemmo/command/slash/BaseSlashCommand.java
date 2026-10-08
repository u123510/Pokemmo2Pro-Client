package cn.pokemmo.command.slash;

import f.prn__2;

/**
 * 玩家聊天 Slash 命令基类
 * 
 * 职责: 封装客户端聊天窗口以 "/" 开头的用户交互指令契约、权限控制与参数路由分发。
 * 原混淆基类: f.prn__2
 */
public abstract class BaseSlashCommand extends prn__2 {

    public BaseSlashCommand(String commandName) {
        super(commandName);
    }

    public BaseSlashCommand(String commandName, boolean enabled) {
        super(commandName, enabled);
    }

    /**
     * 获取命令名称 (带前缀，如 "/time", "/ping")
     */
    public String getCommandName() {
        return this.o1;
    }

    /**
     * 是否在聊天框中默认激活
     */
    public boolean isCommandEnabled() {
        return this.fs;
    }

    /**
     * 现代命令执行入口
     *
     * @param args 输入参数数组，args[0] 为命令本体，args[1..n] 为后续参数
     */
    public abstract void execute(String[] args);

    @Override
    public void sr0(String[] args) {
        this.execute(args);
    }
}
