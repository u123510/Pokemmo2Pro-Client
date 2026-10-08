package cn.pokemmo.particle;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.APSType;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExtLoaderExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectLoaderExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.renderers.BillboardRendererExt;
import f.*;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipFile;

/**
 * 全局粒子系统与特效管理器 (Particle System & Effect Manager)
 * 负责解析加载 .vfx 特效、管理活动粒子实例、公告板贴图生成、相机绑定、多帧时间步长更新以及与渲染管线的对接。
 *
 * 原混淆类: f.ff_0
 */
public class ParticleManager implements uh_1, fy0_0 {
    public static final dl_1 D2 = Cq0.E1(ParticleManager.class);
    public static FJ K3 = null;
    public static gq_1 ij;
    public static Ww0 hL;
    public static float iH0 = 0.016666668F;
    public int COm2;
    public int ig;
    public final es_1 j8;
    public final ArrayDeque Go0;
    public final hd0_2 Vk;
    public final BJ0 XS;
    public final Texture Prn;
    public vh_1 A7;
    public float Nb0;
    public final cf_2 AG;

    public ParticleManager(BJ0 camera) {
        this(camera, 0);
    }

    public ParticleManager(BJ0 camera, int ignored) {
        this.COm2 = 0;
        this.ig = 0;
        this.Go0 = new ArrayDeque();
        this.Nb0 = 0.0F;
        this.AG = new cf_2();
        this.j8 = new es_1();
        this.XS = camera;

        eE();

        this.Vk = new hd0_2(ij);
        this.Vk.ok(ParticleEffect.class, new ParticleEffectLoaderExt(ij));
        this.Vk.ok(ParticleEffectExt.class, new ParticleEffectExtLoaderExt(ij));
        if (hL == null) {
            hL = new Ww0();
        }

        i4_0 pixmap = new i4_0(1, 1, ix0_0.Vp0);
        this.Prn = new Texture(pixmap);
        pixmap.dispose();
    }

    public static void eE() {
        if (ij != null) {
            return;
        }

        ij = new la0_1("data/sprites/particles/");
        if (tw0_0.xj0()) {
            return;
        }

        try {
            os0_0 archive = lg_0.I70;
            archive.getClass();
            VE pak = new VE("data/sprites/particles.pak", zv_1.tt0);
            if (!pak.os0()) {
                return;
            }

            ZipFile zip = new ZipFile(pak.l00());
            gq_1[] sources = new gq_1[]{ij, new Ek0(zip)};
            ij = new H80(sources);
        } catch (IOException e) {
            D2.error("Error loading particle data.", e);
            throw new nf_1("Error loading particle data.");
        }
    }

    public static i4_0 He(i4_0 image, boolean repeatX, boolean repeatY) {
        if (image == null || (!repeatX && !repeatY)) {
            return image;
        }

        if (repeatX && !repeatY) {
            i4_0 result = new i4_0(image.XF.SH * 2, image.XF.mB0, ix0_0.Vw);
            i4_0 flipped = fp_2.Qx(image, true, false);
            result.NH0(image, 0, 0);
            result.NH0(flipped, image.XF.SH, 0);
            flipped.dispose();
            image.dispose();
            return result;
        }

        if (repeatY && !repeatX) {
            i4_0 result = new i4_0(image.XF.SH, image.XF.mB0 * 2, ix0_0.Vw);
            i4_0 flipped = fp_2.Qx(image, false, true);
            result.NH0(image, 0, 0);
            result.NH0(flipped, 0, image.XF.mB0);
            flipped.dispose();
            image.dispose();
            return result;
        }

        i4_0 result = new i4_0(image.XF.SH * 2, image.XF.mB0 * 2, ix0_0.Vw);
        result.Pa0(DF0.Ha0);
        i4_0 flipX = fp_2.Qx(image, true, false);
        i4_0 flipY = fp_2.Qx(image, false, true);
        i4_0 flipBoth = fp_2.Qx(image, true, true);
        result.NH0(image, 0, 0);
        result.NH0(flipX, image.XF.SH, 0);
        result.NH0(flipY, 0, image.XF.mB0);
        result.NH0(flipBoth, image.XF.SH, image.XF.mB0);
        flipX.dispose();
        flipY.dispose();
        flipBoth.dispose();
        image.dispose();
        return result;
    }

