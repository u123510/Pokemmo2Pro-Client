package f;

import cn.pokemmo.constant.enums.InputEventType;

public enum F00 {
    touchDown,
    touchUp,
    touchDragged,
    mouseMoved,
    enter,
    exit,
    scrolled,
    keyDown,
    keyUp,
    keyTyped;

    public static final F00 Fq0 = touchDown;
    public static final F00 Hz = touchUp;
    public static final F00 O3 = touchDragged;
    public static final F00 Pi0 = mouseMoved;
    public static final F00 Lj = enter;
    public static final F00 G60 = exit;
    public static final F00 x20 = scrolled;
    public static final F00 Hd = keyDown;
    public static final F00 Wf = keyUp;
    public static final F00 eq = keyTyped;

    public InputEventType asModern() {
        return InputEventType.valueOf(name());
    }
}
