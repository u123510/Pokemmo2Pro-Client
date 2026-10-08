package cn.pokemmo.scene.cutscene;

import f.*;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;

public class Abstract3DCutsceneScene extends vj_0 {
    public static final vv0_0 COM2;
    public final int RF;
    public final boolean Oe;
    public float Ss;
    public int eC;
    public int hc0;
    public final es_1 sg;
    public Gv0 R6;
    public es_1 Sa;
    public ff_0 Zd0;

    static {
        Cq0.E1(Abstract3DCutsceneScene.class);
        COM2 = by_0.wD;
    }

    public Abstract3DCutsceneScene(int scene, boolean repeat) {
        super(true);
        Ss = 80.0F;
        eC = 30;
        hc0 = 0;
        sg = new es_1();
        RF = scene;
        Oe = repeat;
        if (scene != 19) I0.set(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public static XD Xv(int scene, short ignored, boolean repeat) {
        if (scene == 0 || scene == 1 || scene == 5 || scene == 7 || scene == 8) return null;
        if (scene == 30) return new uv_1();
        return new XD(scene, repeat);
    }

    public static void P7(Xz0 node, String name) {
        if (name != null && !node.mw.equals(name)) {
            I2 children = node.yn.ZD();
            while (children.hasNext()) P7((Xz0) children.next(), name);
            return;
        }
        I2 parts = node.sJ0.ZD();
        while (parts.hasNext()) ((I20) parts.next()).eh = false;
        I2 children = node.yn.ZD();
        while (children.hasNext()) P7((Xz0) children.next(), null);
    }

    public void ux() {
        FJ archive = new FJ((Ae) tw0_0.Ll0.Qz0.fd0.dg.get("/a/1/6/0"));
        int scene = RF;
        switch (scene) {
            case 2:
                sg.Ue0(load(archive, 0, new int[]{-1, 1, -1, -1}, 0));
                sg.Ue0(load(archive, 3, new int[]{2, 4, -1, -1}, 0));
                sg.Ue0(load(archive, 6, new int[]{5, 7, -1, -1}, 0));
                R6 = new Gv0(archive.GJ(10));
                eC = 30;
                Ss = 40.0F;
                break;
            case 3: {
                int base = 63;
                int season = 0;
                c8_0 clock = c8_0.JD0;
                byte time = clock.YG();
                if (time == 0) base = 65;
                else if (time == 1) base = 67;
                else if (time == 3) base = 69;
                int kind = ia0_2.XC[clock.S7.om];
                if (kind == 1) season = 1;
                else if (kind == 2 || kind == 3) season = 2;
                sg.Ue0(load(archive, base, new int[]{-1, base + 1, -1, -1}, 0));
                sg.Ue0(load(archive, 71, new int[]{-1, -1, season + 72, -1}, 0));
                sg.Ue0(load(archive, 76, new int[]{75, -1, -1, -1}, 0));
                sg.Ue0(load(archive, 78, new int[]{77, -1, -1, -1}, 0));
                R6 = new Gv0(archive.GJ(79));
                eC = 30;
                Ss = 40.0F;
                break;
            }
            case 4:
                sg.Ue0(load(archive, 97, new int[]{-1, 98, -1, -1}, 0));
                sg.Ue0(load(archive, 100, new int[]{99, 101, -1, -1}, 0));
                sg.Ue0(load(archive, 103, new int[]{-1, -1, -1, -1}, 0));
                R6 = new Gv0(archive.GJ(104));
                Ss = 40.0F;
                eC = 30;
                break;
            case 6:
                sg.Ue0(load(archive, 135, new int[]{133, -1, -1, 134}, 0));
                sg.Ue0(load(archive, 138, new int[]{136, -1, -1, 137}, 0));
                sg.Ue0(load(archive, 142, new int[]{140, -1, -1, 141}, 0));
                R6 = new Gv0(archive.GJ(132));
                eC = 60;
                Ss = 80.0F;
                break;
            case 7:
                sg.Ue0(load(archive, 38, new int[]{36, 39, -1, 37}, 1));
                sg.Ue0(load(archive, 42, new int[]{40, 43, -1, 41}, 0));
                sg.Ue0(load(archive, 48, new int[]{46, 49, -1, 47}, 0));
                R6 = new Gv0(archive.GJ(45));
                Ss = 20.0F;
                eC = 30;
                break;
            case 8:
                sg.Ue0(load(archive, 52, new int[]{50, 53, -1, 51}, 1));
                sg.Ue0(load(archive, 55, new int[]{53, 56, -1, 54}, 0));
                sg.Ue0(load(archive, 61, new int[]{59, 62, -1, 60}, 0));
                R6 = new Gv0(archive.GJ(58));
                Ss = 20.0F;
                eC = 30;
                break;
            case 9:
                sg.Ue0(load(archive, 146, new int[]{145, 147}, 0));
                sg.Ue0(load(archive, 150, new int[]{148, -1, 151, -1}, 1));
                sg.Ue0(load(archive, 154, new int[]{152, 155, 156, 153}, 0));
                R6 = new Gv0(archive.GJ(157));
                eC = 30;
                Ss = 80.0F;
                break;
            case 10:
                sg.Ue0(load(archive, 159, new int[]{158, 160}, 0));
                sg.Ue0(load(archive, 163, new int[]{161, -1, 164, -1}, 1));
                sg.Ue0(load(archive, 167, new int[]{165, 168, 169, 166}, 0));
                R6 = new Gv0(archive.GJ(170));
                eC = 30;
                Ss = 80.0F;
                break;
            case 11:
                sg.Ue0(load(archive, 172, new int[]{171, 173, 174}, 0));
                sg.Ue0(load(archive, 177, new int[]{175, -1, -1, 176}, 1));
                sg.Ue0(load(archive, 180, new int[]{178, 181, -1, 179}, 0));
                R6 = new Gv0(archive.GJ(182));
                eC = 30;
                Ss = 80.0F;
                break;
            case 12:
                sg.Ue0(load(archive, 184, new int[]{183, 185, 186}, 0));
                sg.Ue0(load(archive, 189, new int[]{187, -1, -1, 188}, 1));
                sg.Ue0(load(archive, 192, new int[]{190, 193, -1, 191}, 0));
                R6 = new Gv0(archive.GJ(195));
                eC = 30;
                Ss = 80.0F;
                break;
            case 13:
            case 14: {
                int offset = scene == 14 ? 8 : 0;
                Lw0(load(archive, offset + 198, new int[]{offset + 196, offset + 199, offset + 200, offset + 197}, 0));
                Lw0(load(archive, offset + 202, new int[]{offset + 201, -1, -1, -1}, 2));
                R6 = new Gv0(archive.EG(offset + 203));
                eC = 30;
                Ss = 40.0F;
                break;
            }
            case 15: {
                sg.Ue0(load(archive, 213, new int[]{212, 214, -1, -1}, 0));
                sg.Ue0(load(archive, 222, new int[]{221, 223, -1, -1}, 0));
                Ou0 model = load(archive, 215, new int[]{217, 216}, 0);
                Pv0 time = c8_0.JD0.S7;
                if (time != Pv0.o6 && time != Pv0.cY) {
                    P7((Xz0) model.ZE0.get(0), "hiru1");
                    P7((Xz0) model.ZE0.get(0), "hiru2");
                }
                if (time != Pv0.P70) P7((Xz0) model.ZE0.get(0), "yuu");
                if (time != Pv0.Vd && time != Pv0.throws$) P7((Xz0) model.ZE0.get(0), "yoru");
                sg.Ue0(model);
                R6 = new Gv0(archive.GJ(224));
                eC = 30;
                Ss = 80.0F;
                break;
            }
            case 16:
                sg.Ue0(load(archive, 242, new int[]{-1, 243, -1, -1}, 0));
                sg.Ue0(load(archive, 245, new int[]{244, 246, -1, -1}, 0));
                sg.Ue0(load(archive, 247, new int[]{-1, -1, -1, -1}, 0));
                R6 = new Gv0(archive.GJ(248));
                Ss = 40.0F;
                eC = 30;
                break;
            case 17:
            case 18: {
                int offset = scene == 18 ? 8 : 0;
                Lw0(load(archive, 227 + offset, new int[]{226 + offset, -1, 228 + offset, -1}, 2));
                Lw0(load(archive, 230 + offset, new int[]{229 + offset}, 2));
                Lw0(load(archive, 232 + offset, new int[]{231 + offset, -1, -1, -1}, 0));
                R6 = new Gv0(archive.EG(233 + offset));
                eC = 30;
                break;
            }
            case 19:
            case 20:
            case 21:
                sg.Ue0(load(archive, 227, new int[]{226, -1, 228, -1}, 1));
                sg.Ue0(load(archive, 230, new int[]{229}, 1));
                if (scene != 19) sg.Ue0(load(archive, 232, new int[]{231, -1, -1, -1}, 0));
                R6 = new Gv0(archive.GJ(233));
                eC = 30;
                scene = 17;
                if (RF == 19) do$();
                else if (RF == 21) Jg0();
                else snow();
                break;
            default:
                break;
        }
        Sa = OJ0.t1.n8(scene).lY();
    }

    private static Ou0 load(FJ archive, int index, int[] animations, int mode) {
        v80_0.Cb0().getClass();
        if (mode == 1) return v80_0.PC0(archive, index, true, true, false, animations);
        if (mode == 2) return v80_0.xL0(archive, index, animations);
        return v80_0.CW(archive, index, animations);
    }

    private void effects() {
        BH.LPT8(new PRN_(PRN_.YI0, 0.0F, 0.0F, 0.0F, 1.0F));
        Zd0 = new ff_0(fC0, 0);
        Zd0.nI(tw0_0.Ll0.Qz0);
        ym0.Ue0(Zd0);
    }

    private void place(Ou0 model, float x, float y, float z, float scale) {
        Ou0 copy = tq0_0.ip0(model, model);
        copy.I0 = true;
        copy.ho.el0(x, y, z);
        copy.ho.hr(scale);
        sg.Ue0(copy);
    }

    private void snow() {
        effects();
        ParticleEffectExt snow = Zd0.UH0("weather/snow");
        snow.init();
        snow.start();
        Zd0.fY(snow);
        Ou0 first = UT.oV().jK(2340);
        Ou0 second = UT.oV().jK(2350);
        Ou0 third = UT.oV().jK(2360);
        Ou0 fourth = UT.oV().jK(2370);
        es_1 positions = new es_1();
        positions.Ue0(new C8(-0.85F, 0.0F, -0.5F));
        positions.Ue0(new C8(-0.4F, 0.0F, -0.77F));
        positions.Ue0(new C8(0.8F, 0.0F, -0.3F));
        positions.Ue0(new C8(0.4F, 0.0F, -0.3F));
        I2 iterator = positions.ZD();
        while (iterator.hasNext()) {
            C8 position = (C8) iterator.next();
            place(first, position.x - 0.21F, position.y, position.z + 0.1F, 1.3F);
            place(second, position.x, position.y, position.z + 0.0F, 1.4F);
            place(third, position.x + 0.25F, position.y, position.z - 0.1F, 1.2F);
            place(fourth, position.x, position.y, position.z + 0.25F, 1.0F);
        }
    }

    public final void gf0() {
        super.gf0();
        hc0 = 0;
        boolean repeat = RF == 21;
        I2 models = sg.ZD();
        while (models.hasNext()) {
            Ou0 model = (Ou0) models.next();
            model.EG();
            model.TI(repeat);
        }
    }

    public final boolean zr0() {
        return RF >= 2 && RF <= 16;
    }

    public boolean Lpt1() {
        Gv0 animation = R6;
        return animation != null && hc0 >= animation.ds && !Oe;
    }

    public final void update() {
        super.update();
        hc0 = (int) Math.floor(ru0 * eC);
        if (hc0 >= 2850 && RF == 6 && sg.KB > 0) ((Ou0) sg.get(0)).EG();
        pG0();
        Gv0 animation = R6;
        if (animation != null && hc0 >= animation.ds && Oe) gf0();
        I2 models = sg.ZD();
        while (models.hasNext()) ((Ou0) models.next()).v3(ru0, Qj);
        Qj = 0.0F;
        if (Sa != null) {
            int frame = (int) Math.floor(ru0 * eC);
            es_1 fired = new es_1();
            for (int i = 0; i < Sa.KB; i++) {
                dj0_2 cue = (dj0_2) Sa.get(i);
                if (frame < cue.L9) continue;
                switch (cue.oq) {
                    case 1:
                        tw0_0.RE0.d00(true, (byte) 2, cue.G00, 0.0F);
                        break;
                    case 6:
                        tw0_0.RE0.Eh((byte) 2, cue.G00, true, true);
                        break;
                    case 8:
                        tw0_0.RE0.qq();
                        break;
                    case 14: {
                        iw_1 previous = tw0_0.FL.Py0();
                        if (previous != null) previous.wQ();
                        String message = sm0_0.Bw((byte) 2, lpt6__2.Q80, cue.G00, cue.lPt2, sm0_0.zb0);
                        pk0_0 messages = tw0_0.FL;
                        jm_1 style = jm_1.hK;
                        CH0 id = CH0.j1;
                        messages.getClass();
                        messages.iQ(new kt_0(message, style, id, null));
                        d9 = true;
                        break;
                    }
                    default:
                        break;
                }
                fired.Ue0(cue);
            }
            Sa.fp0(fired, true);
        }
    }

    public void i5() {
        OB0.A80(sg, BH);
        ff_0 effects = Zd0;
        if (effects != null) {
            effects.begin();
            Zd0.update();
            Zd0.me0();
            Zd0.end();
            OB0.eo0(Zd0);
        }
    }

    public void pG0() {
        fC0.Wu0 = RF == 6 ? 0.001F : 0.01F;
        fC0.Qy = 200.0F;
        if (RF == 19) fC0.Qy = 10.0F;
        fC0.zo0 = Ss;
        fC0.d00 = 0.0F;
        fC0.Q30 = 0.0F;
        Gv0 animation = R6;
        if (animation == null) return;
        float x = animation.Fx0(3, hc0);
        float y = R6.Fx0(4, hc0);
        float z = R6.Fx0(5, hc0);
        float pitch = R6.Fx0(0, hc0);
        float yaw = R6.Fx0(1, hc0);
        float roll = R6.Fx0(2, hc0);
        if (Hd) {
            float nextX = R6.Fx0(3, hc0 + 1);
            float nextY = R6.Fx0(4, hc0 + 1);
            float nextZ = R6.Fx0(5, hc0 + 1);
            float nextPitch = R6.Fx0(0, hc0 + 1);
            float nextYaw = R6.Fx0(1, hc0 + 1);
            float nextRoll = R6.Fx0(2, hc0 + 1);
            float fraction = ru0 * eC - hc0;
            float positionDelta = Math.abs(x - nextX);
            positionDelta = Math.abs(y - nextY) + positionDelta;
            positionDelta = Math.abs(z - nextZ) + positionDelta;
            float rotationDelta = Math.abs(pitch - nextPitch);
            rotationDelta = Math.abs(yaw - nextYaw) + rotationDelta;
            rotationDelta = Math.abs(roll - nextRoll) + rotationDelta;
            if (rotationDelta < 10.0F && positionDelta < 10.0F && fraction <= 1.0F && fraction >= 0.0F) {
                float difference = nextX - x;
                COM2.getClass();
                x = difference * fraction + x;
                y = fe_2.Ga0(nextY, y, fraction, y);
                z = fe_2.Ga0(nextZ, z, fraction, z);
                pitch = fe_2.Ga0(nextPitch, pitch, fraction, pitch);
                yaw = fe_2.Ga0(nextYaw, yaw, fraction, yaw);
                roll = fe_2.Ga0(nextRoll, roll, fraction, roll);
            }
        }
        fC0.jd0.x = 0.0F;
        fC0.jd0.y = 0.0F;
        fC0.jd0.z = -1.0F;
        fC0.v40.x = x / 64.0F;
        fC0.v40.y = y / 64.0F;
        fC0.v40.z = z / 64.0F;
        C8 yAxis = C8.Y;
        fC0.St0.np(yAxis);
        C8 xAxis = C8.X;
        fC0.jd0.YO(xAxis, pitch);
        fC0.St0.YO(xAxis, pitch);
        fC0.jd0.YO(yAxis, yaw);
        fC0.St0.YO(yAxis, yaw);
        C8 zAxis = C8.Z;
        fC0.jd0.YO(zAxis, roll);
        fC0.St0.YO(zAxis, roll);
        fC0.ye(true);
    }

    public final void Lw0(Ou0 model) {
        sg.Ue0(model);
    }

    public final void dispose() {
        super.dispose();
        I2 models = sg.ZD();
        while (models.hasNext()) ((Ou0) models.next()).O4();
        sg.clear();
    }

    public final void Jg0() {
        effects();
        Ou0 base = UT.oV().jK(2400);
        Ou0 decoration = UT.oV().jK(2380);
        es_1 positions = new es_1();
        positions.Ue0(new C8(-0.85F, 0.0F, -0.5F));
        positions.Ue0(new C8(-0.4F, 0.3F, -0.77F));
        positions.Ue0(new C8(0.8F, 0.0F, -0.3F));
        positions.Ue0(new C8(0.4F, 1.0F, -0.3F));
        place(base, 0.0F, 0.0F, -2.0F, 1.3F);
        Ou0 copy = base.Ma0();
        copy.ho.CN(C8.Y, 25.0F);
        copy.ho.el0(-3.0F, 0.0F, -2.0F);
        copy.ho.hr(1.3F);
        sg.Ue0(copy);
        I2 iterator = positions.ZD();
        while (iterator.hasNext()) {
            C8 position = (C8) iterator.next();
            U7 item = (U7) decoration.Ma0();
            sg.Ue0(item);
            item.ho.el0(position.x, position.y, position.z);
            item.ho.hr(1.1F);
            item.TI(true);
            item.vI = Pv0.Vd;
        }
    }

    public final void do$() {
        effects();
        ParticleEffectExt particles = Zd0.UH0("special/login_hween");
        particles.init();
        particles.start();
        Zd0.fY(particles);
        UF.v50.set(0.6F, 0.6F, 0.6F, 1.0F);
        es_1 positions = new es_1();
        positions.Ue0(new C8(-2.0F, 0.5F, -1.75F));
        positions.Ue0(new C8(-1.0F, 1.25F, -1.5F));
        positions.Ue0(new C8(-0.5F, 1.0F, -3.0F));
        positions.Ue0(new C8(2.0F, 0.75F, -1.75F));
        positions.Ue0(new C8(1.0F, 1.1F, -1.5F));
        positions.Ue0(new C8(0.5F, 0.9F, -3.0F));
        es_1 scales = new es_1();
        scales.Ue0(1.0F);
        scales.Ue0(1.5F);
        scales.Ue0(0.75F);
        scales.Ue0(1.0F);
        scales.Ue0(1.5F);
        scales.Ue0(0.75F);
        es_1 periods = new es_1();
        periods.Ue0(1.6F);
        periods.Ue0(2.3F);
        periods.Ue0(1.75F);
        periods.Ue0(2.0F);
        periods.Ue0(1.9F);
        periods.Ue0(2.5F);
        for (int i = 0; i < positions.KB; i++) {
            C8 position = (C8) positions.get(i);
            float scale = (Float) scales.get(i) / 64.0F;
            ut_0 texture = UT.oV().Ji0(0, eb0_1.Y30, "pumpkin");
            float period = (Float) periods.get(i);
            Ts0 first = new Ts0(texture, Zd0, scale, period, position, false);
            C8 axis = C8.Y;
            first.ho.CN(axis, rg0_2.r4(6) - 5);
            first.ho.Y1(position);
            Ts0 second = new Ts0(texture, Zd0, scale, period, position, true);
            second.ho.CN(axis, rg0_2.r4(6) - 5);
            second.ho.Y1(position);
            sg.Ue0(first);
            sg.Ue0(second);
        }
    }
}
