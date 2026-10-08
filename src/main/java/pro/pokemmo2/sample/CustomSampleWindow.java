package pro.pokemmo2.sample;

import pro.pokemmo2.core.BaseWindow;

/**
 * 示例自定义窗口：展示如何在 pro.pokemmo2 模块化体系下快速搭建游戏内 UI。
 */
public class CustomSampleWindow extends BaseWindow {

    public CustomSampleWindow() {
        super("PokeMMO 自定义窗口");

        // 设定窗口默认大小
        this.setWindowSize(380, 220);

        // 添加文字内容
        this.addLabel("欢迎使用 pro.pokemmo2 模块！");
        this.addLabel("当前游戏 UI 已成功加载。");

        // 添加一个测试按钮
        this.addButton("打印调试日志", () -> {
            System.out.println("[PokeMMO2] 测试按钮被点击！");
        });

        // 添加关闭按钮
        this.addButton("关闭此窗口", this::close);

        // 默认居中显示
        this.center();
    }
}
