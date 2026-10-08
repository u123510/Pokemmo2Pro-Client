package pro.pokemmo2.encounter;

import f.A40;
import f.cn_0;
import f.le0_2;
import f.pa0_0;
import f.tk0_0;
import f.tw0_0;
import f.xe_1;
import pro.pokemmo2.core.BaseWindow;

import java.util.List;

/**
 * 闪光宝可梦捕获详情弹窗（图三：上次闪光）。
 * 极致还原游戏原版 UI 布局与高亮配色，支持多条闪光记录顺畅翻页浏览。
 */
public class ShinyDetailWindow extends BaseWindow {
    private final List<EncounterModel.ShinyRecord> records;
    private int currentIndex;

    public ShinyDetailWindow() {
        this(0);
    }

    public ShinyDetailWindow(int index) {
        super("上次闪光");
        this.uf("base-frame-padded");
        this.setMovable(true);
        this.setResizable(false);
        this.records = EncounterService.getInstance().getShinyRecords();
        this.currentIndex = (this.records != null && index >= 0 && index < this.records.size()) ? index : 0;
        this.setWindowSize(400, 390);

        buildUI();
        this.center();
    }

    public ShinyDetailWindow(EncounterModel.ShinyRecord record) {
        super("上次闪光");
        this.uf("base-frame-padded");
        this.setMovable(true);
        this.setResizable(false);
        this.records = EncounterService.getInstance().getShinyRecords();
        int found = -1;
        if (record != null && this.records != null) {
            for (int i = 0; i < this.records.size(); i++) {
                if (this.records.get(i) == record) {
                    found = i;
                    break;
                }
            }
        }
        this.currentIndex = found >= 0 ? found : 0;
        this.setWindowSize(400, 390);

        buildUI();
        this.center();
    }

