/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.com6__1;
import f.nf_0;
import f.nk_0;
import f.prn__2;
import f.q3_0;
import f.tw0_0;
import f.zo_0;

/*
 * Renamed from f.wH
 */
public class UnstuckSlashCommand
extends BaseSlashCommand {
    public UnstuckSlashCommand() {
        super("/unstuck");
    }

    @Override
    public void sr0(String[] stringArray) {
        tw0_0.rl.fw = false;
        nf_0.zo0().w30(500, true);
        nf_0 nf_02 = nf_0.zo0();
        int n = 500;
        int n2 = Math.max(nf_02.COn.kl0, nf_02.TK.kl0);
        nf_02.TK.m(n2, 0, n);
        q3_0 q3_02 = nf_02.COn;
        q3_02.kl0 = 0;
        q3_02.xP = 0;
        tw0_0.rl.Cp(zo_0.Pk, "/unstuck", "", false);
        com6__1.WI0.Qf(nk_0.as0);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
