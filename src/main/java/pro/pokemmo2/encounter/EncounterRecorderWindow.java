package pro.pokemmo2.encounter;

import f.A40;
import f.W9;
import f.X6;
import f.cg_0;
import f.cn_0;
import f.le0_2;
import f.lo0_0;
import f.pa0_0;
import f.pg0_2;
import f.tk0_0;
import f.tq_0;
import f.xe_1;
import pro.pokemmo2.core.BaseWindow;

import java.util.List;

/**
 * 遭遇记录仪主界面（图一资料页、图二历史页）。
 * 深度优化界面排版与交互逻辑，完美支持内容滚动与固定表头。
 */
public class EncounterRecorderWindow extends BaseWindow {
    private boolean isHistoryTab = false;
    private final xe_1 tabProfileBtn;
    private final xe_1 tabHistoryBtn;
    private final tk0_0 topControlsPanel;
    private final tk0_0 tableHeaderPanel;
    private final tk0_0 tableContentPanel;
    private final lo0_0 tableScrollPane;
    private final Runnable serviceListener;

    public EncounterRecorderWindow() {
        super("遭遇记录仪");
        this.uf("base-frame-padded");
        this.setMovable(true);
        this.setResizable(false);
        this.setWindowSize(520, 390);

        // 1. 顶部选项卡栏：[ 资料 ] [ 历史 ]
        tk0_0 tabBar = new tk0_0();
        this.tabProfileBtn = new xe_1(new tq_0());
        this.tabProfileBtn.SU("[ 资料 ]");
        this.tabProfileBtn.qF0(pa0_0.CENTER);
        this.tabProfileBtn.RR(() -> switchTab(false));

        this.tabHistoryBtn = new xe_1(new tq_0());
        this.tabHistoryBtn.SU("历史");
        this.tabHistoryBtn.qF0(pa0_0.CENTER);
        this.tabHistoryBtn.RR(() -> switchTab(true));

        tabBar.gg0.vx0(this.tabProfileBtn).Pt(90.0f).pK0(4.0f);
        tabBar.gg0.vx0(this.tabHistoryBtn).Pt(90.0f);
        tabBar.gg0.vx0(new le0_2()).goto$().im0();

        this.table.vx0(tabBar).dw0().ys0(6.0f).im0();

        // 2. 顶部参数与开关面板
        this.topControlsPanel = new tk0_0();
        this.table.vx0(this.topControlsPanel).dw0().ru().ys0(6.0f).im0();

        // 3. 表头面板（固定置顶，不随内容滚动）
        this.tableHeaderPanel = new tk0_0();
        this.table.vx0(this.tableHeaderPanel).dw0().ru().ys0(2.0f).im0();

        // 4. 主表格数据滚动区（放入 ScrollPane 中，支持鼠标滚轮与滑块拖动）
        this.tableContentPanel = new tk0_0();
        this.tableScrollPane = new lo0_0(this.tableContentPanel);
        this.tableScrollPane.Qs0(2); // 固定宽度 (fixed horizontal), 垂直滚动 (vertical scroll)
        this.tableScrollPane.so();   // 撑满容器宽度
        this.table.vx0(this.tableScrollPane).dw0().goto$().im0();

        // 监听数据层变动自动刷新
        this.serviceListener = this::refreshUI;
        EncounterService.getInstance().addChangeListener(this.serviceListener);

        refreshUI();
        this.center();
    }

    /**
     * 切换 资料 / 历史 标签页
     */
    private void switchTab(boolean history) {
        if (this.isHistoryTab == history) {
            return;
        }
        System.out.println("[EncounterRecorder] 切换选项卡: " + (history ? "历史" : "资料"));
        this.isHistoryTab = history;
        refreshUI();
    }

    /**
     * 刷新整个界面
     */
    public void refreshUI() {
        updateTabButtons();
        updateTopControls();
        updateTableContent();
        this.lt0();
    }

    /**
     * 更新选项卡状态
     */
    private void updateTabButtons() {
        // 保证两个按钮均处于可用（可点击）状态，绝不禁用
        this.tabProfileBtn.pw0(true);
        this.tabHistoryBtn.pw0(true);

        // 设置 ToggleButtonModel 选中状态
        if (this.tabProfileBtn.ER instanceof tq_0) {
            ((tq_0) this.tabProfileBtn.ER).lK0(!this.isHistoryTab);
        }
        if (this.tabHistoryBtn.ER instanceof tq_0) {
            ((tq_0) this.tabHistoryBtn.ER).lK0(this.isHistoryTab);
        }

        // 动态更新选项卡按钮文本，明确显示当前激活的页面
        this.tabProfileBtn.SU(this.isHistoryTab ? "资料" : "[ 资料 ]");
        this.tabHistoryBtn.SU(this.isHistoryTab ? "[ 历史 ]" : "历史");
    }

