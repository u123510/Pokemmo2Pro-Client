package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackUh2 implements Runnable  {
    public final K5 X00;
    public final HD0 j60;

    public TaskCallbackUh2(HD0 owner, K5 item) {
        this.j60 = owner;
        this.X00 = item;
    }

    @Override
    public final void run() {
        Vt0 menu = new Vt0();
        for (int index = 0; index < 9; ++index) {
            int selectedIndex = index;
            K5 selectedItem = this.X00;
            at_0 option = new at_0(sm0_0.wa0(1413, Integer.toString(index + 1)));
            option.eu0 = () -> this.Jf0(selectedItem, selectedIndex);
            menu.hx.add(option);
        }
        UA.zd(menu, this.j60.q9);
    }

    public final void Jf0(K5 item, int index) {
        if (BU.T50.z6 != null) {
            String[] values = new String[]{item.Ua(), Integer.toString(index + 1)};
            Qy0.yI0.dk(-1, sm0_0.Bx(1415, values));
            hl0_0 itemValue = item.nn;
            BU.T50.z6.mg(index, itemValue.Br, itemValue.wQ);
        }
        this.j60.rL0(item);
    }
}
