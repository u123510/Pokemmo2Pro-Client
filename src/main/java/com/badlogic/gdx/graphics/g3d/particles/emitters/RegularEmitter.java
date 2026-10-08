package com.badlogic.gdx.graphics.g3d.particles.emitters;

import com.badlogic.gdx.graphics.g3d.particles.ParallelArray;
import com.badlogic.gdx.graphics.g3d.particles.ParticleChannels;
import com.badlogic.gdx.graphics.g3d.particles.ParticleController;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerComponent;
import com.badlogic.gdx.graphics.g3d.particles.values.RangedNumericValue;
import com.badlogic.gdx.graphics.g3d.particles.values.ScaledNumericValue;
import f.gp_1;
import f.h4_0;
import f.hk0_0;
import f.oe_0;

public class RegularEmitter extends Emitter {
    public RangedNumericValue delayValue;
    public RangedNumericValue durationValue;
    public ScaledNumericValue lifeOffsetValue;
    public ScaledNumericValue lifeValue;
    public ScaledNumericValue emissionValue;
    protected int emission;
    protected int emissionDiff;
    protected int emissionDelta;
    protected int lifeOffset;
    protected int lifeOffsetDiff;
    protected int life;
    protected int lifeDiff;
    protected float duration;
    protected float delay;
    protected float durationTimer;
    protected float delayTimer;
    private boolean continuous;
    private EmissionMode emissionMode;
    private ParallelArray.FloatChannel lifeChannel;

    public RegularEmitter() {
        this.delayValue = new RangedNumericValue();
        this.durationValue = new RangedNumericValue();
        this.lifeOffsetValue = new ScaledNumericValue();
        this.lifeValue = new ScaledNumericValue();
        this.emissionValue = new ScaledNumericValue();
        this.durationValue.setActive(true);
        this.emissionValue.setActive(true);
        this.lifeValue.setActive(true);
        this.continuous = true;
        this.emissionMode = EmissionMode.Enabled;
    }

    public RegularEmitter(RegularEmitter emitter) {
        this();
        set(emitter);
    }

    private void addParticles(int count) {
        count = Math.min(count, this.maxParticleCount - this.controller.particles.size);
        if (count <= 0) return;
        ParticleController controller = this.controller;
        controller.activateParticles(controller.particles.size, count);
        this.controller.particles.size += count;
    }

    @Override
    public void allocateChannels() {
        this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
    }

    @Override
    public void start() {
        this.delay = this.delayValue.active ? this.delayValue.newLowValue() : 0.0f;
        this.delayTimer = 0.0f;
        this.durationTimer = 0.0f;
        this.duration = this.durationValue.newLowValue();
        this.percent = this.durationTimer / this.duration;
        this.emission = (int)this.emissionValue.newLowValue();
        this.emissionDiff = (int)this.emissionValue.newHighValue();
        if (!this.emissionValue.isRelative()) this.emissionDiff -= this.emission;
        this.life = (int)this.lifeValue.newLowValue();
        this.lifeDiff = (int)this.lifeValue.newHighValue();
        if (!this.lifeValue.isRelative()) this.lifeDiff -= this.life;
        this.lifeOffset = this.lifeOffsetValue.active ? (int)this.lifeOffsetValue.newLowValue() : 0;
        this.lifeOffsetDiff = (int)this.lifeOffsetValue.newHighValue();
        if (!this.lifeOffsetValue.isRelative()) this.lifeOffsetDiff -= this.lifeOffset;
    }

    @Override
    public void init() {
        super.init();
        this.emissionDelta = 0;
        this.durationTimer = this.duration;
    }

    @Override
    public void activateParticles(int startIndex, int count) {
        int totalLife = this.life + (int)(this.lifeValue.getScale(this.percent) * (float)this.lifeDiff);
        int currentLife = (int)hk0_0.gb0(this.lifeOffsetValue, this.percent, (float)this.lifeOffsetDiff, (float)this.lifeOffset);
        if (currentLife > 0) {
            if (currentLife >= totalLife) currentLife = totalLife - 1;
            currentLife = totalLife - currentLife;
        } else {
            currentLife = totalLife;
        }
        float currentLifeFloat = currentLife;
        float totalLifeFloat = totalLife;
        float lifePercent = 1.0f - currentLifeFloat / totalLifeFloat;
        int stride = this.lifeChannel.strideSize;
        int i = startIndex * stride;
        int end = count * stride + i;
        while (i < end) {
            this.lifeChannel.data[i + ParticleChannels.CurrentLifeOffset] = currentLifeFloat;
            this.lifeChannel.data[i + ParticleChannels.TotalLifeOffset] = totalLifeFloat;
            this.lifeChannel.data[i + ParticleChannels.LifePercentOffset] = lifePercent;
            i += this.lifeChannel.strideSize;
        }
    }

