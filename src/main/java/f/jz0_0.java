package f;

import cn.pokemmo.constant.enums.GamepadButton;

public enum jz0_0 {
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

    public GamepadButton asModern() {
        return GamepadButton.valueOf(name());
    }
}