    private void buildUI() {
        this.table.OO(); // 清空当前布局

        if (this.records == null || this.records.isEmpty()) {
            this.addCenteredLabel("暂无闪光捕获记录");
            return;
        }

        EncounterModel.ShinyRecord record = this.records.get(this.currentIndex);
        A40 layout = this.table;

        // 0. 多条闪光记录导航栏（当存在多条闪光记录时，支持在弹窗内翻页浏览全部记录）
        if (this.records.size() > 1) {
            tk0_0 navBar = new tk0_0();
            xe_1 prevBtn = new xe_1("< 上一条");
            prevBtn.pw0(this.currentIndex > 0);
            prevBtn.RR(() -> {
                if (this.currentIndex > 0) {
                    this.currentIndex--;
                    buildUI();
                }
            });

            cn_0 pageInfo = new cn_0("闪光记录 (" + (this.currentIndex + 1) + " / " + this.records.size() + ")");
            pageInfo.qF0(pa0_0.CENTER);

            xe_1 nextBtn = new xe_1("下一条 >");
            nextBtn.pw0(this.currentIndex < this.records.size() - 1);
            nextBtn.RR(() -> {
                if (this.currentIndex < this.records.size() - 1) {
                    this.currentIndex++;
                    buildUI();
                }
            });

            navBar.gg0.vx0(prevBtn).Pt(85.0f).Wa0();
            navBar.gg0.vx0(pageInfo).goto$();
            navBar.gg0.vx0(nextBtn).Pt(85.0f).GD().im0();
            layout.vx0(navBar).dw0().ys0(4.0f).im0();
            layout.Rg();
        }

        // 1. 顶部捕获时间（居中）
        cn_0 timeLabel = new cn_0(record.catchTime);
        timeLabel.qF0(pa0_0.CENTER);
        layout.vx0(timeLabel).dw0().ru().im0();
        layout.Rg();

        // 2. 捕获通告：如 "Regretted抓到了闪光铁蚁'虫钢!"
        String titleMsg = record.playerName + "抓到了闪光" + record.getDisplayName() + "!";
        cn_0 announceLabel = new cn_0(titleMsg);
        announceLabel.qF0(pa0_0.CENTER);
        layout.vx0(announceLabel).dw0().ru().ys0(6.0f).im0();
        layout.Rg();

        // 3. 中部立绘与闪光星芒特效面板
        tk0_0 spritePanel = new tk0_0();

        // 顶层星芒
        cn_0 starsTop = new cn_0("✦       ✧       ★       ✧       ✦");
        starsTop.qF0(pa0_0.CENTER);
        spritePanel.gg0.vx0(starsTop).dw0().ru().im0();
        spritePanel.gg0.Rg();

        // 中间行：左星芒 + 闪光大精灵图 + 右星芒
        tk0_0 centerRow = new tk0_0();
        cn_0 starL = new cn_0("✧   ✦");
        starL.qF0(pa0_0.CENTER);
        centerRow.gg0.vx0(starL).Pt(60.0f).GD();

        le0_2 pokemonIcon = EncounterUIHelper.createPokemonIcon(record.speciesId, true, 64, 52);
        if (pokemonIcon != null) {
            centerRow.gg0.vx0(pokemonIcon).Pt(80.0f).ru();
        } else {
            cn_0 fallbackIcon = new cn_0("★ " + record.speciesName + " ★");
            fallbackIcon.qF0(pa0_0.CENTER);
            centerRow.gg0.vx0(fallbackIcon).Pt(120.0f).ru();
        }

        cn_0 starR = new cn_0("✦   ✧");
        starR.qF0(pa0_0.CENTER);
        centerRow.gg0.vx0(starR).Pt(60.0f).Wa0().im0();

        spritePanel.gg0.vx0(centerRow).dw0().ru().im0();
        spritePanel.gg0.Rg();

        // 底层星芒
        cn_0 starsBottom = new cn_0("✧       ★       ✧");
        starsBottom.qF0(pa0_0.CENTER);
        spritePanel.gg0.vx0(starsBottom).dw0().ru().im0();

        layout.vx0(spritePanel).dw0().ru().ys0(10.0f).im0();
        layout.Rg();

        // 4. 底部属性与分享按钮面板
        tk0_0 bottomPanel = new tk0_0();
        A40 bLayout = bottomPanel.gg0;

        // 左侧四行属性（严格靠左对齐，31 个体值亮绿色高亮）
        tk0_0 statsLeft = new tk0_0();
        A40 sLayout = statsLeft.gg0;

        cn_0 ivLabel = new cn_0();
        ivLabel.uf("label-markup");
        ivLabel.Sk("个体值: " + record.getFormattedIVs());
        sLayout.vx0(ivLabel).Wa0().im0();
        sLayout.Rg();

        cn_0 natureLabel = new cn_0("性格: " + record.natureStr);
        sLayout.vx0(natureLabel).Wa0().im0();
        sLayout.Rg();

        cn_0 totalEncLabel = new cn_0("总计遭遇: " + record.totalAtCatch);
        sLayout.vx0(totalEncLabel).Wa0().im0();
        sLayout.Rg();

        cn_0 speciesEncLabel = new cn_0(record.getDisplayName() + "遭遇: " + record.speciesAtCatch);
        sLayout.vx0(speciesEncLabel).Wa0().im0();

        bLayout.vx0(statsLeft).Wa0();

        // 占位弹簧把分享按钮推到右下角
        bLayout.vx0(new le0_2()).goto$();

        // 右侧分享按钮
        xe_1 shareBtn = new xe_1("分享");
        shareBtn.qF0(pa0_0.CENTER);
        shareBtn.RR(this::onShareClicked);
        bLayout.vx0(shareBtn).Pt(85.0f).GD().jN().im0();

        layout.vx0(bottomPanel).dw0().ru().im0();
        this.lt0();
    }

    /**
     * 点击分享按钮
     */
    private void onShareClicked() {
        if (this.records != null && this.currentIndex < this.records.size()) {
            EncounterModel.ShinyRecord r = this.records.get(this.currentIndex);
            String shareText = "[遭遇记录仪] 我在 " + r.catchTime + " 捕获了闪光【" + r.getDisplayName()
                    + "】！总计遭遇: " + r.totalAtCatch + " 次，个体值: " + r.getFormattedIVs()
                    + "，性格: " + r.natureStr;
            System.out.println(shareText);
            if (tw0_0.rl != null) {
                System.out.println("[PokeMMO2] 闪光捕获记录已准备分享至聊天框！");
            }
        }
    }
}
