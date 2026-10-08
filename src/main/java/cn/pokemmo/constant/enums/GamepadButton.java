package cn.pokemmo.constant.enums;

import f.*;

public enum GamepadButton {
    A,
    B,
    X,
    Y,
    BACK,
    GUIDE,
    START,
    LEFTSTICK,
    RIGHTSTICK,
    LEFTBUMPER,
    RIGHTBUMPER,
    DPAD_UP,
    DPAD_DOWN,
    DPAD_LEFT,
    DPAD_RIGHT,
    BUTTON_MISC1,
    BUTTON_PADDLE1,
    BUTTON_PADDLE2,
    BUTTON_PADDLE3,
    BUTTON_PADDLE4,
    BUTTON_TOUCHPAD;

    public f.jz0_0 toLegacy() {
        return f.jz0_0.valueOf(name());
    }
}