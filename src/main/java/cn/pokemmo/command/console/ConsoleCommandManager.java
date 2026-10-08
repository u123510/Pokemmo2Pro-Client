package cn.pokemmo.command.console;

import cn.pokemmo.command.admin.SetClientConfigCommand;
import f.VG;
import f.tx_1;
import f.zy0_0;

import java.util.ArrayList;

/**
 * 客户端内部控制台指令管理中心 (Console Command Manager)
 *
 * 职责:
 * 1. 集中注册与管理所有内部控制台指令（Console Commands / Admin Debug Commands）；
 * 2. 统一处理来自控制台界面（~ 键输入）的指令路由、前缀匹配与执行分发；
 * 3. 支持运行时热重载（Hot Reload）与动态指令扩展；
 * 4. 为旧混淆入口 f.N9 提供 100% 零破坏双向兼容支持。
 *
 * 原混淆类: f.N9
 */
public class ConsoleCommandManager {

    private static final ConsoleCommandManager INSTANCE = new ConsoleCommandManager();

    /**
     * 已注册的控制台命令列表
     */
    protected final ArrayList<BaseConsoleCommand> commands = new ArrayList<>();

    public ConsoleCommandManager() {
        this.registerDefaultCommands();
    }

    public static ConsoleCommandManager getInstance() {
        return INSTANCE;
    }

    /**
     * 注册全部默认控制台指令 (共 22 个)
     */
    public synchronized void registerDefaultCommands() {
        this.commands.clear();
        this.register(new BattleActionConsoleCommand());        // ba (f.DC)
        this.register(new DebugConsoleCommand());               // debug (f.G30)
        this.register(new DumpConsoleCommand());                // dump (f.UB0)
        this.register(new ScriptCmdConsoleCommand());           // cmd (f.Vn)
        this.register(new ExitConsoleCommand());                // exit (f.SV)
        this.register(new LogoutConsoleCommand());              // logout (f.jc_1)
        this.register(new HatchConsoleCommand());               // hatch (f.cd0_1)
        this.register(new MiniWindowConsoleCommand());          // mini (f.Y20)
        this.register(new ReloadConsoleCommand());              // reload (f.kd0_0)
        this.register(new SetClientConfigCommand());            // setclientconfig (f.B80)
        this.register(new SetConfigConsoleCommand());           // setconfig (f.lpt4__0)
        this.register(new MapDebugConsoleCommand());            // mapdebug (f.oe_1)
        this.register(new SayConsoleCommand());                 // say (f.uq_0)
        this.register(new TestConsoleCommand());                // test (f.s70_0)
        this.register(new AnimTestConsoleCommand());            // animtest (f.ol0_1)
        this.register(new TimeScaleConsoleCommand());           // timescale (f.hj0_0)
        this.register(new DesyncDebugConsoleCommand());         // desyncdebug (f.LK0)
        this.register(new ProfilerConsoleCommand());            // profiler (f.AD0)
        this.register(new SpawnParticleTestConsoleCommand());   // spawnparticletest (f.b20_0)
        this.register(new SpawnBotsConsoleCommand());           // spawnbots (f.nm_1)
        this.register(new SpawnAuctionsConsoleCommand());       // spawnauctions (f.bd0_1)
        this.register(new RaidAnimTestConsoleCommand());        // raidanimtest (f.FH)
    }

    /**
     * 注册单条控制台指令
     */
    public synchronized void register(BaseConsoleCommand command) {
        if (command != null && !this.commands.contains(command)) {
            this.commands.add(command);
        }
    }

    /**
     * 获取所有已注册指令列表
     */
    public ArrayList<BaseConsoleCommand> getCommands() {
        return this.commands;
    }

    /**
     * 执行控制台输入的整行指令
     *
     * @param commandLine 控制台整行输入文本
     * @return 是否成功匹配并执行了指令
     */
    public boolean dispatch(String commandLine) {
        if (commandLine == null) {
            return false;
        }
        String trimmed = commandLine.trim();
        if (trimmed.isEmpty()) {
            return false;
        }
        String[] parts = trimmed.split(" ");
        if (parts.length == 0) {
            return false;
        }

        synchronized (this) {
            for (BaseConsoleCommand command : this.commands) {
                if (command.Yi0) {
                    if (tx_1.SC(trimmed, command.K0)) {
                        command.Hh(parts);
                        return true;
                    }
                } else if (trimmed.equalsIgnoreCase(command.K0)) {
                    command.Hh(parts);
                    return true;
                }
            }
        }

        String msg = VG.Mq(new StringBuilder("Command "), parts[0], " not found");
        zy0_0 console = zy0_0.CF0;
        if (console != null) {
            synchronized (console) {
                console.Xt(msg, "default");
            }
        }
        return false;
    }

    /**
     * 重新加载控制台指令配置
     */
    public void reload() {
        this.registerDefaultCommands();
    }
}
