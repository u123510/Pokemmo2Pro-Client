package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class TimeOverrideSlashCommand extends BaseSlashCommand {

    public TimeOverrideSlashCommand() {
        super("/timeoverride");
    }


    public void sr0(String[] v1) {
        if (v1.length < 2) {
            tw0_0.rl.jC("用法: /timeoverride <小时数(0-23)>", zo_0.Dd);
            return;
        }
        try {
            byte i0 = Byte.parseByte(v1[1]);
            c8_0.JD0.Tf = i0;
            c8_0.JD0.vt0.ar = 0L;
        } catch (NumberFormatException unused) {
            tw0_0.rl.jC("用法: /timeoverride <小时数(0-23)>", zo_0.Dd);
        }
    }


    public final int qo0() {
        return 8;
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
