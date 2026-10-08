package cn.pokemmo.graphics.gdx.camera;

import f.*;


import com.badlogic.gdx.graphics.Texture;

public class GdxCameraControllerBase extends vd_1 {
    public GdxCameraControllerBase() {
        super(new lpt1__2());
    }

    public GdxCameraControllerBase(gq_1 gq_1) {
        super(gq_1);
    }

    public final jt0_0 VW(String str) {
        fb0_0 fb0_0 = new fb0_0();
        Dn0 resolve = resolve(str);
        this.ID0 = this.AUX.G4(resolve);
        nb_2 nb_2 = new nb_2();
        I2 zd = hz0(resolve).ZD();
        while (zd.hasNext()) {
            Dn0 dn0 = (Dn0) zd.next();
            Texture texture = new Texture(dn0, false);
            texture.setFilter(fb0_0.yB0, fb0_0.Pm);
            nb_2.WK0(dn0.el(), texture);
        }
        jt0_0 qL0 = qL0(resolve, fb0_0, new yd_0(nb_2));
        qL0.Lu0 = nb_2.Ww0().hT();
        return qL0;
    }

    @Override
    public final es_1 xY(Dn0 dn0, Em0 em0) {
        es_1 es_1 = new es_1();
        I2 zd = hz0(dn0).ZD();
        while (zd.hasNext()) {
            es_1.Ue0(new cr_2((Dn0) zd.next(), Texture.class, em0));
        }
        return es_1;
    }

    public final es_1 hz0(Dn0 dn0) {
        es_1 es_1 = new es_1();
        I2 zd = this.ID0.m8("tileset").ZD();
        while (zd.hasNext()) {
            G10 g10 = (G10) zd.next();
            String sc = g10.SC("source", null);
            if (sc != null) {
                Dn0 od0 = vd_1.OD0(sc, dn0);
                G10 g4 = this.AUX.G4(od0);
                if (g4.uQ("image") != null) {
                    es_1.Ue0(vd_1.OD0(g4.uQ("image").Rf("source"), od0));
                } else {
                    I2 zd2 = g4.m8("tile").ZD();
                    while (zd2.hasNext()) {
                        es_1.Ue0(vd_1.OD0(((G10) zd2.next()).uQ("image").Rf("source"), od0));
                    }
                }
            } else if (g10.uQ("image") != null) {
                es_1.Ue0(vd_1.OD0(g10.uQ("image").Rf("source"), dn0));
            } else {
                I2 zd3 = g10.m8("tile").ZD();
                while (zd3.hasNext()) {
                    es_1.Ue0(vd_1.OD0(((G10) zd3.next()).uQ("image").Rf("source"), dn0));
                }
            }
        }
        I2 zd4 = this.ID0.m8("imagelayer").ZD();
        while (zd4.hasNext()) {
            String sc2 = ((G10) zd4.next()).uQ("image").SC("source", null);
            if (sc2 != null) {
                es_1.Ue0(vd_1.OD0(sc2, dn0));
            }
        }
        return es_1;
    }

    @Override
    public final void pG(Dn0 dn0, fm0_0 fm0_0, rr_1 rr_1, es_1 es_1, int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, String str2, int i8, int i9, Dn0 dn02) {
        Sz0 sz0 = rr_1.Qj0;
        if (sz0 != null) {
            LPT6_ qq0 = fm0_0.Qq0(dn02.el());
            sz0.Oa0.WK0("imagesource", str2);
            sz0.Oa0.WK0("imagewidth", Integer.valueOf(i8));
            sz0.Oa0.WK0("imageheight", Integer.valueOf(i9));
            sz0.Oa0.WK0("tilewidth", Integer.valueOf(i2));
            sz0.Oa0.WK0("tileheight", Integer.valueOf(i3));
            sz0.Oa0.WK0("margin", Integer.valueOf(i5));
            sz0.Oa0.WK0("spacing", Integer.valueOf(i4));
            int bz = qq0.bz - i2;
            int xz = qq0.xZ - i3;
            int i10 = i5;
            int currentTileId = i;
            while (i10 <= xz) {
                int i13 = i5;
                while (i13 <= bz) {
                    LPT6_ lpt6_ = new LPT6_(qq0, i13, i10, i2, i3);
                    float f16 = (float) i7;
                    float f17 = (float) i6;
                    ij_1 ij_1 = new ij_1(lpt6_);
                    ij_1.Tq0 = currentTileId;
                    ij_1.LPt9 = f16;
                    if (this.Ob) {
                        f17 = -f17;
                    }
                    ij_1.f70 = f17;
                    rr_1.zX.qx0(currentTileId, ij_1);
                    currentTileId++;
                    i13 += i2 + i4;
                }
                i10 += i3 + i4;
            }
            return;
        }

        I2 zd = es_1.ZD();
        while (zd.hasNext()) {
            G10 g10 = (G10) zd.next();
            G10 uQ = g10.uQ("image");
            Dn0 dn03 = null;
            if (uQ != null) {
                String rf = uQ.Rf("source");
                if (str != null) {
                    dn03 = vd_1.OD0(rf, vd_1.OD0(str, dn0));
                } else {
                    dn03 = vd_1.OD0(rf, dn0);
                }
            }
            LPT6_ qq0_tile = fm0_0.Qq0(dn03.el());
            int id = Integer.parseInt(g10.Rf("id")) + i;
            float f8 = (float) i7;
            float f9 = (float) i6;
            ij_1 ij_1_tile = new ij_1(qq0_tile);
            ij_1_tile.Tq0 = id;
            ij_1_tile.LPt9 = f8;
            if (this.Ob) {
                f9 = -f9;
            }
            ij_1_tile.f70 = f9;
            rr_1.zX.qx0(id, ij_1_tile);
        }
    }

    @Override
    public final Object loadSync(hd0_2 hd0_2, String str, Dn0 dn0, in_0 in_0) {
        fb0_0 fb0_0 = (fb0_0) in_0;
        return this.ep;
    }

    @Override
    public final void loadAsync(hd0_2 hd0_2, String str, Dn0 dn0, in_0 in_0) {
        fb0_0 fb0_0 = (fb0_0) in_0;
        this.ep = qL0(dn0, fb0_0, new aux__3(hd0_2));
    }
}
