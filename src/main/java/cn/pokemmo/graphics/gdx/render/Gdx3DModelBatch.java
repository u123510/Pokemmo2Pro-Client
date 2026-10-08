package cn.pokemmo.graphics.gdx.render;

import f.*;


import aurelienribon.tweenengine.equations.Quad;
import aurelienribon.tweenengine.equations.Quint;
import aurelienribon.tweenengine.equations.Sine;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class Gdx3DModelBatch extends Oz0 {
    public static final C8 Lt0;
    public static final C8 MS;
    public static final C8 tk;
    public static final C8 Lt;
    public static final C8 SG0;
    public static boolean Zh0;
    public ER o4;
    public U5 qe;
    public fh_1 TO;
    public Tq0 Ko;
    public PRN_ Y20;
    public BJ0 FA;
    public float GF0;
    public float s3;
    public final in_2 hh;
    public final ArrayList A6;
    public boolean BI;
    public Ou0 sJ;
    public Ou0 vr;
    public Ou0 E9;
    public ii0_1 wP;
    public float HC0;
    public pw_1 ru0;
    public pw_1 M2;
    public long zi0;
    public ie_0 hB0;
    public ff_0 OB0;
    public ff_0 Dm;
    public final ConcurrentHashMap X1;
    public ff_0 KV;
    public d70_0 ZK;
    public pw_1 j9;
    public boolean RH;
    public boolean fo;
    public boolean vJ0;
    public Texture fB;
    public final Bp0 sy0;
    public final Bp0 Y70;
    public float ze;
    public final Color SE0;
    public Color ho;
    public final float[] lw;
    public boolean Ho0;
    public long Vn0;
    public ParticleEffectExt Sn0;
    public int u40;
    public boolean G80;
    public J40 an0;
    public boolean o5;
    public String xz0;
    public boolean Jw0;

    static {
        Cq0.E1(Gdx3DModelBatch.class);
        Lt0 = new C8(5.0F, 3.02F, 1.0F);
        MS = new C8(3.0F, 3.02F, 4.0F);
        tk = new C8(4.0F, 3.12F, 4.4F);
        Lt = new C8(3.5F, 3.25F, 4.0F);
        SG0 = new C8(3.5F, 3.4F, 2.5F);
        Zh0 = false;
    }

    public Gdx3DModelBatch(ML0 model, a10_0 data) {
        super(model, data);
        hh = new in_2(500);
        A6 = new ArrayList();
        BI = false;
        HC0 = 1.0F;
        X1 = new ConcurrentHashMap();
        ZK = d70_0.Do;
        sy0 = new Bp0();
        Y70 = new Bp0();
        ze = 0.0F;
        SE0 = Color.BLACK.cpy();
        ho = Color.CLEAR;
        lw = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };
        Ho0 = false;
        Vn0 = 0L;
        u40 = -1;
        G80 = true;
        o5 = false;
        xz0 = "";
        Jw0 = false;
    }

    public static void Cn0(C8 position, int ignored, D2 tween) {
        copyVector(co_1.Kl0, position);
        copyVector(co_1.cOm6, position);
    }

    public static PF[] OI(int size) {
        return new PF[size];
    }

    public static boolean wK0(PF member) {
        return member != null && member.LpT9 != null;
    }

    public static PF[] Pn0(int size) {
        return new PF[size];
    }

    public static boolean z60(PF member) {
        return member != null && member.LpT9 != null;
    }

    public final void Qy0(boolean trainer) {
        BJ0 camera = FA;
        camera.Wu0 = 0.1F;
        camera.Q30 = -10.0F;
        camera.zo0 = 50.0F;
        if (trainer) {
            camera.Rg0 = 3.0F;
            camera.Y90(3.5F, 3.0F, -0.5F);
            FA.d00 = 15.0F;
            FA.JP(4.0F, 3.0F, 1.0F);
        } else {
            camera.Rg0 = 3.0F;
            camera.Y90(4.0F, 3.0F, -2.0F);
            FA.d00 = 0.0F;
            FA.JP(4.0F, 3.0F, -3.0F);
        }
        FA.ye(true);
    }

    public final void Tw0() {
        if (M2 != null) {
            M2.w6 = true;
        }
        float duration = 5.0F;
        pw_1 timeline = pw_1.xC();
        ao_1 initial = ao_1.yp(7, FA);
        initial.h5[0] = 3.0F;
        timeline = timeline.y80(initial);
        C8 position = Lt;
        timeline = timeline.y80(ao_1.yp(9, FA).kt(position.x, position.y, position.z));
        C8 target = SG0;
        ao_1 look = ao_1.yp(4, FA).kt(target.x, target.y, target.z);
        look.Yn = Sine.INOUT;
        timeline = timeline.y80(look)
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x - 0.5F, target.y, target.z + 0.5F))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x - 0.5F, position.y, position.z))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x, target.y, target.z))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x, position.y, position.z))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x + 0.75F, target.y, target.z - 2.0F))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x + 0.75F, position.y, position.z - 2.0F))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x, target.y, target.z))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x, position.y, position.z))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x - 1.0F, target.y + 0.1F, target.z))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x - 0.5F, position.y, position.z))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x - 1.0F, target.y + 0.25F, target.z))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x - 0.5F, position.y + 0.25F, position.z))
                .mz0()
                .Xf0()
                .y80(ao_1.DX(FA, 4, duration).kt(target.x, target.y, target.z))
                .y80(ao_1.DX(FA, 9, duration).kt(position.x, position.y, position.z))
                .mz0();
        M2 = (pw_1) timeline.Yu0(255, 0.0F);
    }

    public final void lpT4() {
        if (!xz0.isEmpty()) {
            N10.wJ(xz0, "", this::Cg);
        } else {
            OE = ca_2.R;
        }
    }

    public final void Cg() {
        OE = ca_2.R;
    }

    public final void G50(int event, D2 tween) {
        a10_0 data = NF0;
        byte team = data.Ez0();
        Oz0.o90(data.wI0[team]);
    }

    public final void xi(int event, D2 tween) {
        a10_0 data = NF0;
        data.mn(data.Ez0()).Jo = true;
    }

    public final void CoM4(int event, D2 tween) {
        a10_0 data = NF0;
        data.mn(data.eI()).Jo = true;
    }

    public final void eJ(int event, D2 tween) {
        a10_0 data = NF0;
        byte team = data.eI();
        Oz0.o90(data.wI0[team]);
    }

    public final BJ0 VU() {
        return FA;
    }

    @Override
    public final void dispose() {
        super.dispose();
        J40 animation = an0;
        if (animation != null && !animation.nJ0) {
            animation.lD();
        }
        ie_0 resources = hB0;
        Texture texture = resources.OL;
        if (texture != null) {
            texture.dispose();
            resources.OL = null;
        }
        resources.W = null;
        vr.O4();
        E9.O4();
        sJ.O4();
        ((uu_0) o4.KF).dispose();
        TO.dispose();
        Ko.dispose();
        OB0.dispose();
        KV.dispose();
        Dm.dispose();
    }

    @Override
    public final void R9(byte team, float offset, byte index) {
        if (NF0.mn(team).v10() == null) {
            return;
        }
        BI = true;
        List sprites = NF0.mn(team).v10();
        int current = 0;
        ru0 = pw_1.xC().Xf0();
        for (Object value : sprites) {
            com3__3 sprite = (com3__3) value;
            if (current++ != index) {
                continue;
            }
            C8 base = team == NF0.eI() ? Lt0 : MS;
            sprite.qr0(base);
            sprite.j.na(offset, -0.025F, 0.0F);
            sprite.nu(0.0F, 0.0F, 0.0F, 0.0F);
            pw_1 timeline = ru0.y80(ao_1.yp(4, sprite).kt(sprite.j.x + 1.5F, sprite.j.y, sprite.j.z)).Xf0();
            ao_1 movement = ao_1.DX(sprite, 4, 0.5F).kt(sprite.j.x + 0.5F, sprite.j.y, sprite.j.z + 1.0F);
            movement.Yn = Quad.IN;
            timeline.y80(movement).mz0();
        }
        ru0.mz0().Ms(wP);
    }

    @Override
    public final void ph() {
        zi0 = System.currentTimeMillis();
        pw_1 previous = M2;
        if (previous != null) {
            previous.w6 = true;
            M2 = null;
            pw_1.xC().Xf0()
                    .y80(ao_1.DX(FA, 4, 0.5F).kt(SG0.x, SG0.y, SG0.z))
                    .y80(ao_1.DX(FA, 9, 0.5F).kt(Lt.x, Lt.y, Lt.z))
                    .mz0().Ms(wP);
        }
    }

    @Override
    public final void Ow0() {
        zi0 = System.currentTimeMillis();
        pw_1 previous = M2;
        if (previous != null) {
            previous.w6 = true;
            M2 = null;
        }
    }

    public final ff_0 protected$() {
        return OB0;
    }

    @Override
    public final void tt(byte team, short effect) {
        short key;
        if (effect < 0) {
            key = team == 0 ? (short) (effect + 10000) : (short) (effect * -1 - 10000);
        } else {
            key = team == 0 ? effect : (short) (effect * -1);
        }
        ParticleEffectExt particle = (ParticleEffectExt) X1.get(Short.valueOf(key));
        if (particle != null) {
            Dm.Kz0(particle);
            X1.remove(Short.valueOf(key));
        }
    }

    public final void jH(pw_1 timeline) {
        pw_1 previous = M2;
        if (previous != null) {
            previous.w6 = true;
            M2 = null;
        }
        ru0 = timeline;
    }

    public final void rj0(int id, Color color) {
        Y70.x = 0.0F;
        Y70.y = 0.0F;
        Texture previous = fB;
        if (previous != null) {
            previous.dispose();
        }
        ie_0 resources = hB0;
        int offset = id * 3;
        Tt0 tiles = new Tt0(resources.m7.EG(offset + 2));
        Gt0 palette = new Gt0(resources.m7.EG(offset + 1), false);
        IA0 image = new IA0(resources.m7.EG(offset), false);
        image.LA = 256;
        in_1 format = image.EC0;
        if ((format == in_1.J9 || format == in_1.bC0) && 256 < image.eC0) {
            image.LA = image.eC0;
        }
        if (id == 8 || id == 9 || id == 11 || id == 34 || id >= 29 && id <= 32) {
            image.YA0(192);
        } else if (id == 23 || id == 25) {
            image.YA0(256);
        } else {
            image.YA0(200);
        }
        i4_0 pixels = image.dB(tiles, palette);
        Texture texture = new Texture(pixels);
        pixels.dispose();
        texture.setWrap(a00_0.xm0, a00_0.xm0);
        fB = texture;
        sy0.x = 0.0F;
        sy0.y = 0.0F;
        ho = color;
    }

    @Override
    public final void JM(boolean playerSide, boolean forward) {
        Ou0 scene = playerSide ? vr : E9;
        float angle = playerSide != forward ? -0.015F : 0.015F;
        a10_0 data = NF0;
        byte team = playerSide ? data.Ez0() : data.eI();
        PF[] members = data.wI0[team];
        pw_1 timeline = pw_1.gb0();
        for (int i = 0; i < members.length; i++) {
            PF member = members[i];
            if (member == null) {
                continue;
            }
            boolean hidden = NF0.nf.po0(i);
            member.hL = hidden;
            if (!hidden) {
                member.Tm();
            } else {
                member.y80();
            }
            member = members[i];
            if (member.hL) {
                timeline.y80(ao_1.DX(member.LpT9, 10, 0.5F).Om0(new float[] { 1.0F, 1.0F, 1.0F, 0.0F }));
            } else {
                timeline.y80(ao_1.DX(member.LpT9, 10, 0.5F).Om0(new float[] { 0.0F, 0.0F, 0.0F, 0.6F }));
            }
        }
        ao_1 movement = ao_1.DX(scene, 1, 0.5F);
        movement.h5[0] = angle;
        timeline.y80(movement);
        timeline.Ms(wP);
    }

    @Override
    public final void nI0() {
        hB0 = tw0_0.Ll0.Qz0.vE0;
        To0 = new hl0_1(0);
        o4 = new ER(new je0_2(), new FG());
        qe = new U5();
        PRN_ ambient = new PRN_(PRN_.xE, 1.0F, 1.0F, 1.0F, 0.8F);
        Y20 = ambient;
        qe.LPT8(ambient);
        BJ0 camera = new BJ0();
        FA = camera;
        Tq0 renderer = new Tq0(camera);
        Ko = renderer;
        TO = new fh_1(100, renderer);
        ff_0 particles = new ff_0(FA, 0);
        OB0 = particles;
        particles.nI(tw0_0.Ll0.Qz0);
        particles = OB0;
        ParticleEffectExt preload = particles.B2("particle/preload.vfx");
        preload.init();
        preload.dispose();
        particles.Vk.Mj("particle/preload.vfx");
        particles = new ff_0(FA, 0);
        KV = particles;
        particles.nI(tw0_0.Ll0.Qz0);
        particles = new ff_0(FA, 0);
        Dm = particles;
        particles.nI(tw0_0.Ll0.Qz0);
        wP = new ii0_1();
        aQ();
        a10_0 data = NF0;
        Qy0(data.mn(data.eI()).BE0());
    }

    public final void w9(ca_2 state) {
        switch (ua0_2.oY[state.d3]) {
            case 8: {
                A6.clear();
                ru0 = pw_1.xC();
                boolean first = false;
                a10_0 data = NF0;
                byte team = data.Ez0();
                for (PF member : data.wI0[team]) {
                    if (member == null) {
                        continue;
                    }
                    ru0.TD0();
                    if (!first) {
                        first = true;
                        ru0.y80(ao_1.pc(this::G50));
                    }
                }
                ru0.mz0();
                ru0.Xf0()
                        .y80(ao_1.DX(FA, 9, 1.0F).kt(Lt.x, Lt.y, Lt.z))
                        .y80(ao_1.DX(FA, 4, 1.0F).kt(SG0.x, SG0.y, SG0.z))
                        .mz0().Ms(wP);
                return;
            }
            case 7: {
                A6.clear();
                a10_0 data = NF0;
                data.mn(data.Ez0()).Cq0(0, true);
                s3 = 0.0F;
                ru0 = pw_1.xC();
                ru0.Xf0();
                ru0.y80(ao_1.pc(this::xi));
                wx_2 seen = new wx_2();
                data = NF0;
                byte team = data.Ez0();
                for (PF member : data.wI0[team]) {
                    if (member == null) {
                        continue;
                    }
                    a10_0 battle = NF0;
                    con__6 trainer = battle.mn(battle.Ez0()).Td0();
                    J40 animation = new J40(battle, member, true, trainer);
                    animation.Tc0 = true;
                    short id = member.p10();
                    if (member.yT()) {
                        id = (short) (id * -1);
                    }
                    if (!seen.TI0(id)) {
                        animation.j7 = false;
                    }
                    an0 = animation;
                    ru0.xi0(animation.zh0());
                }
                ru0.mz0();
                ru0.Xf0()
                        .y80(ao_1.DX(FA, 9, 1.0F).kt(Lt.x, Lt.y, Lt.z))
                        .y80(ao_1.DX(FA, 4, 1.0F).kt(SG0.x, SG0.y, SG0.z))
                        .mz0().Ms(wP);
                return;
            }
            case 6:
                ru0 = (pw_1) pw_1.xC().Xf0()
                        .y80(ao_1.DX(FA, 9, 1.0F).kt(2.75F, 3.0F, 3.0F))
                        .y80(ao_1.DX(FA, 4, 1.0F).kt(3.75F, 2.75F, 4.0F))
                        .mz0().Ms(wP);
                return;
            case 5: {
                a10_0 data = NF0;
                if (data.mn(data.eI()).BE0()) {
                    return;
                }
                A6.clear();
                data = NF0;
                List sprites = data.mn(data.eI()).v10();
                s3 = 0.0F;
                ru0 = pw_1.xC();
                ru0.y80(MU.eK0((short) 1382, false));
                ru0.TD0();
                if (sprites != null) {
                    ru0.Xf0();
                    for (Object value : sprites) {
                        com3__3 sprite = (com3__3) value;
                        ao_1 movement = ao_1.DX(sprite, 4, 1.0F)
                                .kt(sprite.j.x + 0.5F, sprite.j.y, sprite.j.z - 1.0F);
                        movement.Yn = Quad.IN;
                        ru0.y80(movement);
                    }
                    ru0.mz0();
                }
                ru0.y80(ao_1.pc(this::CoM4));
                ru0.mz0();
                ru0.Xf0();
                wx_2 seen = new wx_2();
                data = NF0;
                byte team = data.eI();
                for (PF member : data.wI0[team]) {
                    if (member == null) {
                        continue;
                    }
                    a10_0 battle = NF0;
                    con__6 trainer = battle.mn(battle.eI()).Td0();
                    J40 animation = new J40(battle, member, false, trainer);
                    animation.Tc0 = true;
                    short id = member.p10();
                    if (member.yT()) {
                        id = (short) (id * -1);
                    }
                    if (!seen.TI0(id)) {
                        animation.j7 = false;
                    }
                    an0 = animation;
                    ru0.xi0(animation.zh0());
                }
                ru0.mz0();
                N10.m5();
                N10.X60(false);
                ru0.Xf0()
                        .y80(ao_1.DX(FA, 9, 1.0F).kt(Lt.x, Lt.y, Lt.z))
                        .y80(ao_1.DX(FA, 4, 1.0F).kt(SG0.x, SG0.y, SG0.z))
                        .mz0().Ms(wP);
                return;
            }
            case 4:
                BI = false;
                ru0 = pw_1.xC().Xf0();
                for (byte team = 0; team < NF0.eG.length; team++) {
                    for (PF member : NF0.wI0[team]) {
                        if (member != null) {
                            com3__3[] empty = PF.bB0;
                            member.BG = empty;
                            member.Br0 = empty;
                            member.LpT9 = null;
                            member.Sc0 = null;
                            member.c20();
                        }
                    }
                    O8 side = NF0.mn(team);
                    side.Jo = false;
                    if (NF0.a40) {
                        List sprites = side.v10();
                        if (sprites != null) {
                            for (Object value : sprites) {
                                com3__3 sprite = (com3__3) value;
                                ao_1 fade = ao_1.DX(sprite, 9, 0.5F);
                                fade.h5[0] = 0.0F;
                                fade.Yn = Quad.IN;
                                ru0.y80(fade);
                            }
                        }
                    }
                }
                tw0_0.LD0.he0.N10.m5();
                tw0_0.LD0.he0.N10.X60(false);
                ru0 = (pw_1) ru0.mz0().Ms(wP);
                return;
            case 3:
                BI = true;
                ru0 = pw_1.xC();
                ru0 = (pw_1) ru0.Ms(wP);
                return;
            case 2: {
                BI = true;
                ru0 = pw_1.xC();
                a10_0 data = NF0;
                if (!data.mn(data.eI()).BE0()) {
                    int count = 0;
                    data = NF0;
                    data.mn(data.eI()).Jo = true;
                    ru0.Xf0();
                    data = NF0;
                    byte team = data.eI();
                    for (PF member : data.wI0[team]) {
                        if (member == null) {
                            continue;
                        }
                        com3__3 sprite = member.LpT9;
                        C8 source = sprite.j;
                        C8 origin = T3.hf(source, source);
                        ru0.TD0()
                                .y80(ao_1.yp(7, sprite).UD(0.0F, 0.0F))
                                .y80(ao_1.yp(8, sprite).Om0(new float[] { 1.0F, 1.0F, 1.0F, 1.0F }))
                                .y80(ao_1.yp(10, sprite).Om0(new float[] { 1.0F, 1.0F, 1.0F, 1.0F }))
                                .mz0();
                        pw_1 timeline = ru0.TD0()
                                .y80(ao_1.DX(sprite, 4, 0.1F).kt(origin.x, origin.y + 0.65F, origin.z))
                                .y80(ao_1.pc((event, tween) -> Cn0(origin, event, tween)))
                                .y80(ao_1.DX(sprite, 7, 1.0F).UD(1.2F, 1.2F))
                                .Xf0()
                                .y80(ao_1.DX(sprite, 7, 0.25F).UD(1.0F, 1.0F));
                        ao_1 reset = ao_1.DX(sprite, 11, 0.25F);
                        reset.h5[0] = 0.0F;
                        timeline = timeline.y80(reset).mz0();
                        ao_1 position = ao_1.DX(sprite, 4, 0.5F);
                        float x = origin.x;
                        float y = origin.y;
                        float z = origin.z;
                        float distance = count * 0.1F;
                        float direction = count > 2 ? -1.0F : 1.0F;
                        timeline.y80(position.kt(x, y, distance * direction + z)).mz0();
                        count++;
                    }
                    ru0.Xf0();
                    data = NF0;
                    for (Object value : data.mn(data.eI()).v10()) {
                        com3__3 sprite = (com3__3) value;
                        ru0.y80(ao_1.DX(sprite, 4, 1.0F)
                                .kt(sprite.j.x - 0.5F, sprite.j.y - 0.025F, sprite.j.z + 0.85F));
                    }
                    ru0.mz0();
                    ru0.mz0();
                    tw0_0.LD0.he0.N10.m5();
                    tw0_0.LD0.he0.N10.X60(false);
                }
                ru0 = (pw_1) ru0.Ms(wP);
                return;
            }
            case 1: {
                if (o5) {
                    return;
                }
                o5 = true;
                ru0 = pw_1.xC();
                ArrayList<com3__3> sprites = new ArrayList<>();
                a10_0 data = NF0;
                if (data.mn(data.eI()).BE0()) {
                    Qy0(true);
                    data = NF0;
                    PF[] members;
                    if (data.m2) {
                        members = Stream.of(data.wI0).flatMap(Stream::of)
                                .filter(vr_1::z60).toArray(vr_1::Pn0);
                    } else {
                        byte team = data.eI();
                        members = Stream.of(data.wI0[team]).filter(vr_1::wK0).toArray(vr_1::OI);
                    }
                    for (PF member : members) {
                        member.LpT9.nu(0.0F, 0.0F, 0.0F, 0.75F);
                        sprites.add(member.LpT9);
                    }
                    pw_1 timeline = ru0.Xf0();
                    ao_1 camera = ao_1.DX(FA, 5, 1.0F);
                    camera.h5[0] = 0.0F;
                    timeline.y80(camera).mz0().y80(ao_1.pc(this::eJ));
                } else {
                    data = NF0;
                    if (data.mn(data.eI()).v10() != null) {
                        ru0.Xf0();
                        data = NF0;
                        for (Object value : data.mn(data.eI()).v10()) {
                            com3__3 sprite = (com3__3) value;
                            sprite.nu(0.0F, 0.0F, 0.0F, 1.0F);
                            sprites.add(sprite);
                        }
                        ru0.mz0();
                    }
                    Qy0(false);
                }
                pw_1 timeline = ru0.Xf0();
                timeline.y80(ao_1.DX(FA, 9, 1.0F).kt(Lt.x, Lt.y, Lt.z))
                        .y80(ao_1.DX(FA, 4, 1.0F).kt(SG0.x, SG0.y, SG0.z));
                for (com3__3 sprite : sprites) {
                    timeline.y80(ao_1.DX(sprite, 10, 1.5F).Om0(new float[] { 0.0F, 0.0F, 0.0F, 0.0F }));
                }
                timeline.mz0();
                ru0 = (pw_1) ru0.Ms(wP);
                return;
            }
            default:
                return;
        }
    }

    @Override
    public final void aQ() {
        int width = lg_0.S4.Kr0();
        int height = lg_0.S4.sD0();
        if (tw0_0.kz0()) {
            na_0 window = tw0_0.LD0.nB0;
            QK.IA = window != null ? window.dx0.Yd0 : lg_0.S4.Kr0();
            window = tw0_0.LD0.nB0;
            QK.Eu0 = window != null ? window.dx0.JY : lg_0.S4.sD0();
            WT = true;
        } else {
            fc0_2.q70(dw_2.c10, false);
            QK.IA = fc0_2.YQ;
            QK.Eu0 = fc0_2.On0;
            WT = false;
        }
        QK.j80 = (width - (int) QK.IA) / 2;
        QK.Wm0 = height - (int) QK.Eu0 - 50;
        if (FZ.IA == 0.0F && FZ.Eu0 == 0.0F && j9 == null && !tw0_0.kz0()) {
            FZ.IA = 1.0F;
            FZ.Eu0 = 1.0F;
            float screenWidth = width;
            float screenHeight = height;
            FZ.j80 = screenWidth / 2.0F;
            FZ.Wm0 = screenHeight / 2.0F;
            pw_1 timeline = pw_1.xC().Xf0();
            ao_1 resize = ao_1.DX(FZ, 6, 0.5F).UD(QK.IA, QK.Eu0);
            resize.Yn = Quint.IN;
            timeline = timeline.y80(resize);
            ao_1 move = ao_1.DX(FZ, 3, 0.5F)
                    .UD((screenWidth - QK.IA) / 2.0F, screenHeight - QK.Eu0 - 50.0F);
            move.Yn = Quint.IN;
            j9 = (pw_1) timeline.y80(move).mz0().Ms(wP);
        } else if (j9 == null) {
            FZ.IA = QK.IA;
            FZ.Eu0 = QK.Eu0;
            FZ.j80 = QK.j80;
            FZ.Wm0 = QK.Wm0;
            if (tw0_0.kz0()) {
                FZ.j80 = 0.0F;
                FZ.Wm0 = 0.0F;
            }
        }
        FA.Ui = FZ.IA;
        FA.yG = FZ.Eu0;
        FA.ye(false);
        Math.min(QK.IA / 256.0F, QK.Eu0 / 200.0F);
        if (C5 == null) {
            C5 = new PC0((float) width, (float) height);
        }
        if (j9 == null) {
            C5.LH = 1.0F;
            C5.Ka0(256.0F, 200.0F, false);
            C5.R1(true);
            To0.Po(C5.iJ);
        }
    }

    public final void Wi0() {
        a10_0 data = NF0;
        boolean large = data.nf == Cq.yH;
        boolean encounter = data.Nv0 != null;
        for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
            O8 side = NF0.mn(team);
            if (side.ZG0 == NF0.eI() || NF0.iv0 && NF0.a40) {
                NF0.mn(team).Dt(0.0F, 0.0F);
            }
            if (side.ZG0 == NF0.Ez0()) {
                NF0.mn(team).Vs0(0, 0);
            }
            for (byte slot = 0; slot < NF0.wI0[team].length; slot++) {
                PF member = NF0.Ce(team, slot);
                if (member == null) {
                    continue;
                }
                member.ZI(member.COm2(), true);
                if (large && !NF0.nf.po0(slot)) {
                    member.hL = false;
                    member.Tm();
                    member.LpT9.nu(0.0F, 0.0F, 0.0F, 0.6F);
                }
            }
        }
        I4 background = I4.ri;
        if (encounter) {
            if (NF0.Nv0.p10() == 485) {
                background = I4.eA;
            } else if (NF0.Nv0.p10() == 385) {
                background = I4.S1;
            } else if (NF0.Nv0.p10() == 245) {
                background = I4.Qo;
            }
        } else {
            rh0_1 location = NF0.tB0;
            if (location != null) {
                background = location.sf0;
            }
            if (tw0_0.e60.N60() instanceof p50_0) {
                XF0 map = (XF0) tw0_0.e60.N60();
                int id = ((map.Ro0.mr0 >> 5) & 31) + 1;
                background = I4.ri;
                for (I4 candidate : I4.br) {
                    if (candidate.Bw0 == id) {
                        background = candidate;
                        break;
                    }
                }
            }
        }
        int selection = u40;
        if (selection > 0) {
            background = I4.br[selection % I4.br.length];
            tw0_0.rl.qK(new StringBuilder("BG IS NOW BG").append(background.Bw0).toString());
        }
        ku_0 platform;
        if (large) {
            platform = ku_0.zn(hB0.ym.EG(86).MH(false));
        } else {
            ie_0 resources = hB0;
            rh0_1 location = NF0.tB0;
            int id = background.Da0;
            if (id <= 0) {
                id = 0;
                if (location != null) {
                    switch (Z8.fu0[location.t3]) {
                        case 1:
                            id = 6;
                            break;
                        case 2:
                        case 3:
                            id = 14;
                            break;
                        case 4:
                            id = 15;
                            break;
                        default:
                            break;
                    }
                }
            }
            platform = ku_0.zn(resources.ym.EG(id).MH(false));
        }
        ie_0 resources = hB0;
        resources.getClass();
        int backgroundId = background.BR;
        int phase = background.Em ? c8_0.JD0.YG() : 0;
        ku_0 scenery = ku_0.zn(resources.ym.EG(backgroundId + phase).MH(false));
        es_1 animations = new es_1(1);
        resources = hB0;
        resources.getClass();
        int animationId = background.M20;
        phase = background.Em ? c8_0.JD0.YG() : 0;
        animations.Ue0(ck_0.nU(resources.ym.EG(animationId + phase).MH(false)));
        v80_0 factory = v80_0.Cb0();
        vt_0 mesh = platform.KV[0];
        am_2 textures = platform.QB;
        factory.getClass();
        vr = v80_0.Kg0(mesh, textures, null, 1.0F, true, false, false);
        factory = v80_0.Cb0();
        mesh = platform.KV[0];
        textures = platform.QB;
        factory.getClass();
        E9 = v80_0.Kg0(mesh, textures, null, 1.0F, true, false, false);
        if (NF0.nf != Cq.Jd) {
            factory = v80_0.Cb0();
            mesh = scenery.KV[0];
            textures = scenery.QB;
            factory.getClass();
            Ou0 scene = v80_0.Kg0(mesh, textures, animations, 1.0F, true, false, false);
            sJ = scene;
            scene.PE0 = 2.0F;
            scene.sC0(0, true, null);
            sJ.ho.hr(8.0F);
            sJ.ho.m80(3.0F, 2.5F, 3.0F);
            Lt.x = 3.5F;
            Lt.y = 3.25F;
            Lt.z = 4.0F;
            SG0.x = 3.5F;
            SG0.y = 3.4F;
            SG0.z = 2.5F;
        } else {
            factory = v80_0.Cb0();
            FJ file = new FJ((Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/1/8/9"));
            int[] parts = { 6, 7, 9 };
            factory.getClass();
            Ou0 scene = v80_0.CW(file, 8, parts);
            sJ = scene;
            scene.ia((String) scene.Kv.get(0), true);
            sJ.ho.hr(4.0F);
            SG0.x = 0.0F;
            SG0.y = 0.0F;
            SG0.z = 2.0F;
            Lt.x = 0.0F;
            Lt.y = 0.0F;
            Lt.z = 0.0F;
            sJ.ho.m80(0.0F, 0.0F, 0.0F);
            vr.ho.m80(999.0F, 999.0F, 999.0F);
            E9.ho.m80(999.0F, 999.0F, 999.0F);
        }
        if (large) {
            vr.ho.hr(8.0F);
            E9.ho.hr(8.0F);
        } else {
            vr.ho.hr(16.0F);
            E9.ho.hr(16.0F);
        }
        vr.ho.m80(3.0F, 2.5F, 4.0F);
        E9.ho.m80(5.25F, 2.5F, 1.0F);
        ii0_1 manager = wP;
        for (PF[] members : NF0.wI0) {
            for (PF member : members) {
                if (member == null) {
                    continue;
                }
                if (member.p10() == 1023) {
                    Y20.v50.set(1.0F, 0.7F, 0.7F, 0.0F);
                    setOverlay(0.23F, 0.0F, 0.65F, 0.35F);
                } else if (member.p10() == 1002) {
                    Y20.v50.set(0.12F, 0.12F, 0.21F, 0.5F);
                } else {
                    if (!member.zi0.Fo0()) {
                        continue;
                    }
                    if (member.p10() == 485) {
                        setOverlay(0.6F, 0.15F, 0.15F, 0.21F);
                    } else if (member.p10() == 385) {
                        setOverlay(0.4F, 0.4F, 0.4F, 0.21F);
                    } else if (member.p10() != 245) {
                        switch (member.rP().ordinal()) {
                            case 1:
                            case 4:
                            case 5:
                                Y20.v50.set(0.85F, 0.65F, 0.45F, 0.0F);
                                setOverlay(0.75F, 0.45F, 0.35F, 0.35F);
                                break;
                            case 2:
                            case 15:
                                Y20.v50.set(0.75F, 0.85F, 1.0F, 0.0F);
                                setOverlay(0.5F, 0.6F, 0.85F, 0.31F);
                                break;
                            case 3:
                            case 14:
                                Y20.v50.set(1.0F, 0.7F, 0.7F, 0.0F);
                                setOverlay(0.23F, 0.0F, 0.65F, 0.35F);
                                break;
                            case 6:
                                Y20.v50.set(0.65F, 0.7F, 0.45F, 0.0F);
                                setOverlay(0.3F, 0.65F, 0.35F, 0.28F);
                                break;
                            case 7:
                            case 17:
                                Y20.v50.set(0.65F, 0.55F, 0.6F, 0.0F);
                                setOverlay(0.05F, 0.0F, 0.1F, 0.45F);
                                break;
                            case 8:
                                Y20.v50.set(0.9F, 0.9F, 1.0F, 0.0F);
                                setOverlay(0.5F, 0.6F, 0.85F, 0.31F);
                                break;
                            case 10:
                                Y20.v50.set(1.0F, 0.65F, 0.4F, 0.0F);
                                setOverlay(1.0F, 0.45F, 0.25F, 0.38F);
                                break;
                            case 11:
                                Y20.v50.set(0.45F, 0.65F, 0.85F, 0.0F);
                                setOverlay(0.1F, 0.5F, 0.65F, 0.35F);
                                break;
                            case 12:
                                Y20.v50.set(0.5F, 0.65F, 0.45F, 0.0F);
                                setOverlay(0.5F, 0.75F, 0.35F, 0.28F);
                                break;
                            case 13:
                                Y20.v50.set(0.8F, 0.8F, 0.6F, 0.0F);
                                setOverlay(0.85F, 0.85F, 0.4F, 0.35F);
                                break;
                            case 16:
                                Y20.v50.set(1.0F, 0.7F, 0.7F, 0.0F);
                                setOverlay(0.33F, 0.2F, 0.65F, 0.35F);
                                break;
                            default:
                                Y20.v50.set(1.0F, 1.0F, 0.85F, 0.2F);
                                setOverlay(1.0F, 1.0F, 0.85F, 0.3F);
                                break;
                        }
                    }
                }
                Ho0 = true;
                Jw0 = true;
                break;
            }
        }
        ru0 = pw_1.xC().Xf0();
        I2 materials = sJ.Y3.ZD();
        while (materials.hasNext()) {
            BM material = (BM) materials.next();
            ru0.y80(ao_1.DX(material, 10, 0.0F).Om0(new float[] { lw[0], lw[1], lw[2], lw[3] }));
        }
        ru0.mz0().Ms(manager);
        fM(NF0.O00);
        if (NF0 != null) {
            for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
                ek_0 effects = NF0.mn(team).zI;
                if (effects == null) {
                    continue;
                }
                for (fq_2 effect : fq_2.an0) {
                    if (effects.j1.containsKey(effect)) {
                        short id = 0;
                        switch (ua0_2.dJ[effect.ZZ]) {
                            case 1:
                            case 2: id = 191; break;
                            case 3: id = 390; break;
                            case 4: id = 3390; break;
                            case 5: id = 446; break;
                            case 6: id = 3446; break;
                            case 7: id = 1079; break;
                            case 8: id = 1066; break;
                            case 9: id = 3465; break;
                            default: break;
                        }
                        Z8(team, id);
                    }
                }
                if (effects.Wn0 > 0) {
                    Z8(team, (short) 519);
                }
                if (effects.cU > 0) {
                    Z8(team, (short) 518);
                }
                if (effects.COm5 > 0) {
                    Z8(team, (short) 520);
                }
                if (effects.COm5 > 0) {
                    Z8(team, (short) 520);
                }
                if (effects.bB0 > 0) {
                    Z8(team, (short) 366);
                }
                if (effects.Eo) {
                    Z8(team, (short) -551);
                }
                if (effects.HT) {
                    Z8(team, (short) 1061);
                }
            }
        }
        data = NF0;
        if ((!data.a40 || data.mo()) && !NF0.mW && NF0.nf != Cq.Jd) {
            OE = ca_2.x0;
            return;
        }
        FA.rj.np(Lt);
        FA.zo0 = 50.0F;
        FA.Rg0 = 3.0F;
        FA.Q30 = -10.0F;
        FA.Wu0 = 0.1F;
        FA.JP(SG0.x, SG0.y, SG0.z);
        FA.ye(true);
        data = NF0;
        if (data.a40 && data.j6.u) {
            BI = true;
            for (Object value : data.mn(data.eI()).v10()) {
                com3__3 sprite = (com3__3) value;
                sprite.zf0(sprite.j.x - 0.95F, sprite.j.y - 0.025F, sprite.j.z + 1.69F);
            }
            data = NF0;
            for (Object value : data.mn(data.Ez0()).v10()) {
                com3__3 sprite = (com3__3) value;
                sprite.zf0(sprite.j.x - 2.35F, sprite.j.y - 0.025F, sprite.j.z + 1.62F);
            }
            Ow0();
        }
        N10.H5(true, true);
        if (NF0.Sv != XA0.Pb) {
            N10.H5(false, true);
        }
        for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
            data = NF0;
            if (data.j6 == zg0_0.ef0 && !data.a40 && team == data.Ez0()) {
                continue;
            }
            if (NF0.j6 == zg0_0.oi) {
                continue;
            }
            for (byte slot = 0; slot < NF0.wI0[team].length; slot++) {
                PF member = NF0.Ce(team, slot);
                N10.Tb0[team][slot].z2(member);
                if (team == NF0.Ez0()) {
                    data = NF0;
                    if (data.Sv == XA0.Pb) {
                        data.mn(data.Ez0()).jG();
                    } else {
                        data.mn(team).Jo = true;
                    }
                } else {
                    NF0.mn(team).Jo = true;
                }
            }
        }
        zg0_0 phaseType = NF0.j6;
        if (phaseType == zg0_0.ef0) {
            OE = ca_2.wj;
            N10.H5(true, false);
            N10.H5(false, false);
        } else if (phaseType == zg0_0.oi) {
            OE = ca_2.sR;
            N10.H5(true, false);
            N10.H5(false, false);
        } else {
            OE = ca_2.M6;
        }
        tI0();
    }

    private void setOverlay(float r, float g, float b, float a) {
        float[] color = lw;
        color[0] = r;
        color[1] = g;
        color[2] = b;
        color[3] = a;
    }

    @Override
    public final void Z8(byte team, short effect) {
        ek_0 effects = NF0.mn(team).zI;
        ParticleEffectExt particle = null;
        short key;
        if (effect < 0) {
            key = team == 0 ? (short) (effect + 10000) : (short) (effect * -1 - 10000);
        } else {
            key = team == 0 ? effect : (short) (effect * -1);
        }
        if (effects != null) {
            switch (effect) {
                case 3465:
                    if (effects.j1.containsKey(fq_2.gu)) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/pledge_swamp_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 3446:
                    if (effects.j1.containsKey(fq_2.uv)) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/stealth_rock_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 1079:
                    if (effects.j1.containsKey(fq_2.Sq)) {
                        byte levels = effects.Px0(fq_2.Sq);
                        particle = Dm.UH0("field_effects/metal_shards_field");
                        ParticleControllerExt controller = (ParticleControllerExt) particle.getControllers().KI();
                        controller.emitter.maxParticleCount = levels * 8;
                    }
                    break;
                case 1066:
                    if (effects.j1.containsKey(fq_2.NG)) {
                        particle = Dm.UH0("field_effects/magma_pool_allied_field");
                    }
                    break;
                case 1061:
                    if (effects.HT) {
                        particle = Dm.UH0("field_effects/strong_winds_field");
                    }
                    break;
                case 1046:
                    if (effects.wu0) {
                        particle = Dm.UH0("custom/big_chicken_flap");
                    }
                    break;
                case 520:
                    if (effects.COm5 > 0) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/pledge_swamp_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 519:
                    if (effects.Wn0 > 0) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/pledge_field_of_fire_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 518:
                    if (effects.cU > 0) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/pledge_rainbow_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 446:
                    if (effects.j1.containsKey(fq_2.pz)) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/stealth_rock_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 390:
                case 3390: {
                    byte levels = effect == 390 ? effects.Px0(fq_2.KJ0) : effects.Px0(fq_2.LC0);
                    if (levels == 1 || levels == 2) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/toxic_spikes_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append(levels == 1 ? "_field_l1" : "_field_l2").toString());
                    }
                    break;
                }
                case 366:
                    if (effects.bB0 > 0) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/tailwind_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case 191:
                case 3191: {
                    byte levels = effect == 191 ? effects.Px0(fq_2.ue0) : effects.Px0(fq_2.Bx0);
                    if (levels == 1 || levels == 2 || levels == 3) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/spikes_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        String suffix = levels == 1 ? "_field_l1" : levels == 2 ? "_field_l2" : "_field_l3";
                        particle = manager.UH0(path.append(side).append(suffix).toString());
                    }
                    break;
                }
                case -543:
                    if (effects.kI0 > 0) {
                        ff_0 manager = Dm;
                        StringBuilder path = new StringBuilder("field_effects/healing_field_");
                        String side = team == NF0.Ez0() ? "allied" : "enemy";
                        particle = manager.UH0(path.append(side).append("_field").toString());
                    }
                    break;
                case -551:
                    if (effects.Eo) {
                        particle = Dm.UH0("field_effects/maelstrom");
                    }
                    break;
                default:
                    break;
            }
        }
        ParticleEffectExt previous = (ParticleEffectExt) X1.get(Short.valueOf(key));
        if (previous != null) {
            Dm.Kz0(previous);
            X1.remove(Short.valueOf(key));
        }
        if (particle != null) {
            if (team == NF0.Ez0()) {
                C8 origin = co_1.Kl0;
                origin.np(MS);
                origin.Vy(0.0F, 0.0F, 0.5F);
                co_1.cOm6.np(Lt0);
            } else {
                co_1.Kl0.np(Lt0);
                co_1.cOm6.np(MS);
            }
            particle.start();
            Dm.fY(particle);
            X1.put(Short.valueOf(key), particle);
        }
    }

    @Override
    public final void fM(d70_0 weather) {
        if (weather == ZK) {
            return;
        }
        ParticleEffectExt particle = null;
        PRN_ target = new PRN_(Y20);
        vo_2 world = tw0_0.LD0.Sc;
        boolean forcedLighting = false;
        ii0_1 manager = wP;
        int[] types = ua0_2.hG;
        switch (types[weather.Mf]) {
            case 1:
            case 2:
            case 3:
                particle = KV.UH0("weather/rainbattle");
                break;
            case 4:
                particle = KV.UH0("weather/sandstormbattle");
                break;
            case 5:
                particle = KV.UH0("weather/snowbattle");
                break;
            case 6:
                particle = KV.UH0("weather/fogbattle");
                break;
            case 7:
                target.v50.set(1.0F, 1.0F, 1.0F, 1.0F);
                forcedLighting = true;
                break;
            case 8:
                target.v50.set(0.12F, 0.12F, 0.21F, 0.5F);
                forcedLighting = true;
                break;
            default:
                break;
        }
        if (!Jw0) {
            if (forcedLighting) {
                Ho0 = true;
                pw_1 timeline = pw_1.xC().Xf0();
                ao_1 lighting = ao_1.DX(Y20.v50, 0, 1.4F);
                Color color = target.v50;
                ru0 = (pw_1) timeline.y80(lighting.Om0(new float[] { color.r, color.g, color.b, color.a }))
                        .mz0().Ms(manager);
            } else {
                if (world != null) {
                    world.qq0(target);
                }
                Ho0 = false;
            }
            switch (types[weather.Mf]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    setOverlay(0.0F, 0.0F, 0.0F, 0.35F);
                    break;
                case 7:
                    setOverlay(1.0F, 1.0F, 0.7F, 0.17F);
                    break;
                default:
                    setOverlay(0.0F, 0.0F, 0.0F, 0.0F);
                    break;
            }
        }
        if (Sn0 != null) {
            KV.zd();
        }
        if (particle != null) {
            particle.start();
            KV.fY(particle);
            Sn0 = particle;
        }
        ru0 = pw_1.xC().Xf0();
        I2 materials = sJ.Y3.ZD();
        while (materials.hasNext()) {
            BM material = (BM) materials.next();
            ru0.y80(ao_1.DX(material, 10, 1.0F).Om0(new float[] { lw[0], lw[1], lw[2], lw[3] }));
        }
        materials = vr.Y3.ZD();
        while (materials.hasNext()) {
            BM material = (BM) materials.next();
            ru0.y80(ao_1.DX(material, 10, 1.0F).Om0(new float[] { lw[0], lw[1], lw[2], lw[3] }));
        }
        materials = E9.Y3.ZD();
        while (materials.hasNext()) {
            BM material = (BM) materials.next();
            ru0.y80(ao_1.DX(material, 10, 1.0F).Om0(new float[] { lw[0], lw[1], lw[2], lw[3] }));
        }
        ru0.mz0().Ms(manager);
        ZK = weather;
    }

    @Override
    public final void update() {
        if (NF0.uq) {
            tw0_0.rl.wF();
            OE = ca_2.zc0;
            Ow0();
            Oz0 battle = tw0_0.LD0.he0;
            if (battle != null) {
                ML0 ui = battle.N10;
                if (ui != null) {
                    ui.GD0();
                }
            }
            tw0_0.RE0.qq();
            return;
        }
        wP.D70(lg_0.S4.uL * HC0);
        pw_1 active = ru0;
        if (active != null && !active.BJ0()) {
            return;
        }
        ru0 = null;
        XA0 special = XA0.Pb;
        if (NF0.Sv != special) {
            if (OE.dg && N10.u20() && ru0 == null) {
                if (System.currentTimeMillis() - zi0 >= 20000L && M2 == null) {
                    Tw0();
                    M2.Ms(wP);
                }
            } else {
                pw_1 idle = M2;
                if (idle != null) {
                    idle.w6 = true;
                    M2 = null;
                    pw_1.xC().Xf0()
                            .y80(ao_1.DX(FA, 4, 0.5F).kt(SG0.x, SG0.y, SG0.z))
                            .y80(ao_1.DX(FA, 9, 0.5F).kt(Lt.x, Lt.y, Lt.z))
                            .mz0().Ms(wP);
                }
                zi0 = System.currentTimeMillis();
            }
        }
        ca_2 state = OE;
        switch (ua0_2.oY[state.d3]) {
            case 17: {
                if (an0 != null) {
                    an0 = null;
                }
                while (N10.u20()) {
                    TC0 message = (TC0) NF0.Tk0.poll();
                    if (message != null) {
                        message.QC(N10);
                    } else {
                        message = (TC0) NF0.lPt9.poll();
                        if (message != null) {
                            message.QC(N10);
                        }
                    }
                    if (message == null) {
                        break;
                    }
                }
                if (N10.u20()) {
                    tw0_0.rl.wF();
                }
                return;
            }
            case 16: {
                if (pz0 == null && N10.u20() && !N10.nC0()) {
                    if (Vn0 > 0L && Zh0) {
                        tw0_0.rl.jC(new StringBuilder("Server Desync Length ")
                                .append(System.currentTimeMillis() - Vn0).append(" ms").toString(), zo_0.Dd);
                    }
                    Vn0 = 0L;
                    pz0 = NF0.D0();
                } else if (Zh0 && !N10.nC0() && Vn0 < 1L && NF0.D0() != null) {
                    Vn0 = System.currentTimeMillis();
                }
                if (pz0 != null) {
                    if (NF0.Cd0()) {
                        N10.l60(pz0);
                        pz0 = null;
                    } else {
                        PF member = NF0.Ce(pz0.Pp0, pz0.B6);
                        if (member != null) {
                            Mj roster = NF0.kd0() ? tw0_0.rl.r1(NF0.DF0) : tw0_0.rl.PC0;
                            if (roster != null && roster.sF(member.Zo0()) != null) {
                                N10.l60(pz0);
                            }
                            pz0 = null;
                        }
                    }
                }
                if (N10.u20()) {
                    TC0 message = (TC0) NF0.Tk0.poll();
                    if (message != null) {
                        message.QC(N10);
                        if (!G80) {
                            for (PF[] members : NF0.wI0) {
                                for (PF member : members) {
                                    if (member != null) {
                                        member.Tm();
                                    }
                                }
                            }
                            G80 = true;
                        }
                        if (!(message instanceof uy_2)) {
                            a10_0 data = NF0;
                            if (!data.qQ.isEmpty()) {
                                for (Object value : data.qQ.entrySet()) {
                                    Map.Entry entry = (Map.Entry) value;
                                    data.N8((b30_0) entry.getKey(), null, (short) 0);
                                }
                                data.qQ.clear();
                            }
                        }
                    } else if (G80 && pz0 == null && N10.nC0()) {
                        for (PF[] members : NF0.wI0) {
                            for (PF member : members) {
                                if (member != null) {
                                    member.y80();
                                }
                            }
                        }
                        G80 = false;
                    }
                }
                if (NF0.zL0 && N10.u20()) {
                    OE = ca_2.zc0;
                }
                return;
            }
            case 15: {
                a10_0 data = NF0;
                byte team = data.Ez0();
                for (PF member : data.wI0[team]) {
                    if (member != null && !member.zi0.hf0() && member.om0()) {
                        cg0_0 message = new cg0_0(NF0, null, member);
                        N10.lZ.add(message);
                    }
                }
                N10.H5(false, true);
                tI0();
                OE = ca_2.M6;
                return;
            }
            case 14: {
                a10_0 data = NF0;
                data.mn(data.Ez0()).jG();
                OE = ca_2.M6;
                return;
            }
            case 13: {
                a10_0 data = NF0;
                byte team = data.eI();
                for (PF member : data.wI0[team]) {
                    if (member != null && !member.zi0.hf0() && member.om0()) {
                        cg0_0 message = new cg0_0(NF0, null, member);
                        N10.lZ.add(message);
                    }
                }
                data = NF0;
                OE = data.Sv == XA0.Pb ? ca_2.cOM2 : data.m2 ? ca_2.bM : ca_2.IQ;
                w9(OE);
                N10.H5(true, true);
                return;
            }
            case 11: {
                OE = ca_2.Fr0;
                a10_0 data = NF0;
                if (data.mn(data.eI()).BE0()) {
                    data = NF0;
                    byte team = data.eI();
                    for (PF member : data.wI0[team]) {
                        if (member != null && !member.zi0.hf0() && member.om0()) {
                            cg0_0 message = new cg0_0(NF0, null, member);
                            N10.lZ.add(message);
                        }
                    }
                }
                data = NF0;
                data.mn(data.eI()).vy();
                data = NF0;
                N10.wJ(data.mn(data.eI()).BO(), "", this::lpT4);
                return;
            }
            case 9:
            case 10:
                if (N10.u20()) {
                    TC0 message = (TC0) NF0.Tk0.poll();
                    if (message != null) {
                        message.QC(N10);
                    }
                    if (NF0.zL0) {
                        OE = ca_2.zc0;
                    }
                }
                return;
            case 8:
                if (N10.nC0() || !N10.u20()) {
                    return;
                }
                for (byte slot = 0; slot < (byte) NF0.wI0[NF0.Ez0()].length; slot++) {
                    N10.Tb0[NF0.Ez0()][slot].Hm(true);
                }
                N10.X60(false);
                OE = ca_2.M6;
                return;
            case 7: {
                if (N10.nC0() || !N10.u20()) {
                    return;
                }
                a10_0 data = NF0;
                if (data.mn(data.Ez0()).BE0()) {
                    N10.H5(false, true);
                    tI0();
                    OE = ca_2.M6;
                } else {
                    w9(OE);
                    OE = ca_2.Sa0;
                    data = NF0;
                    N10.wJ(data.mn(data.Ez0()).T8(NF0), "", null);
                }
                for (byte slot = 0; slot < (byte) NF0.wI0[NF0.Ez0()].length; slot++) {
                    PF member = NF0.wI0[NF0.Ez0()][slot];
                    N10.Tb0[NF0.Ez0()][slot].z2(member);
                }
                return;
            }
            case 6:
                OE = ca_2.jr0;
                return;
            case 5: {
                a10_0 data = NF0;
                if (data.mn(data.eI()).BE0()) {
                    data = NF0;
                    OE = data.Sv == special ? ca_2.cOM2 : data.m2 ? ca_2.bM : ca_2.IQ;
                    w9(OE);
                    N10.H5(true, true);
                } else {
                    w9(OE);
                    OE = ca_2.Ve0;
                    data = NF0;
                    data.mn(data.eI()).Cq0(0, false);
                    data = NF0;
                    N10.wJ(data.mn(data.eI()).T8(NF0), "", null);
                }
                for (byte slot = 0; slot < (byte) NF0.wI0[NF0.eI()].length; slot++) {
                    PF member = NF0.wI0[NF0.eI()][slot];
                    N10.Tb0[NF0.eI()][slot].z2(member);
                }
                return;
            }
            case 4: {
                ML0 ui = N10;
                x7_0 panel = ui.Zv0;
                if (panel != null) {
                    panel.cB = false;
                }
                if (panel != null && !panel.cB) {
                    ui.u3(panel);
                    ui.Zv0.dispose();
                    ui.Zv0 = null;
                }
                w9(OE);
                OE = ca_2.NY;
                return;
            }
            case 3:
                w9(state);
                N10.F00();
                if (!NF0.a40) {
                    ML0 ui = N10;
                    if (ui.Zv0 == null) {
                        x7_0 panel = new x7_0(ui.yd0);
                        ui.Zv0 = panel;
                        ui.F9(ui.fU(), panel);
                    }
                    x7_0 panel = N10.Zv0;
                    if (panel != null) {
                        panel.cB = true;
                    }
                }
                OE = ca_2.Qy;
                return;
            case 2:
                w9(state);
                N10.lpt7();
                OE = ca_2.cP;
                return;
            case 1: {
                a10_0 data = NF0;
                xz0 = data.mn(data.eI()).a70(NF0);
                w9(OE);
                zg0_0 initial = NF0.j6;
                OE = initial == zg0_0.ef0 ? ca_2.wj : initial == zg0_0.oi ? ca_2.sR : ca_2.NY;
                return;
            }
            default:
                return;
        }
    }

    @Override
    public final void bL0() {
        if (hh.ty0() && !Ho0) {
            vo_2 world = tw0_0.LD0.Sc;
            if (world != null) {
                world.qq0(Y20);
            }
        }
        pw_1 resize = j9;
        if (resize != null) {
            if (resize.BJ0()) {
                j9 = null;
            }
            aQ();
        }
        PH.Sj(FZ);
        if (dw_2.Ba || NF0.nf == Cq.Jd) {
            lg_0.OH0.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            lg_0.OH0.glClear(16640);
        } else {
            lg_0.OH0.glClear(256);
        }
        if (tw0_0.LD0.hO == null && tw0_0.PK0 != null) {
            ql_0 viewport = FZ;
            CI0.r40((int) viewport.j80, (int) viewport.Wm0, (int) viewport.IA, (int) viewport.Eu0);
            if (fB != null && vJ0 && fo) {
                float limit = ze;
                Bp0 progress = Y70;
                float x = progress.x;
                if (limit > x) {
                    progress.x = x + lg_0.S4.uL;
                }
                float y = progress.y;
                if (limit > y) {
                    progress.y = y + lg_0.S4.uL;
                }
                PH.Sj(FZ);
                C5.LH = 1.0F;
                C5.Ka0(256.0F, 200.0F, false);
                C5.R1(true);
                To0.Po(C5.iJ);
                To0.W30();
                To0.getClass();
                hl0_1 batch = To0;
                Color color = ho;
                batch.oH.set(color);
                batch.og = color.toFloatBits();
                To0.Ya0(fB, 0.0F, 0.0F,
                        (int) (Y70.x * 100.0F * sy0.x), (int) (Y70.y * 100.0F * sy0.y), 256, 200);
                To0.end();
                PH.eF();
            }
            o4.jK(FA);
            float delta = lg_0.S4.uL;
            float time = GF0 + delta;
            GF0 = time;
            s3 += delta;
            sJ.P30(time, null);
            if (dw_2.Ba && !fo || NF0.nf == Cq.Jd) {
                o4.Lh0(sJ, qe);
            }
            if (!RH) {
                o4.Lh0(vr, qe);
                o4.Lh0(E9, qe);
            }
            o4.end();
            o4.jK(FA);
            OB0.update();
            OB0.begin();
            OB0.me0();
            OB0.end();
            o4.eo0(OB0);
            KV.update();
            KV.begin();
            KV.me0();
            KV.end();
            o4.eo0(KV);
            Dm.update();
            Dm.begin();
            Dm.me0();
            Dm.end();
            o4.eo0(Dm);
            for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
                if (NF0.mn(team).v10() == null) {
                    continue;
                }
                if (NF0.mn(team).BE0() && !BI) {
                    continue;
                }
                NF0.mn(team).LPT7();
                for (Object value : NF0.mn(team).v10()) {
                    com3__3 sprite = (com3__3) value;
                    BJ0 camera = FA;
                    sprite.DB0(camera.v40, camera.St0);
                    sprite.GA(lg_0.S4.uL);
                    sprite.OF0(0.01F);
                    sprite.Vg();
                    o4.eo0(sprite);
                }
            }
            ArrayList selected = N10.H20;
            for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
                for (byte slot = 0; slot < NF0.wI0[team].length; slot++) {
                    PF member = NF0.Ce(team, slot);
                    if (member == null || !NF0.mn(team).BE0() || member.LpT9 == null) {
                        continue;
                    }
                    xt_0 pending = member.nl;
                    if (pending != null) {
                        lg_0.k.lPT5(pending);
                    }
                    if (member.Sc0 != null) {
                        yh_0 effects = yh_0.Xm0;
                        Wr clock = effects.dI0;
                        if (clock == null) {
                            clock = new Wr(new tn_0(effects));
                            effects.dI0 = clock;
                        }
                        clock.Ik = hk0_1.KG;
                    }
                    com3__3[] variants = member.BG;
                    for (int i = 0; i < variants.length; i++) {
                        com3__3 sprite = variants[i];
                        if (sprite == null) {
                            continue;
                        }
                        sprite.GA(lg_0.S4.uL);
                        BJ0 camera = FA;
                        sprite.DB0(camera.v40, camera.St0);
                        C8 source = sprite.j;
                        C8 position = T3.hf(source, source);
                        com3__3 highlight = null;
                        if (selected.contains(b30_0.U5(team, slot))) {
                            float size = sprite.im + 0.0005F;
                            highlight = new com3__3(sprite);
                            highlight.nu(1.0F, 1.0F, 0.0F, 1.0F);
                            highlight.Qw0(size, size);
                        } else if (NF0.wI0[team].length > 1 && b30_0.U5(team, slot) == N10.Ru) {
                            float size = sprite.im + 0.0005F;
                            highlight = new com3__3(sprite);
                            Color cyan = Color.CYAN;
                            Rv0 effect = highlight.Cf0;
                            if (effect != null) {
                                effect.Vr.set(cyan);
                            }
                            highlight.Qw0(size, size);
                        }
                        if (highlight != null) {
                            if (member.COm2()) {
                                highlight.zf0(position.x, position.y + 0.005F, position.z - 0.02F);
                            } else {
                                highlight.zf0(position.x, position.y + 0.015F, position.z - 0.005F);
                            }
                            camera = FA;
                            highlight.DB0(camera.v40, camera.St0);
                            highlight.Vg();
                            o4.eo0(highlight);
                        }
                        if (!member.ea0 && variants[i] == member.LpT9 && NF0.wI0[team].length < 5
                                && sprite.MI0().a > 0.0F) {
                            float elevation = (position.y - 3.1F) / 2.0F;
                            float size = sprite.oW.x / 0.01F + elevation;
                            com3__3 shadow = new com3__3(sprite);
                            yh_0 effects = yh_0.Xm0;
                            short species = member.p10();
                            boolean allied = team == NF0.Ez0();
                            C8 offset = effects.L4(species, allied);
                            C8 shadowPosition = new C8(position);
                            float xOffset = team == NF0.Ez0() ? 0.0F : -0.075F;
                            float zOffset;
                            if (team == NF0.Ez0()) {
                                zOffset = offset.y + 0.65F;
                            } else {
                                float base = offset != yh_0.Hz0 && offset.y < 0.0F ? 0.7F : 0.8F;
                                zOffset = base + offset.y;
                            }
                            C8 transformed = shadowPosition.Vy(xOffset, 0.0F, zOffset);
                            transformed.y = 2.6F;
                            shadow.CQ.v50.set(1.0F, 1.0F, 1.0F, 0.25F);
                            size *= 0.015F;
                            shadow.Qw0(size, size);
                            shadow.qr0(transformed);
                            shadow.uF.Ox0(C8.X, -90.0F);
                            shadow.TM = false;
                            shadow.nu(0.0F, 0.0F, 0.0F, 1.0F);
                            shadow.Vg();
                            o4.eo0(shadow);
                        }
                        o4.eo0(sprite);
                    }
                }
            }
            ArrayList billboards = A6;
            if (billboards != null && billboards.size() > 0) {
                for (Object value : A6) {
                    lc_0 sprite = (lc_0) value;
                    sprite.GF();
                    BJ0 camera = FA;
                    C8 position = camera.v40;
                    C8 cameraUp = camera.St0;
                    C8 forward = HG.Wd;
                    copyVector(forward, position);
                    C8 origin = sprite.ei0;
                    forward.Vy(origin.x, origin.y, origin.z).KM();
                    C8 right = HG.BJ;
                    copyVector(right, cameraUp);
                    right.Xv0(forward).KM();
                    C8 up = HG.hn0;
                    copyVector(up, forward);
                    up.Xv0(right).KM();
                    sprite.uj.WA0(false, right.x, up.x, forward.x,
                            right.y, up.y, forward.y, right.z, up.z, forward.z);
                    sprite.vP = false;
                    TO.ni0(sprite);
                }
            }
            d3 extra = tz0;
            if (extra != null) {
                extra.T30(TO, FA);
            }
            TO.JF0();
            o4.end();
            int width = lg_0.S4.Kr0();
            int height = lg_0.S4.sD0();
            CI0.r40(0, 0, width, height);
        }
        MU active = aY;
        if (active != null) {
            if (active.Bv0(false)) {
                N10.H5(false, false);
            }
            if (aY.Bv0(true)) {
                N10.H5(true, false);
            }
            aY.ZS();
            if (aY.bL()) {
                if (aY.Bv0(false)) {
                    N10.H5(false, true);
                }
                if (aY.Bv0(true)) {
                    N10.H5(true, true);
                }
                aY = null;
            }
        }
        ArrayList<Map.Entry> completed = new ArrayList<>();
        for (Object value : OC0.entrySet()) {
            Map.Entry entry = (Map.Entry) value;
            MU animation = (MU) entry.getValue();
            if (animation != null) {
                animation.ZS();
                if (animation.bL()) {
                    completed.add(entry);
                }
            }
        }
        for (Map.Entry entry : completed) {
            OC0.remove(entry.getKey());
        }
        if (tw0_0.Eu(3) && lpt3__1.RJ) {
            if (lg_0.lW.nI0(31) && lg_0.lW.eC0(59)) {
                JM(true, true);
            } else if (lg_0.lW.nI0(30) && lg_0.lW.eC0(59)) {
                u40++;
                Wi0();
            } else if (lg_0.lW.nI0(92) && lg_0.lW.eC0(59)) {
                qk_2.cR = new qk_2();
            } else if (lg_0.lW.nI0(7) && lg_0.lW.eC0(59)) {
                C8 position = Lt;
                FA.rj.np(position);
                FA.zo0 = 50.0F;
                FA.Q30 = -5.0F;
                FA.Rg0 = 3.0F;
                FA.Wu0 = 0.1F;
                SG0.y = 3.45F;
                position.y = 3.2F;
                FA.JP(SG0.x, SG0.y, SG0.z);
                FA.ye(true);
                pw_1 idle = M2;
                if (idle != null) {
                    idle.w6 = true;
                }
                M2 = null;
            } else if (lg_0.lW.nI0(31) && lg_0.lW.eC0(59)) {
                zi0 = System.currentTimeMillis() + 120000L;
                pw_1 idle = M2;
                if (idle != null) {
                    idle.w6 = true;
                    M2 = null;
                    pw_1.xC().Xf0()
                            .y80(ao_1.DX(FA, 4, 0.5F).kt(SG0.x, SG0.y, SG0.z))
                            .y80(ao_1.DX(FA, 9, 0.5F).kt(Lt.x, Lt.y, Lt.z))
                            .mz0().Ms(wP);
                }
                for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
                    for (byte slot = 0; slot < NF0.wI0[team].length; slot++) {
                        PF member = NF0.Ce(team, slot);
                        if (member != null) {
                            member.nm0();
                        }
                    }
                }
            } else if (lg_0.lW.nI0(8) && lg_0.lW.eC0(59)) {
                ii0_1 manager = tw0_0.LD0.Ov;
                int count = manager.n10.size();
                for (int i = 0; i < count; i++) {
                    ((D2) manager.n10.get(i)).w6 = true;
                }
                pw_1 timeline = ru0;
                if (timeline != null) {
                    timeline.w6 = true;
                }
                w9(ca_2.x0);
            } else if (lg_0.lW.nI0(9) && lg_0.lW.eC0(59)) {
                w9(ca_2.IQ);
            } else if (lg_0.lW.nI0(10) && lg_0.lW.eC0(59)) {
                ca_2 state = ca_2.jr0;
                OE = state;
                w9(state);
            } else if (lg_0.lW.nI0(11) && lg_0.lW.eC0(59)) {
                R9(NF0.eI(), 0.0F, (byte) 0);
            } else if (lg_0.lW.nI0(46) && lg_0.lW.eC0(59)) {
                Tw0();
                M2.Ms(wP);
            }
        }
        PH.eF();
        ca_2 state = OE;
        if (state == ca_2.jr0 || state == ca_2.Sa0 || NF0.Sv == XA0.Pb) {
            if (!tw0_0.kz0()) {
                PH.Sj(FZ);
            }
            float scale = 1.0F / (FZ.Eu0 / 133.0F);
            C5.LH = scale;
            C5.Ka0((float) lg_0.S4.Kr0(), (float) lg_0.S4.sD0(), true);
            float height = lg_0.S4.sD0() * scale;
            ql_0 viewport = FZ;
            height -= viewport.Wm0 * scale;
            float x = -viewport.j80 * scale;
            float y = -height + 80.0F;
            C5.v40.na(x, y, 0.0F);
            C5.R1(true);
            To0.Po(C5.iJ);
            To0.W30();
            for (byte team = 0; team < (byte) NF0.wI0.length; team++) {
                NF0.mn(team).Wa0(To0);
            }
            To0.end();
            if (!tw0_0.kz0()) {
                PH.eF();
            }
        }
    }

    private static void copyVector(C8 destination, C8 source) {
        destination.getClass();
        float x = source.x;
        float y = source.y;
        float z = source.z;
        destination.x = x;
        destination.y = y;
        destination.z = z;
    }
}
