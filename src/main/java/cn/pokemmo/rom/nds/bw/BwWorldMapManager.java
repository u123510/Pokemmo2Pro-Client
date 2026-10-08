package cn.pokemmo.rom.nds.bw;

import f.*;
public class BwWorldMapManager extends L00 {
    public static final dl_1 lG0 = Cq0.E1(BwWorldMapManager.class);
    public static final Bp0 KS = new Bp0();
    public static final Bp0 dE0 = new Bp0();
    public final nj0_0 w00;
    public final float[] ns0;
    public final long[] KE;
    public int OP;
    public nv0_0[][] HI0;
    public int v4;
    public float Ut;
    public float B70;
    public float u5;
    public boolean hm0;

    public BwWorldMapManager(nj0_0 resources) {
        super(resources);
        ns0 = new float[200];
        KE = new long[200];
        OP = 0;
        HI0 = null;
        v4 = -1;
        hm0 = false;
        w00 = resources;
    }

    public static void TV(nv0_0 chunk, Ou0 model) {
        if (chunk.yf0.sj0(model, true)) model.O4();
    }

    public final void MJ0() {
        super.MJ0();
        JA configuration = new JA(bn0_0.DK0(), bn0_0.Rn0(), null);
        configuration.HA = 1;
        configuration.F80 = 1;
        configuration.el = 32;
        super.ns0 = new ER(new bn0_0(configuration, null), new FG());
    }

    public final boolean o7(byte action, C8 point, int animation, boolean doors,
                            boolean strict, boolean transition) {
        boolean defer = !fX;
        yt_1 player = tw0_0.e60;
        if (player == null) defer = true;
        XF0 map = null;
        if (!defer) {
            _else current = player.N60();
            if (!(current instanceof XF0)) return true;
            map = (XF0) current;
            if (map == null || (il0 == null ? 0 : il0.gq0()) != map.Ro0.O60) defer = true;
        }
        if (defer) {
            lg_0.k.lPT5(new _goto((cr0_0) (Object) this, action, point, animation, doors, strict, transition));
            return true;
        }
        float nearest = Float.MAX_VALUE;
        Ou0 selected = null;
        nv0_0 selectedChunk = null;
        boolean requiresAnimation = action != 4 && action != 5;
        I2 chunks = qf.ZD();
        while (chunks.hasNext()) {
            nv0_0 chunk = (nv0_0) chunks.next();
            I2 models = chunk.yf0.ZD();
            while (models.hasNext()) {
                Ou0 model = (Ou0) models.next();
                if (doors && !model.yI0.contains("door")) {
                    if (strict || !model.yI0.contains("badgegate")) {
                        if (strict || !model.yI0.contains("elevator")) continue;
                    }
                }
                if (transition && !strict && doors && model.yI0.contains("badgegate")) continue;
                if (J4.p5(map.Bm0, map.case$) == 143) {
                    if (model.yI0.contains("warp0") || model.yI0.contains("_sta")
                            || model.yI0.contains("obj")) continue;
                }
                VN.jG0.np(point).dz0(0.125F);
                VN.Xa0.np(point).if$(0.125F);
                VN.nF(VN.jG0, VN.Xa0);
                if (!model.Mp0.hC0(VN) && !point.eG() && doors) continue;
                if (requiresAnimation && animation >= model.Kv.KB) continue;
                C8 center = model.Mp0.Xm0;
                float distance = point.Ir(center.x, center.y, center.z);
                if (distance < nearest) {
                    nearest = distance;
                    selected = model;
                    selectedChunk = chunk;
                }
            }
        }
        if (selected == null || selectedChunk == null) return false;
        if (!strict && !doors) selected.sY = false;
        switch (action) {
            case 5: {
                Ou0 replacement = selectedChunk.LH0(C8.Zero, animation);
                if (replacement != null) {
                    replacement.ho.Dd0(selected.ho.EW);
                    replacement.Mp0.nF(selected.Mp0.jG0, selected.Mp0.Xa0);
                    nv0_0 chunk = selectedChunk;
                    Ou0 model = selected;
                    lg_0.k.lPT5(() -> TV(chunk, model));
                }
                break;
            }
            case 4: {
                C8 translation = new C8();
                selected.ho.V1(translation);
                if (animation == 1) {
                    if (translation.y <= -90000.0F) translation.y += 100000.0F;
                } else if (translation.y > -90000.0F) {
                    translation.y -= 100000.0F;
                }
                selected.ho.Y1(translation);
                break;
            }
            case 3:
                selected.EG();
                break;
            case 2:
                selected.PE0 = 100000000.0F;
                selected.sC0(animation, false, null);
                break;
            case 0:
            case 1:
                if (doors && strict && animation == 0) selected.PE0 = 100000000.0F;
                else if (selected.yI0.contains("badgegate")) selected.PE0 = 2.5F;
                else selected.PE0 = 1.0F;
                selected.sC0(animation, action == 1, null);
                if (animation == 0 && doors && transition) {
                    pw_1 sequence = pw_1.xC().Xf0();
                    ao_1 zoom = ao_1.DX(uZ, 7, 1.5F);
                    zoom.h5[0] = uZ.Rg0 / 2.0F;
                    sequence = sequence.y80(zoom);
                    ao_1 yaw = ao_1.DX(uZ, 6, 1.5F);
                    yaw.h5[0] = uZ.Q30 + 10.0F;
                    sequence = sequence.y80(yaw).mz0();
                    sequence.xF0 = YB;
                    COM4 = (pw_1) sequence.Ms(tw0_0.LD0.Ov);
                }
                if (doors) {
                    boolean opening = animation == 0;
                    boolean automatic = selected.yI0.contains("_pc") || selected.yI0.startsWith("elevator")
                            || selected.yI0.contains("_untower") || selected.yI0.startsWith("door_c05")
                            || selected.yI0.startsWith("door_auto") || selected.yI0.startsWith("door_c03");
                    if (strict && opening != automatic) return false;
                    short sound = (short) (automatic ? 1671 : opening ? 1669 : 1670);
                    if (sound > 0) tw0_0.RE0.d00(true, (byte) 2, sound, 0.0F);
                }
                break;
            default:
                break;
        }
        return true;
    }

