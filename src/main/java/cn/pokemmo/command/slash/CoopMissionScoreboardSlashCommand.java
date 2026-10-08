/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import f.f50_0;
import f.prn__2;
import f.tw0_0;

/*
 * Renamed from f.Bl0
 */
public class CoopMissionScoreboardSlashCommand
extends BaseSlashCommand {
    public CoopMissionScoreboardSlashCommand() {
        super("/coop_mission_scoreboard");
    }

    @Override
    public void sr0(String[] stringArray) {
        tw0_0.rl.fk0.uQ(new f50_0());
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
