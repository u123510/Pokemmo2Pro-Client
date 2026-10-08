package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.math.Matrix4;
import f.BM;
import f.C8;
import f.QA0;
import f.Tv0;
import f.VE;
import f.W00;
import f.Wm0;
import f.com6__2;
import f.com9__4;
import f.hf_1;
import f.lg_0;
import f.lt_1;
import f.ma_1;
import f.mz_2;
import f.nf_1;
import f.o9_0;
import f.pr_1;
import f.qi_1;
import f.qk_1;
import f.sh_0;
import f.wh_0;
import f.xr_2;
import f.zv_1;

public class ParticleShader extends Wm0 {
    private static String defaultVertexShader;
    private static String defaultFragmentShader;
    protected static long implementedFlags = sh_0.vF0 | mz_2.g7;
    static final C8 TMP_VECTOR3 = new C8();
    private static final long optionalAttributes = pr_1.av | ma_1.ZL;

    private W00 renderable;
    private long materialMask;
    private long vertexMask;
    protected final Config config;
    BM currentMaterial;

    public static String getDefaultVertexShader() {
        if (defaultVertexShader == null) {
            defaultVertexShader = new VE("com/badlogic/gdx/graphics/g3d/particles/particles.vertex.glsl", zv_1.Gi0).gd0(null);
        }
        return defaultVertexShader;
    }

    public static String getDefaultFragmentShader() {
        if (defaultFragmentShader == null) {
            defaultFragmentShader = new VE("com/badlogic/gdx/graphics/g3d/particles/particles.fragment.glsl", zv_1.Gi0).gd0(null);
        }
        return defaultFragmentShader;
    }

    public ParticleShader(W00 renderable) {
        this(renderable, new Config());
    }

    public ParticleShader(W00 renderable, Config config) {
        this(renderable, config, createPrefix(renderable, config));
    }

    public ParticleShader(W00 renderable, Config config, String prefix) {
        this(renderable, config, prefix,
                config.vertexShader == null ? getDefaultVertexShader() : config.vertexShader,
                config.fragmentShader == null ? getDefaultFragmentShader() : config.fragmentShader);
    }

    public ParticleShader(W00 renderable, Config config, String prefix, String vertexShader, String fragmentShader) {
        this(renderable, config, new lt_1(QA0.W0(prefix, vertexShader), QA0.W0(prefix, fragmentShader)));
    }

    public ParticleShader(W00 renderable, Config config, lt_1 program) {
        this.config = config;
        this.program = program;
        this.renderable = renderable;
        this.materialMask = renderable.ly.N30() | optionalAttributes;
        this.vertexMask = renderable.VE0.m8.zh0().Js0();
        long mask = this.materialMask;
        if (!config.ignoreUnimplemented && (implementedFlags & mask) != mask) {
            throw new nf_1("Some attributes not implemented yet (" + this.materialMask + ")");
        }
        register(qk_1.prN, (xr_2) com6__2.Pd);
        register(qk_1.ms, (xr_2) com6__2.ss);
        register(qk_1.Oe, (xr_2) com6__2.Yd);
        register(Inputs.screenWidth, Setters.screenWidth);
        register(qk_1.M30, Setters.cameraUp);
        register(Inputs.cameraRight, Setters.cameraRight);
        register(Inputs.cameraInvDirection, Setters.cameraInvDirection);
        register(qk_1.yz0, Setters.cameraPosition);
        register(qk_1.da, (xr_2) com6__2.PrN);
    }

    public static String createPrefix(W00 renderable, Config config) {
        String prefix = "#version 120\n";
        if (config.type == ParticleType.Billboard) {
            prefix = "#version 120\n#define billboard\n";
            if (config.align == AlignMode.Screen) {
                prefix = "#version 120\n#define billboard\n#define screenFacing\n";
            } else if (config.align == AlignMode.ViewPoint) {
                prefix = "#version 120\n#define billboard\n#define viewPointFacing\n";
            }
        }
        return prefix;
    }

    @Override
    public void init() {
        lt_1 program = this.program;
        this.program = null;
        init(program, this.renderable);
        this.renderable = null;
    }

    @Override
    public boolean canRender(W00 renderable) {
        return this.materialMask == (renderable.ly.ni0 | optionalAttributes)
                && this.vertexMask == renderable.VE0.m8.COM6.JP().Js0();
    }

    public int compareTo(o9_0 other) {
        if (other == null) return -1;
        return 0;
    }

    public boolean equals(Object object) {
        return object instanceof ParticleShader && this.equals((ParticleShader)object);
    }

    public boolean equals(ParticleShader shader) {
        return shader == this;
    }

    @Override
    public void begin(Tv0 camera, qi_1 context) {
        super.begin(camera, context);
    }

    @Override
    public void render(W00 renderable) {
        if (!renderable.ly.tM(sh_0.vF0)) {
            this.context.mx0(770, 771, false);
        }
        bindMaterial(renderable);
        super.render(renderable);
    }

    @Override
    public void end() {
        this.currentMaterial = null;
        super.end();
    }

