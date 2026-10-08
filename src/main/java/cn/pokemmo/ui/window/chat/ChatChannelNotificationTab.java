package cn.pokemmo.ui.window.chat;

import f.*;

public class ChatChannelNotificationTab extends NUL_ {
    public ChatChannelNotificationTab() {
        super();
    }

    @Override
    public final short DF0() { return (short) 1010; }

    @Override
    public final short Y1() { return (short) 6; }

    @Override
    public final int og0() { return 16800221; }

    @Override
    public final String xz0() { return "event-progressbar-halloween-pumpcat"; }

    @Override
    public final String dL0(byte value, short progress) {
        String[] args = new String[2];
        args[0] = sm0_0.c0(value + 250000);
        int index = 0;
        while (index < 19 && progress > prn__3.xn[index]) {
            index++;
        }
        if (index >= 19) {
            index = 0;
        }
        args[1] = sm0_0.c0(index + 16800300);
        return sm0_0.Bx(16800214, args);
    }

    @Override
    public final short c40() { return (short) 800; }

    @Override
    public final short It0() { return (short) 1009; }

    @Override
    public final int[][] YO() { return prn__3.RP; }

    @Override
    public final void Xg0(Br0 button) {
        button.Nk(new Wr[]{gh_1.aH0.zm((short) 1317)});
        if (tw0_0.kz0()) {
            button.EJ0 = 2.0f;
            button.gY = -9;
            button.a4 = -6;
        } else {
            button.gY = 6;
            button.a4 = 6;
        }
    }
}
