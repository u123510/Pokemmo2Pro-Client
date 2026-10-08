package cn.pokemmo.rom.nds.dppt;

import com.badlogic.gdx.graphics.Color;
import f.AG0;
import f.AT;
import f.Ae;
import f.Ao0;
import f.CL;
import f.Dn0;
import f.Er0;
import f.F90;
import f.FJ;
import f.GQ;
import f.GA;
import f.H40;
import f.Lo0;
import f.MG0;
import f.OV;
import f.Qd0;
import f.Rk0;
import f.S80;
import f.SQ;
import f.TE;
import f.WD0;
import f.Wr;
import f.Z0;
import f.Z50;
import f.ZU;
import f.ab0_2;
import f.ac0_0;
import f.am_2;
import f.ax0_0;
import f.bw_1;
import f.bz_0;
import f.c2_0;
import f.con__3;
import f.eo_1;
import f.ep_1;
import f.f1_0;
import f.gh_0;
import f.gh_1;
import f.gu0;
import f.h7_0;
import f.hx_2;
import f.io_2;
import f.iy_1;
import f.kx_1;
import f.l50_0;
import f.lpt6__2;
import f.mc0_1;
import f.nl_0;
import f.no0_0;
import f.ob0_0;
import f.pf_0;
import f.pg_1;
import f.qj0_1;
import f.sm0_0;
import f.tx_1;
import f.un0_0;
import f.v8_0;
import f.w7_0;
import f.wa0_2;
import f.wm_1;
import f.wn_1;
import f.xm_0;
import f.zu_1;
import f.zv_0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/**
 * 宝可梦 白金 (Gen 4 DPPt 神奥) 核心 ROM 资源加载器
 * 原混淆类: f.Ts
 */
public class PlatinumRom extends l50_0 {
    public static final String[] SUPPORTED_CODES = new String[] { "CPU" };
    public static final String[] yi = SUPPORTED_CODES;

    public static final short[][] X70 = new short[][] {
        { 265, 593 }
    };

    public DpptMapHeaderTable mapHeaderTable;
    public f1_0 hJ;
    public kx_1 be;
    public Lo0 gC;
    public v8_0[] pR = new v8_0[0];
    public final TE NG = new TE();
    public final w7_0 Sn = new w7_0();
    public Wr U3;
    public Wr[][] ir0;
    public Wr[] gh;

    public PlatinumRom(Dn0 file) {
        super(file, false, SUPPORTED_CODES);
    }

    @Override
    public final String pG0() {
        String lang = super.pG0();
        if ("ja".equals(lang)) {
            String fontPath = "/graphic/pl_font.narc";
            Ae fontEntry = (Ae) super.fd0.dg.get(fontPath);
            if (fontEntry != null && fontEntry.Vh0 > 500000) {
                return "zh";
            }
        }
        return lang;
    }