    public final void cu0(s4_0 weather, boolean force) {
        if ((!lpt3__1.oq0 && (lpt3__1.RJ || tw0_0.Eu(8))) || !vn0) weather = s4_0.rP;
        if ((Bu0 != null && force) || weather == null || XF != weather) {
            YG0.aUX();
            Bu0 = null;
        }
        XF = weather;
        if (Bu0 != null || weather == null) return;
        switch (weather.ordinal()) {
            case 13:
                Bu0 = YG0.UH0("weather/heavy_rain");
                Bu0.start();
                YG0.fY(Bu0);
                Fg = YG0.UH0("weather/thunder");
                YG0.fY(Fg);
                break;
            case 7:
            case 17:
                Bu0 = YG0.UH0("weather/snow");
                Bu0.start();
                YG0.fY(Bu0);
                break;
            case 5:
                Bu0 = YG0.UH0("weather/rain");
                Bu0.start();
                YG0.fY(Bu0);
                Fg = YG0.UH0("weather/thunder");
                YG0.fY(Fg);
                break;
            case 3:
                Bu0 = YG0.UH0("weather/rain");
                Bu0.start();
                YG0.fY(Bu0);
                break;
            default:
                break;
        }
    }

    public final void mH(_else map) {
        XF0 area = (XF0) map;
        if (!fX) {
            k1 = area.Ro0.TC0.bB();
            mD0();
        }
        Wh0();
        cu0(map.Jo0, !fX);
    }