    /**
     * 更新顶部控制区
     */
    private void updateTopControls() {
        this.topControlsPanel.gg0.OO();
        A40 layout = this.topControlsPanel.gg0;
        EncounterService service = EncounterService.getInstance();

        if (!this.isHistoryTab) {
            // ============= 图一：资料选项卡顶部 =============
            // 第 1 行：遭遇 | 输入框 | 总计 | 复选框 | 占位弹簧 | 下拉菜单
            cn_0 l1 = new cn_0("遭遇:");
            layout.vx0(l1).Pt(42.0f).GD();

            cg_0 totalInput = new cg_0();
            totalInput.mm(String.valueOf(service.getTotalEncounters()));
            totalInput.pw0(false);
            layout.vx0(totalInput).Pt(110.0f).GD().pK0(15.0f);

            W9 hudToggle = new W9();
            hudToggle.k50(service.isHudEnabled());
            hudToggle.RR(() -> service.setHudEnabled(hudToggle.VZ()));

            // 点击 "总计" 文字或复选框均可切换悬浮窗开关
            xe_1 hudLabelBtn = new xe_1("总计");
            hudLabelBtn.uf("label");
            hudLabelBtn.qF0(pa0_0.LEFT);
            hudLabelBtn.RR(() -> {
                boolean next = !hudToggle.VZ();
                hudToggle.k50(next);
                service.setHudEnabled(next);
            });

            layout.vx0(hudLabelBtn).Pt(35.0f).GD();
            layout.vx0(hudToggle).Pt(25.0f).GD();

            layout.vx0(new le0_2()).goto$(); // 弹性占位

            pg0_2 model = new pg0_2((Object[]) EncounterService.CATEGORY_OPTIONS);
            X6 categoryCombo = new X6(model);
            categoryCombo.mu0.PL0 = 8; // 保证展开显示多行 (至少8行并带滚动条)，绝不局限于1行
            categoryCombo.hK(service.getSelectedCategory());
            categoryCombo.Rm0(() -> {
                int idx = categoryCombo.ao();
                if (idx >= 0 && idx < EncounterService.CATEGORY_OPTIONS.length) {
                    String sel = EncounterService.CATEGORY_OPTIONS[idx];
                    service.setSelectedCategory(sel);
                    if ("上次闪光".equals(sel)) {
                        new ShinyDetailWindow().show();
                    }
                }
            });
            layout.vx0(categoryCombo).Pt(150.0f).Wa0().im0();

            // 第 2 行：野外闪率 | 输入框 | (空位) | 占位弹簧 | 子提示框
            layout.Rg();

            cn_0 l3 = new cn_0("野外闪率:");
            layout.vx0(l3).Pt(65.0f).GD();

            cg_0 rateInput = new cg_0();
            rateInput.mm(service.getWildShinyRate());
            rateInput.pw0(false);
            layout.vx0(rateInput).Pt(110.0f).GD().pK0(15.0f);

            layout.vx0(new le0_2()).Pt(35.0f);
            layout.vx0(new le0_2()).Pt(25.0f);
            layout.vx0(new le0_2()).goto$();

            cg_0 subNote = new cg_0();
            subNote.pw0(false);
            layout.vx0(subNote).Pt(150.0f).Wa0().im0();

        } else {
            // ============= 图二：历史选项卡顶部 =============
            // 第 1 行：已捕获闪光宝可梦 | 输入框 | 占位弹簧 | 下拉菜单
            cn_0 l1 = new cn_0("已捕获闪光宝可梦:");
            layout.vx0(l1).Pt(130.0f).GD();

            cg_0 countField = new cg_0();
            countField.mm(String.valueOf(service.getShinyRecords().size()));
            countField.pw0(false);
            layout.vx0(countField).Pt(80.0f).GD();

            layout.vx0(new le0_2()).goto$();

            pg0_2 model = new pg0_2((Object[]) EncounterService.CATEGORY_OPTIONS);
            X6 categoryCombo = new X6(model);
            categoryCombo.mu0.PL0 = 8; // 保证展开显示多行 (至少8行并带滚动条)
            categoryCombo.hK(service.getSelectedCategory());
            categoryCombo.Rm0(() -> {
                int idx = categoryCombo.ao();
                if (idx >= 0 && idx < EncounterService.CATEGORY_OPTIONS.length) {
                    String sel = EncounterService.CATEGORY_OPTIONS[idx];
                    service.setSelectedCategory(sel);
                    if ("上次闪光".equals(sel)) {
                        new ShinyDetailWindow().show();
                    }
                }
            });
            layout.vx0(categoryCombo).Pt(150.0f).Wa0().im0();

            // 第 2 行：占位弹簧 | 显示错过的闪光 | 复选框
            layout.Rg();
            layout.vx0(new le0_2()).goto$();

            cn_0 l2 = new cn_0("显示错过的闪光:");
            layout.vx0(l2).Pt(110.0f).Wa0();

            W9 missedCheck = new W9();
            missedCheck.k50(service.isShowMissedShiny());
            missedCheck.RR(() -> service.setShowMissedShiny(missedCheck.VZ()));
            layout.vx0(missedCheck).Pt(25.0f).Wa0().im0();
        }
    }