    @Override
    public final void jx() {
        lpt6__2 primaryArchive = lpt6__2.Q80;
        xm_0 primaryMessages = this.VB0(primaryArchive);
        lpt6__2 secondaryArchive = lpt6__2.YG0;
        xm_0 secondaryMessages = this.VB0(secondaryArchive);
        sm0_0.Q6[3][primaryArchive.UB0] = primaryMessages;
        sm0_0.Q6[3][secondaryArchive.UB0] = secondaryMessages;

        sm0_0.Tm0(250003, sm0_0.Bw((byte) 3, primaryArchive, (short) 435, (byte) 6, sm0_0.zb0));
        sm0_0.a7(138000, primaryMessages.Sd(391));
        sm0_0.a7(248000, primaryMessages.Sd(392));
        sm0_0.a7(190360, primaryMessages.Sd(619));
        sm0_0.a7(143000, primaryMessages.Sd(433));
        sm0_0.Tm0(1754, sm0_0.Ft0(sm0_0.c0(245328), "??", "[0-9０-９,]{2,10}(?!\\})"));

        gu0 itemRegistry = gu0.l2;
        itemRegistry.getClass();
        String itemDataPath = "/itemtool/itemdata/pl_item_data.narc";
        Ae itemDataEntry = (Ae) super.fd0.dg.get(itemDataPath);
        Qd0.cV();
        ByteBuffer itemDataBuf = itemDataEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(itemDataBuf, itemDataEntry.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", magic, " vs expected 1129464142"));
        }

        int btafOffset = ax0_0.vU(itemDataBuf);
        int itemCount = itemDataBuf.getInt();
        int gmifPad = iy_1.WG0(itemCount, 8, itemDataBuf.position(), itemDataBuf);
        int gmifOffset = itemDataBuf.position() + gmifPad;

        for (short idx = 0; idx < itemCount; idx++) {
            mc0_1 item = new mc0_1();
            short itemId = (short) (idx + 8000);
            if (idx >= 113) {
                itemId = (short) (itemId + 22);
            }

            int relOffset = idx * 8;
            int fileStart = itemDataBuf.getInt(btafOffset + 12 + relOffset);
            int fileEnd = GA.m1(btafOffset, 16, relOffset, itemDataBuf);
            int absStart = fileStart + gmifOffset;
            int length = fileEnd - fileStart;

            ByteBuffer slice = itemDataEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            slice.position(absStart);
            if (length > 0) {
                AT.i20(absStart, length, slice.limit(), slice);
            }

            item.ca(itemId, this, slice.slice().order(ByteOrder.LITTLE_ENDIAN));
            itemRegistry.Cb0.put(item.Z8, item);
            itemRegistry.Pd0.put(item.Z8, item);
        }

        ByteBuffer arm9Buf = this.Gr();
        do {
            while (arm9Buf.getShort() != 209) {
            }
        } while (arm9Buf.getShort() != 210 || arm9Buf.getShort() != 211 || arm9Buf.getShort() != 212);

        Iterator it = itemRegistry.Pd0.values().iterator();
        while (it.hasNext()) {
            mc0_1 item = (mc0_1) it.next();
            if (item.Z8 >= 8328 && item.Z8 <= 8427) {
                item.wb0 = arm9Buf.getShort();
            }
        }

        gh_1 iconRegistry = gh_1.aH0;
        iconRegistry.getClass();
        String itemIconPath = "/itemtool/itemdata/item_icon.narc";
        FJ itemIconArchive = new FJ((Ae) super.fd0.dg.get(itemIconPath));

        ByteBuffer iconTableBuf = this.Gr();
        do {
            while (iconTableBuf.getInt() != 4587577) {
            }
        } while (iconTableBuf.getInt() != 16318896 || iconTableBuf.getInt() != 28246143);

        Rk0 iconPalette = new Rk0(itemIconArchive.GJ(1), false);
        SQ normalIcons = new SQ();
        SQ shinyIcons = new SQ();

        for (int k = 0; k < 468; k++) {
            short itemId = (short) (k + 8000);
            iconTableBuf.getShort();
            short p1 = iconTableBuf.getShort();
            short p2 = iconTableBuf.getShort();
            iconTableBuf.getShort();

            if (!iconRegistry.rf0.bL0(itemId)) {
                Wr normalWr;
                Wr shinyWr;
                int key = p1 << 16 | p2;
                if (normalIcons.l90(key)) {
                    normalWr = (Wr) normalIcons.get(key);
                    shinyWr = (Wr) shinyIcons.get(key);
                } else {
                    normalWr = new Wr(new pg_1(itemIconArchive, p2, false, p1, iconPalette, (byte) 3, (Color) null));
                    normalIcons.j10(normalIcons.yw0(key), normalWr);
                    shinyWr = new Wr(new pg_1(itemIconArchive, p2, true, p1, iconPalette, (byte) 3, (Color) null));
                    shinyIcons.j10(shinyIcons.yw0(key), shinyWr);
                }
                iconRegistry.rf0.coM4(itemId, normalWr);
                iconRegistry.rh.coM4(itemId, shinyWr);
            }
        }

        ZU trainersMgr = ZU.kB;
        trainersMgr.getClass();
        H40 portraits = new H40();
        String trainerGfxPath = "/poketool/trgra/trfgra.narc";
        FJ trainerGfxArchive = new FJ((Ae) super.fd0.dg.get(trainerGfxPath));

        for (int k = 0; k <= 103; k++) {
            Wr image = new Wr(new eo_1(trainerGfxArchive, k));
            image.zz = true;
            portraits.Com3.j10(portraits.Com3.yw0(k), image);
        }

        trainersMgr.Vp0.gE0((byte) 3, portraits);
        nl_0.iS((byte) 3);

        this.gQ = new bz_0(this);

        String matrixPath = "/fielddata/mapmatrix/map_matrix.narc";
        Ae matrixEntry = (Ae) super.fd0.dg.get(matrixPath);
        Qd0.cV();
        ByteBuffer matrixBuf = matrixEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int matrixMagic = pf_0.LPt2(matrixBuf, matrixEntry.bM0);
        if (matrixMagic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", matrixMagic, " vs expected 1129464142"));
        }

        int matrixBtaf = ax0_0.vU(matrixBuf);
        int matrixCount = matrixBuf.getInt();
        int matrixPad = iy_1.WG0(matrixCount, 8, matrixBuf.position(), matrixBuf);
        int matrixGmif = matrixBuf.position() + matrixPad;
        this.du0 = new con__3[matrixCount + 1];

        for (short idx = 0; idx < matrixCount; idx++) {
            int relOffset = idx * 8;
            int fileStart = matrixBuf.getInt(matrixBtaf + 12 + relOffset);
            int fileEnd = GA.m1(matrixBtaf, 16, relOffset, matrixBuf);
            int absStart = fileStart + matrixGmif;
            int length = fileEnd - fileStart;

            String name = idx < 400 ? un0_0.DB0[idx] : Integer.toString(idx);
            Ae fileEntry = new Ae(matrixEntry.h2, name, absStart, length, idx);
            con__3 matrixObj = new con__3(idx, fileEntry);
            fileEntry.kd = "";
            this.du0[idx] = matrixObj;

            switch (idx) {
                case 269:
                    matrixObj.Iz0 = 21;
                    matrixObj.Ig = 10;
                    break;
                case 270:
                    matrixObj.Iz0 = 0;
                    matrixObj.Ig = 35;
                    break;
                case 271:
                    matrixObj.Iz0 = 15;
                    matrixObj.Ig = 0;
                    break;
                case 272:
                    matrixObj.Iz0 = 47;
                    matrixObj.Ig = 21;
                    break;
                case 273:
                case 275:
                    matrixObj.Iz0 = 57;
                    matrixObj.Ig = 34;
                    break;
                case 276:
                    matrixObj.Iz0 = 56;
                    matrixObj.Ig = 38;
                    break;
                case 277:
                    matrixObj.Iz0 = 74;
                    matrixObj.Ig = 32;
                    break;
                case 278:
                    matrixObj.Iz0 = 0;
                    matrixObj.Ig = 0;
                    break;
                case 279:
                    matrixObj.Iz0 = 70;
                    matrixObj.Ig = 30;
                    break;
            }
        }

        f1_0 headerTable = new f1_0(this, 1);
        this.hJ = headerTable;
        this.mapHeaderTable = headerTable;

        Z0 manager = Z0.rb;
        if (3 < manager.h4.length) {
            manager.h4[3] = headerTable;
        }

        String landDataPath = "/fielddata/land_data/land_data.narc";
        FJ landArchive = new FJ((Ae) super.fd0.dg.get(landDataPath));
        int landCount = landArchive.AC.F10;
        this.o50 = new qj0_1[landCount + 1];

        for (short idx = 0; idx < landCount; idx++) {
            this.o50[idx] = new qj0_1(this, idx, landArchive.GJ(idx));
        }

        short[] remap = X70[0];
        short from = remap[0];
        short to = remap[1];
        ((Ao0[]) headerTable.Sx0)[to] = (Ao0) ((Ao0[]) headerTable.Sx0)[from].or();
        ((Ao0[]) headerTable.Sx0)[to].O60 = to;

        if (remap[0] == 265) {
            this.du0[289] = this.du0[59].xI0();
            wa0_2 scriptObj = this.du0[289];
            this.du0[289].SM = 289;
            scriptObj.M70 = new int[][] { { 666 } };
            this.o50[666] = new qj0_1(this, (short) 666, landArchive.GJ(465));
        }

        this.be = new kx_1(this);

        String trDataPath = "/poketool/trainer/trdata.narc";
        Ae trDataEntry = (Ae) super.fd0.dg.get(trDataPath);
        Qd0.cV();
        ByteBuffer trDataBuf = trDataEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int trMagic = pf_0.LPt2(trDataBuf, trDataEntry.bM0);
        if (trMagic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", trMagic, " vs expected 1129464142"));
        }

        int trBtaf = ax0_0.vU(trDataBuf);
        int trainerCount = trDataBuf.getInt();
        int trPad = iy_1.WG0(trainerCount, 8, trDataBuf.position(), trDataBuf);
        int trGmif = trDataBuf.position() + trPad;

        String trPokePath = "/poketool/trainer/trpoke.narc";
        Ae trPokeEntry = (Ae) super.fd0.dg.get(trPokePath);
        Qd0.cV();
        ByteBuffer trPokeBuf = trPokeEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int trPokeMagic = pf_0.LPt2(trPokeBuf, trPokeEntry.bM0);
        if (trPokeMagic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", trPokeMagic, " vs expected 1129464142"));
        }

        int trPokeBtaf = ax0_0.vU(trPokeBuf);
        int trPokePad = iy_1.WG0(trPokeBuf.getInt(), 8, trPokeBuf.position(), trPokeBuf);
        int trPokeGmif = trPokeBuf.position() + trPokePad;

        this.pR = new v8_0[trainerCount];
        for (short idx = 0; idx < this.pR.length; idx++) {
            int relOffset = idx * 8;
            int fileStart = trDataBuf.getInt(trBtaf + 12 + relOffset);
            int fileEnd = GA.m1(trBtaf, 16, relOffset, trDataBuf);
            int absStart = fileStart + trGmif;
            int length = fileEnd - fileStart;

            ByteBuffer trainerSlice = trDataEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            trainerSlice.position(absStart);
            if (length > 0) {
                AT.i20(absStart, length, trainerSlice.limit(), trainerSlice);
            }

            v8_0 trainer = new v8_0(idx, this, trainerSlice.slice().order(ByteOrder.LITTLE_ENDIAN));
            int pokeStart = GA.m1(trPokeBtaf, 12, relOffset, trPokeBuf);
            int pokeEnd = GA.m1(trPokeBtaf, 16, relOffset, trPokeBuf);
            int pokeAbsStart = pokeStart + trPokeGmif;
            int pokeLength = pokeEnd - pokeStart;

            ByteBuffer pokeSlice = trPokeEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            pokeSlice.position(pokeAbsStart);
            if (pokeLength > 0) {
                AT.i20(pokeAbsStart, pokeLength, pokeSlice.limit(), pokeSlice);
            }

            ByteBuffer pokeData = pokeSlice.slice().order(ByteOrder.LITTLE_ENDIAN);
            for (int p = 0; p < trainer.JS.length; p++) {
                trainer.JS[p] = new io_2(trainer, pokeData);
            }
            this.pR[idx] = trainer;
            OV mgr = wn_1.pn.zx0[3];
            mgr.xk.coM4(trainer.vn, trainer);
        }

        wm_1 overlay = super.z40.Wp0[5];
        ByteBuffer overlayBuf = overlay.G3.MH(overlay.Zx);
        tx_1.iY(overlayBuf, 275, 1089, 65535);
        ((Buffer) overlayBuf).position(overlayBuf.position() + 4);

        int code;
        do {
            code = overlayBuf.getInt();
            int val = overlayBuf.getInt();
            this.NG.Dc0((short) code, (short) val);
        } while (code != 65535);

        String mmodelDataPath = "/data/mmodel/mmodel.narc";
        Ae mmodelEntry = (Ae) super.fd0.dg.get(mmodelDataPath);
        Qd0.cV();
        ByteBuffer mmodelBuf = mmodelEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int mmodelMagic = pf_0.LPt2(mmodelBuf, mmodelEntry.bM0);
        if (mmodelMagic != 1129464142) {
            throw new RuntimeException(GQ.ti("Header magic mismatch = ", mmodelMagic, " vs expected 1129464142"));
        }

        int mmodelBtaf = ax0_0.vU(mmodelBuf);
        int mmodelPad = iy_1.WG0(mmodelBuf.getInt(), 8, mmodelBuf.position(), mmodelBuf);
        int mmodelGmif = mmodelBuf.position() + mmodelPad;

        for (short idx = 0; idx < 420; idx++) {
            int relOffset = idx * 8;
            int fileStart = mmodelBuf.getInt(mmodelBtaf + 12 + relOffset);
            int fileEnd = GA.m1(mmodelBtaf, 16, relOffset, mmodelBuf);
            int absStart = fileStart + mmodelGmif;
            int length = fileEnd - fileStart;

            ByteBuffer slice = mmodelEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            slice.position(absStart);
            if (length > 0) {
                AT.i20(absStart, length, slice.limit(), slice);
            }

            Er0 modelContainer = new Er0(slice.slice().order(ByteOrder.LITTLE_ENDIAN), true, false);
            bw_1 bw = modelContainer.Zb0;
            if (bw != null ? bw.lB : ((am_2) modelContainer.Y3.get(0)).qn0) {
                int frameCount = modelContainer.E10.ib0.Ks.KB;
                Wr[] frames = new Wr[frameCount];
                for (int fIdx = 0; fIdx < frameCount; fIdx++) {
                    frames[fIdx] = new Wr(new WD0(modelContainer, fIdx));
                }
                this.Sn.coM4(idx, frames);
            }
        }

        String tmapPath = "/graphic/tmap_gra.narc";
        FJ tmapArchive = new FJ((Ae) super.fd0.dg.get(tmapPath));
        this.U3 = new Wr(new zv_0(tmapArchive));

        Rk0 tmapPalette = new Rk0(tmapArchive.GJ(8), false);
        short tmapCount = tmapPalette.bs0.j2;
        this.gh = new Wr[tmapCount];
        for (int k = 0; k < tmapCount; k++) {
            this.gh[k] = new Wr(new CL(k, tmapPalette, tmapArchive));
        }

        Rk0 iconPalette2 = new Rk0(tmapArchive.GJ(17), false);
        short iconCount = iconPalette2.bs0.j2;
        this.ir0 = new Wr[2][iconCount];
        for (int layer = 0; layer < 2; layer++) {
            for (int k = 0; k < iconCount; k++) {
                this.ir0[layer][k] = new Wr(new h7_0(tmapArchive, layer, iconPalette2, k));
            }
        }

        Gk0();
    }

