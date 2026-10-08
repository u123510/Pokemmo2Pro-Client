package cn.pokemmo.audio;

import f.*;

public class SoundPlaybackCallback implements mu_0 {
    public int n;
    public float LG;
    public float Dg0;
    public float pr;
    public float D3;
    public float Yo;
    public float Py0;
    public final BS B9;

    public SoundPlaybackCallback(int size) {
        this.B9 = size > 1 ? new BS(size) : null;
        this.bL();
    }

    public final void R00(float value) {
        this.Yo = value;
        this.LG += value;
        int count = ++this.n;
        this.D3 = this.LG / count;

        float windowValue = 0.0f;
        BS window = this.B9;
        if (window != null) {
            int filled = window.ma0;
            float[] values = window.UF;
            if (filled < values.length) {
                window.ma0 = filled + 1;
            }
            int index = window.aM0;
            window.aM0 = index + 1;
            values[index] = value;
            if (window.aM0 > values.length - 1) {
                window.aM0 = 0;
            }
            if (window.ma0 >= values.length) {
                float total = 0.0f;
                for (float item : values) {
                    total += item;
                }
                window.hU = total / values.length;
                windowValue = window.hU;
            }
        }

        this.Py0 = windowValue;
        if (window == null || window.ma0 >= window.UF.length) {
            if (windowValue < this.Dg0) {
                this.Dg0 = windowValue;
            }
            if (windowValue > this.pr) {
                this.pr = windowValue;
            }
        }
    }

    @Override
    public final void bL() {
        this.n = 0;
        this.LG = 0.0f;
        this.Dg0 = Float.MAX_VALUE;
        this.pr = -Float.MAX_VALUE;
        this.D3 = 0.0f;
        this.Yo = 0.0f;
        this.Py0 = 0.0f;
        if (this.B9 != null) {
            this.B9.ma0 = 0;
            this.B9.aM0 = 0;
            for (int i = 0; i < this.B9.UF.length; i++) {
                this.B9.UF[i] = 0.0f;
            }
        }
    }

    @Override
    public final String toString() {
        return new StringBuilder("FloatCounter{count=").append(this.n)
            .append(", total=").append(this.LG)
            .append(", min=").append(this.Dg0)
            .append(", max=").append(this.pr)
            .append(", average=").append(this.D3)
            .append(", latest=").append(this.Yo)
            .append(", value=").append(this.Py0)
            .append('}').toString();
    }
}