    public final void nI(nj0_0 resources) {
        if (K3 == null) {
            String path = "/a/0/0/6";
            K3 = new FJ((Ae) resources.fd0.dg.get(path));
        }
        this.A7 = K3;
    }

    public final void fY(ParticleEffectExt effect) {
        this.j8.Ue0(effect);
        if (lpt3__1.Ha0) {
            this.AG.n3(effect, hk0_1.KG);
        }
    }

    public final void addEffect(ParticleEffectExt effect) {
        fY(effect);
    }

    public final void Kz0(ParticleEffectExt effect) {
        if (this.j8.sj0(effect, true)) {
            effect.dispose();
        }
        if (lpt3__1.Ha0 && this.AG.Vd(effect)) {
            D2.info("effect done in = {}ms {}", hk0_1.KG - (Long) this.AG.vC(effect, null), effect);
            this.AG.qq0(effect);
        }
    }

    public final void removeEffect(ParticleEffectExt effect) {
        Kz0(effect);
    }

    public final void I2() {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ParticleEffectExt effect = (ParticleEffectExt) iterator.next();
            if (effect.isComplete()) {
                this.Kz0(effect);
            }
        }
    }

    public final void zd() {
        this.j8.clear();
        if (lpt3__1.Ha0) {
            this.AG.clear();
        }
    }

    public final void clear() {
        zd();
    }

    public final void aUX() {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ((ParticleEffectExt) iterator.next()).dispose();
        }
        this.zd();
    }

    public final void pZ() {
        this.zd();
        Iterator iterator = this.Go0.iterator();
        while (iterator.hasNext()) {
            String path = (String) iterator.next();
            if (!this.Vk.u70(path)) {
                D2.info("Tried to unload not loaded asset: {}", path);
            } else {
                this.Vk.Mj(path);
            }
            iterator.remove();
        }
    }

    public final ParticleEffectExt UH0(String name) {
        try {
            ParticleEffectExt effect = this.B2("particle/" + name + ".vfx").copy();
            effect.init();
            return effect;
        } catch (Exception e) {
            StringBuilder details = new StringBuilder(256);
            synchronized (this.Vk) {
                Iterator entries = this.Vk.LJ0.lb0();
                while (entries.hasNext()) {
                    xn_1 entry = (xn_1) entries.next();
                    String asset = (String) entry.I20;
                    Class type = (Class) entry.kM;
                    if (details.length() > 0) {
                        details.append('\n');
                    }
                    nb_2 typeRefs = (nb_2) this.Vk.fi0.Wk0(type);
                    details.append(asset).append(", ")
                            .append(type.getSimpleName())
                            .append(", refs:")
                            .append(((vs_1) typeRefs.Wk0(asset)).k50);
                    es_1 dependencies = (es_1) this.Vk.GE.Wk0(asset);
                    if (dependencies != null) {
                        details.append(", deps: [");
                        I2 dependencyIterator = dependencies.ZD();
                        while (dependencyIterator.hasNext()) {
                            details.append((String) dependencyIterator.next()).append(',');
                        }
                        details.append(']');
                    }
                }
            }
            D2.info("Couldn't load VFXFully {}\n{}", name, details.toString(), e);
            return new ParticleEffectExt();
        }
    }

    public final ParticleEffectExt obtainEffect(String name) {
        return UH0(name);
    }

    public final void update() {
        this.Ng0(lg_0.S4.uL);
    }

    public final void Ng0(float delta) {
        this.Nb0 += delta;
        if (lpt3__1.Ha0) {
            this.ig++;
        }
        while (this.Nb0 >= iH0) {
            I2 iterator = this.j8.ZD();
            while (iterator.hasNext()) {
                ((ParticleEffectExt) iterator.next()).update(iH0);
            }
            this.Nb0 -= iH0;
            if (lpt3__1.Ha0) {
                this.COm2++;
            }
        }
        if (this.Nb0 < 0.0F) {
            this.Nb0 = 0.0F;
        }
    }

    public final void begin() {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ((ParticleEffectExt) iterator.next()).begin();
        }
    }

    public final void me0() {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ((ParticleEffectExt) iterator.next()).draw();
        }
    }

    public final void end() {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ((ParticleEffectExt) iterator.next()).end();
        }
    }

    @Override
    public final void getRenderables(es_1 renderables, ju_0 pool) {
        I2 iterator = this.j8.ZD();
        while (iterator.hasNext()) {
            ((ParticleEffectExt) iterator.next()).getRenderables(renderables, pool);
        }
    }

    @Override
    public final void dispose() {
        this.aUX();
        this.Vk.dispose();
        this.Prn.dispose();
    }

    public final hd0_2 FF() {
        return this.Vk;
    }

    public final Texture RY(ParticleControllerExt controller) {
        APSType type = controller.type;
        int id = controller.aps_id;
        int low = (int) controller.aps_texture_range.getLowMin();
        int high = (int) controller.aps_texture_range.getLowMax();
        boolean repeatX = controller.repeat_x;
        boolean repeatY = controller.repeat_y;
        boolean flipX = controller.flip_x;
        boolean flipY = controller.flip_y;
        boolean mix = controller.mix;
        boolean average = controller.avg;

        if (id >= this.A7.size()) {
            D2.error("Attempted to load invalid APS texture ( {} ). #{} folder {} size: {}",
                    new Object[]{type, id, this.A7.xX, this.A7.size(), new RuntimeException()});
            return null;
        }

        if (type == APSType.CUSTOM) {
            i4_0 image = new i4_0(ij.bC0("sprites/" + id + ".png"));
            if (repeatX || repeatY) {
                if (flipX || flipY) {
                    D2.error("Flip / Repeat functions are mutually exclusive", new IllegalArgumentException());
                }
                image = He(image, repeatX, repeatY);
            }
            if (flipX || flipY) {
                if (repeatX || repeatY) {
                    D2.error("Flip / Repeat functions are mutually exclusive", new IllegalArgumentException());
                }
                i4_0 old = image;
                image = fp_2.Qx(image, flipX, flipY);
                old.dispose();
            }
            Texture texture = new Texture(image);
            image.dispose();
            return texture;
        }

        jg_0 atlas = jg_0.vE0(this.A7.EG(id));
        if (mix && low != high) {
            i4_0 first = He(atlas.RB0(low), repeatX, repeatY);
            i4_0 last = He(atlas.RB0(high), repeatX, repeatY);
            if (first == null || last == null) {
                return new Texture(new i4_0(1, 1, ix0_0.Vw));
            }

            int firstWidth = first.XF.SH;
            int lastWidth = last.XF.SH;
            if (firstWidth >= lastWidth) {
                first.NH0(last, (firstWidth - lastWidth) / 2,
                        (first.XF.mB0 - last.XF.mB0) / 2);
                last.dispose();
                if (flipX || flipY) {
                    i4_0 old = first;
                    first = fp_2.Qx(first, flipX, flipY);
                    old.dispose();
                }
                Texture texture = new Texture(first);
                first.dispose();
                return texture;
            }

            last.NH0(first, (lastWidth - firstWidth) / 2,
                    (last.XF.mB0 - first.XF.mB0) / 2);
            first.dispose();
            if (flipX || flipY) {
                i4_0 old = last;
                last = fp_2.Qx(last, flipX, flipY);
                old.dispose();
            }
            Texture texture = new Texture(last);
            last.dispose();
            return texture;
        }

        if (low != high) {
            int frameCount = high - low + 1;
            i4_0 combined = null;
            int frameWidth = 0;
            int frameHeight = 0;
            int destinationFrame = 0;

            if (average) {
                for (int frameIndex = low; frameIndex <= high; frameIndex++) {
                    FE[] frames = atlas.Ta;
                    FE frame = frames.length > frameIndex && frameIndex >= 0 ? frames[frameIndex] : null;
                    int width = frame.BU;
                    int height = frame.YE0;
                    if (frameWidth < width) {
                        frameWidth = width;
                    }
                    if (frameHeight < height) {
                        frameHeight = width;
                    }
                }
            }

            for (int frameIndex = low; frameIndex <= high; frameIndex++) {
                i4_0 image = He(atlas.RB0(frameIndex), repeatX, repeatY);
                if ((frameWidth == 0 || frameHeight == 0) && image != null) {
                    frameWidth = image.XF.SH;
                    frameHeight = image.XF.mB0;
                }
                if (combined == null && image != null) {
                    combined = new i4_0(frameWidth * frameCount, frameHeight, ix0_0.Vw);
                    combined.Pa0(DF0.Is);
                    combined.XF.ts0(0);
                }
                if (image != null && combined != null) {
                    if (average && image.XF.SH != frameWidth) {
                        combined.XF.Cg(image.XF, 0, 0, image.XF.SH, image.XF.mB0,
                                destinationFrame++ * frameWidth, 0, frameWidth, frameHeight);
                    } else {
                        combined.XF.bJ(image.XF, 0, 0, destinationFrame++ * frameWidth, 0,
                                image.XF.SH, image.XF.mB0);
                    }
                    image.dispose();
                }
            }

            if (combined != null) {
                if (flipX || flipY) {
                    i4_0 old = combined;
                    combined = fp_2.Qx(combined, flipX, flipY);
                    old.dispose();
                }
                Texture texture = new Texture(combined);
                combined.dispose();
                return texture;
            }
            return null;
        }

        i4_0 image = atlas.RB0(low);
        if (image == null) {
            D2.error("Texture not found {} type {} id {}",
                    new Object[]{low, type, id, new RuntimeException()});
        }
        image = He(image, repeatX, repeatY);
        Texture texture = null;
        if (image != null) {
            if (flipX || flipY) {
                i4_0 old = image;
                image = fp_2.Qx(image, flipX, flipY);
                old.dispose();
            }
            texture = new Texture(image);
            image.dispose();
        }
        return texture;
    }

    public final ParticleEffectExt B2(String path) {
        es_1 loadedAssets;
        synchronized (this.Vk) {
            loadedAssets = this.Vk.LJ0.mC0().Com2();
        }

        if (loadedAssets.KB > 15 || (!lpt3__1.Bv && this.Vk.FG().KB > 0)) {
            int room = this.Vk.FG().KB - 15;
            ArrayList candidates = new ArrayList();
            Iterator iterator = this.Go0.iterator();
            while (iterator.hasNext()) {
                String asset = (String) iterator.next();
                if (!this.Vk.u70(asset)) {
                    iterator.remove();
                    D2.info("Tried to unload not loaded asset: {}", asset);
                } else if (this.Vk.R80(asset) <= 1) {
                    candidates.add(asset);
                }
            }
            for (Object candidate : candidates) {
                String asset = (String) candidate;
                this.Vk.Mj(asset);
                this.Go0.remove(asset);
                if (--room < 1) {
                    break;
                }
            }
        }

        path = path.replaceAll("\\\\", "/");
        this.Vk.im(path, ParticleEffectExt.class,
                new ParticleEffectExtLoaderExt.ParticleEffectLoadParameterExt(this.XS, hL));
        this.Vk.Q4();
        ParticleEffectExt effect = (ParticleEffectExt) this.Vk.nc(ParticleEffectExt.class, path);
        if (this.Vk.R80(path) == 1) {
            this.Vk.v9(2, path);
        }
        this.Go0.remove(path);
        this.Go0.add(path);
        if (effect.isLoaded()) {
            return effect;
        }

        es_1 batches = effect.getBatches();
        int batchIndex = 0;
        I2 controllers = effect.getControllers().ZD();
        while (controllers.hasNext()) {
            ParticleController controller = (ParticleController) controllers.next();
            if (!(controller instanceof ParticleControllerExt)) {
                continue;
            }
            ParticleControllerExt ext = (ParticleControllerExt) controller;
            BillboardParticleBatchExt batch;
            if (batches.KB <= batchIndex) {
                batch = new BillboardParticleBatchExt(hL, false);
                batch.setCamera(this.XS);
                ext.renderer = new BillboardRendererExt(batch);
                Texture texture = null;
                boolean failed = false;
                try {
                    texture = this.RY(ext);
                } catch (Exception e) {
                    failed = true;
                    D2.error("Failed to load effect {} {} {}",
                            new Object[]{effect.path(), ext.type, ext.aps_id, e});
                }
                if (!failed && texture != null) {
                    batch.setTexture(texture);
                    effect.addResource(texture);
                } else {
                    batch.setTexture(fn_0.qz0().lS);
                }
                batch.initRenderData();
                batchIndex++;
                batches.Ue0(batch);
            } else {
                batch = (BillboardParticleBatchExt) batches.get(batchIndex++);
                Texture texture = null;
                boolean failed = false;
                try {
                    texture = this.RY(ext);
                } catch (Exception e) {
                    failed = true;
                    D2.error("Failed to load aps texture type = {} {} {}",
                            new Object[]{ext.type, ext.aps_id, effect.path(), e});
                }
                if (!failed && texture != null) {
                    batch.setTexture(texture);
                    effect.addResource(texture);
                } else {
                    batch.setTexture(fn_0.qz0().lS);
                }
            }
        }

        effect.setLoaded(this.Vk, path);
        return effect;
    }
}
