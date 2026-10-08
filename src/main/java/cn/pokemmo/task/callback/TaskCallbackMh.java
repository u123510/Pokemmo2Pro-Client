package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackMh implements Runnable  {
    public final int mm;
    public final hn_1 j00;

    public TaskCallbackMh(hn_1 owner, int slot) {
        this.j00 = owner;
        this.mm = slot;
    }

    @Override
    public final void run() {
        IA moveSlots = BU.T50.z6;
        if (moveSlots == null) {
            return;
        }

        short moveId = (short) -this.j00.e30.hC0;
        byte previousIndex = moveSlots.YF(moveId);
        short displacedMove = 0;
        if (this.mm >= 0 && this.mm < moveSlots.Mx0.length) {
            displacedMove = moveSlots.Mx0[this.mm].wE0;
        }

        if (previousIndex > -1) {
            moveSlots.mg(previousIndex, CH0.j1, (short) 0);
        }
        moveSlots.mg(this.mm, CH0.j1, moveId);
        this.j00.gj0[this.j00.mY].tp0.r8(new LPT6_[] {fn_0.qz0().uK0});

        if (displacedMove < 0 && this.j00.On0.I8 != null) {
            for (int index = 0; index < this.j00.gj0.length; index++) {
                short id = this.j00.On0.I8.Gu[index];
                vk0_1 move = (vk0_1) ec0_2.Sx().f4.f5(id);
                if (move != null && -move.hC0 == displacedMove && displacedMove != moveId) {
                    this.j00.gj0[index].tp0.r8(new LPT6_[] {fn_0.qz0().bU});
                }
            }
        }
    }
}
