// 
// Decompiled by Procyon v0.6.0
// 

package cn.pokemmo.task.callback;

import f.*;

public class TaskCallbackQj0 extends gp_2 implements Runnable
 {
    public final TJ0 f4;
    public final int kb;
    public final /* synthetic */ r7 Zu;
    
    public TaskCallbackQj0(final r7 zu, final TJ0 f4, final int kb, final Wr wr, final int n, final int n2) {
        super(zu, zu.dH0(), wr, n, n2);
        this.Zu = zu;
        this.f4 = f4;
        this.kb = kb;
        this.RR(this);
    }
    
    @Override
    public final void run() {
        final le0_2 m10;
        if ((m10 = this.f4.M10(this.kb, this.Zu, this, true)) != null) {
            m10.nD();
        }
    }
}

