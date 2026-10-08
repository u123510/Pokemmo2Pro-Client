package cn.pokemmo.ui.font;

import f.UJ0;
import f.es_1;
import f.mu_0;
import f.th_1;

public class FontGlyphMetricsBuffer implements mu_0 {
    public es_1 A30;
    public UJ0 TA0;
    public float S;
    public float Vg0;
    public float UK;

    public FontGlyphMetricsBuffer() {
        this.A30 = new es_1();
        this.TA0 = new UJ0();
    }

    @Override
    public void bL() {
        this.A30.clear();
        this.TA0.Or = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.A30.KB + 32);
        for (int index = 0; index < this.A30.KB; index++) {
            result.append((char) ((th_1) this.A30.get(index)).cJ0);
        }
        result.append(", ").append(this.S)
                .append(", ").append(this.Vg0)
                .append(", ").append(this.UK);
        return result.toString();
    }
}
