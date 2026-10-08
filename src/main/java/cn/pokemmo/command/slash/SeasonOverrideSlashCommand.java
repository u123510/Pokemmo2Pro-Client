package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class SeasonOverrideSlashCommand extends BaseSlashCommand {
    public SeasonOverrideSlashCommand() {
        super("/seasonoverride");
    }

    @Override
    public void sr0(String[] args) {
        if (args.length < 2) {
            tw0_0.rl.jC("用法: /seasonoverride <0-3指定季节, -1为禁用>", zo_0.Dd);
            return;
        }

        try {
            c8_0.JD0.jH0(Byte.parseByte(args[1]));
            ug_0[] tiles = (ug_0[]) tw0_0.Ll0.Qz0.Pq.Sx0;
            for (ug_0 tile : tiles) {
                tile.KJ();
            }
            vo_2 renderer = tw0_0.LD0.Sc;
            if (renderer != null) {
                renderer.vT();
            }
        } catch (NumberFormatException error) {
            tw0_0.rl.jC("用法: /seasonoverride <0-3指定季节, -1为禁用>", zo_0.Dd);
        }
    }

    @Override
    public final int qo0() {
        return 8;
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
