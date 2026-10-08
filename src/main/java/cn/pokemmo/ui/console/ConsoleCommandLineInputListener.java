package cn.pokemmo.ui.console;

import f.*;

import java.util.ArrayList;

public class ConsoleCommandLineInputListener implements gt_0 {
    public final zy0_0 T50;

    public ConsoleCommandLineInputListener(zy0_0 zy00) {
        this.T50 = zy00;
    }

    @Override
    public final void ks0(int i) {
        if (i == 66) {
            String text = ((wn0_0) this.T50.Ke0.dI0).YA.toString();
            if (text.length() <= 0) {
                return;
            }
            this.T50.Ke0.Gv("");
            String[] parts = text.split(" ");
            if (parts.length == 0) {
                return;
            }
            ArrayList history = this.T50.TD0;
            if (history.size() == 0 || !text.equals(history.get(history.size() - 1))) {
                this.T50.TD0.add(text);
            }
            this.T50.ii0 = this.T50.TD0.size();
            for (Object obj : N9.HK0.md0) {
                WY wy = (WY) obj;
                if (wy.Yi0) {
                    if (tx_1.SC(text, wy.K0)) {
                        wy.Hh(text.split(" "));
                        return;
                    }
                } else if (text.equalsIgnoreCase(wy.K0)) {
                    wy.Hh(text.split(" "));
                    return;
                }
            }
            String msg = VG.Mq(new StringBuilder("Command "), parts[0], " not found");
            synchronized (this.T50) {
                this.T50.Xt(msg, "default");
            }
        } else if (i == 19) {
            if (this.T50.ii0 > 0) {
                int idx = --this.T50.ii0;
                String prev = (String) this.T50.TD0.get(idx);
                this.T50.Ke0.Gv(prev);
                this.T50.Ke0.Wi(prev.length());
            }
        } else if (i == 20) {
            if (this.T50.ii0 < this.T50.TD0.size() - 1) {
                int idx = ++this.T50.ii0;
                String next = (String) this.T50.TD0.get(idx);
                this.T50.Ke0.Gv(next);
                this.T50.Ke0.Wi(next.length());
            }
        } else if (i == 92) {
            this.T50.L3.Xr0(this.T50.L3.g1.VP - 60);
        } else if (i == 93) {
            this.T50.L3.Xr0(this.T50.L3.g1.VP + 60);
        }
    }
}
