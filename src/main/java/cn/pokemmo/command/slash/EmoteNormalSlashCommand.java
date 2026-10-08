package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class EmoteNormalSlashCommand extends BaseSlashCommand {
    public EmoteNormalSlashCommand() {
        super("/em_normal");
    }

    public void sr0(String[] v1) {
        BR br = tw0_0.rl;
        byte b = q10_0.uz.iL;
        CH0 ch = CH0.j1;
        br.fk0.uQ(new C6(b, ch, (short) -1, true));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
