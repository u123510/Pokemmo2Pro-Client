package cn.pokemmo.rom.nds.model;

import f.*;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import java.nio.ByteBuffer;

public class NdsField3DModelManager {
    public static final dl_1 tq = Cq0.E1(NdsField3DModelManager.class);
    public static NdsField3DModelManager instance;
    public FJ LU;
    public FJ U20;
    public final vh_1[] LM;
    public FJ G;
    public Ou0 Zp;
    public Ou0 G5;
    public Ou0 OM;
    public Ou0 aJ;
    public Ou0 SA;
    public Ou0 kM;
    public Ou0 yL;
    public Ou0 cU;
    public Ou0 P10;
    public Ou0 zs;
    public final Ou0[] Ht0;
    public Ou0 cg;
    public Ou0 ct;
    public Ou0[] R5;
    public final int[][] Xs0;
    public Ou0 Nt0;
    public Ou0 Mn0;
    public Ou0 W8;
    public Ou0 ff0;
    public Ou0 kn;
    public Ou0[] Py0;
    public LPT6_[][][] transient$;
    public Ou0[] oX;
    public final w7_0 f40;
    public final w7_0 ij;
    public final es_1 M70;
    public es_1 a10;
    public int mw;

    public NdsField3DModelManager() {
        this.Ht0 = new Ou0[4];
        this.R5 = new Ou0[17];
        this.Xs0 = new int[][]{
                {134}, {135}, {136}, {137}, {138}, {139}, {140}, {141}, {142},
                {143}, {144}, {145}, {115}, {116}, {117}, {118, 146}, {119, 147}
        };
        this.f40 = new w7_0();
        this.ij = new w7_0();
        this.M70 = new es_1();
        this.mw = -1;
        this.transient$ = new LPT6_[5][][];
        this.LM = new vh_1[5];
        this.q1(tw0_0.Ll0.Qz0);
        if (tw0_0.Ll0.nC0 != null) {
            this.gj(tw0_0.Ll0.nC0);
        }
        if (tw0_0.Ll0.t1 != null) {
            this.gA0(tw0_0.Ll0.t1);
        }
        this.mw = c8_0.A90().YG();
    }

    public static NdsField3DModelManager getInstance() {
        if (instance == null) {
            instance = new NdsField3DModelManager();
        }
        return instance;
    }

    public final void q1(nj0_0 resources) {
        try {
            this.LM[2] = resources.D4;
            this.transient$[2] = new LPT6_[47][];
            vh_1 archive = this.LM[2];
            this.Zp = v80_0.CW(archive, 49);
            this.OM = v80_0.CW(archive, 47);
            this.yL = v80_0.CW(archive, 48, 96);
            this.G5 = v80_0.CW(archive, 54, 107, 133);
            for (int index = 0; index < this.Ht0.length; index++) {
                this.Ht0[index] = v80_0.CW(archive, index + 50);
                this.Ht0[index].I0 = true;
            }
            this.aJ = v80_0.CW(archive, 95, 106);
            this.SA = v80_0.CW(archive, 84, 103);
            this.kM = v80_0.CW(archive, 82, 114, 130, 149);

            FJ modelArchive = new FJ((Ae) resources.fd0.dg.get("/a/1/1/5"));
            this.cg = v80_0.CW(modelArchive, 66, 67, 68, 69);
            this.ct = v80_0.CW(modelArchive, 58, 60, 61, 62);
            this.G = new FJ((Ae) resources.fd0.dg.get("/a/0/4/9"));
            this.oX = new Ou0[6];
            FJ encounterArchive = new FJ((Ae) resources.fd0.dg.get("/a/0/7/5"));
            this.zs = v80_0.CW(encounterArchive, 77, 101, 113, 129, 148);
        } catch (Exception exception) {
            tq.error("Error loading overworld models.", exception);
        }
    }

    public final void gj(Ts resources) {
        this.LU = new FJ((Ae) resources.fd0.dg.get("/data/mmodel/mmodel.narc"));
        this.LM[3] = new FJ((Ae) resources.fd0.dg.get("/data/mmodel/fldeff.narc"));
        this.transient$[3] = new LPT6_[15][];
        if (this.cU == null) {
            this.cU = v80_0.CW(this.LM[3], 82);
        }
    }