    @Override
    public void update() {
        float deltaMillis = this.controller.deltaTime * 1000.0f;
        if (this.delayTimer < this.delay) {
            this.delayTimer += deltaMillis;
        } else {
            EmissionMode mode = this.emissionMode;
            boolean emit = mode != EmissionMode.Disabled;
            if (this.durationTimer < this.duration) {
                this.durationTimer += deltaMillis;
                this.percent = this.durationTimer / this.duration;
            } else if (this.continuous && emit && mode == EmissionMode.Enabled) {
                this.controller.start();
            } else {
                emit = false;
            }

            if (emit) {
                this.emissionDelta = (int)((float)this.emissionDelta + deltaMillis);
                float emissionTime = hk0_0.gb0(this.emissionValue, this.percent, (float)this.emissionDiff, (float)this.emission);
                if (emissionTime > 0.0f) {
                    emissionTime = 1000.0f / emissionTime;
                    if ((float)this.emissionDelta >= emissionTime) {
                        int emitCount = Math.min((int)((float)this.emissionDelta / emissionTime), this.maxParticleCount - this.controller.particles.size);
                        this.emissionDelta = (int)((float)((int)((float)this.emissionDelta - (float)emitCount * emissionTime)) % emissionTime);
                        addParticles(emitCount);
                    }
                }
                if (this.controller.particles.size < this.minParticleCount) {
                    addParticles(this.minParticleCount - this.controller.particles.size);
                }
            }
        }

        int activeParticles = this.controller.particles.size;
        int particleIndex = 0;
        int lifeOffset = 0;
        while (particleIndex < this.controller.particles.size) {
            ParallelArray particles = this.controller.particles;
            float[] lifeData = this.lifeChannel.data;
            float currentLife = lifeData[lifeOffset] - deltaMillis;
            lifeData[lifeOffset] = currentLife;
            if (currentLife <= 0.0f) {
                particles.removeElement(particleIndex);
                continue;
            }
            lifeData[lifeOffset + ParticleChannels.LifePercentOffset] = 1.0f - currentLife / lifeData[lifeOffset + ParticleChannels.TotalLifeOffset];
            ++particleIndex;
            lifeOffset += this.lifeChannel.strideSize;
        }
        if (this.controller.particles.size < activeParticles) {
            this.controller.killParticles(this.controller.particles.size, activeParticles - this.controller.particles.size);
        }
    }

    public ScaledNumericValue getLife() { return this.lifeValue; }
    public ScaledNumericValue getEmission() { return this.emissionValue; }
    public RangedNumericValue getDuration() { return this.durationValue; }
    public RangedNumericValue getDelay() { return this.delayValue; }
    public ScaledNumericValue getLifeOffset() { return this.lifeOffsetValue; }
    public boolean isContinuous() { return this.continuous; }
    public void setContinuous(boolean continuous) { this.continuous = continuous; }
    public EmissionMode getEmissionMode() { return this.emissionMode; }
    public void setEmissionMode(EmissionMode emissionMode) { this.emissionMode = emissionMode; }

    @Override
    public boolean isComplete() {
        if (this.delayTimer < this.delay) return false;
        return this.durationTimer >= this.duration && this.controller.particles.size == 0;
    }

    public float getPercentComplete() {
        if (this.delayTimer < this.delay) return 0.0f;
        return Math.min(1.0f, this.durationTimer / this.duration);
    }

    public void set(RegularEmitter emitter) {
        super.set(emitter);
        this.delayValue.load(emitter.delayValue);
        this.durationValue.load(emitter.durationValue);
        this.lifeOffsetValue.load(emitter.lifeOffsetValue);
        this.lifeValue.load(emitter.lifeValue);
        this.emissionValue.load(emitter.emissionValue);
        this.emission = emitter.emission;
        this.emissionDiff = emitter.emissionDiff;
        this.emissionDelta = emitter.emissionDelta;
        this.lifeOffset = emitter.lifeOffset;
        this.lifeOffsetDiff = emitter.lifeOffsetDiff;
        this.life = emitter.life;
        this.lifeDiff = emitter.lifeDiff;
        this.duration = emitter.duration;
        this.delay = emitter.delay;
        this.durationTimer = emitter.durationTimer;
        this.delayTimer = emitter.delayTimer;
        this.continuous = emitter.continuous;
    }

    @Override
    public ParticleControllerComponent copy() {
        return new RegularEmitter(this);
    }

    @Override
    public void write(gp_1 json) {
        super.write(json);
        json.v80(this.continuous, "continous");
        json.v80(this.emissionValue, "emission");
        json.v80(this.delayValue, "delay");
        json.v80(this.durationValue, "duration");
        json.v80(this.lifeValue, "life");
        json.v80(this.lifeOffsetValue, "lifeOffset");
    }

    @Override
    public void read(gp_1 json, oe_0 jsonData) {
        super.read(json, jsonData);
        this.continuous = (Boolean) h4_0.Lpt6(json, jsonData, "continous", Boolean.TYPE, null);
        this.emissionValue = (ScaledNumericValue)json.b20(ScaledNumericValue.class, null, jsonData.Is("emission"));
        this.delayValue = (RangedNumericValue)json.b20(RangedNumericValue.class, null, jsonData.Is("delay"));
        this.durationValue = (RangedNumericValue)json.b20(RangedNumericValue.class, null, jsonData.Is("duration"));
        this.lifeValue = (ScaledNumericValue)json.b20(ScaledNumericValue.class, null, jsonData.Is("life"));
        this.lifeOffsetValue = (ScaledNumericValue)json.b20(ScaledNumericValue.class, null, jsonData.Is("lifeOffset"));
    }

    public static enum EmissionMode {
        Enabled,
        EnabledUntilCycleEnd,
        Disabled
    }
}
