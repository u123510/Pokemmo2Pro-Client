package cn.pokemmo.ui.widget.progress;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import f.ae0_1;
import f.hk0_1;
import f.zk0_1;


public class BufferProgressBarWidget
extends BaseProgressControlWidget {
    public int tD;
    public int hX;
    public int S3;
    public boolean iA;
    public long Sq;

    public BufferProgressBarWidget() {
        BufferProgressBarWidget qd_22 = this;
        qd_22.iA = false;
        qd_22.Sq = 0L;
        qd_22.tD = 100;
        qd_22.S3 = 100;
        qd_22.hX = 100;
        qd_22.uf("love-meter");
    }

    
    @Override
    public final void HP(zk0_1 zk0_12) {
        double d;
        double d2;
        int n;
        super.HP(zk0_12);
        int n2 = this.S3;
        int n3 = this.tD;
        if (n2 == n3) {
            this.aE((float)(n2 * 100 / this.hX) / 100.0f);
            return;
        }
        if (this.iA) {
            long l = this.Sq;
            n = (int)(hk0_1.KG - l) / 40;
            if (n < 1) {
                return;
            }
            this.Sq = l += (long)(n * 40);
        } else {
            long l;
            this.iA = true;
            n = 1;
            this.Sq = l = hk0_1.KG;
        }
        if (n2 > n3 ? (this.S3 = n2 - (int)Math.max(1.0, d2 = (double)this.hX * 0.05) * n) < (n2 = this.tD) : (this.S3 = (int)Math.max(1.0, d = (double)this.hX * 0.05) * n + n2) > (n2 = this.tD)) {
            this.S3 = n2;
        }
        this.aE((float)(this.S3 * 100 / this.hX) / 100.0f);
    }
}
