package pro.pokemmo2.core;

import f.A40;
import f.BU;
import f.R90;
import f.cg_0;
import f.cn_0;
import f.j1_0;
import f.le0_2;
import f.pa0_0;
import f.tk0_0;
import f.tw0_0;
import f.wn0_0;
import f.xe_1;

/**
 * 自定义 UI 窗口基类。
 * 封装混淆后的 TWL/LibGDX 窗口组件 (f.R90 等)，提供语义清晰的开发接口。
 */
public class BaseWindow extends R90 {
    protected final tk0_0 rootTable;
    protected final A40 table;

    public BaseWindow(String title) {
        super();
        // 1. 设置游戏内标准浮动窗口皮肤 (base-frame-padded)
        this.uf("base-frame-padded");

        // 2. 设置窗口标题
        this.Hy(title != null ? title : "");

        // 3. 设置允许缩放轴为 NONE (默认禁止边框拖拽缩放大小)，并允许拖拽标题栏移动窗口
        this.ff0(1);
        this.bD(true);

        // 4. 设置右上角关闭按钮逻辑
        this.Pb0(this::close);

        // 5. 创建内容布局器（基于 Table 布局的 tk0_0）
        this.rootTable = new tk0_0();
        this.table = this.rootTable.gg0;
        this.SL(this.rootTable);
    }

    /**
     * 设置窗口标题
     */
    public void setTitle(String title) {
        this.Hy(title);
    }

    /**
     * 设置窗口尺寸 (宽, 高)
     */
    public void setWindowSize(int width, int height) {
        this.oY(width, height);
    }

    /**
     * 设置窗口在屏幕上的绝对坐标 (x, y)
     */
    public void setWindowPosition(int x, int y) {
        this.E40(x, y);
    }

    /**
     * 设置是否允许通过拖拽标题栏移动窗口位置
     */
    public void setMovable(boolean movable) {
        this.bD(movable);
    }

    /**
     * 获取是否允许拖拽移动窗口
     */
    public boolean isMovable() {
        return this.Yc0;
    }

    /**
     * 设置是否允许通过边框缩放窗口大小
     * @param resizable true 允许四边自由缩放，false 固定窗口大小
     */
    public void setResizable(boolean resizable) {
        this.ff0(resizable ? 4 : 1);
    }

    /**
     * 获取窗口当前是否允许通过边框缩放大小
     */
    public boolean isResizable() {
        return this.NT != 1;
    }

    /**
     * 将窗口居中显示在游戏画面中央
     */
    public void center() {
        int screenWidth = tw0_0.LD0 != null ? tw0_0.LD0.ew0() : 800;
        int screenHeight = tw0_0.LD0 != null ? tw0_0.LD0.Hv0() : 600;
        int w = this.Mx > 0 ? this.Mx : 380;
        int h = this.OB > 0 ? this.OB : 200;
        int x = Math.max(0, (screenWidth - w) / 2);
        int y = Math.max(0, (screenHeight - h) / 2);
        this.E40(x, y);
    }

    /**
     * 添加一行文字标签
     * @param text 文本内容
     * @return 标签部件 cn_0
     */
    public cn_0 addLabel(String text) {
        cn_0 label = new cn_0(text != null ? text : "");
        this.table.vx0(label).im0();
        return label;
    }

    /**
     * 添加一行水平居中的文字标签
     * @param text 文本内容
     * @return 标签部件 cn_0
     */
    public cn_0 addCenteredLabel(String text) {
        cn_0 label = new cn_0(text != null ? text : "");
        label.qF0(pa0_0.CENTER);
        this.table.vx0(label).Yt().dw0().ru().im0();
        return label;
    }

    /**
     * 添加一个单行输入框并换行
     * @param initialText 初始文本
     * @return 输入框部件 cg_0
     */
    public cg_0 addInputField(String initialText) {
        cg_0 input = new cg_0();
        if (initialText != null && !initialText.isEmpty()) {
            input.mm(initialText);
        }
        this.table.vx0(input).Yt().dw0().im0();
        return input;
    }

    /**
     * 读取输入框中的文本内容
     */
    public static String getInputText(cg_0 input) {
        if (input != null && input.dI0 instanceof wn0_0) {
            return ((wn0_0) input.dI0).YA.toString();
        }
        return "";
    }

    /**
     * 添加一个按钮并自动换行
     * @param text 按钮文字
     * @param onClick 点击回调
     * @return 布局单元格 j1_0
     */
    public j1_0 addButton(String text, Runnable onClick) {
        xe_1 button = new xe_1(text);
        button.qF0(pa0_0.CENTER);
        if (onClick != null) {
            button.RR(onClick);
        }
        return this.table.vx0(button).im0();
    }

    /**
     * 在当前行添加任意部件
     */
    public j1_0 addWidget(le0_2 widget) {
        return this.table.vx0(widget);
    }

    /**
     * 换行
     */
    public void row() {
        this.table.Rg();
    }

    /**
     * 获取底层的表格布局器，用于自定义复杂排版
     */
    public A40 getTable() {
        return this.table;
    }

    /**
     * 在游戏界面中显示窗口（优先挂载到主 HUD BU.T50）
     */
    public void show() {
        // 游戏运行中的主 HUD 容器为 BU.T50
        le0_2 parent = BU.T50;
        if (parent == null && tw0_0.LD0 != null) {
            parent = tw0_0.LD0.wO; // 备用回退到 GUI 根节点
        }
        if (parent == null && tw0_0.LD0 != null) {
            parent = tw0_0.LD0.wo;
        }

        if (parent != null) {
            if (this.K20 != null && this.K20 != parent) {
                this.close();
            }
            if (this.K20 == null) {
                parent.SL(this);
            }
            // 必须计算布局以获得准确的尺寸
            this.lt0();

            if (this.Mx < 360) {
                this.oY(360, Math.max(this.OB, 200));
            }

            int screenWidth = tw0_0.LD0 != null ? tw0_0.LD0.ew0() : 800;
            int screenHeight = tw0_0.LD0 != null ? tw0_0.LD0.Hv0() : 600;
            int x = Math.max(0, (screenWidth - this.Mx) / 2);
            int y = Math.max(0, (screenHeight - this.OB) / 2);
            this.E40(x, y);

            // 置于顶层并获得键盘焦点
            this.BL();

            System.out.println("[PokeMMO2] BaseWindow.show() 成功挂载至 " + parent.getClass().getSimpleName()
                    + ", 坐标: (" + x + ", " + y + "), 尺寸: " + this.Mx + "x" + this.OB);
        } else {
            System.err.println("[PokeMMO2] BaseWindow.show() 失败: 未找到可用的父 UI 容器！");
        }
    }

    /**
     * 每次布局更新时，确保标题栏文字居中
     */
    @Override
    public void K8() {
        super.K8();
        if (this.QH0 != null) {
            this.QH0.qF0(pa0_0.CENTER);
        }
    }

    /**
     * 关闭并从界面移除窗口
     */
    public void close() {
        if (this.K20 != null) {
            this.K20.u3(this);
        } else {
            this.xe0();
        }
    }
}