    /**
     * 更新主表格内容（固定表头 + 数据行支持滚动）
     */
    private void updateTableContent() {
        this.tableHeaderPanel.gg0.OO();
        this.tableContentPanel.gg0.OO();
        A40 headerLayout = this.tableHeaderPanel.gg0;
        A40 contentLayout = this.tableContentPanel.gg0;
        EncounterService service = EncounterService.getInstance();

        if (!this.isHistoryTab) {
            // ============= 图一：资料列表 =============
            // 表头按钮 (固定在 tableHeaderPanel)
            xe_1 h1 = new xe_1("宝可梦  ^v");
            headerLayout.vx0(h1).Pt(240.0f).dw0();

            xe_1 h2 = new xe_1("种族遭遇");
            headerLayout.vx0(h2).Pt(120.0f);

            xe_1 h3 = new xe_1("置顶");
            headerLayout.vx0(h3).Pt(95.0f).im0();

            // 数据行 (填充在 tableContentPanel，由 ScrollPane 提供滚动)
            List<EncounterModel.SpeciesRecord> list = service.getSpeciesRecords();
            boolean first = true;
            for (EncounterModel.SpeciesRecord r : list) {
                if (!first) {
                    contentLayout.Rg();
                }
                first = false;

                // 宝可梦图标 + 名称 (如 "• 单首龙'恶龙")
                tk0_0 nameBox = new tk0_0();
                le0_2 icon = EncounterUIHelper.createPokemonIcon(r.speciesId);
                if (icon != null) {
                    nameBox.gg0.vx0(icon).Pt(30.0f).Wa0();
                }
                cn_0 nameLabel = new cn_0("  " + r.getDisplayName());
                nameBox.gg0.vx0(nameLabel).Wa0().goto$().im0();
                contentLayout.vx0(nameBox).Pt(240.0f).dw0();

                // 种族遭遇数量
                cn_0 countLabel = new cn_0(String.valueOf(r.count));
                countLabel.qF0(pa0_0.CENTER);
                contentLayout.vx0(countLabel).Pt(120.0f);

                // 置顶 / 取消置顶按钮
                xe_1 pinBtn = new xe_1(r.isPinned ? "取消置顶" : "置顶");
                pinBtn.qF0(pa0_0.CENTER);
                pinBtn.RR(() -> service.togglePin(r));
                contentLayout.vx0(pinBtn).Pt(95.0f).im0();
            }

        } else {
            // ============= 图二：历史列表 =============
            // 表头按钮 (固定在 tableHeaderPanel)
            xe_1 h1 = new xe_1("宝可梦");
            headerLayout.vx0(h1).Pt(170.0f).dw0();

            xe_1 h2 = new xe_1("遭遇");
            headerLayout.vx0(h2).Pt(80.0f);

            xe_1 h3 = new xe_1("种族遭遇");
            headerLayout.vx0(h3).Pt(85.0f);

            xe_1 h4 = new xe_1("捕获时间");
            headerLayout.vx0(h4).Pt(125.0f).im0();

            // 数据行 (填充在 tableContentPanel，由 ScrollPane 提供滚动)
            List<EncounterModel.ShinyRecord> list = service.getShinyRecords();
            boolean first = true;
            for (EncounterModel.ShinyRecord s : list) {
                if (!first) {
                    contentLayout.Rg();
                }
                first = false;

                // 闪光星星 + 图标 + 名称（可点击弹出详细信息卡）
                tk0_0 nameBox = new tk0_0();
                cn_0 star = new cn_0("★ ");
                nameBox.gg0.vx0(star).Wa0();

                le0_2 icon = EncounterUIHelper.createPokemonIcon(s.speciesId, true);
                if (icon != null) {
                    nameBox.gg0.vx0(icon).Pt(30.0f).Wa0();
                }

                xe_1 nameBtn = new xe_1(s.getDisplayName());
                nameBtn.qF0(pa0_0.LEFT);
                nameBtn.RR(() -> new ShinyDetailWindow(s).show());
                nameBox.gg0.vx0(nameBtn).Wa0().goto$().im0();
                contentLayout.vx0(nameBox).Pt(170.0f).dw0();

                cn_0 totalEnc = new cn_0(String.valueOf(s.totalAtCatch));
                totalEnc.qF0(pa0_0.CENTER);
                contentLayout.vx0(totalEnc).Pt(80.0f);

                cn_0 spEnc = new cn_0(String.valueOf(s.speciesAtCatch));
                spEnc.qF0(pa0_0.CENTER);
                contentLayout.vx0(spEnc).Pt(85.0f);

                cn_0 timeLabel = new cn_0(s.catchTime);
                timeLabel.qF0(pa0_0.CENTER);
                contentLayout.vx0(timeLabel).Pt(125.0f).im0();
            }
        }
    }

    @Override
    public void close() {
        EncounterService.getInstance().removeChangeListener(this.serviceListener);
        super.close();
    }
}
