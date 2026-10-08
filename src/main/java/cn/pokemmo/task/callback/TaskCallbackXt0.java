package cn.pokemmo.task.callback;

import f.*;

import com.badlogic.gdx.graphics.Texture;

public class TaskCallbackXt0 implements fy0_0, Runnable  {
    public static final i00_0 Ky0;
    public static final Bp0 t5;
    public static final Bp0 Jf;
    public static ui_1 gK;

    public final Tt0 BY;
    public final Gt0 qI0;
    public final Rk0 em;
    public final mm_1 JY;
    public final E3 fa;
    public final mm_1 oL;

    public boolean Ot0 = false;
    public D30 t2;
    public PC0 Cd;
    public na_0 Fv0;
    public LPT6_ DM;
    public D30 pg0;
    public B5[] yb0;
    public float cOm4 = 1.0f;
    public int No0 = 0;
    public boolean PP = true;
    public boolean rF = true;
    public boolean coM9 = true;
    public boolean qC = true;
    public int Com3;
    public int IT = 0;
    public boolean rs0 = false;
    public float a30 = 0.0f;
    public float B0 = 1.0f;
    public int LpT3 = 192;
    public int Uy0 = 128;
    public final es_1 DA0 = new es_1();
    public final com7__3 jG0 = new com7__3();
    public final Bp0 k = new Bp0(0.0f, 0.0f);

    static {
        Ky0 = new i00_0();
        t5 = new Bp0();
        Jf = new Bp0();
    }

    public static void init() {
        gK = new ui_1(32);
    }

    public TaskCallbackXt0(Tt0 v1, Gt0 v2, Rk0 v3, mm_1 v4, E3 v5, mm_1 v6) {
        this.BY = v1;
        this.qI0 = v2;
        this.em = v3;
        this.JY = v4;
        this.fa = v5;
        this.oL = v6;
    }

    public final void j9(float f1) {
        if (this.Fv0 == null) {
            this.cOm4 = LW.r1(f1, 1.0f, 4.0f);
            return;
        }
        throw new IllegalStateException();
    }

    public final LPT6_ yq() {
        if (this.Fv0 == null) {
            float scale = this.cOm4;
            int width = (int) (this.LpT3 * scale);
            int height = (int) (this.Uy0 * scale);
            na_0 fbo = new na_0(ix0_0.Vw, width, height, false);
            this.Fv0 = fbo;
            ((Texture) ((lq_2) fbo.f1.KI())).setFilter(eb0_1.Y30, eb0_1.Y30);
            PC0 cam = new PC0(this.LpT3 * scale, this.Uy0 * scale);
            this.Cd = cam;
            cam.Ka0(this.LpT3 * scale, this.Uy0 * scale, true);
            float yOffset = (this.Uy0 * 0.75f * this.cOm4) / 2.0f;
            if (this.fa == null) {
                yOffset = 0.0f;
            }
            this.Cd.v40.x = 0.0f;
            this.Cd.v40.y = yOffset;
            this.Cd.v40.z = 0.1f;
            this.Cd.Y90(0.0f, yOffset, 0.0f);
            this.Cd.R1(true);
            LPT6_ region = new LPT6_((Texture) ((lq_2) this.Fv0.f1.KI()));
            this.DM = region;
            region.Wu0(true, false);
            if (this.pg0 == null) {
                Bp0 bp1 = new Bp0();
                Bp0 bp2 = new Bp0();
                int numParts = this.em.bs0.j2;
                es_1 rectList = new es_1();
                for (int i6 = 0; i6 < this.em.bs0.j2; i6++) {
                    this.em.DX(i6, bp1, bp2);
                    rectList.Ue0(new ql_0(0.0f, 0.0f, bp1.x, bp1.y));
                }
                int atlasW = 256;
                int atlasH = 1024;
                int maxW = 0;
                int maxH = 0;
                int curX = 0;
                int curY = 0;
                for (int i11 = numParts - 1; i11 >= 0; i11--) {
                    ql_0 rect = (ql_0) rectList.Tx0(i11);
                    int rw = (int) rect.IA + 4;
                    int rh = (int) rect.Eu0 + 4;
                    if (curX + rw > atlasW) {
                        curY += rh;
                        if (curY > atlasH - rh) {
                            break;
                        }
                        curX = 0;
                    }
                    rect.j80 = curX;
                    rect.Wm0 = curY;
                    curX += rw;
                    maxW = Math.max(maxW, curX);
                    maxH = Math.max(maxH, curY + rh);
                }
                LJ0 packer = new LJ0(maxW, maxH, ix0_0.Vw, 1, false);
                for (int i4 = 0; i4 < this.em.bs0.j2; i4++) {
                    this.em.DX(i4, bp1, bp2);
                    i4_0 pixmap = new i4_0((int) bp1.x, (int) bp1.y, ix0_0.Vw);
                    this.em.else$(i4, this.qI0, this.BY, pixmap, bp2);
                    packer.y9(Integer.toString(i4), pixmap);
                    pixmap.dispose();
                }
                eb0_1 filter = eb0_1.Y30;
                D30 atlas;
                synchronized (packer) {
                    atlas = new D30();
                    packer.DD(atlas, filter, filter);
                }
                this.pg0 = atlas;
                packer.dispose();
                this.yb0 = new B5[this.em.bs0.j2];
                for (int i1 = 0; i1 < this.em.bs0.j2; i1++) {
                    B5 sprite = new B5((LPT6_) this.pg0.kE.get(i1));
                    sprite.ak0(0.0f, curX * 0.05f);
                    this.yb0[i1] = sprite;
                }
            }
        }
        return this.DM;
    }