    public final void Xf0() {
        yt_1 player = tw0_0.e60;
        if (player == null || player.jB0 == null || !tw0_0.rl.NA
                || !(tw0_0.e60.N60() instanceof p50_0)) return;
        super.Xf0();
        p50_0 map = (p50_0) tw0_0.e60.N60();
        E90 actor = tw0_0.e60.jB0;
        lg_0.OH0.glClearColor(qh.r, qh.g, qh.b, qh.a);
        lg_0.OH0.glClear(16640);
        if (COM4 != null) {
            ez.np(uZ.v40).Vy(uZ.rj.x, uZ.rj.y, uZ.rj.z);
        } else if (actor != null) {
            af0_0.SS.bk();
            Be(actor, uZ, true);
            BJ0 camera = kp0 ? RX : uZ;
            ez.np(camera.v40).Vy(camera.rj.x, camera.rj.y, camera.rj.z);
        }
        if (map != null) {
            C8 position = actor.il0.t60;
            if (K60 == null || K60 != map || (K60.Fm && nf_0.zo0().t8() >= 255)) {
                c8_0.JD0.vt0.ar = 0L;
                XF0 previous = K60;
                if (previous != null && previous.Fm) {
                    previous.Fm = false;
                    previous.gA();
                }
                K60 = map;
                wa0_2 matrix = map.i80;
                HI0 = new nv0_0[matrix.It0][matrix.WH];
                mk_1.NU.Sq0();
                I2 chunks = qf.ZD();
                while (chunks.hasNext()) ((nv0_0) chunks.next()).dispose();
                qf.clear();
                sN.fx.ri0();
                e0 = -1;
                hq = -1;
                if (tw0_0.PK0 == null && tw0_0.LD0.hO == null) {
                    tw0_0.RE0.Eh(map.dw, map.hh0(), true, false);
                }
                z0 = map.lm0.AK && J4.p5(map.Bm0, map.case$) != 249;
                ((Ze) sN.fx).yA0.b20();
                tw0_0.lM.BO();
            }
            if ((il0 == null ? -1 : il0.gq0()) != map.Ro0.O60
                    || (tw0_0.Eu(1) && lg_0.lW.eC0(129) && lg_0.lW.nI0(92))) {
                if (il0 != null) {
                    il0.dispose();
                    il0 = null;
                }
                switch (map.Ro0.O60) {
                    case 0: il0 = new dd_0(map); break;
                    case 7: il0 = new OF(map); break;
                    case 18: il0 = new KQ(map); break;
                    case 29: il0 = new ha0_0(map); break;
                    case 32:
                    case 33:
                    case 34:
                    case 254: il0 = new c_0(map); break;
                    case 63: il0 = new w9_0(map); break;
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74: il0 = new j6_0(map); break;
                    case 97: il0 = new ik0_1(map); break;
                    case 98: il0 = new ix_0(map); break;
                    case 108: il0 = new gf_1(map); break;
                    case 114: il0 = new ZV(map); break;
                    case 121: il0 = new mu0_0(map); break;
                    case 137: il0 = new Jq0(map); break;
                    case 138: il0 = new lpt1__5(map); break;
                    case 195:
                    case 196:
                    case 197: il0 = new gs_0(map); break;
                    case 27:
                    case 51:
                    case 90:
                    case 91:
                    case 92:
                    case 131:
                    case 132:
                    case 133:
                    case 159:
                    case 251:
                    case 252:
                    case 318:
                    case 320:
                    case 366:
                    case 369:
                    case 372:
                    case 375:
                    case 379: il0 = new com3__5(map, (cr0_0) (Object) this); break;
                    default: il0 = new gr_2(map); break;
                }
            }
            int tileX = 0;
            int tileY = 0;
            int width = map.yd;
            if (width > 0) {
                int height = map.ie;
                if (height > 0) {
                    tileX = (int) (position.x / width);
                    tileY = (int) (position.y / height);
                }
            }
            if (e0 != tileX || hq != tileY) {
                e0 = tileX;
                hq = tileY;
            }
            int radius = 1;
            byte kind = map.Ro0.WH0;
            if (kind == 1 || kind == 11) radius = 2;
            else if (kind == 13) radius = 3;
            System.nanoTime();
            boolean created = false;
            boolean refresh = false;
            for (int x = Math.max(0, tileX - radius); x <= tileX + radius; x++) {
                for (int y = Math.max(0, tileY - radius); y <= tileY + radius; y++) {
                    if (x < 0 || y < 0) continue;
                    bm_1 block = map.gg(x, y);
                    if (block == null || HI0[x][y] != null) continue;
                    ug_0 header = map.Uc0(x, y);
                    nv0_0 chunk = new nv0_0(header, (w6) block.wj0());
                    chunk.Hb0(k1);
                    byte blockKind = header.WH0;
                    if (blockKind == 1) chunk.hw.na(x * 32 + 16, 0.0F, y * 32 + 16);
                    else if (blockKind == 5) chunk.hw.na(x * 8 + 8, 0.0F, y * 8 + 8);
                    else chunk.hw.na(x * 8 + 4, 0.0F, y * 8 + 4);
                    chunk.Py0();
                    HI0[x][y] = chunk;
                    qf.Ue0(chunk);
                    refresh = true;
                    chunk.wp0.jF = 1.0F;
                    chunk.wp0.QT = 1.0F;
                    chunk.wp0.kv = 1.0F;
                    created = true;
                }
            }
            if (refresh && tt0_0.C7()) {
                tt0_0 editor = tt0_0.j0;
                editor.d6.tA0();
                if (editor.G2 != null) {
                    if (editor.Mu != null) editor.Ol.sj0(editor.Mu, true);
                    editor.Mu = null;
                    editor.n90();
                    editor.G2.dispose();
                    editor.Ol.sj0(editor.G2, true);
                }
            }
            if (created && tw0_0.Eu(1)) {
                dl_1 logger = lG0;
                boolean configurationInitialized = dw_2.Va;
                System.nanoTime();
                logger.getClass();
            }
        }
        super.ns0.jK(cV());
        Kx();
        YG0.begin();
        YG0.I2();
        YG0.me0();
        YG0.end();
        super.ns0.eo0(YG0);
        if (map != null && (map.pG != tW.cH || ((_else) map).Z10) && tw0_0.rl.c50 != 7) {
            VJ0.np(uZ.rj);
            VJ0.y += 0.125F;
            if (qH < 1.0F) qH = 1.0F;
            if (qH > 5.0F) qH = 5.0F;
            a1.ho.F();
            a1.ho.co(uZ.rj, uZ.v40, uZ.St0);
            a1.ho.Y1(VJ0);
            a1.ho.tO(C8.X, 90.0F);
            float scale = qH * 1.2F;
            a1.ho.w2(scale, scale, scale);
            super.ns0.vL();
            super.ns0.eo0(a1);
        }
        super.ns0.end();
        tw0_0.lM.getClass();
        if (!fX) {
            for (int i = 0; i < 200; i++) {
                ns0[i] = 0.0F;
                KE[i] = 0L;
            }
            BR connection = tw0_0.rl;
            if (connection.Sy) {
                connection.Sy = false;
                E90 actorNow = tw0_0.e60.jB0;
                actorNow.L8.Np0 = false;
                actorNow.il0.LE(new nk_0[]{nk_0.Nw});
            } else {
                connection.kg0();
            }
            nf_0.zo0().w30(500, false);
        }
    }

