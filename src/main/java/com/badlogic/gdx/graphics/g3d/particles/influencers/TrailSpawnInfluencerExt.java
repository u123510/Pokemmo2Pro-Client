package com.badlogic.gdx.graphics.g3d.particles.influencers;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannelsExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.ResourceData;
import f.C8;
import f.gp_1;
import f.h4_0;
import f.hd0_2;
import f.oe_0;

public class TrailSpawnInfluencerExt extends Influencer {
    private ParallelArray.FloatChannel positionChannel;
    private ParallelArray.FloatChannel colorChannel;
    private ParallelArray.FloatChannel rotationChannel;
    private ParallelArray.IntChannel colorParentOffsetChannel;
    private ParallelArray.IntChannel rotationParentOffsetChannel;

    public C8 spawnPosition;
    public ParallelArray.FloatChannel parent;
    public ParallelArray.FloatChannel positionChannelParent;
    public ParallelArray.FloatChannel parentColor;
    public int parentColorOffset;
    public ParallelArray.FloatChannel parentRotation;
    public int parentRotationOffset;
    public boolean copyParentColor;
    public boolean copyParentColorAlpha;
    public boolean copyParentColorDynamic;
    public boolean copyParentRotation;
    public boolean copyParentRotationDynamic;

    public TrailSpawnInfluencerExt() {
        this.copyParentColor = true;
        this.copyParentColorAlpha = true;
        this.copyParentColorDynamic = false;
        this.copyParentRotation = true;
        this.copyParentRotationDynamic = false;
        this.spawnPosition = new C8();
    }

    public TrailSpawnInfluencerExt(TrailSpawnInfluencerExt source) {
        this.copyParentColor = true;
        this.copyParentColorAlpha = true;
        this.copyParentColorDynamic = false;
        this.copyParentRotation = true;
        this.copyParentRotationDynamic = false;
        this.spawnPosition = new C8();
        this.copyParentColor = source.copyParentColor;
        // Bytecode keeps copyParentColorAlpha at constructor default (true).
        this.copyParentColorDynamic = source.copyParentColorDynamic;
        this.copyParentRotation = source.copyParentRotation;
        this.copyParentRotationDynamic = source.copyParentRotationDynamic;
    }

    @Override
    public void init() {
    }

