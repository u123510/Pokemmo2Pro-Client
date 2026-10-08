package cn.pokemmo.ui.widget.list;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.CurrencyValueTagLabel;
import cn.pokemmo.ui.widget.component.BaseInteractiveListComponent;
import cn.pokemmo.ui.widget.list.BaseScrollListWidget;

import org.lwjgl.glfw.GLFW;

public class CompactDropdownItemListWidget extends BaseScrollListWidget {
    public CompactDropdownItemListWidget() {
        super();
    }

    public final boolean WS() {
        String value;
        if (lg_0.k.E00 == null) {
            value = "";
        } else {
            value = GLFW.glfwGetClipboardString(lg_0.S4.rt0.hc0);
        }
        if (value == null) {
            return true;
        }
        if (RF.tw0(value) > 0) {
            String[] lines = value.replaceAll("\\r", "").split("\\n");
            for (String line : lines) {
                this.Nr0(line);
                this.mS(66);
            }
            return true;
        }
        this.Nr0(value);
        return true;
    }
}