    public final void Be(E90 actor, BJ0 camera, boolean record) {
        C8 position = actor.il0.t60;
        sC.x = position.x * 0.25F;
        sC.y = position.z * 0.25F + 0.1F;
        sC.z = position.y * 0.25F + 0.1F;
        float ignoredY = camera.x90.y;
        if (K60 != null) {
            w20_0 settings = (w20_0) w00.mA.BM((byte) (K60.Ro0.b9 & -2));
            int id = K60.Ro0.O60;
            if (id == 28) camera.zo0 = settings.Aj0 / 196.0F;
            else if (id == 250) camera.zo0 = settings.Aj0 / 96.0F - 8.0F;
            else if (!hm0) camera.zo0 = settings.Aj0 / 96.0F;
            float rawDistance = settings.MV;
            float distance = rawDistance / 64.0F + 1.0F;
            if (!hm0 && dw_2.z2 && id != 250) {
                camera.zo0 *= 0.6F;
                distance = rawDistance / 42.0F;
            }
            if (id == 0) distance *= 2.0F;
            camera.Qy = settings.Qz + 4.0F;
            camera.Wu0 = settings.lD0 / 4.0F + 0.1F;
            if (id == 155) camera.Qy = camera.Rg0 + 6.0F;
            else if (id == 249) camera.Qy = camera.Rg0 + 30.0F;
            if (XF == s4_0.Oj0) camera.Qy = camera.Rg0 + 5.0F;
            boolean orbit = false;
            float orbitAngle = 0.0F;
            p50_0 map = (p50_0) tw0_0.e60.N60();
            zv_2 location = actor.ba0;
            if (location.Lpt2 && J4.p5(map.Bm0, map.case$) != 114
                    && J4.p5(map.Bm0, map.case$) != 121 && J4.p5(map.Bm0, map.case$) != 137) {
                nC0 path = (nC0) location.LPt1();
                if (path != null) {
                    _package segment = path.Or0;
                    wg_0 track = map.th;
                    Q90 pointA = track.yz[segment.Fq];
                    Q90 pointB = track.yz[segment.FP];
                    wa_0 current = track.I5[segment.strictfp$];
                    wa_0 from = track.I5[pointA.cI];
                    wa_0 to = track.I5[pointB.cI];
                    float targetPitch = -((((current.sA & 65535) / 65536.0F * 360.0F
                            + 360.0F) % 360.0F + 360.0F) % 360.0F);
                    float fromDistance = from.su / 4.0F;
                    float toDistance = to.su / 4.0F;
                    float targetDistance = current.su / 4.0F;
                    float length = Math.max(segment.ll0, 1);
                    if (fromDistance != toDistance || fromDistance != targetDistance) {
                        int type = current.Hy0;
                        if (type == 19 || type == 17 || type == 5 || type == 12 || type == 1) {
                            targetDistance = type == 2 ? current.su / 4.0F : current.su / 8.0F;
                        } else {
                            targetDistance = fe_2.Ga0(toDistance, fromDistance,
                                    tw0_0.e60.jB0.ba0.Lq0 / length, fromDistance);
                        }
                    }
                    targetDistance += 1.0F;
                    if (J4.p5(map.Bm0, map.case$) == 28 && path.HR() <= -3) camera.zo0 *= 1.25F;
                    float fromYaw = w20_0.y0(from.ZO);
                    float toYaw = w20_0.y0(to.ZO);
                    float targetYaw = w20_0.y0(current.ZO);
                    float yaw = fe_2.Ga0(toYaw, fromYaw, tw0_0.e60.jB0.ba0.Lq0 / length, fromYaw);
                    int type = current.Hy0;
                    if (type == 4) yaw = targetYaw;
                    if (type == 11) yaw = w20_0.y0(current.sA);
                    float pitch = (path.xs0 % 360.0F + 360.0F) % 360.0F;
                    while (pitch - camera.d00 > 30.0F) camera.d00 += 360.0F;
                    while (pitch - camera.d00 < -30.0F) camera.d00 -= 360.0F;
                    if (J4.p5(map.Bm0, map.case$) == 66) {
                        orbit = true;
                        yaw = -34.0F;
                        camera.Q30 = yaw;
                        if (current.Hy0 == 4) {
                            pitch = (path.JA0.y - 0.66666675F) / 5.333333F * -90.0F + 270.0F;
                            orbitAngle = 270.0F;
                        } else {
                            orbitAngle = camera.d00;
                        }
                        while (yaw - camera.Q30 > 30.0F) camera.Q30 += 360.0F;
                        while (yaw - camera.Q30 < -30.0F) camera.Q30 -= 360.0F;
                        float difference = yaw - camera.Q30;
                        if (difference > 180.0F || difference < -180.0F) yaw = camera.Q30;
                    }
                    type = current.Hy0;
                    if (type == 19) {
                        camera.Q30 = targetYaw;
                        camera.d00 = targetPitch;
                        camera.Rg0 = targetDistance;
                    } else {
                        targetYaw = yaw;
                        targetPitch = pitch;
                    }
                    if ((v4 == 19 && type != 19) || v4 == -1) {
                        camera.Q30 = targetYaw;
                        camera.d00 = targetPitch;
                        camera.Rg0 = targetDistance;
                    }
                    if (COM4 == null) {
                        EA0 movement = tw0_0.e60.jB0.il0;
                        if (movement.np) {
                            float progress = (float) (hk0_1.KG - movement.b60) / movement.Kg;
                            O00 interpolation = LW.Yu;
                            camera.Q30 = fe_2.Ga0(targetYaw, Ut, progress, Ut);
                            camera.d00 = (((((targetPitch - B70) % 360.0F + 360.0F + 180.0F)
                                    % 360.0F - 180.0F) * progress + B70) % 360.0F + 360.0F) % 360.0F;
                            camera.Rg0 = fe_2.Ga0(targetDistance, u5, progress, u5);
                        } else {
                            Ut = targetYaw;
                            B70 = targetPitch;
                            u5 = targetDistance;
                            camera.d00 = targetPitch;
                            camera.Rg0 = targetDistance;
                            camera.Q30 = targetYaw;
                        }
                    }
                    v4 = type;
                }
            } else {
                camera.d00 = 0.0F;
                camera.Rg0 = distance;
                camera.Q30 = w20_0.y0(settings.B60);
                if (J4.p5(K60.Bm0, K60.case$) == 137) {
                    camera.Rg0 = distance * 1.25F;
                    camera.Q30 = -30.0F;
                }
                v4 = -1;
                M90 bounds = (M90) w00.n30.f5(K60.Ro0.Ot0);
                if (bounds != null) {
                    fc_1 limit = bounds.r1[0];
                    sC.x = LW.r1(sC.x, limit.Sg / 64.0F, limit.G4 / 64.0F);
                    limit = bounds.r1[0];
                    sC.z = LW.r1(sC.z, limit.V5 / 64.0F, limit.LPT6 / 64.0F);
                }
                Ut = camera.Q30;
                B70 = camera.d00;
                u5 = camera.Rg0;
            }
            float offsetX = ((settings.pz & 65535) / 65536.0F + settings.j3) * 0.25F;
            float offsetY = -((settings.cR & 65535) / 65536.0F + settings.Or) * 0.25F;
            float offsetZ = -((settings.LB0 & 65535) / 65536.0F + settings.kx0) * 0.25F;
            if (settings.Gv == 0) {
                sC.x = offsetX;
                sC.y = -offsetY;
                sC.z = -offsetZ;
                camera.Rg0 = 10.0F;
                camera.nz0(offsetX, -offsetY * 0.2F, -offsetZ, 0.0F, 0.0F, 0.0F);
            } else {
                if (record) {
                    long now = hk0_1.KG;
                    long targetTime = now - 200L;
                    if (++OP >= ns0.length) OP = 0;
                    ns0[OP] = sC.y;
                    KE[OP] = now;
                    long beforeTime = 0L;
                    float before = 0.0F;
                    long afterTime = Long.MAX_VALUE;
                    float after = 0.0F;
                    for (int i = 0; i < 200; i++) {
                        long time = KE[i];
                        if (time == 0L) continue;
                        if (time <= targetTime && time > beforeTime) {
                            before = ns0[i];
                            beforeTime = time;
                        }
                        if (time > targetTime && time < afterTime) {
                            after = ns0[i];
                            afterTime = time;
                        }
                    }
                    if (afterTime != Long.MAX_VALUE) {
                        if (beforeTime == 0L) {
                            sC.y = after;
                        } else {
                            float progress = (float) (targetTime - beforeTime) / (float) (afterTime - beforeTime);
                            O00 interpolation = LW.Yu;
                            float height = fe_2.Ga0(after, before, progress, before);
                            float current = sC.y;
                            double difference = current - height;
                            if (difference > 0.25D) sC.y = (float) ((double) current - 0.25D);
                            else if (difference < -0.25D) sC.y = (float) ((double) current + 0.25D);
                            else sC.y = height;
                        }
                    }
                }
                af0_0 shake = af0_0.SS;
                float offset = (shake.Lu0 % 2 == 0 ? shake.fq0 : -shake.fq0) * 0.02F;
                sC.Vy(offset, 0.0F, offset);
                camera.nz0(sC.x, sC.y, sC.z, offsetX, offsetY, offsetZ);
                if (orbit) {
                    KS.x = 6.5F;
                    KS.y = 4.0F;
                    dE0.x = 4.0F;
                    dE0.y = 4.0F;
                    KS.ub0(dE0, -orbitAngle);
                    camera.Rg0 = 4.5F;
                    camera.nz0(KS.x, sC.y, KS.y, offsetX, offsetY, offsetZ);
                }
            }
        }
        if (kp0) {
            RX.Qy = 1000.0F;
            RX.Wu0 = 0.1F;
            RX.zo0 = camera.zo0;
        }
    }

