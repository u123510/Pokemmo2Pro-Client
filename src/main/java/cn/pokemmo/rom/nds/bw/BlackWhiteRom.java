package cn.pokemmo.rom.nds.bw;

import cn.pokemmo.rom.nds.base.AbstractNdsRom;
import f.AG0;
import f.Ae;
import f.AT;
import f.D4;
import f.D9;
import f.Dn0;
import f.F90;
import f.FI;
import f.FJ;
import f.G9;
import f.GA;
import f.Ge;
import f.Gz0;
import f.H40;
import f.LPT4_;
import f.M;
import f.M90;
import f.MG0;
import f.N2;
import f.OJ0;
import f.OV;
import f.P80;
import f.Qd0;
import f.QY;
import f.Rk0;
import f.S80;
import f.SQ;
import f.SS;
import f.Tt0;
import f.U20;
import f.UG;
import f.V3;
import f.VE;
import f.Wr;
import f.Wx0;
import f.Z0;
import f.Z50;
import f.ZU;
import f.ab0_2;
import f.aj_1;
import f.am_2;
import f.au_1;
import f.aux__1;
import f.ax0_0;
import f.be0_1;
import f.bm0_1;
import f.bw_1;
import f.bz_0;
import f.c8_0;
import f.com4__4;
import f.cq_0;
import f.dd_2;
import f.dx_2;
import f.ec0_2;
import f.ej_1;
import f.fe_1;
import f.gb_0;
import f.gc_2;
import f.gh_1;
import f.gi0_0;
import f.gu0;
import f.gz0_0;
import f.he0_1;
import f.hx_2;
import f.i40_0;
import f.ie_0;
import f.iy_1;
import f.l5_0;
import f.lg_0;
import f.lpt6__2;
import f.m_0;
import f.mc0_1;
import f.mp_1;
import f.nl_0;
import f.nl_2;
import f.ob0_0;
import f.ol0_0;
import f.pf_0;
import f.pu0_0;
import f.q1_0;
import f.qg0_0;
import f.rg0_0;
import f.sm0_0;
import f.Sv0;
import f.t9_0;
import f.tp_1;
import f.ug_0;
import f.un0_0;
import f.vh_1;
import f.vk0_1;
import f.w20_0;
import f.w6;
import f.w7_0;
import f.wa0_2;
import f.wg_0;
import f.wn_1;
import f.xi0_2;
import f.xm_0;
import f.xw0;
import f.WW;
import f.yh_0;
import f.yj_0;
import f.yw_0;
import f.zd_0;
import f.zg_0;
import f.zv_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/**
 * 宝可梦 黑/白 (Gen 5 NDS) 核心底包挂载与资源加载器
 * 原混淆类: f.nj0_0
 */
public class BlackWhiteRom extends f.l50_0 {
    public static final String[] SUPPORTED_CODES = new String[] { "IRB", "IRA" };
    public static final String[] tN = SUPPORTED_CODES;

    public static final short[][] MAP_REMAP_TABLE = new short[][] {
        { 376, 427 }, { 377, 428 }, { 199, 429 }, { 200, 430 },
        { 201, 431 }, { 202, 432 }, { 203, 433 }, { 427, 434 }, { 428, 435 }
    };
    public static final short[][] hF0 = MAP_REMAP_TABLE;

    public tp_1 mapHeaders;
    public com4__4[] mapCollisions;
    public D9 matrixData;
    public qg0_0[] mapConnections;
    public wg_0[] terrainGrids;
    public U20[] trainers;
    public final w7_0 textures;
    public final bm0_1 wildEncounters;
    public final w7_0 wildAreas;
    public ie_0 spriteProvider;
    public FJ soundArchives;
    public Wr overworldSprite;
    public Wr[] overworldSprites;

    // 兼容混淆字段别名
    public tp_1 Pq;
    public com4__4[] PY;
    public D9 Oq0;
    public qg0_0[] jn;
    public wg_0[] qg;
    public U20[] Gr0;
    public final w7_0 Ao0;
    public final bm0_1 mA;
    public final w7_0 n30;
    public ie_0 vE0;
    public FJ D4;
    public Wr sz0;
    public Wr[] ma0;

