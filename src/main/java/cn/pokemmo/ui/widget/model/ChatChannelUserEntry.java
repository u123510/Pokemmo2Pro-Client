package cn.pokemmo.ui.widget.model;

import f.CH0;

public class ChatChannelUserEntry {
    public final CH0 w8;
    public final String zJ0;
    public final String mo;
    public final int yc;

    public ChatChannelUserEntry(int i1, CH0 v2, String v3, String v4) {
        this.w8 = v2;
        this.zJ0 = v3;
        if (v4.length() > 10) {
            this.mo = v4.substring(0, 9);
        } else {
            this.mo = v4;
        }
        this.yc = i1;
    }
}
