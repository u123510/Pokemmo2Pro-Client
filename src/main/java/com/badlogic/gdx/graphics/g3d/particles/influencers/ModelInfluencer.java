package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.I2;
import f.LW;
import f.St;
import f.cr_2;
import f.es_1;
import f.hd0_2;
import f.ju_0;
import f.ut_0;

public abstract class ModelInfluencer extends Influencer {
    public es_1 models;
    ParallelArray.ObjectChannel modelChannel;

    public ModelInfluencer() {
        this.models = new es_1(true, 1, ut_0.class);
    }

    public ModelInfluencer(ut_0... models) {
        this.models = new es_1(models);
    }

    public ModelInfluencer(ModelInfluencer source) {
        this((ut_0[])source.models.Mo0(ut_0.class));
    }

    @Override
    public void allocateChannels() {
        this.modelChannel = (ParallelArray.ObjectChannel)this.controller.particles.addChannel(ParticleChannels.ModelInstance);
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData saveData = resources.createSaveData();
        I2 iterator = this.models.ZD();
        while (iterator.hasNext()) saveData.saveAsset(manager.RV((ut_0)iterator.next()), ut_0.class);
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
        ResourceData.SaveData saveData = resources.getSaveData();
        cr_2 descriptor;
        while ((descriptor = saveData.loadAsset()) != null) {
            ut_0 model;
            synchronized (manager) {
                model = (ut_0)manager.Og0(descriptor.wj, descriptor.RH0);
            }
            if (model == null) throw new RuntimeException("Model is null");
            this.models.Ue0(model);
        }
    }

    public static class Random extends ModelInfluencer {
        ModelInstancePool pool;

        public Random() {
            this.pool = new ModelInstancePool();
        }

        public Random(Random source) {
            super(source);
            this.pool = new ModelInstancePool();
        }

        public Random(ut_0... models) {
            super(models);
            this.pool = new ModelInstancePool();
        }

        @Override
        public void init() {
            this.pool.clear();
        }

        @Override
        public void activateParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) ((St[])this.modelChannel.data)[i] = (St)this.pool.obtain();
        }

        @Override
        public void killParticles(int startIndex, int count) {
            int end = startIndex + count;
            for (int i = startIndex; i < end; ++i) {
                this.pool.free(((St[])this.modelChannel.data)[i]);
                ((St[])this.modelChannel.data)[i] = null;
            }
        }

        @Override
        public Random copy() { return new Random(this); }

        public class ModelInstancePool extends ju_0 {
            @Override
            public St newObject() {
                int size = Random.this.models.KB;
                ut_0 model = (ut_0)(size == 0 ? null : Random.this.models.rZ[(int)LW.Yu.nextLong(size)]);
                return new St(model);
            }
        }
    }

    public static class Single extends ModelInfluencer {
        public Single() { }
        public Single(Single source) { super(source); }
        public Single(ut_0... models) { super(models); }

        @Override
        public void init() {
            ut_0 model = (ut_0)this.models.KI();
            int count = this.controller.emitter.maxParticleCount;
            for (int i = 0; i < count; ++i) ((St[])this.modelChannel.data)[i] = new St(model);
        }

        @Override
        public Single copy() { return new Single(this); }
    }
}
