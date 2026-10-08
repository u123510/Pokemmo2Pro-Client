package pro.pokemmo2.encounter;

import f.PF;
import f.a10_0;
import f.tw0_0;
import pro.pokemmo2.UIManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 遭遇记录仪全局业务与数据服务（全内存态维护，不强制写盘）。
 */
public class EncounterService {
    private static final EncounterService INSTANCE = new EncounterService();

    public static EncounterService getInstance() {
        return INSTANCE;
    }

    // 分类选项
    public static final String[] CATEGORY_OPTIONS = {
            "上次闪光",
            "种族累计",
            "野外",
            "野外甜甜香气",
            "野外其他",
            "头目",
            "巢穴",
            "神秘精灵球",
            "孵蛋",
            "化石",
            "行程"
    };

    private int totalEncounters = 144907;
    private String wildShinyRate = "1 / 30000";
    private String selectedCategory = "上次闪光";
    private boolean hudEnabled = true; // 默认开启总计悬浮窗并常驻保留
    private boolean showMissedShiny = false;

    private final List<EncounterModel.SpeciesRecord> speciesRecords = new ArrayList<>();
    private final List<EncounterModel.ShinyRecord> shinyRecords = new ArrayList<>();
    private final List<Runnable> changeListeners = new CopyOnWriteArrayList<>();

    // 战斗自动监听缓存
    private a10_0 lastBattle = null;

    private EncounterService() {
        initDefaultData();
    }

    /**
     * 初始化与截图一致的演示数据
     */
    private void initDefaultData() {
        // 1. 种族遭遇列表
        speciesRecords.add(new EncounterModel.SpeciesRecord("单首龙", "恶龙", 49181, true, (short) 633));
        speciesRecords.add(new EncounterModel.SpeciesRecord("步哨鼠", "普", 8, false, (short) 505));
        speciesRecords.add(new EncounterModel.SpeciesRecord("食梦梦", "超", 13, false, (short) 517));
        speciesRecords.add(new EncounterModel.SpeciesRecord("拉达", "普", 7, false, (short) 20));
        speciesRecords.add(new EncounterModel.SpeciesRecord("安瓢虫", "虫飞", 87, false, (short) 166));

        // 2. 闪光历史列表
        shinyRecords.add(new EncounterModel.ShinyRecord(
                "铁蚁", "虫钢", 8934, 4672,
                "2026/1/20 17:40", new int[]{3, 31, 25, 18, 10, 24}, "乐天(Lax)", "Regretted", false, (short) 632
        ));
        shinyRecords.add(new EncounterModel.ShinyRecord(
                "铁蚁", "虫钢", 4956, 3045,
                "2026/1/21 20:00", new int[]{15, 20, 31, 12, 18, 29}, "固执(Adamant)", "Regretted", false, (short) 632
        ));
        shinyRecords.add(new EncounterModel.ShinyRecord(
                "百变怪", "普", 63153, 2810,
                "2026/2/10 20:23", new int[]{31, 28, 31, 14, 25, 31}, "天真(Naive)", "Regretted", false, (short) 132
        ));

        sortSpeciesList();
    }

    public int getTotalEncounters() {
        return totalEncounters;
    }

    public void setTotalEncounters(int totalEncounters) {
        this.totalEncounters = totalEncounters;
        notifyChange();
    }

    /**
     * 从服务器同步最新的遭遇总数量（后续由服务端协议下发时直接调用）
     *
     * @param serverTotalEncounters 从服务器获取的账号遭遇总数量
     */
    public synchronized void updateFromServer(int serverTotalEncounters) {
        this.totalEncounters = serverTotalEncounters;
        notifyChange();
    }

    /**
     * 从服务器全量同步数据（遭遇总数、各精灵种族计数、闪光历史记录）
     */
    public synchronized void updateFromServer(int serverTotalEncounters,
                                              List<EncounterModel.SpeciesRecord> serverSpecies,
                                              List<EncounterModel.ShinyRecord> serverShinies) {
        this.totalEncounters = serverTotalEncounters;
        if (serverSpecies != null) {
            this.speciesRecords.clear();
            this.speciesRecords.addAll(serverSpecies);
            sortSpeciesList();
        }
        if (serverShinies != null) {
            this.shinyRecords.clear();
            this.shinyRecords.addAll(serverShinies);
        }
        notifyChange();
    }

    public String getWildShinyRate() {
        return wildShinyRate;
    }

    public void setWildShinyRate(String wildShinyRate) {
        this.wildShinyRate = wildShinyRate;
        notifyChange();
    }

    public String getSelectedCategory() {
        return selectedCategory;
    }

    public void setSelectedCategory(String selectedCategory) {
        this.selectedCategory = selectedCategory;
        notifyChange();
    }

    public boolean isHudEnabled() {
        return hudEnabled;
    }