    @Override
    public void allocateChannels() {
        this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
        this.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color);
        this.colorParentOffsetChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.ColorParentId);
        this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D);
        this.rotationParentOffsetChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.RotationParentId);
    }

    @Override
    public void start() {
    }

    @Override
    public void update() {
        super.update();
        if (this.positionChannelParent != null) {
            int offset = 0;
            int end = this.controller.particles.size * this.positionChannel.strideSize;
            while (offset < end) {
                int base = offset;
                this.positionChannel.data[offset] = this.positionChannelParent.data[offset];
                this.positionChannel.data[offset + 1] = this.positionChannelParent.data[offset + 1];
                this.positionChannel.data[offset + 2] = this.positionChannelParent.data[offset + 2] - 0.001f;
                offset = base + this.positionChannel.strideSize;
            }
        }

        if (this.parentColor != null && this.copyParentColor && this.copyParentColorDynamic) {
            int colorOffset = 0;
            int parentIndexOffset = 0;
            int end = this.controller.particles.size * this.colorChannel.strideSize;
            while (colorOffset < end) {
                int sourceOffset = this.colorParentOffsetChannel.data[parentIndexOffset];
                this.colorChannel.data[colorOffset] = this.parentColor.data[sourceOffset];
                this.colorChannel.data[colorOffset + 1] = this.parentColor.data[sourceOffset + 1];
                this.colorChannel.data[colorOffset + 2] = this.parentColor.data[sourceOffset + 2];
                this.colorChannel.data[colorOffset + 3] = this.parentColor.data[sourceOffset + 3];
                colorOffset += this.colorChannel.strideSize;
                parentIndexOffset += this.colorParentOffsetChannel.strideSize;
            }
        }

        if (this.parentColor != null && (this.copyParentColor || this.copyParentColorAlpha) && this.copyParentColorDynamic) {
            int colorOffset = 0;
            int parentIndexOffset = 0;
            int end = this.controller.particles.size * this.colorChannel.strideSize;
            while (colorOffset < end) {
                int sourceOffset = this.colorParentOffsetChannel.data[parentIndexOffset];
                if (this.copyParentColor) {
                    this.colorChannel.data[colorOffset] = this.parentColor.data[sourceOffset];
                    this.colorChannel.data[colorOffset + 1] = this.parentColor.data[sourceOffset + 1];
                    this.colorChannel.data[colorOffset + 2] = this.parentColor.data[sourceOffset + 2];
                }
                if (this.copyParentColorAlpha) {
                    this.colorChannel.data[colorOffset + 3] = this.parentColor.data[sourceOffset + 3];
                }
                colorOffset += this.colorChannel.strideSize;
                parentIndexOffset += this.colorParentOffsetChannel.strideSize;
            }
        }

        if (this.copyParentRotation && this.copyParentRotationDynamic && this.parentRotation != null) {
            int rotationOffset = 0;
            int parentIndexOffset = 0;
            int end = this.controller.particles.size * this.rotationChannel.strideSize;
            while (rotationOffset < end) {
                int sourceOffset = this.rotationParentOffsetChannel.data[parentIndexOffset];
                this.rotationChannel.data[rotationOffset] = this.parentRotation.data[sourceOffset];
                this.rotationChannel.data[rotationOffset + 1] = this.parentRotation.data[sourceOffset + 1];
                rotationOffset += this.rotationChannel.strideSize;
                parentIndexOffset += this.rotationParentOffsetChannel.strideSize;
            }
        }
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        if (this.positionChannelParent != null) {
            int stride = this.positionChannel.strideSize;
            int offset = startIndex * stride;
            int end = count * stride + offset;
            while (offset < end) {
                int base = offset;
                ParticleControllerComponent.TMP_V1.np(this.spawnPosition);
                this.positionChannel.data[offset] = this.positionChannelParent.data[offset];
                this.positionChannel.data[offset + 1] = this.positionChannelParent.data[offset + 1];
                this.positionChannel.data[offset + 2] = this.positionChannelParent.data[offset + 2] - 0.01f;
                offset = base + this.positionChannel.strideSize;
            }
            return;
        }

        int stride = this.positionChannel.strideSize;
        int offset = startIndex * stride;
        int end = count * stride + offset;
        while (offset < end) {
            int base = offset;
            C8 tmp = ParticleControllerComponent.TMP_V1;
            tmp.np(this.spawnPosition);
            this.positionChannel.data[offset] = tmp.x;
            this.positionChannel.data[offset + 1] = tmp.y;
            this.positionChannel.data[offset + 2] = tmp.z;
            offset = base + this.positionChannel.strideSize;
        }

        if ((this.copyParentColor || this.copyParentColorAlpha) && this.parentColor != null) {
            int indexStride = this.colorParentOffsetChannel.strideSize;
            int indexOffset = startIndex * indexStride;
            int indexEnd = count * indexStride + indexOffset;
            while (indexOffset < indexEnd) {
                this.colorParentOffsetChannel.data[indexOffset] = this.parentColorOffset;
                indexOffset += this.colorParentOffsetChannel.strideSize;
            }

            stride = this.colorChannel.strideSize;
            offset = startIndex * stride;
            end = count * stride + offset;
            while (offset < end) {
                if (this.copyParentColor) {
                    this.colorChannel.data[offset] = this.parentColor.data[this.parentColorOffset];
                    this.colorChannel.data[offset + 1] = this.parentColor.data[this.parentColorOffset + 1];
                    this.colorChannel.data[offset + 2] = this.parentColor.data[this.parentColorOffset + 2];
                }
                if (this.copyParentColorAlpha) {
                    this.colorChannel.data[offset + 3] = this.parentColor.data[this.parentColorOffset + 3];
                }
                offset += this.colorChannel.strideSize;
            }
        }

        if (this.copyParentRotation && this.parentRotation != null) {
            int indexStride = this.rotationParentOffsetChannel.strideSize;
            int indexOffset = startIndex * indexStride;
            int indexEnd = count * indexStride + indexOffset;
            while (indexOffset < indexEnd) {
                this.rotationParentOffsetChannel.data[indexOffset] = this.parentRotationOffset;
                indexOffset += this.rotationParentOffsetChannel.strideSize;
            }

            stride = this.rotationChannel.strideSize;
            offset = startIndex * stride;
            end = count * stride + offset;
            while (offset < end) {
                int base = offset;
                this.rotationChannel.data[offset] = this.parentRotation.data[this.parentRotationOffset];
                this.rotationChannel.data[offset + 1] = this.parentRotation.data[this.parentRotationOffset + 1];
                offset = base + this.rotationChannel.strideSize;
            }
        } else {
            stride = this.rotationChannel.strideSize;
            offset = startIndex * stride;
            end = count * stride + offset;
            while (offset < end) {
                this.rotationChannel.data[offset] = 1.0f;
                this.rotationChannel.data[offset + 1] = 0.0f;
                offset += this.rotationChannel.strideSize;
            }
        }
    }

    @Override
    public TrailSpawnInfluencerExt copy() {
        return new TrailSpawnInfluencerExt(this);
    }

    @Override
    public void write(gp_1 json) {
        json.v80(Boolean.valueOf(this.copyParentColor), "copyParentColor");
        json.v80(Boolean.valueOf(this.copyParentColorAlpha), "copyParentColorAlpha");
        json.v80(Boolean.valueOf(this.copyParentColorDynamic), "copyParentColorDynamic");
        json.v80(Boolean.valueOf(this.copyParentRotation), "copyParentRotation");
        json.v80(Boolean.valueOf(this.copyParentRotationDynamic), "copyParentRotationDynamic");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        this.copyParentColor = ((Boolean)h4_0.Lpt6(json, jsonData, "copyParentColor", Boolean.class, null)).booleanValue();
        if (jsonData.UJ0("copyParentColorAlpha")) {
            this.copyParentColorAlpha = ((Boolean)json.b20(Boolean.class, null, jsonData.Is("copyParentColorAlpha"))).booleanValue();
        }
        if (jsonData.UJ0("copyParentColorAlpha")) {
            this.copyParentColorDynamic = ((Boolean)json.b20(Boolean.class, null, jsonData.Is("copyParentColorDynamic"))).booleanValue();
        }
        this.copyParentRotation = ((Boolean)json.b20(Boolean.class, null, jsonData.Is("copyParentRotation"))).booleanValue();
        this.copyParentRotationDynamic = ((Boolean)json.b20(Boolean.class, null, jsonData.Is("copyParentRotationDynamic"))).booleanValue();
    }

    @Override
    public void save(hd0_2 manager, ResourceData resources) {
    }

    @Override
    public void load(hd0_2 manager, ResourceData resources) {
    }
}
