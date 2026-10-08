package cn.pokemmo.constant.enums;

import f.*;

public enum InputEventType {
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

    public static final InputEventType Fq0 = touchDown;
    public static final InputEventType Hz = touchUp;
    public static final InputEventType O3 = touchDragged;
    public static final InputEventType Pi0 = mouseMoved;
    public static final InputEventType Lj = enter;
    public static final InputEventType G60 = exit;
    public static final InputEventType x20 = scrolled;
    public static final InputEventType Hd = keyDown;
    public static final InputEventType Wf = keyUp;
    public static final InputEventType eq = keyTyped;

    public f.F00 toLegacy() {
        return f.F00.valueOf(name());
    }
}
