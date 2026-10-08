package cn.pokemmo.graphics.gdx.shader;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

/**
 * Shader base class reconstructed from the Recaf JASM for f/Wm0.
 */
public abstract class GdxBaseShader implements o9_0 {
    private final es_1 uniforms;
    private final es_1 validators;
    private final es_1 setters;
    private int[] locations;
    private final Nn0 globalUniforms;
    private final Nn0 localUniforms;
    private final PS attributes;
    private final PS instancedAttributes;
    public lt_1 program;
    public qi_1 context;
    public Tv0 camera;
    private ap0_0 currentMesh;
    private final Nn0 tempArray;
    private final Nn0 tempArray2;
    private wh_0 combinedAttributes;

    public GdxBaseShader() {
        this.uniforms = new es_1();
        this.validators = new es_1();
        this.setters = new es_1();
        this.globalUniforms = new Nn0();
        this.localUniforms = new Nn0();
        this.attributes = new PS();
        this.instancedAttributes = new PS();
        this.tempArray = new Nn0();
        this.tempArray2 = new Nn0();
        this.combinedAttributes = new wh_0();
    }

    public int register(String alias, GI validator, xr_2 setter) {
        if (this.locations != null) {
            throw new nf_1("Cannot register an uniform after initialization");
        }
        int index = this.getUniformID(alias);
        if (index >= 0) {
            this.validators.c0(index, validator);
            this.setters.c0(index, setter);
            return index;
        }
        this.uniforms.Ue0(alias);
        this.validators.Ue0(validator);
        this.setters.Ue0(setter);
        return this.uniforms.KB - 1;
    }

    public int register(String alias, GI validator) {
        return this.register(alias, validator, null);
    }

    public int register(String alias, xr_2 setter) {
        return this.register(alias, null, setter);
    }

    public int register(String alias) {
        return this.register(alias, null, null);
    }

    public int register(com9__4 uniform, xr_2 setter) {
        return this.register(uniform.He, uniform, setter);
    }

    public int register(com9__4 uniform) {
        return this.register(uniform, null);
    }

    public int getUniformID(String alias) {
        int count = this.uniforms.KB;
        for (int i = 0; i < count; ++i) {
            if (((String)this.uniforms.get(i)).equals(alias)) {
                return i;
            }
        }
        return -1;
    }

    public String getUniformAlias(int index) {
        return (String)this.uniforms.get(index);
    }

    public void init(lt_1 program, W00 renderable) {
        if (this.locations != null) {
            throw new nf_1("Already initialized");
        }
        if (!program.U00) {
            throw new nf_1(program.aX());
        }
        this.program = program;
        int count = this.uniforms.KB;
        this.locations = new int[count];
        for (int i = 0; i < count; ++i) {
            String alias = (String)this.uniforms.get(i);
            GI validator = (GI)this.validators.get(i);
            xr_2 setter = (xr_2)this.setters.get(i);
            if (setter != null) {
                com9__4 required = (com9__4)validator;
                long renderableMask = 0L;
                if (renderable != null && renderable.ly != null) {
                    renderableMask = renderable.ly.ni0;
                }
                long instancedMask = 0L;
                if (renderable != null && renderable.AA0 != null) {
                    instancedMask = renderable.AA0.ni0;
                }
                if ((renderableMask & required.mo0) != required.mo0
                        || (instancedMask & required.uK0) != required.uK0
                        || ((renderableMask | instancedMask) & required.xj0) != required.xj0) {
                    this.locations[i] = -1;
                    if (this.locations[i] < 0) {
                        this.validators.c0(i, null);
                        this.setters.c0(i, null);
                    }
                    continue;
                }
            }
            this.locations[i] = program.WD0(alias, false);
            if (this.locations[i] >= 0 && setter != null) {
                if (setter.isGlobal(this, i)) {
                    this.globalUniforms.ja0(i);
                } else {
                    this.localUniforms.ja0(i);
                }
            }
            if (this.locations[i] < 0) {
                this.validators.c0(i, null);
                this.setters.c0(i, null);
            }
        }
        if (renderable == null) {
            return;
        }
        sa_0 vertexAttributes = renderable.VE0.m8.COM6.JP();
        for (kz_0 attribute : vertexAttributes.Os) {
            int location = program.Us.Rl0(-1, attribute.ot0);
            if (location >= 0) {
                this.attributes.m9((attribute.By0 << 8) + (attribute.sf & 255), location);
            }
        }
        renderable.VE0.m8.getClass();
    }

    public void begin(Tv0 camera, qi_1 context) {
        this.camera = camera;
        this.context = context;
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUseProgram(this.program.lH);
        this.currentMesh = null;
        for (int i = 0; i < this.globalUniforms.Ml; ++i) {
            int index = this.globalUniforms.X8(i);
            xr_2 setter = (xr_2)this.setters.get(index);
            if (setter != null) {
                setter.set(this, index, null, null);
            }
        }
    }

    public void render(W00 renderable) {
        float[] matrix = renderable.eo0.EW;
        float determinant = matrix[8] * matrix[1] * matrix[6]
                + (matrix[4] * matrix[9] * matrix[2] + matrix[0] * matrix[5] * matrix[10]);
        determinant = uj_0.SJ0(matrix[0], matrix[9], matrix[6], determinant);
        determinant = uj_0.SJ0(matrix[4], matrix[1], matrix[10], determinant);
        determinant = uj_0.SJ0(matrix[8], matrix[5], matrix[2], determinant);
        if (determinant == 0.0f) {
            return;
        }
        this.combinedAttributes.ni0 = 0L;
        this.combinedAttributes.VH.clear();
        if (renderable.AA0 != null) {
            I2 iterator = (I2)renderable.AA0.iterator();
            while (iterator.hasNext()) {
                this.combinedAttributes.LPT8((hf_1)iterator.next());
            }
        }
        if (renderable.ly != null) {
            I2 iterator = (I2)renderable.ly.iterator();
            while (iterator.hasNext()) {
                this.combinedAttributes.LPT8((hf_1)iterator.next());
            }
        }
        this.render(renderable, this.combinedAttributes);
    }