    public BlackWhiteRom(Dn0 file) {
        super(file, true, SUPPORTED_CODES);
        this.trainers = new U20[0];
        this.Gr0 = this.trainers;
        this.textures = new w7_0();
        this.Ao0 = this.textures;
        this.wildEncounters = new bm0_1();
        this.mA = this.wildEncounters;
        this.wildAreas = new w7_0();
        this.n30 = this.wildAreas;
    }

    private Ae resource(String path) {
        return (Ae) this.fd0.dg.get(path);
    }

    private static final class Archive {
        final AbstractNdsRom owner;
        final ByteBuffer buffer;
        final int table;
        final int count;
        final int data;

        Archive(Ae entry, boolean accessor) {
            Qd0.cV();
            if (accessor) {
                owner = entry.zv0();
                buffer = entry.zv0().Mr0();
            } else {
                owner = entry.h2;
                buffer = owner.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            }
            int magic = pf_0.LPt2(buffer, entry.bM0);
            if (magic != 1129464142) {
                throw new RuntimeException("Header magic mismatch = " + magic + " vs expected 1129464142");
            }
            table = ax0_0.vU(buffer);
            count = buffer.getInt();
            int size = iy_1.WG0(count, 8, buffer.position(), buffer);
            data = buffer.position() + size;
        }

        Ae entry(short index) {
            int relative = buffer.getInt(table + 12 + index * 8);
            int length = GA.m1(table, 16, index * 8, buffer) - relative;
            int start = relative + data;
            String[] names = un0_0.DB0;
            String name = index < 400 ? names[index] : Integer.toString(index);
            Ae entry = new Ae(owner, name, start, length, index);
            entry.kd = "";
            return entry;
        }

        ByteBuffer slice(int index, boolean first) {
            int relative = buffer.getInt(table + 12 + index * 8);
            int length = GA.m1(table, 16, index * 8, buffer) - relative;
            int start = relative + data;
            return sliceAt(start, length);
        }

