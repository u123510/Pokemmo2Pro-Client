package pro.pokemmo2.core;

import java.util.ArrayList;

/**
 * 自定义功能模块生命周期与命令自注册标准接口。
 * 后续所有新功能模块（如签到、VIP、传送等）均可实现此接口。
 */
public interface IModule {
    /**
     * 模块名称
     */
    String getModuleName();

    /**
     * 初始化模块（在游戏或 UI 管理器启动时调用）
     */
    default void init() {}

    /**
     * 向客户端注册该模块独有的聊天指令
     * @param commandList 客户端的命令列表
     */
    default void registerCommands(ArrayList commandList) {}
}
