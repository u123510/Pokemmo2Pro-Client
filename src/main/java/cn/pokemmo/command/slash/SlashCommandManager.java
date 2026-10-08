package cn.pokemmo.command.slash;

import f.H50;
import f.lg_0;
import f.prn__2;
import f.zo_0;

import java.util.ArrayList;

/**
 * 客户端玩家聊天框 Slash 指令总调度中心 (Slash Command Manager)
 *
 * 职责:
 * 1. 集中注册与管理所有聊天框用户命令（以 "/" 开头的指令）；
 * 2. 注册动态聊天频道快捷切换指令与私聊指令；
 * 3. 衔接外部插件系统 (pro.pokemmo2.UIManager) 的指令拓展注册；
 * 4. 为旧混淆单例入口 f.st_0 提供 100% 零破坏双向兼容支持。
 *
 * 原混淆类: f.st_0
 */
public class SlashCommandManager {

    private static final SlashCommandManager INSTANCE = new SlashCommandManager();

    /**
     * 已注册的 Slash 命令列表
     */
    protected final ArrayList<prn__2> commands = new ArrayList<>();

    public SlashCommandManager() {
        this.registerDefaultCommands();
    }

    public static SlashCommandManager getInstance() {
        return INSTANCE;
    }

    /**
     * 注册全部默认 Slash 指令
     */
    public synchronized void registerDefaultCommands() {
        this.commands.clear();

        // 基础交互与系统工具指令
        this.register(new BlockSlashCommand());                  // /block (f.wh_1)
        this.register(new PingSlashCommand());                   // /ping (f.ra0_1)
        this.register(new BattleCancelSlashCommand());           // /b_cancel (f.G8)
        this.register(new HsViewSlashCommand());                 // /hsview (f.MK0)
        this.register(new CoopMissionScoreboardSlashCommand());  // /coop_mission_scoreboard (f.bl0_0)
        this.register(new UnstuckSlashCommand());                // /unstuck (f.sm_1)
        this.register(new UnblockSlashCommand());                // /unblock (f.In0)
        this.register(new SysGcSlashCommand());                  // /sysgc (f.jb0_2)
        this.register(new TimeSlashCommand());                   // /time (f.B2)
        this.register(new ChannelChangeSlashCommand());          // /channelchange (f.yd_1)
        this.register(new SpectateSlashCommand());               // /spectate (f.hx0_0)

        // 技能、动画与光影覆盖指令
        this.register(new TestAnimation2SlashCommand());         // /testanimation2 (f.ki0_1)
        this.register(new TestAnimationSlashCommand());          // /testanimation (f.y00_0)
        this.register(new TimeOverrideSlashCommand());           // /timeoverride (f.id_1)
        this.register(new SeasonOverrideSlashCommand());         // /seasonoverride (f.Z20)
        this.register(new ModelTestSlashCommand());              // /modeltest (f.rj0_0)
        this.register(new DialogTestSlashCommand());             // /dialogtest (f.w30_0)
        this.register(new LanguageSlashCommand());               // /lang (f.qi_0)

        // 角色表情指令
        this.register(new EmoteNormalSlashCommand());            // /em_normal (f.Mp0)
        this.register(new EmoteAngrySlashCommand());             // /em_angry (f.WC)
        this.register(new EmoteCalmSlashCommand());              // /em_calm (f.wd0_1)

        // 音乐与对战调试指令
        this.register(new BgmSlashCommand());                    // /bgm (f.S40)
        this.register(new BattleLockDebugSlashCommand());        // /battlelockdebug (f.ym_1)
        this.register(new HighlightSlashCommand());              // //highlight (f.ko0_0)
        this.register(new EvoDebugSlashCommand());               // /evodebug (f.me_0)

        // 对战模拟器启动指令
        this.register(new BaseSlashCommand("/sim", true) {
            @Override
            public void execute(String[] args) {
                if (lg_0.k != null) {
                    lg_0.k.lPT5(() -> H50.j50(null));
                }
            }
        });
        this.register(new BaseSlashCommand("/battle", true) {
            @Override
            public void execute(String[] args) {
                if (lg_0.k != null) {
                    lg_0.k.lPT5(() -> H50.j50(null));
                }
            }
        });

        // 外部插件扩展注册
        pro.pokemmo2.UIManager.registerCommandsToList(this.commands);

        // 注册聊天频道快捷前缀指令 (/all, /trade, /w 等)
        for (zo_0 type : zo_0.JG) {
            String[] names = type.Ud0();
            if (names == null) {
                continue;
            }
            for (String name : names) {
                if (type == zo_0.YL) {
                    this.register(new WhisperSlashCommand(name));
                } else {
                    this.register(new ChannelSlashCommand(name, type));
                }
            }
        }
    }

    /**
     * 注册单条 Slash 指令
     */
    public synchronized void register(prn__2 command) {
        if (command != null && !this.commands.contains(command)) {
            this.commands.add(command);
        }
    }

    /**
     * 获取所有已注册 Slash 指令列表
     */
    public ArrayList<prn__2> getCommands() {
        return this.commands;
    }

    /**
     * 重新加载 Slash 指令列表
     */
    public void reload() {
        this.registerDefaultCommands();
    }
}
