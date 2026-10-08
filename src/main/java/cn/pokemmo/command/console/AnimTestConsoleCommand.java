package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import java.lang.reflect.Constructor;

public class AnimTestConsoleCommand extends BaseConsoleCommand {
    public AnimTestConsoleCommand() {
        super("animtest");
    }

    public void Hh(String[] args) {
        if (args.length < 4) {
            WY.Ba0("用法: >animtest [动画ID] [队伍ID] [槽位ID]");
            return;
        }
        a10_0 registry = tw0_0.PK0;
        try {
            Class<?> type = Class.forName("com.pokeemu.client.graphics.animation.battle.auto.special.Animation" + args[1]);
            byte teamId = Byte.parseByte(args[2]);
            byte slotId = Byte.parseByte(args[3]);
            Constructor<?> constructor;
            try {
                constructor = type.getConstructor(PF.class);
            } catch (NoSuchMethodException error) {
                error.printStackTrace();
                WY.Ba0("用法: >animtest [动画ID]");
                return;
            }
            MU animation;
            try {
                animation = (MU)constructor.newInstance(registry.Ce(teamId, slotId));
                kw_0 wrapper = new kw_0((byte)0, animation.vv(registry.Ce((byte)0, (byte)0)));
                animation.us();
                tw0_0.LD0.he0.N10.lZ.add(wrapper);
                float duration = animation.E8 == null ? 0.0F : animation.E8.oX();
                if (duration < 1.0F) {
                    throw new IllegalStateException("");
                }
                WY.Ba0(new StringBuilder("动画持续时间 = ").append(duration).toString());
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (Exception error) {
            WY.Ba0("用法: >animtest [动画ID]");
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
