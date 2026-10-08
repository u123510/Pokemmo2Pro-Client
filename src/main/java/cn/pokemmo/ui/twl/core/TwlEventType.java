package cn.pokemmo.ui.twl.core;

/**
 * TWL 事件类型分类器 (Event.Type Classifier)
 * 原始混淆类: f.E00
 */
public abstract class TwlEventType {

    /**
     * 判断事件类型是否为鼠标拖拽类事件 (DRAGGED / MOUSE_DRAGGED)
     */
    public static boolean isMouseDrag(int eventType) {
        return eventType == 9 || eventType == 10;
    }

    /**
     * 判断事件类型是否为鼠标按键点击/释放类事件 (MOUSE_BTNDOWN / MOUSE_BTNUP)
     */
    public static boolean isMouseButton(int eventType) {
        return eventType >= 1 && eventType <= 8;
    }

    // 混淆方法签名别名兼容
    public static boolean ZU(int value) {
        return isMouseDrag(value);
    }

    public static boolean C10(int value) {
        return isMouseButton(value);
    }
}
