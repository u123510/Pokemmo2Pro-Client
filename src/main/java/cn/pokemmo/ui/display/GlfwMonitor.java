package cn.pokemmo.ui.display;

public class GlfwMonitor extends DisplayMonitor {
    public final long Y2;

    public GlfwMonitor(long l, int n, int n2, String string) {
        super(n, n2, string);
        this.Y2 = l;
    }
}