    public void render(W00 renderable, wh_0 combinedAttributes) {
        for (int i = 0; i < this.localUniforms.Ml; ++i) {
            int index = this.localUniforms.X8(i);
            xr_2 setter = (xr_2)this.setters.get(index);
            if (setter != null) {
                setter.set(this, index, renderable, combinedAttributes);
            }
        }
        ap0_0 mesh = this.currentMesh;
        ap0_0 renderMesh = renderable.VE0.m8;
        if (mesh != renderMesh) {
            if (mesh != null) {
                mesh.COM6.yK0(this.program, this.tempArray.bR);
                if (mesh.Sw0.Id() > 0) {
                    mesh.Sw0.qe();
                }
            }
            this.currentMesh = renderMesh;
            lt_1 program = this.program;
            sa_0 vertexAttributes = renderMesh.COM6.JP();
            this.tempArray.Ml = 0;
            for (kz_0 attribute : vertexAttributes.Os) {
                this.tempArray.ja0(this.attributes.Ol((attribute.By0 << 8) + (attribute.sf & 255), -1));
            }
            if (this.tempArray.bR.length != this.tempArray.Ml) {
                this.tempArray.Wn(this.tempArray.Ml);
            }
            renderMesh.COM6.Fn0(program, this.tempArray.bR);
            if (renderMesh.Sw0.Id() > 0) {
                renderMesh.Sw0.bind();
            }
        }
        renderMesh.zm(this.program, renderable.VE0.bJ0, renderable.VE0.d30, renderable.VE0.I8, false);
    }

    public void end() {
        ap0_0 mesh = this.currentMesh;
        if (mesh != null) {
            mesh.COM6.yK0(this.program, this.tempArray.bR);
            if (mesh.Sw0.Id() > 0) {
                mesh.Sw0.qe();
            }
            this.currentMesh = null;
        }
    }

    @Override
    public void dispose() {
        this.program = null;
        this.uniforms.clear();
        this.validators.clear();
        this.setters.clear();
        this.localUniforms.Ml = 0;
        this.globalUniforms.Ml = 0;
        this.locations = null;
    }

    public final boolean has(int index) {
        return index >= 0 && index < this.locations.length && this.locations[index] >= 0;
    }

    public final int loc(int index) {
        return index >= 0 && index < this.locations.length ? this.locations[index] : -1;
    }

    public final boolean set(int index, Matrix4 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        this.program.getClass();
        lg_0.Sf0.glUniformMatrix4fv(location, 1, false, value.EW, 0);
        return true;
    }

    public final boolean set(int index, i00_0 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        lt_1 program = this.program;
        int offset = 0;
        sY gl = lg_0.Sf0;
        program.WI();
        gl.glUniformMatrix3fv(location, 1, false, value.Z2, offset);
        return true;
    }

    public final boolean set(int index, C8 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        this.program.getClass();
        float x = value.x;
        float y = value.y;
        float z = value.z;
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform3f(location, x, y, z);
        return true;
    }

    public final boolean set(int index, Bp0 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        this.program.getClass();
        float x = value.x;
        float y = value.y;
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform2f(location, x, y);
        return true;
    }

    public final boolean set(int index, Color value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        this.program.getClass();
        float r = value.r;
        float g = value.g;
        float b = value.b;
        float a = value.a;
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform4f(location, r, g, b, a);
        return true;
    }

    public final boolean set(int index, float value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform1f(location, value);
        return true;
    }

    public final boolean set(int index, float value1, float value2) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform2f(location, value1, value2);
        return true;
    }

    public final boolean set(int index, float value1, float value2, float value3) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform3f(location, value1, value2, value3);
        return true;
    }

    public final boolean set(int index, float value1, float value2, float value3, float value4) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform4f(location, value1, value2, value3, value4);
        return true;
    }

    public final boolean set(int index, int value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform1i(location, value);
        return true;
    }

    public final boolean set(int index, int value1, int value2) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform2i(location, value1, value2);
        return true;
    }

    public final boolean set(int index, int value1, int value2, int value3) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform3i(location, value1, value2, value3);
        return true;
    }

    public final boolean set(int index, int value1, int value2, int value3, int value4) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        sY gl = lg_0.Sf0;
        this.program.WI();
        gl.glUniform4i(location, value1, value2, value3, value4);
        return true;
    }

    public final boolean set(int index, B90 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        ph0_2 textureBinder = (ph0_2)this.context.iG;
        int textureUnit = textureBinder.d30(value);
        sY gl = lg_0.Sf0;
        this.program.getClass();
        gl.glUniform1i(location, textureUnit);
        return true;
    }

    public final boolean set(int index, lq_2 value) {
        int location = this.locations[index];
        if (location < 0) {
            return false;
        }
        ph0_2 textureBinder = (ph0_2)this.context.iG;
        textureBinder.s20.Td0(value, null, null, null, null);
        int textureUnit = textureBinder.d30(textureBinder.s20);
        sY gl = lg_0.Sf0;
        this.program.getClass();
        gl.glUniform1i(location, textureUnit);
        return true;
    }
}
