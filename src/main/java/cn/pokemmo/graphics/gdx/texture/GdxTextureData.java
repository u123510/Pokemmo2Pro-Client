package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class GdxTextureData implements kj_0 {
    public final sa_0 YB0;
    public final FloatBuffer jM;
    public final ByteBuffer R60;

    public GdxTextureData(int count, kz_0... attributes) {
        this(count, new sa_0(attributes));
    }

    public GdxTextureData(int count, sa_0 attributes) {
        this.YB0 = attributes;
        this.R60 = BufferUtils.qw0(attributes.u5 * count);
        this.jM = this.R60.asFloatBuffer();
        this.jM.flip();
        this.R60.flip();
    }

    @Override
    public final void dispose() {
        BufferUtils.t7(this.R60);
    }

    @Override
    public final FloatBuffer st0(boolean unused) {
        return this.jM;
    }

    @Override
    public final int mB0() {
        return this.jM.limit() * 4 / this.YB0.u5;
    }

    @Override
    public final int Ew0() {
        return this.R60.capacity() / this.YB0.u5;
    }

    @Override
    public final void ce0(int count, int limit, float[] data) {
        BufferUtils.ys0(data, this.R60, limit, count);
        this.jM.position(0);
        this.jM.limit(limit);
    }

    @Override
    public final void Fn0(lt_1 shader, int[] locations) {
        kz_0[] attributes = this.YB0.Os;
        int length = attributes.length;
        this.R60.limit(this.jM.limit() * 4);
        if (locations == null) {
            for (int index = 0; index < length; index++) {
                kz_0 attribute = attributes[index];
                String name = attribute.ot0;
                int location = shader.Us.Rl0(-1, name);
                if (location < 0) {
                    continue;
                }
                lg_0.Sf0.glEnableVertexAttribArray(location);
                if (attribute.IK0 == 5126) {
                    this.jM.position(attribute.Kk0 / 4);
                    lg_0.Sf0.glVertexAttribPointer(
                        location,
                        attribute.dG0,
                        attribute.IK0,
                        attribute.UO,
                        this.YB0.u5,
                        this.jM);
                } else {
                    this.R60.position(attribute.Kk0);
                    lg_0.Sf0.glVertexAttribPointer(
                        location,
                        attribute.dG0,
                        attribute.IK0,
                        attribute.UO,
                        this.YB0.u5,
                        this.R60);
                }
            }
            return;
        }
        for (int index = 0; index < length; index++) {
            int location = locations[index];
            if (location < 0) {
                continue;
            }
            kz_0 attribute = attributes[index];
            shader.getClass();
            lg_0.Sf0.glEnableVertexAttribArray(location);
            if (attribute.IK0 == 5126) {
                this.jM.position(attribute.Kk0 / 4);
                lg_0.Sf0.glVertexAttribPointer(
                    location,
                    attribute.dG0,
                    attribute.IK0,
                    attribute.UO,
                    this.YB0.u5,
                    this.jM);
            } else {
                this.R60.position(attribute.Kk0);
                lg_0.Sf0.glVertexAttribPointer(
                    location,
                    attribute.dG0,
                    attribute.IK0,
                    attribute.UO,
                    this.YB0.u5,
                    this.R60);
            }
        }
    }

    @Override
    public final void yK0(lt_1 shader, int[] locations) {
        kz_0[] attributes = this.YB0.Os;
        int length = attributes.length;
        if (locations == null) {
            for (int index = 0; index < length; index++) {
                shader.kC(attributes[index].ot0);
            }
            return;
        }
        for (int index = 0; index < length; index++) {
            int location = locations[index];
            if (location < 0) {
                continue;
            }
            shader.getClass();
            lg_0.Sf0.glDisableVertexAttribArray(location);
        }
    }

    @Override
    public final sa_0 JP() {
        return this.YB0;
    }
}