    public final Wr[] f80(short id) {
        return !this.NG.bL0(id) ? null : (Wr[]) this.Sn.f5(this.NG.f5(id));
    }

    @Override
    public final F90 eg0(short zoneId) {
        String eventDataPath = "/fielddata/eventdata/zone_event.narc";
        Ae eventEntry = (Ae) super.fd0.dg.get(eventDataPath);
        Qd0.cV();
        ByteBuffer eventBuf = eventEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(eventBuf, eventEntry.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", 1129464142));
        }

        int btaf = ax0_0.vU(eventBuf);
        int totalZones = eventBuf.getInt();
        int pad = iy_1.WG0(totalZones, 8, eventBuf.position(), eventBuf);
        int gmif = eventBuf.position() + pad;

        if (zoneId >= totalZones) {
            return null;
        }

        int relOffset = zoneId * 8;
        int fileStart = eventBuf.getInt(btaf + 12 + relOffset);
        int fileEnd = GA.m1(btaf, 16, relOffset, eventBuf);
        int absStart = fileStart + gmif;
        int length = fileEnd - fileStart;

        String name = zoneId < 400 ? un0_0.DB0[zoneId] : Integer.toString(zoneId);
        Ae fileHandle = new Ae(this, name, absStart, length, zoneId);
        fileHandle.kd = "";
        return new ep_1(fileHandle);
    }

