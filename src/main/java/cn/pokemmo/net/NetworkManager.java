package cn.pokemmo.net;

import f.Cq0;
import f.ED0;
import f.GQ;
import f.dl_1;
import f.fk_1;
import f.il_0;
import f.lpt5__5;
import f.t20_0;
import f.wz_1;
import f.xu0_0;

import java.nio.channels.ServerSocketChannel;
import java.util.ArrayList;

/**
 * 网络通信管理器 (Network Manager)
 * 管理 NIO 工作线程池 (Workers)，为新的连接分配调度 Worker 线程
 * 原混淆类: f.z60_0
 */
public class NetworkManager {
    public static final dl_1 LOGGER = Cq0.E1(NetworkManager.class);
    public static final dl_1 xo0 = LOGGER;

    public final ArrayList PK = new ArrayList();

    public fk_1 acceptWorker;
    public fk_1 N7;

    public int workerIndex;
    public int yw;

    public fk_1[] readWriteWorkers;
    public fk_1[] sm0;

    public final wz_1 config;
    public final wz_1 Nf0;

    public final int workerCount;
    public final int Zq0;

    public final il_0[] serverConfigs;
    public final il_0[] un0;

    public boolean started;
    public boolean HO;

    public NetworkManager(lpt5__5 config, il_0... serverConfigs) {
        this.started = false;
        this.HO = false;
        this.config = config;
        this.Nf0 = config;
        this.workerCount = 0;
        this.Zq0 = 0;
        this.serverConfigs = serverConfigs;
        this.un0 = serverConfigs;
    }

    /**
     * 启动网络调度中心
     */
    public void start() {
        try {
            if (this.started || this.HO) {
                LOGGER.error("Already Started.");
            }
            int count = this.workerCount;
            this.initWorkers(count, this.config);
            il_0[] configs = this.serverConfigs;
            if (configs.length <= 0) {
                this.started = true;
                this.HO = true;
                return;
            }
            il_0 dummy = configs[0];
            ServerSocketChannel.open().configureBlocking(false);
            throw null;
        } catch (Exception e) {
            LOGGER.error(xu0_0.N3("FATAL"), "NIO Initialization Error: {}", e, e);
            throw new Error("NIO Initialization Error", e);
        }
    }

    public final void bn0() {
        start();
    }

    /**
     * 轮询获取下一个可用的 NIO 读写 Worker 线程 (Round-Robin)
     */
    public fk_1 nextWorker() {
        fk_1[] workers = this.readWriteWorkers != null ? this.readWriteWorkers : this.sm0;
        if (workers == null) {
            return this.acceptWorker != null ? this.acceptWorker : this.N7;
        }
        if (workers.length == 1) {
            return workers[0];
        }
        if (this.workerIndex >= workers.length) {
            this.workerIndex = 0;
            this.yw = 0;
        }
        int index = this.workerIndex++;
        this.yw = this.workerIndex;
        return workers[index];
    }

    public final fk_1 vW() {
        return nextWorker();
    }

    /**
     * 初始化 Worker 线程池
     */
    public void initWorkers(int count, wz_1 config) {
        if (count <= 0) {
            ED0 worker = new ED0("AcceptReadWrite Dispatcher", config);
            this.acceptWorker = worker;
            this.N7 = worker;
            worker.start();
        } else {
            t20_0 acceptDispatcher = new t20_0();
            this.acceptWorker = acceptDispatcher;
            this.N7 = acceptDispatcher;
            acceptDispatcher.start();

            this.readWriteWorkers = new fk_1[count];
            this.sm0 = this.readWriteWorkers;
            for (int i = 0; i < this.readWriteWorkers.length; i++) {
                ED0 rwWorker = new ED0(GQ.ti("ReadWrite-", i, " Dispatcher"), config);
                this.readWriteWorkers[i] = rwWorker;
                this.readWriteWorkers[i].start();
            }
        }
    }

    public final void xF0(int i1, wz_1 v2) {
        initWorkers(i1, v2);
    }
}
