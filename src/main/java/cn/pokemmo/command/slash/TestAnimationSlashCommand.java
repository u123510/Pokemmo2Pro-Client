package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


public class TestAnimationSlashCommand extends BaseSlashCommand {
    public TestAnimationSlashCommand() {
        super("/testanimation");
    }

    @Override
    public void sr0(String[] args) {
        if (args.length < 2) {
            tw0_0.rl.jC("用法: /testanimation <技能ID>", zo_0.Dd);
            return;
        }
        final short skill;
        try {
            skill = Short.parseShort(args[1]);
        } catch (NumberFormatException exception) {
            tw0_0.rl.jC("用法: /testanimation <技能ID>", zo_0.Dd);
            return;
        }
        a10_0 state = tw0_0.PK0;
        if (state == null || tw0_0.LD0.he0 == null) {
            return;
        }
        vk0_1 animation = (vk0_1) ec0_2.Sx().f4.f5(skill);
        if (animation == null) {
            return;
        }
        Oz0 overlay = tw0_0.LD0.he0;
        PF first = state.Ce((byte) 0, (byte) 0);
        PF[] second = {state.Ce((byte) 1, (byte) 0)};
        MU effect = qk_2.cR.import$(first, animation.hC0);
        effect.kA0(second);
        overlay.aY = effect.us();
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
