package f;

import cn.pokemmo.ui.widget.component.BaseTabbedPanelComponent;
import java.util.*;

/**
 * 垫片 - BaseTabbedPanelComponent
 * 职责: 通用复合视图与面板组件
 * 原始混淆类: f.OA0
 * 现代实现: cn.pokemmo.ui.widget.component.BaseTabbedPanelComponent
 */
public abstract class OA0 extends BaseTabbedPanelComponent {

    public OA0(BU owner, byte mode) {
        super(owner, mode);
    }
    public OA0(BU owner, byte mode, int confirmId, int cancelId) {
        super(owner, mode, confirmId, cancelId);
    }
}
