package cn.pokemmo.ui.widget.component;

import f.LT;
import f.Ll0;
import f.UV;
import f.cn_0;

public class TileHexLabelComponent {
    public final LT ts;
    public final cn_0 LpT4;
    public final UV Sp0;

    public TileHexLabelComponent(UV owner, Ll0 value) {
        this.Sp0 = owner;
        this.ts = value;
        String text = new StringBuilder()
                .append(String.format("%02X", value.re() & 0xFF))
                .append("\n")
                .append(String.format("%02X", value.uj() & 0xFF))
                .toString();
        this.LpT4 = new cn_0(text);
    }
}