    @Override
    public final void run() {
        if (this.Ot0) {
            return;
        }
        if (!this.rs0) {
            this.Com3 = this.oL.yq0(this.No0);
            if (!this.PP && this.JY != null) {
                this.Com3 = Math.min(this.oL.yq0(this.No0), this.JY.yq0(this.No0));
            }
            float f1;
            if (this.rF) {
                f1 = (float) rg0_2.r4(this.Com3) / 60.0f;
            } else {
                f1 = 0.0f;
            }
            this.a30 = f1;
        }
        if (this.coM9 && this.qC) {
            this.a30 += lg_0.S4.uL * this.B0;
        }
        int i1 = (int) Math.floor(this.a30 * 60.0f);
        while (i1 >= this.Com3) {
            if (this.PP) {
                i1 -= this.Com3;
            } else {
                i1 = this.Com3 - 1;
            }
        }
        this.qC = true;
        if (this.rs0) {
            mm_1 v2 = this.oL;
            int i3 = this.No0;
            int i4 = this.IT;
            E3 v5 = this.fa;
            mm_1 v6 = this.JY;
            if (i3 < 0 || i3 >= v2.yG.v3) {
                return;
            }
            gl_1 v7 = v2.yG.Sc[i3];
            iv_2[] v8 = v7.wz0;
            int i9 = 0;
            int i10 = -1;
            int i11 = 0;
            int i12 = i1;
            while (true) {
                if (i11 >= v7.Mi) {
                    break;
                }
                iv_2 iv = v8[i11];
                short i13 = iv.tj;
                short i14 = iv.Sm.DK0;
                if (i10 != i14) {
                    i9 = 0;
                }
                if (i4 >= i13 && i12 < i13) {
                    boolean i7_flag = (i4 < i13);
                    boolean i8_flag = (i12 < i13);
                    if (i7_flag != i8_flag) {
                        break;
                    }
                    int checkPrev = i4 + i9;
                    int checkCurr = i12 + i9;
                    if (i3 < 0 || i3 >= v2.yG.v3) {
                        return;
                    }
                    if (v5 == null || v6 == null) {
                        return;
                    }
                    short dk0 = v2.yG.Sc[i3].wz0[i11].Sm.DK0;
                    if (dk0 < 0 || dk0 >= v5.Hy0.I40) {
                        return;
                    }
                    j90_0 j90 = v5.mh0[dk0];
                    aq_0[] aqArr = j90.rI;
                    for (int i5 = 0; i5 < j90.qv0; i5++) {
                        aq_0 aq = aqArr[j90.qv0 - 1 - i5];
                        if (v6.yz0(checkPrev, aq.N80) != v6.yz0(checkCurr, aq.N80)) {
                            break;
                        }
                    }
                    return;
                }
                i4 -= i13;
                i9 = i12 - i13;
                i10 += i13;
                i11 = (short) (i11 + 1);
                i10 = i14;
                i12 = i9;
                i9 = i10;
            }
        }
        this.rs0 = true;
        this.IT = i1;
        if (this.t2 != null) {
            return;
        }
        yq();
        this.Fv0.synchronized$();
        lg_0.OH0.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        lg_0.OH0.glClear(16384);
        this.Cd.R1(true);
        gK.Po(this.Cd.iJ);
        gK.W30();
        int i2 = this.No0;
        this.jG0.freeAll(this.DA0);
        this.DA0.clear();
        this.k.x = 0.0f;
        this.k.y = 0.0f;
        mm_1 v4_anim = this.oL;
        int i5_frame = this.IT;
        if (i2 >= 0 && i2 < v4_anim.yG.v3) {
            gl_1 gl = v4_anim.yG.Sc[i2];
            iv_2[] wz0 = gl.wz0;
            int i8_acc = 0;
            int i9_last = -1;
            for (short i10_idx = 0; i10_idx < gl.Mi; i10_idx++) {
                iv_2 iv = wz0[i10_idx];
                short tj = iv.tj;
                short dk0 = iv.Sm.DK0;
                if (i9_last != dk0) {
                    i8_acc = 0;
                }
                if (i5_frame < tj) {
                    i5_frame += i8_acc;
                    if (i2 < v4_anim.yG.v3) {
                        if (this.fa == null) {
                            v4_anim.Oe.x += this.k.x;
                            v4_anim.Oe.y += this.k.y;
                            v4_anim.Hh0((short) i2, i10_idx, (xt_0) this, v4_anim.Oe.x, v4_anim.Oe.y);
                        } else {
                            if (mm_1.t90(gl, i10_idx, v4_anim.Ye, null, v4_anim.Oe)) {
                                v4_anim.Oe.x += this.k.x;
                                v4_anim.Oe.y += this.k.y;
                                int vb = v4_anim.Ye.VB;
                                if (vb >= 0 && vb < this.fa.Hy0.I40) {
                                    j90_0 j90 = this.fa.mh0[vb];
                                    aq_0[] aqArr = j90.rI;
                                    for (int i7 = 0; i7 < j90.qv0; i7++) {
                                        aq_0 aq = aqArr[j90.qv0 - 1 - i7];
                                        float ax = v4_anim.Oe.x + aq.J3;
                                        float ay = v4_anim.Oe.y + aq.x60;
                                        int yz = this.JY.yz0(i5_frame, aq.N80);
                                        if (yz >= 0) {
                                            if (!this.JY.Hh0(aq.N80, yz, (xt_0) this, ax, ay)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    i5_frame -= tj;
                    i8_acc += tj;
                    i9_last = dk0;
                }
            }
        }

        es_1 v2_da0 = this.DA0;
        for (int i3 = 0; i3 < v2_da0.KB; i3++) {
            U4 v4_u4 = (U4) v2_da0.get(i3);
            int i5_part = v4_u4.WU;
            if (i5_part < 0) {
                continue;
            }
            B5 v5_sprite = this.yb0[i5_part];
            boolean i6_flipY = false;
            boolean i7_flipX = false;
            float f8_rot = 0.0f;
            Jf.x = this.cOm4;
            Jf.y = this.cOm4;
            t5.x = v4_u4.Tt;
            t5.y = v4_u4.DJ;
            t5.x *= Jf.x;
            t5.y *= Jf.y;
            ac0_1 v11_ac = v4_u4.N60;
            if (v11_ac != null) {
                i7_flipX = v11_ac.ht;
                i6_flipY = v11_ac.instanceof$;
                f8_rot = v11_ac.Rq;
                Bp0 xd0 = v11_ac.xd0;
                Jf.x *= xd0.x;
                Jf.y *= xd0.y;
            }
            float[] z2 = Ky0.Z2;
            z2[0] = 1.0f;
            z2[1] = 0.0f;
            z2[2] = 0.0f;
            z2[3] = 0.0f;
            z2[4] = 1.0f;
            z2[5] = 0.0f;
            z2[6] = t5.x;
            z2[7] = t5.y;
            z2[8] = 1.0f;

            float[] tf = Ky0.Tf;
            tf[0] = Jf.x;
            tf[1] = 0.0f;
            tf[3] = 0.0f;
            tf[4] = Jf.y;
            tf[6] = 0.0f;
            tf[7] = 0.0f;
            i00_0.mC(z2, tf);

            if (f8_rot != 0.0f) {
                float rad = f8_rot * 0.0174532924f;
                if (rad != 0.0f) {
                    float c = (float) Math.cos(rad);
                    float s = (float) Math.sin(rad);
                    tf[0] = c;
                    tf[1] = s;
                    tf[3] = -s;
                    tf[4] = c;
                    tf[6] = 0.0f;
                    tf[7] = 0.0f;
                    i00_0.mC(z2, tf);
                }
            }

            float offX = v4_u4.RI * (i7_flipX ? 1.0f : -1.0f);
            float offY = v4_u4.S6 * (i6_flipY ? -1.0f : 1.0f);
            tf[0] = 1.0f;
            tf[1] = 0.0f;
            tf[3] = 0.0f;
            tf[4] = 1.0f;
            tf[6] = offX;
            tf[7] = offY;
            i00_0.mC(z2, tf);

            t5.x = z2[6];
            t5.y = z2[7];
            t5.x -= v5_sprite.l() / 2.0f;
            t5.y -= v5_sprite.LD0() / 2.0f;

            boolean flipX = (v5_sprite.yQ > v5_sprite.Yo) != i7_flipX;
            boolean flipY = (v5_sprite.Y60 > v5_sprite.Ll0) != i6_flipY;
            v5_sprite.Wu0(flipX, flipY);
            v5_sprite.Zi0 = Jf.x;
            v5_sprite.D60 = Jf.y;
            v5_sprite.B1 = f8_rot;
            v5_sprite.o70 = true;
            v5_sprite.ak0(t5.x, t5.y);
            v5_sprite.jN(gK);
        }
        gK.end();
        this.Fv0.end();
    }

    @Override
    public final void dispose() {
        if (this.Ot0) {
            return;
        }
        this.Ot0 = true;
        if (this.t2 != null) {
            this.t2.dispose();
        }
        if (this.Fv0 != null) {
            this.Fv0.dispose();
        }
        if (this.pg0 != null) {
            this.pg0.dispose();
        }
    }
}