        ByteBuffer sliceAt(int start, int length) {
            ByteBuffer value = owner.dL.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            value.position(start);
            if (length > 0) AT.i20(start, length, value.limit(), value);
            return value.slice().order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public final void sw0() {
        Archive scriptsArchive = new Archive(resource("/a/0/0/9"), false);
        this.du0 = new wa0_2[scriptsArchive.count];
        for (short i = 0; i < this.du0.length; i++) this.du0[i] = new dd_2(i, scriptsArchive.entry(i));
        this.gQ = new bz_0(this);
        this.Oq0 = new D9(new FJ(resource("/a/0/6/1")));
        this.matrixData = this.Oq0;
        Archive maps = new Archive(resource("/a/0/1/2"), false);
        this.Pq = new tp_1(this, maps.entry((short) 0));
        this.mapHeaders = this.Pq;

        short[][] mapping = hF0;
        for (int i = 0; i < 9; i++) {
            short from = mapping[i][0];
            short to = mapping[i][1];
            tp_1 table = this.Pq;
            ug_0[] entries = (ug_0[]) table.Sx0;
            entries[to] = entries[from].or();
            ((ug_0[]) table.Sx0)[to].O60 = to;
        }

        Z0 manager = Z0.rb;
        S80 table = this.Pq;
        S80[] regions = manager.h4;
        if (2 < regions.length) regions[2] = table;

        Archive eventsArchive = new Archive(resource("/a/0/0/8"), false);
        this.o50 = new w6[eventsArchive.count];
        for (short i = 0; i < this.o50.length; i++) this.o50[i] = new w6((f.nj0_0) (Object) this, i, eventsArchive.entry(i));

        Archive connectionsArchive = new Archive(resource("/a/0/1/0"), false);
        int relative = connectionsArchive.buffer.getInt(connectionsArchive.table + 12);
        int length = connectionsArchive.buffer.getInt(connectionsArchive.table + 16) - relative;
        int start = relative + connectionsArchive.data;
        this.jn = new qg0_0[length / 16];
        this.mapConnections = this.jn;
        ByteBuffer data = connectionsArchive.sliceAt(start, length);
        for (int i = 0; i < this.jn.length; i++) this.jn[i] = new qg0_0(data);
    }

    public final void Lpt8() {
        FJ archive = new FJ(resource("/a/0/8/5"));
        this.sz0 = new Wr(new zg_0(archive));
        this.overworldSprite = this.sz0;
        Rk0 images = new Rk0(archive.GJ(12), false);
        short count = images.bs0.j2;
        this.ma0 = new Wr[count];
        this.overworldSprites = this.ma0;
        for (int i = 0; i < count; i++) this.ma0[i] = new Wr(new dx_2(archive, images, i));
    }

    public final void ig0() {
        FJ archive = new FJ(resource("/a/0/4/0"));
        Rk0 images = new Rk0(archive.GJ(45), false);
        int count = Math.min(8, images.bs0.j2);
        for (int i = 0; i < count; i++) {
            ob0_0 manager = ob0_0.Ui0();
            AG0 image = new Wr(new aj_1(archive, images, i)).T20();
            manager.Zc0[2][i] = image;
        }
    }

    public final void Ep() {
        Archive trainersArchive = new Archive(resource("/a/0/9/2"), false);
        Archive partiesArchive = new Archive(resource("/a/0/9/3"), false);
        this.Gr0 = new U20[trainersArchive.count];
        this.trainers = this.Gr0;
        for (short i = 0; i < this.Gr0.length; i++) {
            ByteBuffer data = trainersArchive.slice(i, false);
            U20 trainer = new U20(i, (f.nj0_0) (Object) this, data);
            ByteBuffer party = partiesArchive.slice(i, false);
            for (int j = 0; j < trainer.S30.length; j++) trainer.S30[j] = new Ge(trainer, party);
            this.Gr0[i] = trainer;
            OV manager = wn_1.pn.zx0[2];
            manager.xk.coM4(trainer.vn, trainer);
        }
    }

    public final void LX() {
        Archive encounters = new Archive(resource("/a/0/6/0"), false);
        ByteBuffer data = encounters.slice(0, true);
        byte index = 0;
        while (data.remaining() >= 44) {
            this.mA.gE0(index, new w20_0(data));
            index = (byte) (index + 2);
        }
        Archive areas = new Archive(resource("/a/1/0/8"), false);
        for (short i = 0; i < areas.count; i++) {
            M90 area = new M90(i, areas.slice(i, false));
            this.n30.coM4(i, area);
        }
    }

    @Override
    public final void jx() {
        sm0_0.Tk((f.nj0_0) (Object) this);
        mp_1 species = mp_1.vf0();
        species.k2.clear();
        cq_0 empty = new cq_0((short) 0);
        species.k2.put(empty.dR, empty);
        loadSpecies(species);
        loadMoves();
        loadItems();
        loadSprites();
        SS.hG0.COM3 = (f.nj0_0) (Object) this;
        gh_1.aH0.CR((f.nj0_0) (Object) this);
        ZU trainersMgr = ZU.kB;
        trainersMgr.getClass();
        H40 portraits = new H40();
        FJ archive = new FJ(resource("/a/0/7/2"));
        for (int i = 0; i <= 94; i++) {
            Wr image = new Wr(new G9(archive, i));
            image.zz = true;
            SQ images = portraits.Com3;
            images.j10(images.yw0(i), image);
        }
        trainersMgr.Vp0.gE0((byte) 2, portraits);
        nl_0.iS((byte) 2);

        FJ encounters = new FJ(resource("/a/0/7/9"));
        int count = encounters.AC.F10 / 2;
        this.qg = new wg_0[count];
        this.terrainGrids = this.qg;
        for (short i = 0; i < this.qg.length; i++) this.qg[i] = new wg_0(encounters.GJ(i));
        this.PY = new com4__4[count];
        this.mapCollisions = this.PY;
        for (short i = 0; i < this.PY.length; i++) this.PY[i] = new com4__4(i, encounters.GJ(count + i).MH(false));

        Z10();
        sw0();
        Ep();
        LX();
        this.vE0 = new ie_0(new FJ(resource("/a/0/1/1")), new FJ(resource("/a/0/9/5")), new FJ(resource("/a/0/0/6")));
        this.spriteProvider = this.vE0;
        this.D4 = new FJ(resource("/a/0/7/5"));
        this.soundArchives = this.D4;
        Lpt8();
        ig0();
        OJ0.t1.Sv((f.nj0_0) (Object) this);
        yj_0.ne0.Wm0((f.nj0_0) (Object) this);
        ob0_0.Ui0().coM4((f.nj0_0) (Object) this);
    }

    private void loadSpecies(mp_1 manager) {
        Archive archive = new Archive(resource("/a/0/1/6"), true);
        for (short id = 1; id < archive.count - 1; id++) {
            cq_0 species = new cq_0(id);
            manager.k2.put(id, species);
            ByteBuffer data = archive.slice(id, false);
            species.zq = data.get() & 255;
            species.sE0 = data.get() & 255;
            species.yi0 = data.get() & 255;
            species.ce0 = data.get() & 255;
            species.wL0 = data.get() & 255;
            species.this$ = data.get() & 255;
            species.av0 = i40_0.COm3(data.get());
            species.aUx = i40_0.COm3(data.get());
            data.get();
            data.get();
            species.OR = data.getShort();
            species.MZ = new short[3];
            species.MZ[0] = data.getShort();
            species.MZ[1] = data.getShort();
            species.MZ[2] = data.getShort();
            for (int i = 0; i < species.MZ.length; i++) {
                short item = species.MZ[i];
                if (item >= 1) species.MZ[i] = (short) (item + 5000);
            }
            species.Ai = data.get() & 255;
            data.get();
            data.get();
            species.yw = (q1_0) q1_0.kc.BM(data.get());
            byte group = data.get();
            bm0_1 groups = au_1.Ty;
            species.B2 = (au_1) groups.BM(group);
            species.Cw = (au_1) groups.BM(data.get());
            species.h5[0] = (short) (data.get() & 255);
            species.h5[1] = (short) (data.get() & 255);
            species.h5[2] = (short) (data.get() & 255);
            data.get();
            species.iv0 = data.getShort();
            species.Com7 = data.getShort();
            species.ar = data.get();
            byte color = (byte) (data.get() & 15);
            species.AT = data.getShort();
            species.vF = data.getShort();
            species.Cu0 = data.getShort();
            species.AB0();
        }
        archive = new Archive(resource("/a/0/1/8"), true);
        for (short id = 1; id < archive.count; id++) {
            cq_0 species = (cq_0) manager.k2.get(id);
            if (species == null) break;
            ByteBuffer data = archive.slice(id, false);
            while (data.remaining() > 4) {
                short move = data.getShort();
                short level = data.getShort();
                if (move == -1 || level == -1) break;
                species.WC.add(new pu0_0((byte) level, move));
            }
        }
        archive = new Archive(resource("/a/0/1/9"), true);
        for (short id = 1; id < archive.count; id++) {
            cq_0 species = (cq_0) manager.k2.get(id);
            if (species == null) break;
            ByteBuffer data = archive.slice(id, false);
            for (int i = 0; i < 7; i++) {
                byte method = (byte) data.getShort();
                m_0 evolution = (m_0) m_0.d70.BM(method);
                int parameter = data.getShort() & 65535;
                short target = data.getShort();
                int ordinal = evolution.ordinal();
                if (ordinal == 6 || ordinal == 8 || (ordinal >= 17 && ordinal <= 20)) parameter += 5000;
                if (target < 1) continue;
                if (id == 349 && evolution == m_0.lPT4) continue;
                species.Xn.add(new P80(evolution, parameter, target));
            }
        }
        manager.av.clear();
        for (short id = 1; id < 650; id++) {
            cq_0 species = (cq_0) manager.k2.get(id);
            if (species == null) break;
            manager.av.put(id, species);
        }
        // 图鉴集合兜底：把所有非 ROM 种族（type10 注册的新精灵/自定义精灵）也纳入图鉴集合
        // 650-667 为历史占位槽位，跳过避免污染图鉴
        for (Object value : manager.k2.values()) {
            cq_0 species = (cq_0) value;
            if (species.dR >= 668) {
                manager.av.put(Short.valueOf(species.dR), species);
            }
        }
        for (Object value : manager.k2.values()) {
            cq_0 species = (cq_0) value;
            for (Object entry : species.Xn) {
                cq_0 target = manager.W50(((P80) entry).YS);
                if (target != null) target.By = species;
            }
        }
        for (Object value : manager.k2.values()) {
            cq_0 species = (cq_0) value;
            if (species.By != null) continue;
            for (Object entry : species.Xn) {
                cq_0 target = manager.W50(((P80) entry).YS);
                target.ng = species;
                for (Object next : target.Xn) manager.W50(((P80) next).YS).ng = species;
            }
        }
        for (Object value : manager.av.values()) {
            cq_0 species = (cq_0) value;
            if (species.ar < 2 || species.iv0 <= 0) continue;
            for (int form = 0; form < species.ar - 1; form++) {
                cq_0 alternate = manager.W50((short) (species.iv0 + form));
                if (alternate == null) continue;
                alternate.kT = species;
                alternate.a20 = (byte) (form + 1);
            }
        }
    }

    private void loadMoves() {
        ec0_2 manager = ec0_2.Sx();
        manager.getClass();
        Archive archive = new Archive(resource("/a/0/2/1"), true);
        manager.f4.clear();
        for (short id = 0; id < archive.count; id++) {
            vk0_1 move = new vk0_1(id);
            ByteBuffer data = archive.slice(id, false);
            move.Bn = i40_0.COm3(data.get());
            data.get();
            byte category = data.get();
            move.EW = category == 0 ? yw_0.Jy : category == 2 ? yw_0.pi0 : yw_0.c0;
            move.X00 = (short) (data.get() & 255);
            move.mt0 = data.get();
            move.lE0 = data.get();
            move.Tp = data.get();
            data.get();
            data.getShort();
            data.get();
            data.get();
            data.get();
            data.get();
            move.l10 = data.get();
            data.get();
            data.getShort();
            move.zQ = data.get();
            move.sw = data.get();
            move.g5 = data.get();
            move.N0[0] = data.get();
            move.N0[1] = data.get();
            move.N0[2] = data.get();
            move.ao0[0] = data.get();
            move.ao0[1] = data.get();
            move.ao0[2] = data.get();
            move.d60[0] = data.get();
            move.d60[1] = data.get();
            move.d60[2] = data.get();
            data.get();
            data.get();
            move.ej = data.getShort();
            manager.f4.coM4(move.hC0, move);
        }
    }

    private void loadItems() {
        gu0 manager = gu0.l2;
        manager.getClass();
        Archive archive = new Archive(resource("/a/0/2/4"), true);
        for (short index = 0; index < archive.count; index++) {
            mc0_1 item = new mc0_1();
            short id = (short) (index + 5000);
            item.ca(id, this, archive.slice(index, false));
            manager.Cb0.put(item.Z8, item);
            manager.Pd0.put(item.Z8, item);
            byte kind = item.Bk0;
            if (kind != -1) manager.iz.gE0(kind, item);
        }
        ByteBuffer data = Gr();
        for (;;) {
            if (data.getInt() != 56165208) continue;
            if (data.getInt() != 56492888) continue;
            if (data.getInt() != 59114373) continue;
            if (data.getInt() == 59245447) break;
        }
        for (Object value : manager.Pd0.values()) {
            mc0_1 item = (mc0_1) value;
            if (item.PX == 2 && item.Yt0 == l5_0.YW) item.wb0 = data.getShort();
        }
    }

    private void loadSprites() {
        yh_0 manager = yh_0.Xm0;
        manager.getClass();
        yh_0.HG0.clear();
        yh_0.BE = 650;
        FJ icons = new FJ(resource("/a/0/0/7"));
        ByteBuffer data = Gr();
        byte[] palettes = new byte[712];
        for (int offset = 0; offset < data.limit() - 100; offset++) {
            data.position(offset);
            if (data.get() != 0 || data.get() != 17 || data.get() != 17 || data.get() != 17
                    || data.get() != 0 || data.get() != 0 || data.get() != 0 || data.get() != 0
                    || data.get() != 34 || data.get() != 34 || data.get() != 17 || data.get() != 17
                    || data.get() != 0 || data.get() != 17 || data.get() != 34 || data.get() != 34) continue;
            data.position(offset);
            data.get(palettes);
            break;
        }
        Rk0 images = new Rk0(icons.GJ(2), false);
        Tt0 palette = new Tt0(icons.GJ(0));
        int paletteCount = palette.dc0.length;
        zd_0[] colors = new zd_0[paletteCount];
        for (int i = 0; i < paletteCount; i++) {
            gz0_0 color = new gz0_0();
            colors[i] = color;
            color.dc0 = new LPT4_[][] { palette.dc0[i] };
        }
        for (short species = 0; species < 712; species++) {
            byte first = (byte) (palettes[species] & 15);
            byte second = (byte) (palettes[species] >> 4);
            for (byte gender = 0; gender < 2; gender++) {
                if (gender == 1 && icons.GJ(species * 2 + 7 + gender).Vh0 < 1 && first == second) continue;
                if (gender == 1) yh_0.HG0.Ue0(species);
                AG0[] normal = new AG0[3];
                AG0[] alternate = new AG0[3];
                for (int frame = 0; frame < 3; frame++) {
                    nl_2 provider = new nl_2(icons, species, gender, images, colors, first, second, frame);
                    normal[frame] = new AG0(new Wr(provider), 0, 0, 36, 36);
                    alternate[frame] = new AG0(new Wr(new Sv0(provider)), 0, 0, 36, 36);
                }
                SQ sprites = manager.BN;
                sprites.j10(sprites.yw0(yh_0.tp(species, false, true, gender, false, false)), normal);
                sprites = manager.BN;
                sprites.j10(sprites.yw0(yh_0.tp(species, false, true, gender, false, true)), alternate);
                if (first == second) {
                    sprites = manager.BN;
                    sprites.j10(sprites.yw0(yh_0.tp(species, false, true, (byte) 1, false, false)), normal);
                    sprites = manager.BN;
                    sprites.j10(sprites.yw0(yh_0.tp(species, false, true, (byte) 1, false, true)), alternate);
                }
            }
        }
        FJ battle = new FJ(resource("/a/0/0/4"));
        manager.iD0 = battle;
        Rk0 battleImages = new Rk0(battle.EG(4), false);
        for (short species = 0; species <= 711; species++) {
            for (int variant = 0; variant < 4; variant++) {
                int index = variant < 2 ? species * 20 + variant : species * 20 + 9 + variant - 2;
                Ae entry = manager.iD0.EG(index);
                if (entry.Vh0 == 0) {
                    if (variant % 2 != 1) throw new RuntimeException();
                    for (int shiny = 0; shiny < 2; shiny++) {
                        SQ sprites = manager.BN;
                        int key = yh_0.tp(species, variant >= 2, false, (byte) (variant % 2), shiny == 1, false);
                        Object fallback = manager.BN.get(yh_0.tp(species, variant >= 2, false, (byte) 0, shiny == 1, false));
                        sprites.j10(sprites.yw0(key), fallback);
                    }
                } else {
                    for (int shiny = 0; shiny < 2; shiny++) {
                        Wr image = new Wr(new xw0(manager, species, shiny, entry, battleImages));
                        image.zz = true;
                        AG0 region = new AG0(image, 0, 0, 96, 96);
                        SQ sprites = manager.BN;
                        int key = yh_0.tp(species, variant >= 2, false, (byte) (variant % 2), shiny == 1, false);
                        sprites.j10(sprites.yw0(key), new AG0[] { region });
                    }
                }
            }
        }
        for (short species = 801; species <= 816; species++) {
            for (int variant = 0; variant < 4; variant++) {
                int index = variant < 2 ? variant + 9860 : variant - (-9867);
                Ae entry = manager.iD0.EG(index);
                if (entry.Vh0 == 0) {
                    if (variant % 2 != 1) throw new RuntimeException();
                    for (int shiny = 0; shiny < 2; shiny++) {
                        SQ sprites = manager.BN;
                        int key = yh_0.tp(species, variant >= 2, false, (byte) (variant % 2), shiny == 1, false);
                        Object fallback = manager.BN.get(yh_0.tp(species, variant >= 2, false, (byte) 0, shiny == 1, false));
                        sprites.j10(sprites.yw0(key), fallback);
                    }
                } else {
                    for (int shiny = 0; shiny < 2; shiny++) {
                        Wr image = new Wr(new WW(manager, species, shiny, entry, battleImages));
                        image.zz = true;
                        AG0 region = new AG0(image, 0, 0, 96, 96);
                        SQ sprites = manager.BN;
                        int key = yh_0.tp(species, variant >= 2, false, (byte) (variant % 2), shiny == 1, false);
                        sprites.j10(sprites.yw0(key), new AG0[] { region });
                    }
                }
            }
        }
    }

    @Override
    public final void Tf0() {
        this.r3 = new hx_2(resource("/wb_sound_data.sdat"));
        this.soundData = this.r3;
    }

    @Override
    public final byte Tz() {
        return 2;
    }

    @Override
    public final F90 eg0(short id) {
        Archive archive = new Archive(resource("/a/1/2/5"), false);
        if (id >= archive.count) return null;
        return new UG(archive.entry(id));
    }

    public final D9 pu() {
        return this.Oq0;
    }

    @Override
    public final void A3() {
        lpt6__2 mode = lpt6__2.Q80;
        this.Gn = new xm_0(this, mode, resource("/a/0/0/2"));
        this.textBankPrimary = this.Gn;
        mode = lpt6__2.YG0;
        this.b70 = new xm_0(this, mode, resource("/a/0/0/3"));
        this.textBankSecondary = this.b70;
    }

    public final QY[] OJ() {
        Archive archive = new Archive(resource("/a/0/8/6"), false);
        ByteBuffer data = archive.slice(0, true);
        int count = data.remaining() / 54;
        QY[] entries = new QY[count];
        for (byte i = 0; i < count; i++) {
            QY entry = new QY(i, data);
            entries[i] = entry;
            short id = entry.Yr0;
            if (id == 376) {
                entry.At0 = 4;
                entry.Jx = 1568;
                entry.MF0 = true;
            } else if (id == 424) {
                entry.Yr0 = 0;
                entry.Yb = new short[] { 56, 57, -1, -1, -1, -1, -1 };
            }
        }
        return entries;
    }

    public final void Z10() {
        SS.hG0.COM3 = (f.nj0_0) (Object) this;
        Dn0 file = lg_0.I70 == null ? null : new VE("data/sprites/sp.pak", zv_1.tt0);
        byte[] paletteData = new byte[0];
        if (file != null && file.os0()) paletteData = FI.MH(file.kI0());
        w7_0 texturesMap = new w7_0();
        Archive mapping = new Archive(resource("/a/0/4/8"), false);
        ByteBuffer data = mapping.slice(0, true);
        int count = data.getInt();
        this.Ao0.clear();
        this.Ao0.coM4((short) -1, ej_1.RR);
        for (int i = 0; i < count; i++) {
            ej_1 entry = new ej_1(data);
            short id = entry.p00;
            this.Ao0.coM4(id, entry);
            if (id >= 4095 && id <= 5094) {
                short next = (short) (id + 1000);
                this.Ao0.coM4(next, new ej_1((byte) 1, next, (short) (entry.vq + 1000)));
                next = (short) (id + 2000);
                this.Ao0.coM4(next, new ej_1((byte) 1, next, (short) (entry.vq + 2000)));
            }
        }
        for (short species = 494; species <= 649; species++) {
            if (species == 585) {
                for (int form = 0; form < 4; form++) {
                    short source = rg0_0.Prn(form, species);
                    if (source == 0) continue;
                    short id = (short) (rg0_0.gu(species, false, true, form) + 4095);
                    this.Ao0.coM4(id, new ej_1((byte) 1, id, ((ej_1) this.Ao0.f5(source)).vq));
                }
            } else {
                short source = rg0_0.Prn(0, species);
                if (source == 0) continue;
                short id = rg0_0.gu(species, false, true, 0);
                this.Ao0.coM4(id, new ej_1((byte) 1, id, source));
            }
        }
        this.Ao0.coM4((short) 8202, new ej_1((byte) 2, (short) 8202, (short) 78));
        Archive archive = new Archive(resource("/a/0/4/9"), false);
        for (short i = 6; i < archive.count; i++) {
            f.Er0 model = new f.Er0(archive.slice(i, false), true, false);
            bw_1 attributes = model.Zb0;
            boolean textured = attributes != null ? attributes.lB : ((am_2) model.Y3.get(0)).qn0;
            if (!textured) continue;
            int textureCount = model.E10.ib0.Ks.KB;
            Wr[] images = new Wr[textureCount];
            for (int j = 0; j < textureCount; j++) images[j] = new Wr(new fe_1(model, j));
            texturesMap.coM4(i, images);
            if (i >= 198 && i <= 763) {
                byte[] original = ((gb_0) (be0_1) model.E10.CoM5.Ks.get(0)).COm6(ol0_0.Jk0);
                int offset = (i - 198) * original.length;
                if (paletteData.length >= offset + original.length) {
                    byte[] alternate = new byte[original.length];
                    for (int j = 0; j < original.length; j++) alternate[j] = (byte) (original[j] ^ paletteData[offset + j]);
                    model.E10.CoM5.Ks.c0(1, new xi0_2(alternate));
                } else {
                    aux__1 palettes = model.E10.CoM5;
                    palettes.Ks.c0(1, (be0_1) palettes.Ks.get(0));
                }
                textureCount = model.E10.ib0.Ks.KB;
                images = new Wr[textureCount];
                for (int j = 0; j < textureCount; j++) images[j] = new Wr(new gi0_0(model, j));
                texturesMap.coM4((short) (i + 2000), images);
            }
        }
        w7_0 entries = this.Ao0;
        entries.getClass();
        new M(entries);
        V3 iterator = new V3(entries);
        while (iterator.hasNext()) {
            ej_1 entry = (ej_1) iterator.u7();
            Wr[] images = (Wr[]) texturesMap.f5(entry.vq);
            entry.TK = images == null ? ej_1.QC0 : images;
        }
    }

    public final ej_1 AF(short id) {
        ej_1 entry = (ej_1) this.Ao0.f5(id);
        return entry == null ? ej_1.RR : entry;
    }

    @Override
    public final am_2 EL0(MG0 type, int id) {
        int mapped = Gz0.Ku0[type.hX];
        String path = mapped == 2 ? "/a/1/7/6" : mapped == 3 ? "/a/1/7/7" : "/a/0/1/4";
        Archive archive = new Archive(resource(path), false);
        return new f.Er0(archive.slice(id, false), false, false).E10;
    }

    @Override
    public final S80 G80() {
        return this.Pq;
    }

    @Override
    public final Z50 Sc0(int id) {
        return (ug_0) this.Pq.Sx0[id];
    }

    public final FJ Hp() {
        return this.D4;
    }
}
