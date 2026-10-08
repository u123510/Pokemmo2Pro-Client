package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class BgmSlashCommand extends BaseSlashCommand {
    public BgmSlashCommand() {
        super("/bgm");
    }

    @Override
    public void sr0(String[] args) {
        BR audio = tw0_0.rl;
        StringBuilder path = new StringBuilder("正在播放背景音乐 sounds/");
        OE0 output = tw0_0.RE0.e00;
        int first = output == null ? 0 : output.Fv();
        path.append(first).append('/');
        output = tw0_0.RE0.e00;
        int second = output == null ? 0 : output.Ib0();
        audio.jC(path.append(second).toString(), zo_0.Dd);
    }

    @Override
    public void execute(String[] args) {
        this.sr0(args);
    }
}
