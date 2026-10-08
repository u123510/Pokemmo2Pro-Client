package cn.pokemmo.ui.font;

public class FontGlyphRenderMetrics {
    public int cJ0;
    public int Pt;
    public int wj0;
    public int k;
    public int pz0;
    public float DG;
    public float A60;
    public float En0;
    public float Dj0;
    public int kJ0;
    public int iM;
    public int V80;
    public byte[][] LS;
    public int qc0;

    public FontGlyphRenderMetrics() {
        this.qc0 = 0;
    }

    public void zA(int i1, int i2) {
        if (this.LS == null) {
            this.LS = new byte[128][];
        }
        int i3 = i1 >>> 9;
        byte[] bArr = this.LS[i3];
        if (bArr == null) {
            bArr = new byte[512];
            this.LS[i3] = bArr;
        }
        bArr[i1 & 511] = (byte) i2;
    }

    @Override
    public String toString() {
        return Character.toString((char) this.cJ0);
    }
}
