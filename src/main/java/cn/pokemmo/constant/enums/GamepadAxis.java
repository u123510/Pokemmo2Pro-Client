package cn.pokemmo.constant.enums;

import f.*;

public enum GamepadAxis {
   LEFTX,
   LEFTY,
   RIGHTX,
   RIGHTY,
   TRIGGERLEFT,
   TRIGGERRIGHT;

   public static final GamepadAxis[] w9 = values();

    public f.SW toLegacy() {
        return f.SW.valueOf(name());
    }
}