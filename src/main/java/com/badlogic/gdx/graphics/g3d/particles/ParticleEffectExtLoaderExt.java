package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt;
import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.Cq0;
import f.Dn0;
import f.I2;
import f.KT;
import f.N00;
import f.Tv0;
import f.VE;
import f.Ww0;
import f.cr_2;
import f.dl_1;
import f.es_1;
import f.gp_1;
import f.gq_1;
import f.hd0_2;
import f.in_0;
import f.lg_0;
import f.nf_1;
import f.xn_1;
import f.zv_1;
import java.io.StringWriter;

public class ParticleEffectExtLoaderExt extends N00 {
    private static final dl_1 log = Cq0.E1(ParticleEffectExtLoaderExt.class);
    protected es_1 items = new es_1();

    public ParticleEffectExtLoaderExt(gq_1 resolver) {
        super(resolver);
    }

    public void loadAsync(hd0_2 manager, String fileName, Dn0 file, ParticleEffectLoadParameterExt parameter) {
    }

    public es_1 getDependencies(String fileName, Dn0 file, ParticleEffectLoadParameterExt parameter) {
        ResourceData data = (ResourceData)new gp_1().YC(file, ResourceData.class);
        es_1 assets;
        synchronized (this.items) {
            xn_1 entry = new xn_1();
            entry.I20 = fileName;
            entry.kM = data;
            this.items.Ue0(entry);
            assets = data.getAssets();
        }

        es_1 descriptors = new es_1();
        I2 iterator = assets.ZD();
        while (iterator.hasNext()) {
            ResourceData.AssetData assetData = (ResourceData.AssetData)iterator.next();
            if (!resolve(assetData.filename).os0()) {
                Dn0 parent = file.Br();
                String name = assetData.filename;
                lg_0.I70.getClass();
                assetData.filename = parent.wp(new VE(name, zv_1.tt0).Q50.getName()).el();
            }
            Class type = assetData.type;
            if (type == ParticleEffectExt.class) {
                descriptors.Ue0(new cr_2(assetData.filename, type, parameter));
            } else {
                descriptors.Ue0(new cr_2(assetData.filename, type));
            }
        }
        return descriptors;
    }

    public void save(ParticleEffectExt effect, ParticleEffectSaveParameter parameter) {
        ResourceData data = getResourceData(effect, parameter);
        new gp_1().vt0(data, parameter.file);
    }

    public ResourceData getResourceData(ParticleEffectExt effect, ParticleEffectSaveParameter parameter) {
        ResourceData data = new ResourceData(effect);
        effect.save(parameter.manager, data);
        int controllerCount = effect.getControllers().KB;
        es_1 batches = parameter.batches;
        if (batches != null) {
            int batchIndex = 0;
            I2 batchIterator = batches.ZD();
            while (batchIterator.hasNext()) {
                ParticleBatch batch = (ParticleBatch)batchIterator.next();
                if (batchIndex >= controllerCount) {
                    System.out.println("Found too many batches. Trimming.");
                    continue;
                }
                ResourceData.SaveData batchData = data.createSaveData("billboardBatchExt" + batchIndex);
                ++batchIndex;

                boolean compatible = false;
                I2 controllerIterator = effect.getControllers().ZD();
                while (controllerIterator.hasNext()) {
                    ParticleController controller = (ParticleController)controllerIterator.next();
                    if (controller.renderer.isCompatible(batch)) {
                        compatible = true;
                        break;
                    }
                }

                if (compatible && batch instanceof BillboardParticleBatchExt) {
                    ((BillboardParticleBatchExt)batch).save(batchData, parameter.manager);
                } else if (compatible) {
                    batch.save(parameter.manager, data);
                }
            }
        }
        return data;
    }

    public String getSaveResults(ResourceData data) {
        gp_1 json = new gp_1();
        Class clazz = data == null ? null : data.getClass();
        StringWriter writer = new StringWriter();
        json.Zx(writer);
        try {
            json.XH(data, clazz, null);
        } finally {
            KT.E1(json.FO);
            json.FO = null;
        }
        return writer.toString();
    }

    public ParticleEffectExt loadSync(hd0_2 manager, String fileName, Dn0 file, ParticleEffectLoadParameterExt parameter) {
        ResourceData effectData = null;
        synchronized (this.items) {
            for (int i = 0; i < this.items.KB; ++i) {
                xn_1 entry = (xn_1)this.items.get(i);
                if (((String)entry.I20).equals(fileName)) {
                    effectData = (ResourceData)entry.kM;
                    this.items.Tx0(i);
                    break;
                }
            }
        }

        ((ParticleEffectExt)effectData.resource).load(manager, effectData);
        if (parameter != null) {
            BillboardParticleBatchExt batch = new BillboardParticleBatchExt(parameter.shaderProvider);
            batch.setCamera(parameter.camera);
            es_1 batches = new es_1();
            batches.Ue0(batch);

            if (effectData.getSaveData("billboardBatchExt") != null) {
                I2 batchIterator = batches.ZD();
                while (batchIterator.hasNext()) {
                    ((ParticleBatch)batchIterator.next()).load(manager, effectData);
                }
                ((ParticleEffectExt)effectData.resource).setBatch(batches);
            } else {
                int batchIndex = 0;
                ResourceData.SaveData batchData = effectData.getSaveData("billboardBatchExt0");
                while (batchData != null) {
                    if (batchIndex > 0) {
                        batch = new BillboardParticleBatchExt(parameter.shaderProvider, false);
                        batch.setCamera(parameter.camera);
                        batches.Ue0(batch);
                    }
                    batch.load(batchData);
                    batchData = effectData.getSaveData("billboardBatchExt" + ++batchIndex);
                }

                if (((ParticleEffectExt)effectData.resource).getControllers().KB > batches.KB) {
                    log.error("Controller size may not exceed batch size", new nf_1(""));
                }

                int controllerIndex = 0;
                I2 controllerIterator = ((ParticleEffectExt)effectData.resource).getControllers().ZD();
                while (controllerIterator.hasNext()) {
                    ParticleController controller = (ParticleController)controllerIterator.next();
                    controller.renderer.setBatch((ParticleBatch)batches.get(controllerIndex++));
                }
            }
            ((ParticleEffectExt)effectData.resource).setBatches(batches);
        }
        return (ParticleEffectExt)effectData.resource;
    }

    @Override
    public Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter) {
        return loadSync(manager, fileName, file, (ParticleEffectLoadParameterExt)parameter);
    }

    @Override
    public void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter) {
        loadAsync(manager, fileName, file, (ParticleEffectLoadParameterExt)parameter);
    }

    @Override
    public es_1 getDependencies(String fileName, Dn0 file, in_0 parameter) {
        return getDependencies(fileName, file, (ParticleEffectLoadParameterExt)parameter);
    }

    public static class ParticleEffectSaveParameter extends in_0 {
        es_1 batches;
        Dn0 file;
        hd0_2 manager;

        public ParticleEffectSaveParameter(Dn0 file, hd0_2 manager, es_1 batches) {
            this.batches = batches;
            this.file = file;
            this.manager = manager;
        }
    }

    public static class ParticleEffectLoadParameterExt extends in_0 {
        Tv0 camera;
        Ww0 shaderProvider;

        public ParticleEffectLoadParameterExt(Tv0 camera, Ww0 shaderProvider) {
            this.camera = camera;
            this.shaderProvider = shaderProvider;
        }
    }
}
