package cn.pokemmo.ui.widget.model;

import f.CH0;
import java.util.Comparator;

public class ChatChannelTabDescriptor {
    public static final Comparator bb = Comparator.comparingInt(ChatChannelTabDescriptor::getOrder);
    public final CH0 tZ;
    public final String JG0;
    public final int yK;
    public String i60;

    public ChatChannelTabDescriptor(CH0 id, String name, int order) {
        this.tZ = id;
        this.JG0 = name.length() > 255 ? name.substring(0, 254) : name;
        this.yK = order;
    }

    public static int getOrder(ChatChannelTabDescriptor value) {
        return value.yK;
    }

    public static int mZ(ChatChannelTabDescriptor value) {
        return getOrder(value);
    }
}
