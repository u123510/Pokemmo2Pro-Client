package f;

import cn.pokemmo.constant.enums.GamepadAxis;

public enum SW {
   LEFTX,
   LEFTY,
   RIGHTX,
   RIGHTY,
   TRIGGERLEFT,
   TRIGGERRIGHT;

   public static final SW[] w9 = values();

    public GamepadAxis asModern() {
        return GamepadAxis.valueOf(name());
    }
}