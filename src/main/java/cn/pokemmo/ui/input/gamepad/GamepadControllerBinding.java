package cn.pokemmo.ui.input.gamepad;

import com.studiohartman.jamepad.ControllerIndex;
import f.o3_0;

public class GamepadControllerBinding {
    public ControllerIndex ww;
    public final o3_0 dq0;

    public GamepadControllerBinding(ControllerIndex controllerIndex) {
        this.ww = controllerIndex;
        this.dq0 = new o3_0(controllerIndex);
    }
}