    public final Ao0 na(int id) {
        return (Ao0) this.hJ.Sx0[id];
    }

    @Override
    public final void Tf0() {
        String soundPath = "/data/sound/pl_sound_data.sdat";
        super.r3 = new hx_2((Ae) super.fd0.dg.get(soundPath));
    }

    @Override
    public final byte Tz() {
        return 3;
    }

    @Override
    public final am_2 EL0(MG0 mg0, int id) {
        String texSetPath = "/fielddata/areadata/area_map_tex/map_tex_set.narc";
        Ae texEntry = (Ae) super.fd0.dg.get(texSetPath);
        Qd0.cV();
        ByteBuffer buf = texEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int magic = pf_0.LPt2(buf, texEntry.bM0);
        if (magic != 1129464142) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", 1129464142));
        }

        int btaf = ax0_0.vU(buf);
        int pad = iy_1.WG0(buf.getInt(), 8, buf.position(), buf);
        int gmif = buf.position() + pad;

        int relOffset = id * 8;
        int fileStart = buf.getInt(btaf + 12 + relOffset);
        int fileEnd = GA.m1(btaf, 16, relOffset, buf);
        int absStart = fileStart + gmif;
        int length = fileEnd - fileStart;

        ByteBuffer slice = texEntry.h2.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        slice.position(absStart);
        if (length > 0) {
            AT.i20(absStart, length, slice.limit(), slice);
        }