    public final void gA0(UY resources) {
        this.U20 = new FJ((Ae) resources.fd0.dg.get("/a/0/8/1"));
        this.LM[4] = new FJ((Ae) resources.fd0.dg.get("/a/1/0/3"));
        this.transient$[4] = new LPT6_[28][];
        this.P10 = v80_0.CW(this.LM[4], 30, 135);
        if (this.cU == null) {
            this.cU = v80_0.CW(this.LM[4], 87);
        }
    }

    public final LPT6_[] LPT6(byte archiveIndex, int fileIndex) {
        if (archiveIndex == 3 && (fileIndex == 0 || fileIndex == 8 || fileIndex == 9)
                && this.mw != c8_0.JD0.YG()) {
            this.disposeTexture(3, 0);
            this.disposeTexture(3, 8);
            this.disposeTexture(3, 9);
            this.mw = c8_0.JD0.YG();
        }
        if (archiveIndex == 4 && (fileIndex == 21 || fileIndex == 25)
                && this.mw != c8_0.JD0.YG()) {
            this.disposeTexture(4, 25);
            LPT6_[] regions = this.transient$[4][21];
            if (regions != null) {
                for (LPT6_ region : regions) {
                    region.OB.dispose();
                }
                this.transient$[4][21] = null;
            }
            this.mw = c8_0.JD0.YG();
        }
        if (this.transient$[archiveIndex][fileIndex] == null) {
            this.transient$[archiveIndex][fileIndex] = this.buildTextureRegions(archiveIndex, fileIndex);
        }
        return this.transient$[archiveIndex][fileIndex];
    }

    private void disposeTexture(int archiveIndex, int fileIndex) {
        LPT6_[] regions = this.transient$[archiveIndex][fileIndex];
        if (regions != null) {
            regions[0].OB.dispose();
            this.transient$[archiveIndex][fileIndex] = null;
        }
    }

    private LPT6_[] buildTextureRegions(byte archiveIndex, int fileIndex) {
        ByteBuffer bytes = this.LM[archiveIndex].EG(fileIndex).MH(false);
        Er0 parsed = new Er0(bytes, false, false);
        am_2 animation = parsed.E10;
        pv_0 firstFrame = (pv_0) animation.ib0.Ks.KI();
        int frameCount = animation.ib0.Ks.KB;
        int paletteCount = animation.CoM5.Ks.KB;
        int frameWidth = firstFrame.kK0;
        int frameHeight = firstFrame.bR;
        i4_0 combined = new i4_0(frameWidth * frameCount, frameHeight, ix0_0.Vw);
        combined.Pa0(DF0.Ha0);
        combined.bI(Color.RED);
        combined.XF.HI0(0, combined.Je0);
        combined.bI(Color.GREEN);
        combined.XF.HI0(32, combined.Je0);
        combined.bI(Color.BLUE);
        combined.XF.HI0(64, combined.Je0);
        combined.bI(Color.PURPLE);
        combined.XF.HI0(96, combined.Je0);

        LPT6_[] regions = new LPT6_[frameCount];
        for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
            i4_0 frame;
            if (archiveIndex == 3 && (fileIndex == 0 || fileIndex == 8 || fileIndex == 9)) {
                frame = this.buildPlayerFrame(animation, frameIndex, fileIndex);
            } else if (archiveIndex == 4 && (fileIndex == 21 || fileIndex == 25)) {
                frame = this.buildFieldEffectFrame(animation, frameIndex, fileIndex);
            } else {
                frame = animation.Rt0(frameIndex, frameCount == paletteCount ? frameIndex : 0);
            }
            combined.NH0(frame, frameIndex * frameWidth, 0);
            frame.dispose();
        }