    public void setHudEnabled(boolean hudEnabled) {
        if (this.hudEnabled != hudEnabled) {
            this.hudEnabled = hudEnabled;
            // 联动悬浮挂件的打开与关闭
            UIManager.setEncounterHUDVisible(hudEnabled);
            notifyChange();
        }
    }

    public boolean isShowMissedShiny() {
        return showMissedShiny;
    }

    public void setShowMissedShiny(boolean showMissedShiny) {
        this.showMissedShiny = showMissedShiny;
        notifyChange();
    }

    public synchronized List<EncounterModel.SpeciesRecord> getSpeciesRecords() {
        return new ArrayList<>(speciesRecords);
    }

    public synchronized List<EncounterModel.ShinyRecord> getShinyRecords() {
        return new ArrayList<>(shinyRecords);
    }

    /**
     * 获取最新抓获的闪光记录
     */
    public synchronized EncounterModel.ShinyRecord getLastShinyRecord() {
        if (!shinyRecords.isEmpty()) {
            return shinyRecords.get(0);
        }
        return null;
    }

    /**
     * 计算除了已列出的精灵之外的“其他”遭遇数量
     */
    public synchronized int getOtherEncountersCount() {
        int sum = 0;
        for (EncounterModel.SpeciesRecord r : speciesRecords) {
            sum += r.count;
        }
        return Math.max(0, totalEncounters - sum);
    }

    /**
     * 切换宝可梦置顶状态
     */
    public synchronized void togglePin(EncounterModel.SpeciesRecord record) {
        if (record != null) {
            record.isPinned = !record.isPinned;
            sortSpeciesList();
            notifyChange();
        }
    }

    /**
     * 增加遇敌计数
     */
    public synchronized void recordEncounter(String speciesName, String typeStr, int count, boolean isShiny, short speciesId) {
        if (speciesName == null || speciesName.isEmpty()) {
            return;
        }
        this.totalEncounters += count;

        EncounterModel.SpeciesRecord target = null;
        for (EncounterModel.SpeciesRecord r : speciesRecords) {
            if (r.name.equals(speciesName)) {
                target = r;
                break;
            }
        }
        if (target == null) {
            target = new EncounterModel.SpeciesRecord(speciesName, typeStr, count, false, speciesId);
            speciesRecords.add(target);
        } else {
            target.count += count;
            if (typeStr != null && !typeStr.isEmpty()) {
                target.typeStr = typeStr;
            }
        }

        // 如果是闪光宝可梦，自动生成一条闪光捕获记录
        if (isShiny) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d HH:mm");
            String timeNow = LocalDateTime.now().format(formatter);
            String player = (tw0_0.e60 != null && tw0_0.e60.at() != null) ? tw0_0.e60.at().na0() : "玩家";
            int[] dummyIvs = new int[]{(int)(Math.random()*32), 31, (int)(Math.random()*32), (int)(Math.random()*32), (int)(Math.random()*32), (int)(Math.random()*32)};
            EncounterModel.ShinyRecord shiny = new EncounterModel.ShinyRecord(
                    speciesName, typeStr, this.totalEncounters, target.count,
                    timeNow, dummyIvs, "勇敢(Brave)", player, false
            );
            shinyRecords.add(0, shiny);
            System.out.println("[PokeMMO2] 恭喜！自动捕获/遭遇闪光宝可梦: " + speciesName);
        }

        sortSpeciesList();
        notifyChange();
    }

    /**
     * 对种族列表排序：置顶排在最前，随后按遭遇次数从大到小排列
     */
    private synchronized void sortSpeciesList() {
        speciesRecords.sort((a, b) -> {
            if (a.isPinned != b.isPinned) {
                return a.isPinned ? -1 : 1;
            }
            return Integer.compare(b.count, a.count);
        });
    }

    /**
     * 战斗事件检测：由游戏渲染循环或定时调度调用
     */
    public synchronized void pollBattleEncounter() {
        a10_0 currentBattle = tw0_0.PK0;
        if (currentBattle != null && currentBattle != lastBattle) {
            lastBattle = currentBattle;
            // 获得敌方队伍
            if (currentBattle.wI0 != null && currentBattle.wI0.length > 1) {
                PF[] enemyTeam = currentBattle.wI0[1];
                if (enemyTeam != null) {
                    for (PF pf : enemyTeam) {
                        if (pf != null) {
                            String name = pf.A60();
                            boolean isShiny = pf.zi0 != null && pf.zi0.Bj();
                            short speciesId = pf.p10();
                            recordEncounter(name, "", 1, isShiny, speciesId);
                        }
                    }
                }
            }
        } else if (currentBattle == null) {
            lastBattle = null;
        }
    }

    public void addChangeListener(Runnable listener) {
        if (listener != null) {
            changeListeners.add(listener);
        }
    }

    public void removeChangeListener(Runnable listener) {
        changeListeners.remove(listener);
    }

    private void notifyChange() {
        for (Runnable listener : changeListeners) {
            try {
                listener.run();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
