package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import f.LPT6_;

public class RegionInfluencerExt {
    public static class AnimatedExt extends RegionInfluencer {
        ParallelArray.FloatChannel lifeChannel;

        public AnimatedExt() {
            super();
        }

        public AnimatedExt(AnimatedExt source) {
            super(source);
        }

        public AnimatedExt(LPT6_ region) {
            super(new LPT6_[]{region});
        }

        public AnimatedExt(Texture texture) {
            super(texture);
        }

        @Override
        public void allocateChannels() {
            super.allocateChannels();
            this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
        }

        @Override
        public void update() {
            int regionIndex = 0;
            int lifeIndex = 2;
            int end = this.controller.particles.size * this.regionChannel.strideSize;
            while (regionIndex < end) {
                int regionCount = this.regions.KB;
                RegionInfluencer.AspectTextureRegion region =
                    (RegionInfluencer.AspectTextureRegion)this.regions.get(
                        Math.min(
                            regionCount - 1,
                            (int)(this.lifeChannel.data[lifeIndex] * (float)(regionCount - 1))
                        )
                    );
                float[] data = this.regionChannel.data;
                data[regionIndex] = region.u;
                data[regionIndex + 1] = region.v;
                data[regionIndex + 2] = region.u2;
                data[regionIndex + 3] = region.v2;
                data[regionIndex + 4] = 0.5f;
                data[regionIndex + 5] = region.halfInvAspectRatio;
                regionIndex += this.regionChannel.strideSize;
                lifeIndex += this.lifeChannel.strideSize;
            }
        }

        @Override
        public AnimatedExt copy() {
            return new AnimatedExt(this);
        }
    }

    public static class NDSRegionInfluencer extends AnimatedExt {
        private ParallelArray.FloatChannel regionChannel;
        private ParallelArray.FloatChannel lifeChannel;
        private RegionInfluencer.AspectTextureRegion aspectTextureRegion;
        private com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt target_batch;
        private f.xt_0 ndsAnimatedSprite;
        private short pokemon_id;
        private boolean shiny;
        private boolean backsprite;

        public NDSRegionInfluencer(com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatchExt batch, short pokemonId, boolean shiny, boolean backsprite) {
            super();
            this.ndsAnimatedSprite = f.yh_0.Dl0().P90((byte)0, pokemonId, backsprite, shiny);
            this.aspectTextureRegion = new RegionInfluencer.AspectTextureRegion();
            this.target_batch = batch;
            this.pokemon_id = pokemonId;
            this.shiny = shiny;
            this.backsprite = backsprite;
        }

        @Override
        public void update() {
            f.lg_0.k.lPT5(this.ndsAnimatedSprite);
            int end = this.controller.particles.size * this.regionChannel.strideSize;
            for (int i = 0; i < end; i += this.regionChannel.strideSize) {
                this.aspectTextureRegion.set(this.ndsAnimatedSprite.yq());
                this.target_batch.setTexture(this.ndsAnimatedSprite.yq().OB);
                float[] data = this.regionChannel.data;
                data[i] = this.aspectTextureRegion.u;
                data[i + 1] = this.aspectTextureRegion.v;
                data[i + 2] = this.aspectTextureRegion.u2;
                data[i + 3] = this.aspectTextureRegion.v2;
                data[i + 4] = 0.5f;
                data[i + 5] = this.aspectTextureRegion.halfInvAspectRatio;
            }
        }

        @Override
        public AnimatedExt copy() {
            return new NDSRegionInfluencer(this.target_batch, this.pokemon_id, this.shiny, this.backsprite);
        }

        @Override
        public void allocateChannels() {
            this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
            this.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion);
        }

        @Override
        public void end() {
            super.end();
        }

        @Override
        public void dispose() {
            this.ndsAnimatedSprite.dispose();
            super.dispose();
        }
    }
}