    public final void dispose() {
        super.dispose();
        sN.fx.ri0();
        if (il0 != null) il0.dispose();
    }

    public final void HF0() {
        hm0 = true;
        uZ.zo0 -= 1.0F;
    }

    public final void uD0() {
        hm0 = true;
        uZ.zo0 += 1.0F;
    }

    public final void Yt(double value) {
    }

    public final void aN(float value) {
        uZ.zo0 = value;
    }

    public final float Bc() {
        return 67.0F;
    }

    public final void M9() {
        hm0 = false;
        uZ.zo0 = 67.0F;
    }

    public final String g80() {
        String info = "\n\nMapHeader:";
        if (K60 != null) {
            info = "\n\nMapHeader:\nID: " + K60.Ro0.O60;
            info = AN.nK0(info, "\nMatrix: ").append(K60.i80.SM).toString();
            info = AN.nK0(info, "\nTilesetID: ").append(K60.Ro0.T70).toString();
            info = AN.nK0(info, "\nLight ID: ").append(K60.Ro0.IJ.aw0).toString();
            if (k1 != null) info = AN.nK0(info, "\nClearColor: ").append(k1.Ak0).toString();
        }
        p50_0 map = (p50_0) tw0_0.e60.N60();
        if (map != null) {
            zv_2 location = tw0_0.e60.jB0.ba0;
            if (location.Lpt2) {
                nC0 path = (nC0) location.LPt1();
                if (path != null) {
                    _package segment = path.Or0;
                    wg_0 track = map.th;
                    Q90 pointA = track.yz[segment.Fq];
                    Q90 pointB = track.yz[segment.FP];
                    wa_0 current = track.I5[segment.strictfp$];
                    wa_0 from = track.I5[pointA.cI];
                    wa_0 to = track.I5[pointB.cI];
                    info = AN.nK0(info, "\nPoint A:  ").append(segment.Fq).toString();
                    info = AN.nK0(info, "\nPoint B: ").append(segment.FP).toString();
                    info = AN.nK0(info, "\n\nCamera A: ").append(pointA.cI)
                            .append("\n\t\u00bb Type: ").append(from.Hy0)
                            .append("\n\t\u00bb Distance: ").append(from.su)
                            .append("\n\t\u00bb Yaw: ").append(from.ZO)
                            .append("\n\t\u00bb Pitch: ").append(from.sA).toString();
                    info = AN.nK0(info, "\n\nCamera B: ").append(pointB.cI)
                            .append("\n\t\u00bb Type: ").append(to.Hy0)
                            .append("\n\t\u00bb Distance: ").append(to.su)
                            .append("\n\t\u00bb Yaw: ").append(to.ZO)
                            .append("\n\t\u00bb Pitch: ").append(to.sA).toString();
                    info = AN.nK0(info, "\n\nCamera L: ").append(segment.strictfp$)
                            .append("\n\t\u00bb Type: ").append(current.Hy0)
                            .append("\n\t\u00bb Distance: ").append(current.su)
                            .append("\n\t\u00bb Yaw: ").append(current.ZO)
                            .append("\n\t\u00bb Pitch: ").append(current.sA).toString();
                }
            }
        }
        XF0 area = K60;
        if (area != null) {
            w20_0 settings = (w20_0) w00.mA.BM((byte) (area.Ro0.b9 & -2));
            StringBuilder result = AN.nK0(info, "\n\nCameras:\nID: ");
            XF0 current = K60;
            return result.append(current == null ? -1 : current.Ro0.b9)
                    .append("\nBW Distance: ").append(settings.MV)
                    .append("\nDIST: ").append(uZ.Rg0)
                    .append("\nYAW: ").append(uZ.Q30)
                    .append("\nPITCH: ").append(uZ.d00).toString();
        }
        return info;
    }

    public final void Lo0(boolean start) {
        Hq.np(tw0_0.e60.jB0.L8.ze0);
        I2 chunks = qf.ZD();
        while (chunks.hasNext()) {
            I2 models = ((nv0_0) chunks.next()).yf0.ZD();
            while (models.hasNext()) {
                Ou0 model = (Ou0) models.next();
                VN.jG0.np(Hq).dz0(0.125F);
                VN.Xa0.np(Hq).if$(0.125F);
                VN.nF(VN.jG0, VN.Xa0);
                if (model.yI0.equalsIgnoreCase("pc01") && model.Mp0.hC0(VN)) {
                    model.Ey(start ? "pc01_start" : "pc01_end", false, null);
                }
            }
        }
    }

    public final boolean yp(byte region) {
        return region == 2;
    }
}
