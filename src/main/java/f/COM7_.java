package f;

import cn.pokemmo.constant.enums.TaskPhase;

public enum COM7_ {
   Nx,
   ms,
   wE,
   kH,
   WV;

    public TaskPhase asModern() {
        return TaskPhase.valueOf(name());
    }
}