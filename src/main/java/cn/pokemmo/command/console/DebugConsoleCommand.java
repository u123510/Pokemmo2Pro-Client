package cn.pokemmo.command.console;

import f.*;
import java.util.*;


public class DebugConsoleCommand extends BaseConsoleCommand {
    public DebugConsoleCommand() {
        super("debug");
    }

    @Override
    public void Hh(String[] v1) {
        if (v1.length < 2) {
            WY.Ba0("用法: >debug <ui|map|season|csanim|battle_gui|buildmode|phyupdate|particlesystem>");
            return;
        }

        String command = v1[1];
        if (command.equals("ui")) {
            jn_0.Ey0 = !jn_0.Ey0;
            Qy0.yI0.zm0();
            WY.Ba0("UI调试状态 = " + jn_0.Ey0);
            return;
        }
        if (command.equals("map")) {
            if (tw0_0.LD0 == null || tw0_0.LD0.Sc == null) {
                zy0_0.CF0.Xt("当前未进入游戏地图，无法打开地图调试窗口。", "red");
                return;
            }
            UV map = new UV();
            Qy0 qy0 = Qy0.yI0;
            qy0.F9(qy0.fU(), map);
            map.RY(600, 400);
            map.lt0();
            map.vf(pa0_0.Ol);
            return;
        }
        if (command.equals("season")) {
            if (v1.length < 3) {
                zy0_0.CF0.Xt("缺少季节ID参数，请检查输入。", "red");
                return;
            }
            try {
                c8_0.JD0.jH0(Byte.parseByte(v1[2]));
            } catch (NumberFormatException ignored) {
                zy0_0.CF0.Xt("季节ID解析错误，请检查输入。", "red");
            }
            return;
        }
        if (command.equals("weather")) {
            try {
                s4_0.valueOf(v1[2]);
            } catch (Exception ignored) {
                zy0_0.CF0.Xt("天气类型解析错误，请检查输入。", "red");
            }
            return;
        }
        if (command.equals("csanim")) {
            try {
                float speed = Float.parseFloat(v1[2]);
                if (speed <= 0.0f) {
                    zy0_0.CF0.Xt("速度不能小于或等于0。", "red");
                }
                _native.mu0 = speed;
                zy0_0.CF0.Xt(
                        "已将角色行走图动画速度设置为 " + speed,
                        "green");
            } catch (NumberFormatException ignored) {
                zy0_0.CF0.Xt("速度参数解析错误，请检查输入。", "red");
            }
            return;
        }
        if (command.equals("phyupdate") || command.equals("physpeed")) {
            vr_1 battle = null;
            jn_0 screen = tw0_0.LD0;
            Oz0 world = screen.he0;
            if (world instanceof vr_1) {
                battle = (vr_1) world;
            }
            ff_0 map = screen.Sc.Fq0();
            if (v1.length < 3) {
                if (battle != null) {
                    battle.OB0.getClass();
                    WY.Ba0("对战物理更新周期 = " + ff_0.iH0);
                }
                if (map != null) {
                    WY.Ba0("地图物理更新周期 = " + ff_0.iH0);
                }
                return;
            }
            try {
                float speed = Float.parseFloat(v1[2]);
                if (speed <= 0.0f) {
                    zy0_0.CF0.Xt("速度不能小于或等于0。", "red");
                }
                if (battle != null) {
                    battle.OB0.getClass();
                    ff_0.iH0 = 1.0f / speed;
                }
                if (map != null) {
                    ff_0.iH0 = 1.0f / speed;
                }
                zy0_0.CF0.Xt("已将物理系统更新频率设置为 " + speed + " 帧/秒 ", "green");
            } catch (NumberFormatException ignored) {
                zy0_0.CF0.Xt("速度参数解析错误，请检查输入。", "red");
            }
            return;
        }
        if (command.equals("particlesystem")) {
            lpt3__1.Ha0 = !lpt3__1.Ha0;
            zy0_0.CF0.Xt("已切换3D粒子系统性能分析器状态。", "green");
            return;
        }
        if (command.equals("buildmode")) {
            BR client = tw0_0.rl;
            if (client != null && client.cJ0 != null) {
                Ge0.Vv0 = (byte) (Ge0.Vv0 == 0 ? 1 : 0);
            }
            return;
        }
        if (command.equals("battle_gui") && tw0_0.PK0 != null) {
            byte rowIndex = 0;
            while (rowIndex < (byte) tw0_0.PK0.wI0.length) {
                PF[] row = tw0_0.PK0.wI0[rowIndex];
                for (PF actor : row) {
                    if (actor != null) {
                        Oz0 world = tw0_0.LD0.he0;
                        if (world != null) {
                            jd0_1 display = world.N10.Hi(actor);
                            display.le0(actor, false, actor.uk());
                            int x = display.j00;
                            int y = display.Kl;
                            int width = display.k0;
                            int height = display.Ou;
                            display.V6(x, y, width, height, true);
                        }
                    }
                }
                rowIndex = (byte) (rowIndex + 1);
            }
        }
    }


    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
