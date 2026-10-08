package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray.ChannelDescriptor;
import java.util.Arrays;

public class ParticleChannelsExt {
    public static final ChannelDescriptor ScaleXY;
    public static final ChannelDescriptor BaseScaleXY;
    public static final ChannelDescriptor PathId;
    public static final ChannelDescriptor ParticleId;
    public static final ChannelDescriptor ColorParentId;
    public static final ChannelDescriptor RotationParentId;
    public static final ChannelDescriptor SpawnPosition;

    public static final int ScaleXStartOffset = 0;
    public static final int ScaleXDiffOffset = 1;
    public static final int ScaleYStartOffset = 2;
    public static final int ScaleYDiffOffset = 3;

    static {
        ScaleXY = new ChannelDescriptor(ParticleChannels.newGlobalId(), Float.TYPE, 2);
        BaseScaleXY = new ChannelDescriptor(ParticleChannels.newGlobalId(), Float.TYPE, 2);
        PathId = new ChannelDescriptor(ParticleChannels.newGlobalId(), Integer.TYPE, 1);
        ParticleId = new ChannelDescriptor(ParticleChannels.newGlobalId(), Integer.TYPE, 1);
        ColorParentId = new ChannelDescriptor(ParticleChannels.newGlobalId(), Integer.TYPE, 1);
        RotationParentId = new ChannelDescriptor(ParticleChannels.newGlobalId(), Integer.TYPE, 1);
        SpawnPosition = new ChannelDescriptor(ParticleChannels.newGlobalId(), Float.TYPE, 3);
    }

    public static class ScaleXYInitializer implements ParallelArray.ChannelInitializer<ParallelArray.FloatChannel> {
        private static ScaleXYInitializer instance;

        public static ScaleXYInitializer get() {
            if (instance == null) {
                instance = new ScaleXYInitializer();
            }
            return instance;
        }

        @Override
        public void init(ParallelArray.FloatChannel channel) {
            Arrays.fill(channel.data, 0, channel.data.length, 1.0f);
        }
    }
}