        Er0 container = new Er0(slice.slice().order(ByteOrder.LITTLE_ENDIAN), false, false);
        return container.E10;
    }

    @Override
    public final void A3() {
        lpt6__2 archive = lpt6__2.Q80;
        String path = "/msgdata/pl_msg.narc";
        c2_0 messages = new c2_0(this, archive, (Ae) super.fd0.dg.get(path));
        super.Gn = messages;
        super.b70 = messages;
    }

    @Override
    public final S80 G80() {
        return this.hJ;
    }

    @Override
    public final Z50 Sc0(int id) {
        return this.na(id);
    }

    public static boolean W9(Ae entry) {
        return entry.k9.equals("trainer_case.narc");
    }

    public final void Gk0() {
        String casePath = "/graphic/trainer_case.narc";
        Ae caseEntry = (Ae) super.fd0.dg.get(casePath);
        if (caseEntry == null) {
            no0_0 fs = super.fd0;
            Iterator it = fs.dg.values().iterator();
            while (it.hasNext()) {
                Ae entry = (Ae) it.next();
                if (W9(entry)) {
                    caseEntry = entry;
                    break;
                }
            }
        }

        FJ caseArchive = new FJ(caseEntry);
        Rk0 casePalette = new Rk0(caseArchive.GJ(44), false);

        for (int j = 0; j < 8; j++) {
            int targetIdx;
            if (j != 2) {
                if (j != 3) {
                    if (j != 4) {
                        targetIdx = j;
                    } else {
                        targetIdx = 2;
                    }
                } else {
                    targetIdx = 4;
                }
            } else {
                targetIdx = 3;
            }

            ob0_0 renderState = ob0_0.Ui0();
            AG0 image = new Wr(new zu_1(j, casePalette, caseArchive)).T20();
            renderState.Zc0[3][targetIdx] = image;
        }
    }
}
