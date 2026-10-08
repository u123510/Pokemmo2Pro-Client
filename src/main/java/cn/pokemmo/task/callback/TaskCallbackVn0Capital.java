package cn.pokemmo.task.callback;

import f.*;
import java.util.ArrayList;

public class TaskCallbackVn0Capital implements Runnable {
    public final com2__3 U0;
    public final cb0_1 Co0;

    public TaskCallbackVn0Capital(cb0_1 cb0_12, com2__3 com2__32) {
        this.Co0 = cb0_12;
        this.U0 = com2__32;
    }

    @Override
    public final void run() {
        com2__3 com2__32 = this.U0;
        P8 p8 = this.Co0.Z60;
        com2__3 com2__33 = p8.bC;
        if (com2__32 != com2__33 && com2__32.to0 != null) {
            if (com2__32.s90.K20 == p8.ms0) {
                int n = com2__32 == com2__33 ? p8.g6.indexOf(com2__32) : -1;
                P8 p82 = p8;
                com2__32.gn(null);
                p82.ms0.u3(com2__32.s90);
                p82.g6.remove(com2__32);
                if (n >= 0 && !p8.g6.isEmpty()) {
                    P8 p83 = p8;
                    ArrayList arrayList = p83.g6;
                    p83.Zd((com2__3)arrayList.get(Math.min(arrayList.size() - 1, n)));
                }
                p8.g30();
                if (this.Co0.Z60.Bb() > 2) {
                    P8 p84 = this.Co0.Z60;
                    int n2 = 0;
                    p84.Zd((com2__3)p84.g6.get(n2));
                }
            } else {
                throw new IllegalArgumentException("Invalid tab");
            }
        }
    }
}
