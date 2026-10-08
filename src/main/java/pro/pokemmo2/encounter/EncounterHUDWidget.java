package pro.pokemmo2.encounter;

import f.A40;
import f.cn_0;
import f.le0_2;
import f.pa0_0;
import f.tk0_0;
import f.xe_1;
import pro.pokemmo2.UIManager;
import pro.pokemmo2.core.BaseWindow;

import java.util.List;

/**
 * 主界面微型悬浮挂件（图四折叠形态、图五展开形态）。
 * 极致还原官方 UI 质感与排版。
 */
public class EncounterHUDWidget extends BaseWindow {
    private boolean expanded = false;
    private final xe_1 toggleBtn;
    private final tk0_0 contentPanel;
    private final Runnable serviceListener;

    public EncounterHUDWidget() {
        super("");
        this.uf("base-frame-padded");
        this.setMovable(true);
        this.setResizable(false);

        // 1. 将 [+] / [−] 展开按钮直接添加进窗口原生标题栏（与右上角关闭按钮并列）
        this.toggleBtn = new xe_1("+");
        this.toggleBtn.qF0(pa0_0.CENTER);
        this.toggleBtn.RR(this::toggleExpand);
        this.F9(this.fU(), this.toggleBtn);

        // 2. 窗口关闭监听
        this.Pb0(this::onCloseClicked);

        // 3. 核心内容区容器
        this.contentPanel = new tk0_0();
        this.table.vx0(this.contentPanel).dw0().goto$().im0();

        // 4. 数据层变动自动刷新
        this.serviceListener = this::refreshContent;
        EncounterService.getInstance().addChangeListener(this.serviceListener);

        refreshContent();
        this.setWindowPosition(20, 80);
    }

    /**
     * 覆盖窗口布局计算：将 toggleBtn 自动对齐到原生关闭按钮 (Lr0) 左侧
     */
    @Override
    public void K8() {
        super.K8();
        if (this.toggleBtn != null && this.Lr0 != null) {
            int closeX = this.Lr0.A20;
            int closeY = this.Lr0.SB0;
            int h = this.Lr0.OB > 0 ? this.Lr0.OB : 14;
            int w = 15;
            this.toggleBtn.oY(w, h);
            this.toggleBtn.E40(closeX - w - 3, closeY);
        }
    }

    /**
     * 切换展开 / 折叠
     */
    public void toggleExpand() {
        this.expanded = !this.expanded;
        this.toggleBtn.SU(this.expanded ? "−" : "+");
        refreshContent();
    }

    /**
     * 点击右上角关闭悬浮窗
     */
    private void onCloseClicked() {
        EncounterService.getInstance().setHudEnabled(false);
        this.close();
    }

    /**
     * 刷新挂件内容（图四 与 图五）
     */
    public void refreshContent() {
        this.contentPanel.gg0.OO();
        A40 layout = this.contentPanel.gg0;
        EncounterService service = EncounterService.getInstance();

        // 1. 首行：总计（图四 & 图五 均包含，精灵球标识 + 总计 + 数值）
        tk0_0 totalCol = new tk0_0();
        le0_2 ballIcon = EncounterUIHelper.createItemIcon((short) 4);
        if (ballIcon != null) {
            totalCol.gg0.vx0(ballIcon).Pt(24.0f).Wa0();
        }
        xe_1 totalLabel = new xe_1("  总计");
        totalLabel.uf("label");
        totalLabel.qF0(pa0_0.LEFT);
        totalLabel.RR(UIManager::openEncounterRecorder);
        totalCol.gg0.vx0(totalLabel).Wa0().im0();

        cn_0 totalCount = new cn_0(String.valueOf(service.getTotalEncounters()));
        totalCount.qF0(pa0_0.RIGHT);

        layout.vx0(totalCol).dw0().Wa0();
        layout.vx0(totalCount).dw0().GD().im0();

        // 2. 展开模式（图五）：显示置顶精灵、常规精灵以及其他统计
        if (this.expanded) {
            List<EncounterModel.SpeciesRecord> list = service.getSpeciesRecords();
            int maxShow = Math.min(list.size(), 4);
            for (int i = 0; i < maxShow; i++) {
                EncounterModel.SpeciesRecord r = list.get(i);
                layout.Rg();

                // 左侧列：宝可梦图标 + 名称 + 置顶标识
                tk0_0 spCol = new tk0_0();
                le0_2 icon = EncounterUIHelper.createPokemonIcon(r.speciesId);
                if (icon != null) {
                    spCol.gg0.vx0(icon).Pt(30.0f).Wa0();
                }
                String pin = r.isPinned ? " ★" : "";
                cn_0 spName = new cn_0("  " + r.getDisplayName() + pin);
                spName.qF0(pa0_0.LEFT);
                spCol.gg0.vx0(spName).Wa0().goto$().im0();

                // 右侧列：遭遇计数值
                cn_0 spCount = new cn_0(String.valueOf(r.count));
                spCount.qF0(pa0_0.RIGHT);

                layout.vx0(spCol).dw0().Wa0();
                layout.vx0(spCount).dw0().GD().im0();
            }

            // 汇总剩余的“其他”
            int other = service.getOtherEncountersCount();
            int extraRows = 0;
            if (other > 0 || list.size() > maxShow) {
                extraRows = 1;
                layout.Rg();
                tk0_0 otherCol = new tk0_0();
                le0_2 otherIcon = EncounterUIHelper.createItemIcon((short) 0);
                if (otherIcon != null) {
                    otherCol.gg0.vx0(otherIcon).Pt(24.0f).Wa0();
                }
                cn_0 otherName = new cn_0("  其他");
                otherName.qF0(pa0_0.LEFT);
                otherCol.gg0.vx0(otherName).Wa0().goto$().im0();

                cn_0 otherCount = new cn_0(String.valueOf(other));
                otherCount.qF0(pa0_0.RIGHT);

                layout.vx0(otherCol).dw0().Wa0();
                layout.vx0(otherCount).dw0().GD().im0();
            }

            this.setWindowSize(260, 52 + (maxShow + extraRows) * 25);
        } else {
            // 折叠模式尺寸（图四）
            this.setWindowSize(220, 52);
        }

        this.lt0();
    }

    @Override
    public void close() {
        EncounterService.getInstance().removeChangeListener(this.serviceListener);
        super.close();
    }
}
