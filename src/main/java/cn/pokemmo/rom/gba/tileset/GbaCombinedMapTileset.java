package cn.pokemmo.rom.gba.tileset;

import f.*;

import com.badlogic.gdx.graphics.Texture;
import java.nio.ByteBuffer;

public class GbaCombinedMapTileset {
    public static final dl_1 uf = Cq0.E1(GbaCombinedMapTileset.class);
    public final db0_2[] w3;
    public final int Pp0;
    public go0_0 Qv0;

    public GbaCombinedMapTileset(int n, int n2, qa0_1 qa0_12) {
        p2_0 first = GbaCombinedMapTileset.nz0(n, qa0_12, null);
        p2_0 second = GbaCombinedMapTileset.nz0(n2, qa0_12, first);
        this.Pp0 = first.GL();
        this.w3 = new db0_2[first.GL() + second.GL()];
        this.Qv0 = new go0_0(Math.min(1024, sx_1.jg0), Math.min(1024, sx_1.jg0), ix0_0.Vw, 2, true, new d00_0());
        for (int i = 0; i < first.GL(); i++) {
            this.w3[i] = first.MD()[i];
        }
        for (int i = 0; i < second.GL(); i++) {
            this.w3[first.GL() + i] = second.MD()[i];
        }
        this.Ep(qa0_12.vy0(), first, second);
    }

    public static p2_0 nz0(int n, qa0_1 qa0_12, p2_0 p2_02) {
        return new p2_0(n, qa0_12, p2_02);
    }

    public final void Ep(ByteBuffer buffer, p2_0 first, p2_0 second) {
        int max = -1;
        for (db0_2 tile : this.w3) {
            int id = tile.cY;
            if (id > max) {
                max = id;
            }
        }
        first.nj(buffer, this.Qv0, second);
        second.nj(buffer, this.Qv0, null);
        eb0_1 filter = eb0_1.Y30;
        boolean useMipMaps = false;
        I2 it = this.Qv0.b6.ZD();
        while (it.hasNext()) {
            ZO page = (ZO) it.next();
            i4_0 pixmap = page.WD0;
            Texture texture = new Texture(new S60(pixmap, pixmap.rH0(), useMipMaps, true, false));
            page.q5 = texture;
            texture.setFilter(filter, filter);
        }
        dl_1 logger = GbaCombinedMapTileset.uf;
        int ignored = this.Qv0.b6.KB;
        logger.getClass();
        first.SD0(this.Qv0);
        second.SD0(this.Qv0);
        this.Qv0.oo = null;
    }
}
