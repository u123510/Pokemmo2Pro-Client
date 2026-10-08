package pro.pokemmo2;

import f.st_0;
import pro.pokemmo2.core.BaseWindow;
import pro.pokemmo2.encounter.EncounterCommand;
import pro.pokemmo2.encounter.EncounterHUDWidget;
import pro.pokemmo2.encounter.EncounterRecorderWindow;
import pro.pokemmo2.encounter.EncounterService;
import pro.pokemmo2.redeem.RedeemCommand;
import pro.pokemmo2.redeem.RedeemWindow;
import pro.pokemmo2.sample.CustomSampleWindow;

import java.util.ArrayList;

/**
 * 全局 UI 与模块化调度中心（Facade 外观模式）。
 * 统一管理各业务子模块（卡密兑换、遭遇记录仪、通用窗口等）的命令注册与窗口调度。
 */
public final class UIManager {
    private static CustomSampleWindow sampleWindow;
    private static RedeemWindow redeemWindow;
    private static EncounterRecorderWindow encounterRecorderWindow;
    private static EncounterHUDWidget encounterHUDWidget;

    private UIManager() {}

    /**
     * 注册自定义命令到客户端命令系统
     */
    public static void registerCommands() {
        if (st_0.my != null && st_0.my.x5 != null) {
            registerCommandsToList(st_0.my.x5);
        }
    }

    /**
     * 将各功能模块命令添加到指定的命令列表中
     */
    public static void registerCommandsToList(ArrayList list) {
        if (list == null) return;

        // 1. 卡密兑换模块命令
        list.add(new RedeemCommand("/redeem"));
        list.add(new RedeemCommand("/cdkey"));
        list.add(new RedeemCommand("/km"));

        // 2. 遭遇记录仪模块命令
        list.add(new EncounterCommand("/zy"));
        list.add(new EncounterCommand("/counter"));
        list.add(new EncounterCommand("/encounter"));
    }

    // ================== 卡密兑换模块调度 ==================

    /**
     * 打开卡密兑换窗口
     * @param initialCode 预填卡密代码（可为空）
     */
    public static void openRedeemWindow(String initialCode) {
        if (redeemWindow == null || redeemWindow.K20 == null) {
            redeemWindow = new RedeemWindow();
            if (initialCode != null && !initialCode.isEmpty()) {
                redeemWindow.setCode(initialCode);
            }
            redeemWindow.show();
        } else {
            if (initialCode != null && !initialCode.isEmpty()) {
                redeemWindow.setCode(initialCode);
            }
            redeemWindow.show();
        }
    }

    /**
     * 切换卡密兑换窗口状态
     */
    public static void toggleRedeemWindow() {
        if (redeemWindow == null || redeemWindow.K20 == null) {
            openRedeemWindow("");
        } else {
            redeemWindow.close();
            redeemWindow = null;
        }
    }

    // ================== 遭遇记录仪模块调度 ==================

    /**
     * 打开遭遇记录仪大窗口
     */
    public static void openEncounterRecorder() {
        if (encounterRecorderWindow == null || encounterRecorderWindow.K20 == null) {
            encounterRecorderWindow = new EncounterRecorderWindow();
            encounterRecorderWindow.show();
        } else {
            encounterRecorderWindow.show();
        }

        // 默认保留：只要总计悬浮窗开启（默认即为开启），确保悬浮窗也在界面上展示并保留
        if (EncounterService.getInstance().isHudEnabled()) {
            setEncounterHUDVisible(true);
        }
    }

    /**
     * 切换遭遇记录仪大窗口显示/隐藏
     * （大窗口关闭时，总计悬浮窗默认依然常驻保留在界面上）
     */
    public static void toggleEncounterRecorder() {
        if (encounterRecorderWindow == null || encounterRecorderWindow.K20 == null) {
            openEncounterRecorder();
        } else {
            encounterRecorderWindow.close();
            encounterRecorderWindow = null;
            // 注意：总计悬浮窗默认常驻保留，不受大窗口关闭影响
        }
    }

    /**
     * 设置主界面微型悬浮挂件的显隐状态
     */
    public static void setEncounterHUDVisible(boolean visible) {
        if (visible) {
            if (encounterHUDWidget == null || encounterHUDWidget.K20 == null) {
                encounterHUDWidget = new EncounterHUDWidget();
                encounterHUDWidget.show();
            }
        } else {
            if (encounterHUDWidget != null) {
                encounterHUDWidget.close();
                encounterHUDWidget = null;
            }
        }
    }

    /**
     * 切换主界面微型悬浮挂件
     */
    public static void toggleEncounterHUD() {
        boolean next = (encounterHUDWidget == null || encounterHUDWidget.K20 == null);
        EncounterService.getInstance().setHudEnabled(next);
    }

    // ================== 示例模块与基础调度 ==================

    /**
     * 切换示例窗口的显示/隐藏状态
     */
    public static void toggleSampleWindow() {
        if (sampleWindow == null || sampleWindow.K20 == null) {
            if (sampleWindow == null) {
                sampleWindow = new CustomSampleWindow();
            }
            sampleWindow.show();
        } else {
            sampleWindow.close();
            sampleWindow = null;
        }
    }

    /**
     * 显示指定窗口
     * @param window 待显示的窗口实例
     */
    public static void showWindow(BaseWindow window) {
        if (window != null) {
            window.show();
        }
    }
}
