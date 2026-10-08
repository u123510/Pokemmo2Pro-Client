package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class WhisperSlashCommand extends BaseSlashCommand {
    public WhisperSlashCommand(String v1) {
        super(v1);
    }

    public void sr0(String[] v1) {
        if (v1.length < 2) {
            tw0_0.rl.jC(sm0_0.c0(1524), zo_0.YL);
            return;
        }
        BR br = tw0_0.rl;
        String s = v1[1];
        BU bu = br.lZ.zK0;
        if (bu != null) {
            bu.BK.iX(s);
        }
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