        Texture texture = new Texture(combined);
        this.M70.Ue0(texture);
        combined.dispose();
        for (int frameIndex = 0; frameIndex < frameCount; frameIndex++) {
            regions[frameIndex] = new LPT6_(texture, frameIndex * frameWidth, 0, frameWidth, frameHeight);
        }
        return regions;
    }

    private i4_0 buildPlayerFrame(am_2 animation, int frameIndex, int fileIndex) {
        pv_0 image = (pv_0) animation.ib0.Ks.get(frameIndex);
        int paletteIndex = animation.ib0.Ks.KB == animation.CoM5.Ks.KB ? frameIndex : 0;
        int[] palette = ((gb_0) animation.CoM5.Ks.get(paletteIndex)).yF0(image.bh0);
        c8_0 settings = c8_0.JD0;
        if (settings.YG() != 0) {
            int outfitArchive = 6;
            int outfitImage = 31;
            int outfitPalette = 30;
            if (fileIndex == 8) {
                outfitArchive = 18;
                outfitImage = 68;
                outfitPalette = 64;
            } else if (fileIndex == 9) {
                outfitArchive = 62;
                outfitImage = 49;
                outfitPalette = 48;
            }
            am_2 outfit = tw0_0.Ll0.nC0.EL0(MG0.lpt6, outfitArchive);
            int[] original = ((gb_0) outfit.CoM5.Ks.get(outfitPalette))
                    .yF0(((pv_0) outfit.ib0.Ks.get(outfitImage)).bh0);
            int[] replacement = jj0_2.SC0((byte) 3, outfit, settings.YG(), outfitArchive, outfitImage,
                    ((gb_0) outfit.CoM5.Ks.get(outfitPalette)).a00);
            if (replacement != null) {
                if (fileIndex == 9) {
                    palette[5] = replacement[0];
                    palette[6] = replacement[2];
                    palette[7] = replacement[4];
                } else {
                    for (int color = 0; color < palette.length; color++) {
                        for (int originalColor = 0; originalColor < original.length; originalColor++) {
                            if (palette[color] == original[originalColor]) {
                                palette[color] = replacement[originalColor];
                            }
                        }
                    }
                }
            }
        }
        return am_2.Rd(image, palette);
    }

    private i4_0 buildFieldEffectFrame(am_2 animation, int frameIndex, int fileIndex) {
        pv_0 image = (pv_0) animation.ib0.Ks.get(frameIndex);
        int paletteIndex = animation.ib0.Ks.KB == animation.CoM5.Ks.KB ? frameIndex : 0;
        int[] palette = ((gb_0) animation.CoM5.Ks.get(paletteIndex)).yF0(image.bh0);
        byte theme = c8_0.JD0.YG();
        if (fileIndex == 25) {
            if (theme != 1) {
                int[] override = this.fieldEffect25Palette(theme);
                if (override != null) {
                    palette = override;
                }
            }
        } else if (fileIndex == 21) {
            int[] override = this.fieldEffect21Palette(theme, frameIndex == 0);
            if (override != null) {
                palette = override;
            }
        }
        return am_2.Rd(image, palette);
    }

    private int[] fieldEffect25Palette(byte theme) {
        switch (theme) {
            case 0:
                return new int[]{-489472, -14497167, -15623851, -15632829, -16747264, -15628800,
                        -14571776, -13453312, -11220686, -8069022, -8724906, -16777216, -16777216,
                        -16777216, -16777216, -16777216};
            case 2:
                return new int[]{-489472, -9397721, -11176175, -12294639, -11246269, -10127838,
                        -7890877, -6772396, -5653898, -3351160, -4535433, -16777216, -16777216,
                        -16777216, -16777216, -16777216};
            case 3:
                return new int[]{-489472, -10440805, -12351626, -13408683, -14522795, -13404314,
                        -12285833, -12281464, -11162983, -8007472, -9188919, -16777216, -16777216,
                        -16777216, -16777216, -16777216};
            default:
                return null;
        }
    }

    private int[] fieldEffect21Palette(byte theme, boolean firstFrame) {
        if (firstFrame) {
            switch (theme) {
                case 0:
                    return new int[]{-11489056, -14505472, -16738048, -16742383, -14505472, -15615232,
                            -11154381, -15628288, -11489056, -16738048, -16742383, -14505472,
                            -15615232, -11154381, -15628288, -460552};
                case 1:
                    return new int[]{-11489056, -10180814, -11233486, -11237838, -10180814, -10176445,
                            -10172093, -12356319, -11489056, -11233486, -11237838, -10180814,
                            -10176445, -10172093, -12356319, -460552};
                case 2:
                    return new int[]{-11489056, -6838444, -7956669, -9075167, -6838444, -5785483,
                            -4667019, -10193597, -11489056, -7956669, -9075167, -6838444,
                            -5785483, -4667019, -10193597, -460552};
                case 3:
                    return new int[]{-11489056, -13395833, -12351626, -13404571, -13395833, -11228776,
                            -10110295, -14523052, -11489056, -12351626, -13404571, -13395833,
                            -11228776, -10110295, -14523052, -460552};
                default:
                    return null;
            }
        }
        switch (theme) {
            case 0:
                return new int[]{-11489056, -16738048, -16742383, -14505472, -15615232, -11154381,
                        -15628288, -460552, 16777215, 16777215, 16777215, 16777215, 16777215,
                        16777215, 16777215, 16777215};
            case 1:
                return new int[]{-11489056, -11233486, -11237838, -10180814, -10176445, -10172093,
                        -12356319, -460552, 16777215, 16777215, 16777215, 16777215, 16777215,
                        16777215, 16777215, 16777215};
            case 2:
                return new int[]{-11489056, -7956669, -9075167, -6838444, -5785483, -4667019,
                        -10193597, -460552, 16777215, 16777215, 16777215, 16777215, 16777215,
                        16777215, 16777215, 16777215};
            case 3:
                return new int[]{-11489056, -12351626, -13404571, -13395833, -11228776, -10110295,
                        -14523052, -460552, 16777215, 16777215, 16777215, 16777215, 16777215,
                        16777215, 16777215, 16777215};
            default:
                return null;
        }
    }

    public final Ou0 Et(short spriteId) {
        short fileIndex = 0;
        vh_1 archive = this.LU;
        switch (spriteId) {
            case 91: fileIndex = 429; break;
            case 92: fileIndex = 430; break;
            case 93: fileIndex = 431; break;
            case 94: fileIndex = 432; break;
            case 95: fileIndex = 433; break;
            case 96: fileIndex = 434; break;
            case 97:
            case 98:
            case 101: fileIndex = 438; break;
            case 118: fileIndex = 426; break;
            case 183: fileIndex = 427; break;
            case 209: archive = this.LM[3]; fileIndex = 110; break;
            case 262: archive = this.LM[3]; fileIndex = 149; break;
            case 100:
            case 105:
            case 8192: break;
            default:
                fileIndex = 435;
                tq.error("unknown bmd for sprite_id {}", Short.valueOf(spriteId));
                break;
        }
        if (fileIndex == 0) {
            return null;
        }
        if (this.f40.bL0(fileIndex)) {
            return ((Ou0) this.f40.f5(fileIndex)).Ma0();
        }
        ku_0 parsed = ku_0.zn(archive.EG(fileIndex).MH(false));
        Ou0 model = v80_0.Kg0(parsed.KV[0], parsed.QB, null, 1.0F, true, false, false);
        if (fileIndex == 426) {
            es_1 animationFrames = new es_1();
            for (int index = 0; index < 4; index++) {
                SJ frame = new SJ();
                frame.T2 = (byte) index;
                frame.IX = (byte) index;
                frame.IH = (short) index;
                animationFrames.Ue0(frame);
            }
            model.Dv("animation", ((BM) model.Y3.get(0)).mi, 0.05F,
                    v80_0.nn0(parsed.QB, parsed.QB.mw.Ub, parsed.QB.J80.Ub, null, animationFrames,
                            model.FC0, false), false);
        }
        this.track(model);
        this.f40.coM4(fileIndex, model);
        Ou0 copy = new Ou0(model);
        copy.I0 = true;
        return copy;
    }

    public final Ou0 Bz(short spriteId) {
        short fileIndex = 0;
        vh_1 archive = this.LM[4];
        switch (spriteId) {
            case 183: fileIndex = 84; break;
            case 251: fileIndex = 110; break;
            case 252: fileIndex = 111; break;
            case 253: fileIndex = 109; break;
            case 254: fileIndex = 112; break;
            case 255: fileIndex = 113; break;
            case 256: fileIndex = 107; break;
            case 257: fileIndex = 108; break;
            case 288: fileIndex = 114; break;
            case 289: fileIndex = 117; break;
            case 290: archive = this.U20; fileIndex = 279; break;
            case 291: fileIndex = 116; break;
            case 292: fileIndex = 115; break;
            case 8192: break;
            default:
                fileIndex = 125;
                tq.error("unknown bmd for sprite_id {}", Short.valueOf(spriteId));
                break;
        }
        if (fileIndex == 0) {
            return null;
        }
        if (this.ij.bL0(fileIndex)) {
            return ((Ou0) this.ij.f5(fileIndex)).Ma0();
        }
        ku_0 parsed = ku_0.zn(archive.EG(fileIndex).MH(false));
        Ou0 model = v80_0.Kg0(parsed.KV[0], parsed.QB, null, 1.0F, true, false, false);
        this.track(model);
        this.ij.coM4(fileIndex, model);
        Ou0 copy = new Ou0(model);
        copy.I0 = true;
        return copy;
    }

    public final Ou0 rH(int index) {
        if (index == 78) {
            return this.v(0);
        }
        if (index < 0 || index > this.oX.length) {
            index = 0;
        }
        if (this.oX[index] == null) {
            ku_0 parsed = ku_0.zn(this.G.GJ(index).MH(false));
            this.oX[index] = v80_0.Kg0(parsed.KV[0], parsed.QB, null, 1.0F, true, false, false);
            this.track(this.oX[index]);
        }
        return this.oX[index];
    }

    public final Ou0 cR(int index) {
        if (index < 0 || index >= 4) {
            index = 0;
        }
        return this.Ht0[index];
    }

    public final Ou0 cOM6(int index) {
        if (this.R5[index] == null) {
            this.R5[index] = v80_0.CW(this.LM[2], index + 60, this.Xs0[index]);
            this.track(this.R5[index]);
        }
        return this.R5[index].Ma0();
    }

    public final Ou0 v(int index) {
        if (this.Py0 == null) {
            this.Py0 = new Ou0[3];
            this.Py0[0] = v80_0.CW(this.LM[2], 78, 120, 121);
            this.Py0[1] = v80_0.CW(this.LM[2], 79, 122, 123);
            this.Py0[2] = v80_0.CW(this.LM[2], 81);
            for (Ou0 model : this.Py0) {
                this.track(model);
            }
        }
        return this.Py0[index];
    }

    public final Ou0 rv() {
        if (this.Nt0 == null) {
            this.Nt0 = v80_0.CW(this.LM[3], 113, 182, 183, 184, 185, 186, 187, 188, 189);
            this.M70.Ue0(this.Nt0.hW);
        }
        return this.Nt0;
    }

    public final Ou0 BH() {
        if (this.Mn0 == null) {
            this.Mn0 = v80_0.CW(this.LM[3], 114);
            this.M70.Ue0(this.Mn0.hW);
        }
        return this.Mn0;
    }

    public final Ou0 Sp() {
        if (this.ff0 == null) {
            this.ff0 = v80_0.CW(this.LM[3], 111, 166, 167);
            this.M70.Ue0(this.ff0.hW);
        }
        return this.ff0;
    }

    public final Ou0 eh() {
        if (this.kn == null) {
            FJ archive = new FJ((Ae) tw0_0.Ll0.nC0.fd0.dg.get("/arc/plgym_ghost.narc"));
            this.kn = v80_0.PC0(archive, 0, false, false, false);
            this.M70.Ue0(this.kn.hW);
        }
        return this.kn;
    }

    public final Ou0 r8(int index) {
        int fileIndex = index + 124;
        short paletteIndex = -1;
        switch (fileIndex) {
            case 144: paletteIndex = 198; break;
            case 145: paletteIndex = 200; break;
            case 146: paletteIndex = 191; break;
            case 147: paletteIndex = 192; break;
            case 148: paletteIndex = 193; break;
            case 156: paletteIndex = 194; break;
            default: break;
        }
        return v80_0.CW(this.LM[3], fileIndex, paletteIndex);
    }

    public final Texture A4(int index) {
        if (this.a10 == null) {
            this.a10 = new es_1();
            FJ archive = new FJ((Ae) tw0_0.Ll0.nC0.fd0.dg.get("/data/tw_arc_etc.narc"));
            Tt0 palette = new Tt0(archive.GJ(24));
            Bp0 dimensions = new Bp0();
            Bp0 offset = new Bp0();
            for (int textureIndex = 0; textureIndex < 7; textureIndex++) {
                int imageIndex = textureIndex * 3 + 3;
                Gt0 image = new Gt0(archive.GJ(imageIndex + 4), false);
                Rk0 cell = new Rk0(archive.GJ(imageIndex), false);
                cell.DX(0, dimensions, offset);
                i4_0 pixmap = new i4_0((int) dimensions.x, (int) dimensions.y, ix0_0.CON);
                cell.else$(0, image, palette, pixmap, offset);
                this.a10.Ue0(new Texture(pixmap));
                pixmap.dispose();
            }
            Gt0 image = new Gt0(archive.GJ(0), false);
            i4_0 pixmap = new IA0(archive.GJ(2), false).dB(new Tt0(archive.GJ(1)), image);
            this.a10.Ue0(new Texture(pixmap));
            pixmap.dispose();
        }
        return (Texture) this.a10.get(index);
    }

    public final Ou0 hI() {
        Ou0 copy = tq0_0.ip0(this.zs, this.zs);
        copy.I0 = true;
        return copy;
    }

    private void track(Ou0 model) {
        this.M70.Ue0(model.hW);
        this.M70.Ue0(model.FC0);
    }
}
