package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffect;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.I2;
import f.LW;
import f.Nn0;
import f.be_2;
import f.cr_2;
import f.es_1;
import f.hd0_2;
import f.ju_0;
import f.nb_2;
import f.vs_1;

public abstract class ParticleControllerInfluencer extends Influencer {
    public es_1 templates;
    ParallelArray.ObjectChannel particleControllerChannel;

    public ParticleControllerInfluencer() {
        this.templates = new es_1(true, 1, ParticleController.class);
    }

    public ParticleControllerInfluencer(ParticleController... templates) {
        this.templates = new es_1(templates);
    }

    public ParticleControllerInfluencer(ParticleControllerInfluencer source) {
        this((ParticleController[])source.templates.rZ);
    }

    @Override
    public void allocateChannels() {
        this.particleControllerChannel = (ParallelArray.ObjectChannel)this.controller.particles.addChannel(ParticleChannels.ParticleController);
    }

    @Override
    public void end() {
        for (int i = 0; i < this.controller.particles.size; ++i) {
            ((ParticleController[])this.particleControllerChannel.data)[i].end();
        }
    }

    @Override
    public void dispose() {
        if (this.controller != null) {
            for (int i = 0; i < this.controller.particles.size; ++i) {
                ParticleController particleController = ((ParticleController[])this.particleControllerChannel.data)[i];
                if (particleController != null) {
                    particleController.dispose();
                    ((ParticleController[])this.particleControllerChannel.data)[i] = null;
                }
            }
        }
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData data = resources.createSaveData();
        es_1 effects = new es_1();
        synchronized (manager) {
            nb_2 typedAssets = (nb_2)manager.fi0.Wk0(ParticleEffect.class);
            if (typedAssets != null) {
                be_2 values = typedAssets.Ww0();
                while (values.hasNext()) {
                    effects.Ue0(((vs_1)values.next()).w60);
                }
            }
        }

        es_1 controllers = new es_1(this.templates);
        es_1 effectsIndices = new es_1();
        for (int i = 0; i < effects.KB && controllers.KB > 0; ++i) {
            ParticleEffect effect = (ParticleEffect)effects.get(i);
            es_1 effectControllers = effect.getControllers();
            I2 iterator = controllers.ZD();
            Nn0 indices = null;
            while (iterator.hasNext()) {
                ParticleController template = (ParticleController)iterator.next();
                int index = effectControllers.E8(template, true);
                if (index > -1) {
                    if (indices == null) {
                        indices = new Nn0();
                    }
                    iterator.remove();
                    indices.ja0(index);
                }
            }
            if (indices != null) {
                data.saveAsset(manager.RV(effect), ParticleEffect.class);
                effectsIndices.Ue0(indices);
            }
        }
        data.save("indices", effectsIndices);
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData data = resources.getSaveData();
        es_1 savedIndices = (es_1)data.load("indices");
        I2 iterator = savedIndices.ZD();
        cr_2 descriptor;
        while ((descriptor = data.loadAsset()) != null) {
            ParticleEffect effect;
            synchronized (manager) {
                effect = (ParticleEffect)manager.Og0(descriptor.wj, descriptor.RH0);
            }
            if (effect == null) {
                throw new RuntimeException("Template is null");
            }
            es_1 effectControllers = effect.getControllers();
            Nn0 indices = (Nn0)iterator.next();
            for (int i = 0; i < indices.Ml; ++i) {
                this.templates.Ue0(effectControllers.get(indices.X8(i)));
            }
        }
    }

    public static class Random extends ParticleControllerInfluencer {
        ParticleControllerPool pool;

        public Random() {
            this.pool = new ParticleControllerPool();
        }

        public Random(ParticleController... templates) {
            super(templates);
            this.pool = new ParticleControllerPool();
        }

        public Random(Random source) {
            super(source);
            this.pool = new ParticleControllerPool();
        }

        @Override
        public void init() {
            this.pool.clear();
            for (int i = 0; i < this.controller.emitter.maxParticleCount; ++i) {
                this.pool.free(this.pool.newObject());
            }
        }

        @Override
        public void dispose() {
            this.pool.clear();
            super.dispose();
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) {
                ParticleController particleController = (ParticleController)this.pool.obtain();
                particleController.start();
                ((ParticleController[])this.particleControllerChannel.data)[i] = particleController;
            }
        }

        @Override
        public void killParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) {
                ParticleController particleController = ((ParticleController[])this.particleControllerChannel.data)[i];
                particleController.end();
                this.pool.free(particleController);
                ((ParticleController[])this.particleControllerChannel.data)[i] = null;
            }
        }

        @Override
        public Random copy() {
            return new Random(this);
        }

        public class ParticleControllerPool extends ju_0 {
            @Override
            public ParticleController newObject() {
                int size = Random.this.templates.KB;
                ParticleController template = (ParticleController)(size == 0 ? null : Random.this.templates.rZ[(int)LW.Yu.nextLong(size)]);
                ParticleController particleController = template.copy();
                particleController.init();
                return particleController;
            }

            @Override
            public void clear() {
                int free = Random.this.pool.getFree();
                for (int i = 0; i < free; ++i) {
                    ((ParticleController)Random.this.pool.obtain()).dispose();
                }
                super.clear();
            }
        }
    }

    public static class Single extends ParticleControllerInfluencer {
        public Single(ParticleController... templates) {
            super(templates);
        }

        public Single() {
        }

        public Single(Single source) {
            super(source);
        }

        @Override
        public void init() {
            ParticleController first = (ParticleController)this.templates.KI();
            int capacity = this.controller.particles.capacity;
            for (int i = 0; i < capacity; ++i) {
                ParticleController copy = first.copy();
                copy.init();
                ((ParticleController[])this.particleControllerChannel.data)[i] = copy;
            }
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) {
                ((ParticleController[])this.particleControllerChannel.data)[i].start();
            }
        }

        @Override
        public void killParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) {
                ((ParticleController[])this.particleControllerChannel.data)[i].end();
            }
        }

        @Override
        public Single copy() {
            return new Single(this);
        }
    }
}
