package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.batches.ParticleBatch;
import f.Dn0;
import f.I2;
import f.N00;
import f.cr_2;
import f.es_1;
import f.gp_1;
import f.gq_1;
import f.hd0_2;
import f.in_0;
import f.sg_1;
import f.xn_1;

public class ParticleEffectLoader extends N00 {
    protected es_1 items = new es_1();

    public ParticleEffectLoader(gq_1 resolver) {
        super(resolver);
    }

    private Object find(es_1 array, Class type) {
        I2 iterator = array.ZD();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (type.isAssignableFrom(object.getClass())) return object;
        }
        return null;
    }

    public void loadAsync(hd0_2 manager, String fileName, Dn0 file, ParticleEffectLoadParameter parameter) {
    }

    public es_1 getDependencies(String fileName, Dn0 file, ParticleEffectLoadParameter parameter) {
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
            if (!resolve(assetData.filename).RL()) {
                assetData.filename = file.Br().wp(new Dn0(assetData.filename).BN()).R20();
            }
            if (assetData.type == ParticleEffect.class) {
                descriptors.Ue0(new cr_2(assetData.filename, assetData.type, parameter));
            } else {
                descriptors.Ue0(new cr_2(assetData.filename, assetData.type));
            }
        }
        return descriptors;
    }

    public void save(ParticleEffect effect, ParticleEffectSaveParameter parameter) {
        ResourceData data = new ResourceData(effect);
        effect.save(parameter.manager, data);
        if (parameter.batches != null) {
            I2 batchIterator = parameter.batches.ZD();
            while (batchIterator.hasNext()) {
                ParticleBatch batch = (ParticleBatch)batchIterator.next();
                boolean save = false;
                I2 controllerIterator = effect.getControllers().ZD();
                while (controllerIterator.hasNext()) {
                    ParticleController controller = (ParticleController)controllerIterator.next();
                    if (controller.renderer.isCompatible(batch)) {
                        save = true;
                        break;
                    }
                }
                if (save) batch.save(parameter.manager, data);
            }
        }
        gp_1 json = new gp_1(parameter.jsonOutputType);
        if (parameter.prettyPrint) {
            String prettyJson = json.Lpt2(data);
            parameter.file.Ex0(prettyJson, "UTF-8");
        } else {
            json.vt0(data, parameter.file);
        }
    }

    public ParticleEffect loadSync(hd0_2 manager, String fileName, Dn0 file, ParticleEffectLoadParameter parameter) {
        ResourceData effectData = null;
        synchronized (this.items) {
            for (int i = 0; i < this.items.KB; ++i) {
                xn_1 entry = (xn_1)this.items.get(i);
                if (entry.I20.equals(fileName)) {
                    effectData = (ResourceData)entry.kM;
                    this.items.Tx0(i);
                    break;
                }
            }
        }
        effectData.resource = effectData.resource == null ? new ParticleEffect() : effectData.resource;
        ((ParticleEffect)effectData.resource).load(manager, effectData);
        if (parameter != null) {
            if (parameter.batches != null) {
                I2 iterator = parameter.batches.ZD();
                while (iterator.hasNext()) {
                    ((ParticleBatch)iterator.next()).load(manager, effectData);
                }
            }
            ((ParticleEffect)effectData.resource).setBatch(parameter.batches);
        }
        return (ParticleEffect)effectData.resource;
    }

    @Override
    public Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter) {
        return loadSync(manager, fileName, file, (ParticleEffectLoadParameter)parameter);
    }

    @Override
    public void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameter) {
        loadAsync(manager, fileName, file, (ParticleEffectLoadParameter)parameter);
    }

    @Override
    public es_1 getDependencies(String fileName, Dn0 file, in_0 parameter) {
        return getDependencies(fileName, file, (ParticleEffectLoadParameter)parameter);
    }

    public static class ParticleEffectLoadParameter extends in_0 {
        es_1 batches;

        public ParticleEffectLoadParameter(es_1 batches) {
            this.batches = batches;
        }
    }

    public static class ParticleEffectSaveParameter extends in_0 {
        es_1 batches;
        Dn0 file;
        hd0_2 manager;
        sg_1 jsonOutputType;
        boolean prettyPrint;

        public ParticleEffectSaveParameter(Dn0 file, hd0_2 manager, es_1 batches) {
            this(file, manager, batches, sg_1.Ed, false);
        }

        public ParticleEffectSaveParameter(Dn0 file, hd0_2 manager, es_1 batches, sg_1 jsonOutputType, boolean prettyPrint) {
            this.batches = batches;
            this.file = file;
            this.manager = manager;
            this.jsonOutputType = jsonOutputType;
            this.prettyPrint = prettyPrint;
        }
    }
}
