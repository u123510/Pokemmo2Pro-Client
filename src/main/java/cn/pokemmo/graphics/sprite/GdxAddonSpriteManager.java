package cn.pokemmo.graphics.sprite;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class GdxAddonSpriteManager {
    public static short Tn0 = 0;
    public static final q10_0[] KE0;
    public static final byte[][] UQ;
    public static final LPT6_[][] HQ;
    public static final Matrix4 Ds0;
    public static final me0_2 Hv0;
    public static final C8 Ep0;
    public static final C8 class$;
    public static final C8 TE;
    public static final C8 vI;
    public static final dl_1 Re;
    public static final Color Ql0;
    public static boolean j7;
    public static float mu0;
    public LPT6_[][][] SI0;
    public com3__3[][] o0;
    public ByteBuffer O30;
    public float C4;
    public final SQ[] Jx0;

    static {
        KE0 = new q10_0[]{q10_0.VI, q10_0.Bj0};
        UQ = new byte[][]{{3, 5, 4}, {0, 2, 1}, {6, 8, 7}};
        HQ = new LPT6_[UQ.length][];
        Ds0 = new Matrix4();
        Hv0 = new me0_2();
        Ep0 = new C8(0.01171875F, 0.01171875F, 0.01171875F);
        class$ = new C8();
        TE = new C8();
        vI = new C8();
        Re = Cq0.E1(GdxAddonSpriteManager.class);
        Ql0 = Color.WHITE.cpy();
        j7 = false;
        mu0 = 1.0F;
    }

    public GdxAddonSpriteManager() {
        Jx0 = new SQ[3];
        for (ew0_0 view : ew0_0.Fh0) Jx0[view.db0()] = new SQ();
    }

    public static void EL(q10_0 category, short[] ids) {
        ew0_0 view = ew0_0.C1;
        for (short id : ids) {
            X90 addon = (X90) category.Fk.f5(id);
            if (addon != null) addon.Yv(view).Pu(false);
        }
    }

    public static void eI(hl0_1 batch, LPT6_ image, q10_0 category, short id, yb_1 tint,
                          float x, float y, boolean flip, boolean shaded, float alpha) {
        if (image == null) return;
        if (tint != null && category.Yy(id)) {
            Color color = tint.YH0;
            batch.oH.set(color);
            batch.og = color.toFloatBits();
        } else if (shaded) {
            float color = Vs0.lv;
            Color.abgr8888ToColor(batch.oH, color);
            batch.og = color;
        } else if (alpha == 1.0F) {
            float color = Color.WHITE_FLOAT_BITS;
            Color.abgr8888ToColor(batch.oH, color);
            batch.og = color;
        } else {
            Color color = Ql0;
            color.a = alpha;
            batch.oH.set(color);
            batch.og = color.toFloatBits();
        }
        float offset = flip ? 42.75F : 0.0F;
        batch.u2(image, x + offset, y, 0.0F, 0.0F, (float) (image.bz * (flip ? -1 : 1)),
                (float) image.xZ, 0.75F, 0.75F, 0.0F);
        float color = Vs0.lv;
        Color.abgr8888ToColor(batch.oH, color);
        batch.og = color;
    }

    public static void MP(q10_0 category, byte direction, ec0_1 appearance, ArrayList layers, int group) {
        short id = appearance.Nul(category);
        if (id == -1) return;
        X90 addon = (X90) category.Fk.f5(id);
        if (addon == null) return;
        z3_0 sprites = addon.Yv(ew0_0.XI0);
        if (sprites == null) return;
        sprites.Pu(true);
        for (byte layer = 0; layer < 3; layer++) {
            if (layer == 1) continue;
            LPT6_ image = sprites.bO((byte) (qx_1.AE0[group] + layer), direction);
            if (image == null) continue;
            jk_0 sprite = new jk_0(image);
            if (layer == 0) {
                yb_1 tint = appearance.Ry0(category);
                if (tint != null && category.Yy(id)) {
                    sprite.Ej = tint.cOM7;
                    sprite.kH0();
                    sprite.cg = tint.TH * 2;
                    sprite.kH0();
                }
            }
            layers.add(sprite);
        }
    }

    public static void HL0(q10_0 category, ec0_1 appearance, ArrayList layers, boolean alternate) {
        ew0_0 view = ew0_0.a;
        short id = appearance.Nul(category);
        if (id == -1) return;
        X90 addon = (X90) category.Fk.f5(id);
        if (addon == null) return;
        z3_0 sprites = addon.Yv(view);
        if (sprites == null) return;
        sprites.Pu(true);
        for (byte layer = 0; layer < 3; layer++) {
            if (layer == 1) continue;
            byte direction = appearance.mh0;
            LPT6_ image = sprites.bO(alternate ? (byte) (layer + 3) : layer, direction);
            if (image == null) continue;
            com3__3 sprite = new com3__3(image.bz, image.xZ, image, true);
            Color color = Color.WHITE;
            if (layer == 0) {
                yb_1 tint = appearance.Ry0(category);
                if (tint != null && category.Yy(id)) color = tint.tg0;
            }
            sprite.CQ.v50.set(color);
            layers.add(sprite);
        }
    }

    public final void yk(ER renderer, U5 environment, bi0_1 actor, q10_0 category, byte direction,
                         yb_1 tint, Matrix4 transform, boolean flip, int group) {
        short id = actor.Gi().Nul(category);
        if (id == -1) return;
        if (category == q10_0.Qh0) {
            long now = hk0_1.KG;
            EA0 animation = actor.il0;
            long elapsed = now - animation.YT;
            long transition = now - animation.gd;
            if (id == 28 || id == 30) {
                if (transition < 250L) id++;
            } else if (id == 52) {
                ew0_0 initialized = ew0_0.C1;
                EL(q10_0.Qh0, Ss0.VG);
                if (elapsed < 200L) id = 53;
                else if (transition < 400L) {
                    switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                        case 0:
                            id = 54;
                            break;
                        case 1:
                        case 3:
                            id = 55;
                            break;
                        case 2:
                            id = 56;
                            break;
                        default:
                            break;
                    }
                } else if (transition < 600L) id = 53;
            }
        }
        EE animation = actor.Gi().auX[category.iL];
        for (byte layer : UQ[group]) {
            LPT6_ image = b50(ew0_0.C1, category, id, direction, layer, false, animation);
            if (image == null) continue;
            yb_1 color = qx_1.Con(layer) ? null : tint;
            DB0(layer, renderer, environment, image, category, id, color, transform, flip, 1.0F);
        }
    }

    public final boolean Pk0() {
        long started = System.currentTimeMillis();
        SI0 = new LPT6_[3][5][52];
        try {
            os0_0 files = lg_0.I70;
            String path = "data/sprites/addons.pak";
            files.getClass();
            O30 = new VE(path, zv_1.tt0).zs0(FileChannel.MapMode.READ_ONLY).order(ByteOrder.LITTLE_ENDIAN);
            int count = q10_0.pB.length;
            for (byte id = 0; id < count; id++) {
                for (ew0_0 view : ew0_0.Fh0) {
                    z3_0 sprites = q10_0.pB[id].Yv(view);
                    int frames = sprites.ku0.length;
                    for (byte frame = 0; frame < frames; frame++) {
                        NJ0 entry = sprites.ku0[frame].aY[0];
                        int offset = entry.Wn;
                        int length = entry.LB0;
                        i4_0 pixels;
                        if (length <= 0) pixels = null;
                        else {
                            if (offset < 0) throw new RuntimeException();
                            if (offset + length > O30.capacity()) throw new RuntimeException();
                            pixels = new i4_0(O30, offset, length);
                        }
                        LPT6_ image = null;
                        if (pixels != null) {
                            Texture texture = new Texture(pixels);
                            texture.setFilter(eb0_1.Y30, eb0_1.Y30);
                            texture.setWrap(a00_0.x3, a00_0.x3);
                            image = new LPT6_(texture);
                            pixels.dispose();
                        }
                        SI0[view.Bu0][id][frame] = image;
                    }
                }
            }
            for (q10_0 category : q10_0.Pn0) {
                w7_0 addons = category.Fk;
                addons.getClass();
                new M(addons);
                V3 iterator = new V3(addons);
                while (iterator.hasNext()) {
                    X90 addon = (X90) iterator.u7();
                    for (ew0_0 view : ew0_0.Fh0) addon.Yv(view).YR = this;
                }
            }
        } catch (Exception exception) {
            if (tw0_0.hH0.EF0(exception)) return true;
            Re.error("Error loading addons.pak", exception);
            return false;
        }
        Re.info("Loaded addons in {} milliseconds", System.currentTimeMillis() - started);
        return true;
    }

    public final void bH0(X90 addon, ew0_0 view, boolean synchronous) {
        if (synchronous) {
            Xi(addon, view, 0, null, synchronous);
            return;
        }
        lpt5__5.hL.ZD(new Ep0(this, addon, view, synchronous), 0L);
    }

    public final void Xi(X90 addon, ew0_0 view, int pass, cf_2 images, boolean synchronous) {
        try {
            q10_0 category = addon.SG;
            int variants = addon.vf0.length;
            if (pass == 0) images = new cf_2();
            for (int variant = 0; variant < variants; variant++) {
                z3_0 sprites = addon.vf0[variant][view.Bu0];
                int frames = sprites.ku0.length;
                for (byte frame = 0; frame < frames; frame++) {
                    for (byte layer = 0; layer < sprites.ku0[frame].AJ0; layer++) {
                        NJ0 entry = sprites.ku0[frame].aY[layer];
                        if (entry == null) continue;
                        short key = (short) ((variant + 1) * 100 + entry.LPt6);
                        if (pass == 0 && !images.Vd(key)) images.n3(key, new i4_0[frames]);
                        if (pass == 1) {
                            if (!entry.hW) {
                                i4_0 pixels = ((i4_0[]) images.vC(key, null))[frame];
                                LPT6_ image = pixels == null ? null : new LPT6_(new Texture(pixels));
                                byte targetLayer = entry.LPt6;
                                yy0 target = sprites.ku0[frame];
                                if (target.DD0 == yy0.XI) target.DD0 = new LPT6_[9];
                                target.DD0[targetLayer] = image;
                                if (category != q10_0.VI && pixels != null) pixels.dispose();
                            } else {
                                byte sourceFrame = entry.Qd0;
                                int x = entry.Er;
                                int y = entry.OD;
                                LPT6_ source = sprites.bO(entry.LPt6, sourceFrame);
                                if (source == null) continue;
                                byte targetLayer = entry.LPt6;
                                LPT6_ image = new LPT6_(source, -x, -y, source.bz, source.xZ);
                                yy0 target = sprites.ku0[frame];
                                if (target.DD0 == yy0.XI) target.DD0 = new LPT6_[9];
                                target.DD0[targetLayer] = image;
                            }
                        } else if (entry.hW) {
                            byte sourceFrame = entry.Qd0;
                            int dx = entry.Er;
                            int dy = entry.OD;
                            if (category == q10_0.VI) {
                                byte sourceLayer = entry.LPt6;
                                yy0[] sourceFrames = sprites.ku0;
                                i4_0 source = null;
                                if (sourceFrames != null && sourceFrame >= 0 && sourceFrame < sourceFrames.length) {
                                    yy0 sourceEntry = sourceFrames[sourceFrame];
                                    if (sourceEntry != null) source = sourceEntry.PU[sourceLayer];
                                }
                                if (source == null) continue;
                                int width = source.XF.SH;
                                int height = source.XF.mB0;
                                i4_0 shifted = new i4_0(width, height, source.rH0());
                                for (int x = 0; x < width; x++) {
                                    int targetX = dx + x;
                                    if (targetX < 0 || targetX >= width) continue;
                                    for (int y = 0; y < height; y++) {
                                        int targetY = dy + y;
                                        if (targetY < 0 || targetY >= height) continue;
                                        int color = source.XF.iH0(x, y);
                                        shifted.XF.XS(targetX, targetY, color);
                                    }
                                }
                                byte targetLayer = entry.LPt6;
                                yy0 target = sprites.ku0[frame];
                                if (target.PU == yy0.xa0) target.PU = new i4_0[9];
                                target.PU[targetLayer] = shifted;
                            } else if (category == q10_0.Bj0) {
                                BitSet[] masks = sprites.VZ;
                                BitSet source = masks == null ? null : masks[sourceFrame];
                                if (source == null) continue;
                                int width = 57;
                                int height = 56;
                                BitSet shifted = new BitSet(3192);
                                for (int x = 0; x < width; x++) {
                                    for (int y = 0; y < height; y++) {
                                        int targetX = dx + x;
                                        int targetY;
                                        if (targetX >= 0 && targetX < width && (targetY = dy + y) >= 0 && targetY < height) {
                                            shifted.set(targetY * width + targetX, source.get(y * width + x));
                                        } else {
                                            shifted.set(y * width + x, true);
                                        }
                                    }
                                }
                                if (sprites.VZ == null) sprites.VZ = new BitSet[sprites.ku0.length];
                                sprites.VZ[frame] = shifted;
                            }
                        } else {
                            int offset = entry.Wn;
                            int length = entry.LB0;
                            i4_0 pixels;
                            if (length <= 0) pixels = null;
                            else {
                                if (offset < 0) throw new RuntimeException();
                                if (offset + length > O30.capacity()) throw new RuntimeException();
                                pixels = new i4_0(O30, offset, length);
                            }
                            if (pixels != null) {
                                pixels.Pa0(DF0.Ha0);
                                int width = pixels.XF.SH;
                                int height = pixels.XF.mB0;
                                BitSet mask = new BitSet(width * height);
                                for (int x = 0; x < width; x++) {
                                    for (int y = 0; y < height; y++) {
                                        if (pixels.XF.iH0(x, y) == -15428609) {
                                            pixels.XF.XS(x, y, 0);
                                            if (category == q10_0.Bj0) mask.set(y * width + x, true);
                                        }
                                    }
                                }
                                if (category == q10_0.Bj0 && entry.LPt6 == 0) {
                                    if (sprites.VZ == null) sprites.VZ = new BitSet[sprites.ku0.length];
                                    sprites.VZ[frame] = mask;
                                }
                                if (category == q10_0.VI) {
                                    byte targetLayer = entry.LPt6;
                                    yy0 target = sprites.ku0[frame];
                                    if (target.PU == yy0.xa0) target.PU = new i4_0[9];
                                    target.PU[targetLayer] = pixels;
                                }
                            }
                            ((i4_0[]) images.vC(key, null))[frame] = pixels;
                        }
                    }
                }
                if (pass != 0) sprites.s1 = true;
            }
            if (pass == 0) {
                if (synchronous) Xi(addon, view, 1, images, synchronous);
                else lg_0.k.lPT5(new S10(this, addon, view, images, synchronous));
            }
        } catch (Exception exception) {
            Re.error("Error loading addon sprite frames", exception);
        }
    }

    public final LPT6_ fr(ew0_0 view, int id, int frame) {
        if (id < 0 || id >= SI0[view.Bu0].length) id = 0;
        if (frame < 0) return null;
        LPT6_[] frames = SI0[view.Bu0][id];
        return frame < frames.length ? frames[frame] : null;
    }

    public final LPT6_ b50(ew0_0 view, q10_0 category, short id, byte direction, byte layer,
                           boolean load, EE animation) {
        if (id == -1) return null;
        X90 addon = (X90) category.Fk.f5(id);
        if (addon == null) return null;
        boolean active = animation != null && animation.Tq == id;
        float time = active ? (float) animation.ZH / 1000.0F : C4;
        if (active) {
            k2 track = addon.yh0[1];
            p_0 frames = track == null ? null : track.nv;
            if (frames != null && frames.d40(time)) animation.Mj0((short) -1, 0.0F);
        }
        z3_0 sprites = addon.Tz(view, active, time);
        if (load) sprites.Pu(true);
        return sprites.bO(layer, direction);
    }

    public final LPT6_[] MQ(ew0_0 view, short hairId, short hatId, byte direction, byte layer,
                            boolean load, EE animation) {
        if (hatId == -1 && hairId == -1) return null;
        q10_0 hats = q10_0.Bj0;
        X90 hat = (X90) hats.Fk.f5(hatId);
        if (hat == null) return null;
        byte viewIndex = (byte) view.Bu0;
        short[][] hidden = hat.XD0;
        if (viewIndex < hidden.length) {
            short[] ids = hidden[viewIndex];
            if (ids.length != 0 && Arrays.binarySearch(ids, hairId) >= 0) hairId = 0;
        }
        q10_0 hairCategory = q10_0.VI;
        X90 hair = (X90) hairCategory.Fk.f5(hairId);
        if (hair == null) return null;
        boolean active = animation != null && animation.Tq == hatId;
        float time = active ? (float) animation.ZH / 1000.0F : C4;
        if (active) {
            k2 track = hat.yh0[1];
            p_0 frames = track == null ? null : track.nv;
            if (frames != null && frames.d40(time)) animation.Mj0((short) -1, 0.0F);
        }
        k2 track = hat.yh0[active ? 1 : 0];
        byte frame = track == null ? 0 : (Byte) track.nv.hE0(time);
        int key = (hairId & 127) << 25 | (hatId & 1023) << 15 | (layer & 15) << 11
                | (direction & 63) << 5 | frame & 31;
        if (Jx0[view.Bu0].l90(key)) return (LPT6_[]) Jx0[view.Bu0].get(key);
        if (load) {
            hat.Yv(view).Pu(true);
            hair.Yv(view).Pu(true);
        }
        LPT6_ hairImage = b50(view, hairCategory, hairId, direction, layer, load, null);
        LPT6_ hatImage = b50(view, hats, hatId, direction, layer, load, animation);
        if (!hat.Tz(view, active, time).s1 || !hair.Tz(view, false, time).s1) {
            return new LPT6_[]{hairImage, hatImage};
        }
        if (hairImage == null) {
            LPT6_[] result = {hairImage, hatImage};
            SQ cache = Jx0[view.Bu0];
            cache.j10(cache.yw0(key), result);
            return result;
        }
        BitSet[] masks = hat.vf0[frame][view.Bu0].VZ;
        BitSet mask = masks == null ? null : masks[direction];
        if (mask == null) {
            LPT6_[] result = {hairImage, hatImage};
            SQ cache = Jx0[view.Bu0];
            cache.j10(cache.yw0(key), result);
            return result;
        }
        i4_0 pixels = null;
        if (hairId != -1) {
            X90 source = (X90) hairCategory.Fk.f5(hairId);
            if (source != null) {
                yy0[] frames = source.Yv(view).ku0;
                if (frames != null && direction >= 0 && direction < frames.length) {
                    yy0 entry = frames[direction];
                    if (entry != null) pixels = entry.PU[layer];
                }
            }
        }
        if (pixels == null) {
            System.out.println(new StringBuilder("COULD NOT FIND HAIR2 = ").append(hairId)
                    .append(" frame_id = ").append(direction).toString());
            return null;
        }
        LPT6_[] result = new LPT6_[2];
        int width = pixels.XF.SH;
        int height = pixels.XF.mB0;
        i4_0 clipped = new i4_0(width, height, pixels.rH0());
        clipped.Pa0(DF0.Is);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int color = mask.get(y * width + x) ? 0 : pixels.XF.iH0(x, y);
                clipped.XF.XS(x, y, color);
            }
        }
        LPT6_ clippedImage = new LPT6_(new Texture(clipped));
        clipped.dispose();
        result[0] = clippedImage;
        result[1] = hatImage;
        SQ cache = Jx0[view.Bu0];
        cache.j10(cache.yw0(key), result);
        return result;
    }

    public final void r1(hl0_1 batch, bi0_1 actor, q10_0 category, byte direction,
                         float x, float y, boolean flip, int group) {
        short id = actor.Gi().Nul(category);
        if (id == -1) return;
        if (category == q10_0.Qh0) {
            long now = hk0_1.KG;
            EA0 animation = actor.il0;
            long elapsed = now - animation.YT;
            long transition = now - animation.gd;
            if (id == 28 || id == 30) {
                if (transition < 250L) id++;
            } else if (id == 52) {
                ew0_0 initialized = ew0_0.C1;
                EL(q10_0.Qh0, Ss0.VG);
                if (elapsed < 200L) id = 53;
                else if (transition < 400L) {
                    switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                        case 0:
                            id = 54;
                            break;
                        case 1:
                        case 3:
                            id = 55;
                            break;
                        case 2:
                            id = 56;
                            break;
                        default:
                            break;
                    }
                } else if (transition < 600L) id = 53;
            }
        }
        yb_1 tint = actor.Gi().Ry0(category);
        EE animation = actor.Gi().auX[category.iL];
        for (byte layer : UQ[group]) {
            LPT6_ image = b50(ew0_0.C1, category, id, direction, layer, false, animation);
            if (image == null) continue;
            yb_1 color = qx_1.Con(layer) ? null : tint;
            boolean shaded = layer != 4 && layer != 1 && layer != 7;
            eI(batch, image, category, id, color, x, y, flip, shaded, 1.0F);
        }
    }

    public final jk_0[] Rc0(ec0_1 appearance) {
        jk_0[] result = new jk_0[5];
        for (byte direction = 0; direction < 5; direction++) {
            boolean front = q10_0.Ci.Wo(appearance.Nul(q10_0.Ci));
            ArrayList layers = new ArrayList();
            for (int group = 0; group < 3; group++) {
                if (group == 1) {
                    LPT6_ base = fr(ew0_0.XI0, appearance.rh.Fw, direction);
                    if (base != null) layers.add(new jk_0(base));
                }
                q10_0 body = q10_0.bb;
                if (body.QI(appearance.Nul(body))) MP(q10_0.l3, direction, appearance, layers, group);
                q10_0 accessory = q10_0.Xl;
                boolean accessoryFront = appearance.Nul(accessory) != 1;
                if (!accessoryFront) MP(accessory, direction, appearance, layers, group);
                MP(body, direction, appearance, layers, group);
                if (!front) MP(q10_0.Ci, direction, appearance, layers, group);
                MP(q10_0.rg0, direction, appearance, layers, group);
                MP(q10_0.uz, direction, appearance, layers, group);
                q10_0 hair = q10_0.VI;
                if (hair.Pd0(appearance.Nul(hair)) && appearance.Nul(q10_0.Bj0) != -1) {
                    short hairId = appearance.Nul(hair);
                    short hatId = appearance.Nul(q10_0.Bj0);
                    for (byte part = 0; part < 2; part++) {
                        q10_0 category = part == 0 ? q10_0.VI : q10_0.Bj0;
                        for (byte layer = 0; layer < 3; layer++) {
                            if (layer == 1) continue;
                            byte combinedLayer = (byte) (qx_1.AE0[group] + layer);
                            LPT6_[] images = MQ(ew0_0.XI0, hairId, hatId, direction, combinedLayer, true, null);
                            if (images == null || images[part] == null) continue;
                            jk_0 sprite = new jk_0(images[part]);
                            if (layer == 0) {
                                yb_1 tint = appearance.Ry0(category);
                                if (tint != null && category.Yy(category == q10_0.VI ? hairId : hatId)) {
                                    sprite.Ej = tint.cOM7;
                                    sprite.kH0();
                                    sprite.cg = tint.TH * 2;
                                    sprite.kH0();
                                }
                            }
                            layers.add(sprite);
                        }
                    }
                } else {
                    short hairId = appearance.Nul(hair);
                    if (hairId != -1) {
                        X90 addon = (X90) hair.Fk.f5(hairId);
                        if (addon != null) {
                            z3_0 sprites = addon.Yv(ew0_0.XI0);
                            if (sprites != null) {
                                sprites.Pu(true);
                                for (byte layer = 0; layer < 3; layer++) {
                                    if (layer == 1) continue;
                                    LPT6_ image = sprites.bO((byte) (qx_1.AE0[group] + layer), direction);
                                    if (image == null) continue;
                                    jk_0 sprite = new jk_0(image);
                                    if (layer == 0) {
                                        q10_0 category = q10_0.VI;
                                        yb_1 tint = appearance.Ry0(category);
                                        if (tint != null && category.Yy(hairId)) {
                                            sprite.Ej = tint.cOM7;
                                            sprite.kH0();
                                            sprite.cg = tint.TH * 2;
                                            sprite.kH0();
                                        }
                                    }
                                    layers.add(sprite);
                                }
                            }
                        }
                    }
                }
                if (accessoryFront) MP(q10_0.Xl, direction, appearance, layers, group);
                if (front) MP(q10_0.Ci, direction, appearance, layers, group);
            }
            result[direction] = new jn0_0((jk_0[]) layers.toArray(new jk_0[0]));
        }
        return result;
    }

    public final com3__3 lPt2(ER renderer, U5 environment, bi0_1 actor, com3__3 base,
                              com3__3[][] layers, byte direction, Matrix4 transform, boolean flip, boolean shadow) {
        o0 = layers;
        nk_0 animation = actor.il0.mV;
        if (animation != nk_0.J9 && animation != nk_0.Qi0) {
            if (actor.LH0() || actor.Ze()) direction = (byte) (direction + 27);
            else if (actor.oI0()) direction = (byte) (direction + 18);
        }
        q10_0 outfitCategory = q10_0.Ci;
        short outfit = actor.Gi().Nul(outfitCategory);
        q10_0 effectCategory = q10_0.Qh0;
        short effect = actor.Gi().Nul(effectCategory);
        boolean outfitFront = actor.ba0.Y30 == 1 && outfitCategory.Wo(outfit);
        boolean effectFront = actor.ba0.Y30 == 1 && effectCategory.Wo(effect);
        if (effect == 28 || effect == 30) effectFront = true;
        byte effectDirection;
        if (actor.oI0() && !actor.LH0() && !actor.Ze()) {
            if (Ss0.C90(effect)) {
                byte mapped;
                switch (direction) {
                    case 18:
                    case 21:
                    case 22:
                        mapped = 18;
                        break;
                    case 19:
                    case 23:
                    case 24:
                        mapped = 19;
                        break;
                    default:
                        mapped = 20;
                }
                if (effect == 17 || effect == 40) direction = mapped;
                if (Ss0.lPt2(effect) && !shadow) {
                    actor.Gi().Ry0(effectCategory);
                    ii0(renderer, environment, actor, effectCategory, effect, direction, transform, flip, false);
                }
                effectDirection = direction;
                direction = mapped;
            } else if (effect == 52) {
                long now = hk0_1.KG;
                EA0 state = actor.il0;
                long elapsed = now - state.YT;
                if (now - state.gd < 400L) {
                    int frame = (int) ((elapsed - 200L) / 200L % 4L);
                    if (frame == 3) {
                        float[] matrix = transform.EW;
                        matrix[12] += 0.0F;
                        matrix[13] += 0.0199999996F;
                        matrix[14] += 0.0F;
                    } else if (frame == 2) {
                        float[] matrix = transform.EW;
                        matrix[12] += 0.0F;
                        matrix[13] += 0.0099999998F;
                        matrix[14] += 0.0F;
                    }
                }
                switch (direction) {
                    case 18:
                    case 21:
                    case 22:
                        direction = 27;
                        effectDirection = 18;
                        break;
                    case 19:
                    case 23:
                    case 24:
                        direction = 28;
                        effectDirection = 19;
                        break;
                    default:
                        direction = 29;
                        effectDirection = 20;
                }
            } else {
                effectDirection = direction;
            }
        } else {
            effectDirection = direction;
        }
        if (outfit == 68 || outfit == 73) {
            actor.Gi().Ry0(effectCategory);
            Qp0(renderer, environment, actor, outfitCategory, outfit, direction, transform, flip, false);
        }
        int groups = shadow ? 1 : 3;
        for (int group = 0; group < groups; group++) {
            if (group == 1 || groups == 1) {
                ew0_0 view = ew0_0.C1;
                int id = shadow ? 0 : actor.Gi().rh.Fw;
                LPT6_ image = fr(view, id, direction);
                if (image != null) {
                    if (base == null) base = new com3__3(image.bz, image.xZ, image, true);
                    base.qq0(vo_2.z0);
                    base.Gb0(image, flip);
                    if (shadow) {
                        if (base.MI0().a > 0.5F) base.CQ.v50.set(0.0F, 0.0F, 0.0F, 0.3300000131F);
                    } else if (base.MI0().a < 1.0F) {
                        base.CQ.v50.set(1.0F, 1.0F, 1.0F, 1.0F);
                    }
                    Matrix4 matrix = base.qI0;
                    matrix.getClass();
                    matrix.Dd0(transform.EW);
                    renderer.Lh0(base, environment);
                }
                if (shadow) return base;
            }
            q10_0 category = q10_0.Cw0;
            yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            if (!effectFront && !Ss0.lPt2(effect)) {
                category = q10_0.Qh0;
                yk(renderer, environment, actor, category, effectDirection, actor.Gi().Ry0(category), transform, flip, group);
            }
            q10_0 body = q10_0.bb;
            if (body.QI(actor.Gi().Nul(body))) {
                category = q10_0.l3;
                yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            }
            if (body.cOm4(actor.Gi().Nul(body))) {
                category = q10_0.pv;
                yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            }
            q10_0 accessory = q10_0.Xl;
            boolean accessoryFront = actor.Gi().Nul(accessory) != 1 && actor.ba0.Y30 != 1;
            if (!accessoryFront)
                yk(renderer, environment, actor, accessory, direction, actor.Gi().Ry0(accessory), transform, flip, group);
            yk(renderer, environment, actor, body, direction, actor.Gi().Ry0(body), transform, flip, group);
            if (!outfitFront) {
                category = q10_0.Ci;
                yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            }
            category = q10_0.rg0;
            yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            category = q10_0.uz;
            yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            q10_0 hair = q10_0.VI;
            if (hair.Pd0(actor.Gi().Nul(hair)) && group != 2 && actor.Gi().Nul(q10_0.Bj0) != -1) {
                short hairId = actor.Gi().Nul(hair);
                short hatId = actor.Gi().Nul(q10_0.Bj0);
                EE hatAnimation = actor.Gi().auX[q10_0.Bj0.iL];
                Arrays.fill(HQ, null);
                byte[] groupLayers = UQ[group];
                for (int part = 0; part < KE0.length; part++) {
                    category = KE0[part];
                    for (int i = 0; i < groupLayers.length; i++) {
                        byte layer = groupLayers[i];
                        LPT6_[][] images = HQ;
                        if (images[i] == null)
                            images[i] = MQ(ew0_0.C1, hairId, hatId, direction, layer, false, hatAnimation);
                        LPT6_[] pair = images[i];
                        if (pair == null || pair[part] == null) continue;
                        LPT6_ image = pair[part];
                        short id = category == q10_0.VI ? hairId : hatId;
                        yb_1 tint = qx_1.Con(layer) ? null : actor.Gi().Ry0(category);
                        DB0(layer, renderer, environment, image, category, id, tint, transform, flip, 1.0F);
                    }
                }
            } else {
                yk(renderer, environment, actor, hair, direction, actor.Gi().Ry0(hair), transform, flip, group);
            }
            if (accessoryFront) {
                category = q10_0.Xl;
                yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            }
            if (outfitFront) {
                category = q10_0.Ci;
                yk(renderer, environment, actor, category, direction, actor.Gi().Ry0(category), transform, flip, group);
            }
            if (effectFront && !Ss0.lPt2(effect)) {
                category = q10_0.Qh0;
                yk(renderer, environment, actor, category, effectDirection, actor.Gi().Ry0(category), transform, flip, group);
            }
            if (Ss0.lPt2(effect) && actor.oI0()) {
                category = q10_0.Qh0;
                actor.Gi().Ry0(category);
                ii0(renderer, environment, actor, category, effect, effectDirection, transform, flip, true);
            }
        }
        if (outfit == 68 || outfit == 73) {
            q10_0 category = q10_0.Ci;
            actor.Gi().Ry0(q10_0.Qh0);
            Qp0(renderer, environment, actor, category, outfit, direction, transform, flip, true);
        }
        return base;
    }

    public final com3__3 hF(ER renderer, U5 environment, bi0_1 actor, com3__3 base,
                            com3__3[][] layers, byte direction, C8 position, C8 target, C8 up, boolean flip, boolean shadow) {
        if (actor.Ou()) position.y += 0.0002F;
        C8 forward = vI;
        forward.getClass();
        forward.x = target.x;
        forward.y = target.y;
        forward.z = target.z;
        forward.Vy(position.x, position.y, position.z).KM();
        C8 right = class$;
        right.getClass();
        right.x = up.x;
        right.y = up.y;
        right.z = up.z;
        right.Xv0(forward).KM();
        C8 vertical = TE;
        vertical.getClass();
        vertical.x = forward.x;
        vertical.y = forward.y;
        vertical.z = forward.z;
        vertical.Xv0(right).KM();
        me0_2 rotation = Hv0;
        rotation.WA0(false, right.x, vertical.x, forward.x, right.y, vertical.y, forward.y,
                right.z, vertical.z, forward.z);
        float angle = 0.0F;
        zv_2 location = actor.ba0;
        if (location.uS == 3) {
            LT tile = location.LPt1();
            if (tile != null && tile.gr0()) {
                angle = tile.XC0();
                if (LW.LH0(90.0F, angle)) position.Vy(0.200000003F, 0.25F, -0.0500000007F);
                else if (LW.LH0(270.0F, angle)) position.Vy(-0.150000006F, 0.200000003F, 0.0F);
            }
        }
        right.x = position.x;
        right.y = position.y;
        right.z = position.z;
        q10_0 category = q10_0.Qh0;
        short id = actor.Gi().Nul(category);
        if (actor.oI0() && !actor.LH0() && !actor.Ze() && (id == 28 || id == 30 || id == 52)) {
            right.x = 0.0F;
            right.y = 0.1400000006F;
            right.z = 0.0F;
            X90 addon = (X90) category.Fk.f5(id);
            if (addon != null && id != 52) {
                ew0_0 initialized = ew0_0.C1;
                float time = C4;
                k2 track = addon.yh0[0];
                p_0 animation = track == null ? null : track.nv;
                byte frame = animation == null ? 0 : (Byte) animation.Jy(time, true);
                if (frame == 1 || frame == 2 || frame == 4) right.y += 0.0099999998F;
            }
            right.bm0(rotation);
            right.na(position.x, position.y, position.z);
        }
        Matrix4 transform = Ds0;
        transform.oF0(right, rotation, Ep0);
        if (!LW.LH0(angle, 0.0F)) transform.tO(C8.Z, angle);
        return lPt2(renderer, environment, actor, base, layers, direction, transform, flip, shadow);
    }

    public final void MB0(hl0_1 batch, bi0_1 actor, q10_0 category, short id, byte direction,
                          float x, float y, boolean flip, boolean front) {
        boolean overlayFront = true;
        switch (direction) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
                overlayFront = false;
                break;
            default:
                break;
        }
        long now = hk0_1.KG;
        EA0 animation = actor.il0;
        long elapsed = now - animation.YT;
        long transition = now - animation.gd;
        float duration = (float) animation.Kg / 1000.0F * 1000.0F + 250.0F;
        short overlay = 0;
        if (id == 40) {
            q10_0 effect = q10_0.Qh0;
            ew0_0 initialized = ew0_0.C1;
            EL(effect, Ss0.Q30);
            if (elapsed < 200L) {
                id = 44;
                overlay = 50;
            } else if (transition < 400L) {
                switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                    case 0:
                        id = 41;
                        overlay = 46;
                        break;
                    case 1:
                    case 3:
                        id = 42;
                        overlay = 47;
                        break;
                    case 2:
                        id = 43;
                        overlay = 48;
                        break;
                    default:
                        break;
                }
            } else if (transition < 600L) {
                id = 45;
                overlay = 49;
            }
        } else if (id == 17) {
            q10_0 effect = q10_0.Qh0;
            ew0_0 initialized = ew0_0.C1;
            EL(effect, Ss0.v20);
            if (elapsed < 200L) {
                id = 21;
                overlay = 27;
            } else if (transition < 400L) {
                switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                    case 0:
                        id = 18;
                        overlay = 23;
                        break;
                    case 1:
                    case 3:
                        id = 19;
                        overlay = 24;
                        break;
                    case 2:
                        id = 20;
                        overlay = 25;
                        break;
                    default:
                        break;
                }
            } else if (transition < 600L) {
                id = 22;
                overlay = 26;
            }
        } else {
            overlay = Ss0.zl[(int) (elapsed / 200L % 4L)];
        }
        yb_1 tint = yb_1.Cy0;
        float age = (float) transition;
        if (age < duration && !front && front == overlayFront) {
            LPT6_ image = b50(ew0_0.C1, category, overlay, direction, (byte) 0, false, null);
            if (image != null)
                eI(batch, image, category, overlay, tint, x, y, flip, false, Math.min(1.0F, (duration - age) / 250.0F));
        }
        ew0_0 view = ew0_0.C1;
        LPT6_ image = b50(view, category, id, direction, (byte) (front ? 0 : 2), false, null);
        if (image != null) eI(batch, image, category, id, tint, x, y, flip, true, 1.0F);
        if (front) {
            image = b50(view, category, id, direction, (byte) 1, false, null);
            if (image != null) eI(batch, image, category, id, tint, x, y, flip, false, 1.0F);
        }
        if (age < duration && front && front == overlayFront) {
            image = b50(view, category, overlay, direction, (byte) 0, false, null);
            if (image != null)
                eI(batch, image, category, overlay, tint, x, y, flip, false, Math.min(1.0F, (duration - age) / 250.0F));
        }
    }

    public final void c4(hl0_1 batch, bi0_1 actor, q10_0 category, short id, byte direction,
                         float x, float y, boolean flip, boolean front) {
        boolean overlayFront = false;
        switch (direction) {
            case 1:
            case 5:
            case 6:
            case 12:
            case 13:
            case 14:
            case 19:
            case 23:
            case 24:
            case 28:
            case 31:
            case 34:
            case 43:
            case 44:
            case 45:
            case 46:
                overlayFront = true;
                break;
            default:
                break;
        }
        if (front != overlayFront) return;
        yb_1 tint = yb_1.Cy0;
        long now = hk0_1.KG;
        EA0 animation = actor.il0;
        long elapsed = now - animation.gd;
        float duration = (float) animation.Kg / 1000.0F * 1000.0F + 250.0F;
        float age = (float) elapsed;
        if (age < duration) {
            short[] frames = id == 68 ? Ss0.UQ : Ss0.Yb;
            short frame = frames[(int) (hk0_1.KG / 200L % (long) frames.length)];
            LPT6_ image = b50(ew0_0.C1, category, frame, direction, (byte) 0, false, null);
            if (image != null)
                eI(batch, image, category, frame, tint, x, y, flip, false, Math.min(1.0F, (duration - age) / 250.0F));
        }
    }

    public final void ii0(ER renderer, U5 environment, bi0_1 actor, q10_0 category, short id,
                          byte direction, Matrix4 transform, boolean flip, boolean front) {
        boolean overlayFront = true;
        switch (direction) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
                overlayFront = false;
                break;
            default:
                break;
        }
        long now = hk0_1.KG;
        EA0 animation = actor.il0;
        long elapsed = now - animation.YT;
        long transition = now - animation.gd;
        float duration = (float) animation.Kg / 1000.0F * 1000.0F + 250.0F;
        short overlay = 0;
        if (id == 40) {
            if (elapsed < 200L) {
                id = 44;
                overlay = 50;
            } else if (transition < 400L) {
                switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                    case 0:
                        id = 41;
                        overlay = 46;
                        break;
                    case 1:
                    case 3:
                        id = 42;
                        overlay = 47;
                        break;
                    case 2:
                        id = 43;
                        overlay = 48;
                        break;
                    default:
                        break;
                }
            } else if (transition < 600L) {
                id = 45;
                overlay = 49;
            }
        } else if (id == 17) {
            if (elapsed < 200L) {
                id = 21;
                overlay = 27;
            } else if (transition < 400L) {
                switch ((int) ((elapsed - 200L) / 200L % 4L)) {
                    case 0:
                        id = 18;
                        overlay = 23;
                        break;
                    case 1:
                    case 3:
                        id = 19;
                        overlay = 24;
                        break;
                    case 2:
                        id = 20;
                        overlay = 25;
                        break;
                    default:
                        break;
                }
            } else if (transition < 600L) {
                id = 22;
                overlay = 26;
            }
        } else {
            overlay = Ss0.zl[(int) (elapsed / 200L % 4L)];
        }
        if (overlay != 0 && (float) transition < duration && !front && front == overlayFront) {
            float age = (float) transition;
            LPT6_ image = b50(ew0_0.C1, category, overlay, direction, (byte) 0, false, null);
            if (image != null)
                DB0(1, renderer, environment, image, category, overlay, null, transform, flip, Math.min(1.0F, (duration - age) / 250.0F));
        }
        ew0_0 view = ew0_0.C1;
        LPT6_ image = b50(view, category, id, direction, (byte) (front ? 0 : 2), false, null);
        if (image != null) DB0(front ? 0 : 2, renderer, environment, image, category, id, null, transform, flip, 1.0F);
        if (front) {
            image = b50(view, category, id, direction, (byte) 1, false, null);
            if (image != null) DB0(4, renderer, environment, image, category, id, null, transform, flip, 1.0F);
        }
        float age = (float) transition;
        if (age < duration && front && front == overlayFront) {
            image = b50(view, category, overlay, direction, (byte) 0, false, null);
            if (image != null)
                DB0(1, renderer, environment, image, category, overlay, null, transform, flip, Math.min(1.0F, (duration - age) / 250.0F));
        }
    }

    public final void Qp0(ER renderer, U5 environment, bi0_1 actor, q10_0 category, short id,
                          byte direction, Matrix4 transform, boolean flip, boolean front) {
        boolean overlayFront = false;
        switch (direction) {
            case 1:
            case 5:
            case 6:
            case 12:
            case 13:
            case 14:
            case 19:
            case 23:
            case 24:
            case 28:
            case 31:
            case 34:
            case 43:
            case 44:
            case 45:
            case 46:
                overlayFront = true;
                break;
            default:
                break;
        }
        if (front != overlayFront) return;
        long now = hk0_1.KG;
        EA0 animation = actor.il0;
        long elapsed = now - animation.gd;
        float duration = (float) animation.Kg / 1000.0F * 1000.0F + 250.0F;
        float age = (float) elapsed;
        if (age < duration) {
            short[] frames = id == 68 ? Ss0.UQ : Ss0.Yb;
            short frame = frames[(int) (hk0_1.KG / 200L % (long) frames.length)];
            LPT6_ image = b50(ew0_0.C1, category, frame, direction, (byte) 0, false, null);
            if (image != null)
                DB0(1, renderer, environment, image, category, frame, null, transform, flip, Math.min(1.0F, (duration - age) / 250.0F));
        }
    }

    public final void DB0(int layer, ER renderer, U5 environment, LPT6_ image, q10_0 category,
                          short id, yb_1 tint, Matrix4 transform, boolean flip, float alpha) {
        if (image == null) return;
        com3__3 sprite = o0[layer][category.iL];
        if (sprite == null) {
            sprite = new com3__3(image.bz, image.xZ, image, false);
            o0[layer][category.iL] = sprite;
        }
        boolean shaded = vo_2.z0 && layer != 4 && layer != 1 && layer != 7;
        sprite.qq0(shaded);
        sprite.Gb0(image, flip);
        Matrix4 matrix = sprite.qI0;
        matrix.getClass();
        matrix.Dd0(transform.EW);
        Color color;
        if (tint != null && category.Yy(id)) color = tint.tg0;
        else if (alpha == 1.0F) color = Color.WHITE;
        else {
            color = Ql0;
            color.a = alpha;
        }
        sprite.CQ.v50.set(color);
        renderer.Lh0(sprite, environment);
    }
}
