package cn.pokemmo.command.slash;

import f.*;
import java.util.*;


import java.lang.reflect.Constructor;

public class TestAnimation2SlashCommand extends BaseSlashCommand {
    public TestAnimation2SlashCommand() {
        super("/testanimation2");
    }

    @Override
    public void sr0(String[] arrstring) {
        if (arrstring.length < 2) {
            tw0_0.rl.jC("用法: /testanimation2 <技能ID>", zo_0.Dd);
            return;
        }

        short s;
        try {
            s = Short.parseShort(arrstring[1]);
        } catch (NumberFormatException unused) {
            tw0_0.rl.jC("用法: /testanimation2 <技能ID>", zo_0.Dd);
            return;
        }

        a10_0 a10_0Var = tw0_0.PK0;
        if (a10_0Var == null || tw0_0.LD0.he0 == null) {
            return;
        }

        try {
            String className = "com.pokeemu.client.graphics.animation.battle.auto.special.Animation" + s;
            Class<? extends MU> clazz = Class.forName(className).asSubclass(MU.class);
            Constructor<? extends MU> constructor = clazz.getConstructor(PF.class);
            if (constructor == null) {
                return;
            }

            PF attacker = a10_0Var.Ce((byte) 0, (byte) 0);
            MU mu = constructor.newInstance(attacker);
            PF target = a10_0Var.Ce((byte) 1, (byte) 0);
            mu.vv(target);
            tw0_0.LD0.he0.aY = mu.us();

            pw_1 pw_1Var = mu.E8;
            float f = 0.0f;
            if (pw_1Var != null) {
                f = pw_1Var.oX();
                if (f < 1.0f) {
                    throw new IllegalStateException("");
                }
            }

            tw0_0.rl.jC("动画时长 = " + (f * 1000.0f), zo_0.Dd);
        } catch (Exception e) {
            e.printStackTrace();
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
