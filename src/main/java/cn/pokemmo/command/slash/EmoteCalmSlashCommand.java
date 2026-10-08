package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class EmoteCalmSlashCommand extends BaseSlashCommand {
    public EmoteCalmSlashCommand() {
        super("/em_calm");
    }

    @Override
    public void sr0(String[] unused) {
        tw0_0.rl.fk0.uQ(new C6(q10_0.uz.iL, CH0.j1, (short) 1, true));
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