    public void bindMaterial(W00 renderable) {
        BM material = renderable.ly;
        if (this.currentMaterial == material) return;

        int cullFace = this.config.defaultCullFace;
        if (cullFace == -1) cullFace = 1029;
        int depthFunc = this.config.defaultDepthFunc;
        if (depthFunc == -1) depthFunc = 515;
        float depthRangeNear = 0.0f;
        float depthRangeFar = 1.0f;
        boolean depthMask = true;

        this.currentMaterial = material;
        for (Object value : (wh_0)material) {
            hf_1 attr = (hf_1)value;
            long type = attr.yO;
            if ((type & sh_0.vF0) == type) {
                sh_0 blending = (sh_0)attr;
                this.context.mx0(blending.W00, blending.Rs, true);
            } else if ((type & ma_1.ZL) == ma_1.ZL) {
                ma_1 depth = (ma_1)attr;
                depthFunc = depth.BA0;
                depthRangeNear = depth.sC0;
                depthRangeFar = depth.Sg;
                depthMask = depth.WZ;
            } else if (!this.config.ignoreUnimplemented) {
                throw new nf_1("Unknown material attribute: " + attr.toString());
            }
        }

        this.context.fh0(cullFace);
        this.context.vk0(depthFunc, depthRangeNear, depthRangeFar);
        qi_1 context = this.context;
        if (context.Wz != depthMask) {
            context.Wz = depthMask;
            lg_0.OH0.glDepthMask(depthMask);
        }
    }

    @Override
    public void dispose() {
        this.program.dispose();
        super.dispose();
    }

    public int getDefaultCullFace() {
        int cullFace = this.config.defaultCullFace;
        return cullFace == -1 ? 1029 : cullFace;
    }

    public void setDefaultCullFace(int cullFace) {
        this.config.defaultCullFace = cullFace;
    }

    public int getDefaultDepthFunc() {
        int depthFunc = this.config.defaultDepthFunc;
        return depthFunc == -1 ? 515 : depthFunc;
    }

    public void setDefaultDepthFunc(int depthFunc) {
        this.config.defaultDepthFunc = depthFunc;
    }

    public static class Setters {
        public static final xr_2 cameraRight = new xr_2() {
            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return true; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                shader.set(inputID, TMP_VECTOR3.np(shader.camera.jd0).Xv0(shader.camera.St0).KM());
            }
        };
        public static final xr_2 cameraUp = new xr_2() {
            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return true; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                shader.set(inputID, TMP_VECTOR3.np(shader.camera.St0).KM());
            }
        };
        public static final xr_2 cameraInvDirection = new xr_2() {
            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return true; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                C8 direction = shader.camera.jd0;
                TMP_VECTOR3.x = -direction.x;
                TMP_VECTOR3.y = -direction.y;
                TMP_VECTOR3.z = -direction.z;
                shader.set(inputID, TMP_VECTOR3.KM());
            }
        };
        public static final xr_2 cameraPosition = new xr_2() {
            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return true; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                shader.set(inputID, shader.camera.v40);
            }
        };
        public static final xr_2 screenWidth = new xr_2() {
            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return true; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                shader.set(inputID, (float)lg_0.S4.Kr0());
            }
        };
        public static final xr_2 worldViewTrans = new xr_2() {
            final Matrix4 temp = new Matrix4();

            @Override
            public boolean isGlobal(Wm0 shader, int inputID) { return false; }

            @Override
            public void set(Wm0 shader, int inputID, W00 renderable, wh_0 combinedAttributes) {
                Matrix4 value = this.temp.Dd0(shader.camera.bq.EW);
                Matrix4.md0(value.EW, renderable.eo0.EW);
                shader.set(inputID, value);
            }
        };
    }

    public static class Inputs {
        public static final com9__4 cameraRight = new com9__4("u_cameraRight");
        public static final com9__4 cameraInvDirection = new com9__4("u_cameraInvDirection");
        public static final com9__4 screenWidth = new com9__4("u_screenWidth");
        public static final com9__4 regionSize = new com9__4("u_regionSize");
    }

    public static class Config {
        public String vertexShader = null;
        public String fragmentShader = null;
        public boolean ignoreUnimplemented = true;
        public int defaultCullFace = -1;
        public int defaultDepthFunc = -1;
        public AlignMode align = AlignMode.Screen;
        public ParticleType type;

        public Config() {
            this.type = ParticleType.Billboard;
        }

        public Config(AlignMode align, ParticleType type) {
            this.align = align;
            this.type = type;
        }

        public Config(AlignMode align) {
            this.type = ParticleType.Billboard;
            this.align = align;
        }

        public Config(ParticleType type) {
            this.type = type;
        }

        public Config(String vertexShader, String fragmentShader) {
            this.type = ParticleType.Billboard;
            this.vertexShader = vertexShader;
            this.fragmentShader = fragmentShader;
        }
    }

    public static enum AlignMode {
        Screen,
        ViewPoint
    }

    public static enum ParticleType {
        Billboard,
        Point
    }
}
