package cn.pokemmo.graphics.g3d;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import java.nio.ShortBuffer;

/**
 * 现代化重构类 - 原始类: f.ut_0
 */
public class G3dModel implements fy0_0 {

    public final es_1 Cs;
    public final es_1 Wc0;
    public final es_1 AF;
    public final es_1 By;
    public final es_1 a50;
    public final es_1 iM;
    public final nb_2 SJ;

    public G3dModel() {
        Cs = new es_1();
        Wc0 = new es_1();
        AF = new es_1();
        By = new es_1();
        a50 = new es_1();
        iM = new es_1();
        SJ = new nb_2();
    }

    public G3dModel(y90_0 data) {
        this(data, new ww_1());
    }

    public G3dModel(y90_0 data, E60 textures) {
        this();
        ln(data, textures);
    }

    public final void ln(y90_0 data, E60 textures) {
        I2 meshes = data.Bz.ZD();
        while (meshes.hasNext()) {
            te_0 source = (te_0) meshes.next();
            int indexCount = 0;
            for (vx0 part : source.W) {
                indexCount += part.Ky0.length;
            }
            boolean indexed = indexCount > 0;
            sa_0 attributes = new sa_0(source.Ef);
            int vertexCount = source.e90.length / (attributes.u5 / 4);
            ap0_0 mesh = new ap0_0(true, vertexCount, indexCount, attributes);
            By.Ue0(mesh);
            iM.Ue0(mesh);
            BufferUtils.ys0(source.e90, mesh.COM6.st0(true), source.e90.length, 0);
            int offset = 0;
            ShortBuffer indices = mesh.Sw0.st0(true);
            indices.clear();
            for (vx0 sourcePart : source.W) {
                U30 part = new U30();
                part.Xj = sourcePart.a80;
                part.bJ0 = sourcePart.Yu0;
                part.d30 = offset;
                part.I8 = indexed ? sourcePart.Ky0.length : vertexCount;
                part.m8 = mesh;
                if (indexed) {
                    indices.put(sourcePart.Ky0);
                }
                offset += part.I8;
                a50.Ue0(part);
            }
            indices.position(0);
            I2 parts = a50.ZD();
            while (parts.hasNext()) {
                ((U30) parts.next()).TI0();
            }
        }

        I2 materials = data.zK.ZD();
        while (materials.hasNext()) {
            ef0_1 source = (ef0_1) materials.next();
            es_1 destination = Cs;
            BM material = new BM();
            material.mi = source.dq0;
            if (source.dm0 != null) {
                material.LPT8(new PRN_(PRN_.gp0, source.dm0));
            }
            if (source.lF0 != null) {
                material.LPT8(new PRN_(PRN_.Ly, source.lF0));
            }
            if (source.xv != null) {
                material.LPT8(new PRN_(PRN_.zz, source.xv));
            }
            if (source.ph0 != null) {
                material.LPT8(new PRN_(PRN_.sI, source.ph0));
            }
            if (source.x80 != null) {
                material.LPT8(new PRN_(PRN_.Ar, source.x80));
            }
            if (source.ai > 0.0F) {
                material.LPT8(new mb0_2(mb0_2.an0, source.ai));
            }
            if (source.xu0 != 1.0F) {
                material.LPT8(new sh_0(770, 771, source.xu0));
            }
            nb_2 loaded = new nb_2();
            if (source.wX != null) {
                I2 entries = source.wX.ZD();
                while (entries.hasNext()) {
                    jx0_0 entry = (jx0_0) entries.next();
                    Texture texture;
                    if (loaded.fl(entry.Dn0)) {
                        texture = (Texture) loaded.Wk0(entry.Dn0);
                    } else {
                        texture = textures.De0(entry.Dn0);
                        loaded.WK0(entry.Dn0, texture);
                        iM.Ue0(texture);
                    }
                    B90 descriptor = new B90(texture);
                    descriptor.xQ = texture.getMinFilter();
                    descriptor.Rb0 = texture.getMagFilter();
                    descriptor.Zk0 = texture.getUWrap();
                    descriptor.HH = texture.getVWrap();
                    Bp0 translation = entry.iy0;
                    float u = translation == null ? 0.0F : translation.x;
                    float v = translation == null ? 0.0F : translation.y;
                    Bp0 scaling = entry.Vi0;
                    float scaleU = scaling == null ? 1.0F : scaling.x;
                    float scaleV = scaling == null ? 1.0F : scaling.y;
                    switch (entry.for$) {
                        case 2:
                            material.LPT8(new mz_2(mz_2.g7, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 3:
                            material.LPT8(new mz_2(mz_2.protected$, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 4:
                            material.LPT8(new mz_2(mz_2.cW, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 5:
                            material.LPT8(new mz_2(mz_2.GB0, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 7:
                            material.LPT8(new mz_2(mz_2.yS, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 8:
                            material.LPT8(new mz_2(mz_2.NM, descriptor, u, v, scaleU, scaleV));
                            break;
                        case 10:
                            material.LPT8(new mz_2(mz_2.Dh0, descriptor, u, v, scaleU, scaleV));
                            break;
                        default:
                            break;
                    }
                }
            }
            destination.Ue0(material);
        }

        es_1 sourceNodes = data.d9;
        SJ.b20();
        I2 nodes = sourceNodes.ZD();
        while (nodes.hasNext()) {
            Wc0.Ue0(vQ((ui0_0) nodes.next()));
        }
        a60_0 bindings = SJ.lb0();
        bindings.getClass();
        while (bindings.hasNext()) {
            xn_1 binding = (xn_1) bindings.next();
            I20 part = (I20) binding.I20;
            if (part.RQ == null) {
                part.RQ = new cf_2(Xz0.class, Matrix4.class);
            }
            ((I20) binding.I20).RQ.clear();
            sf0_1 bones = ((cf_2) binding.kM).ED();
            bones.getClass();
            while (bones.hasNext()) {
                xn_1 bone = (xn_1) bones.next();
                cf_2 inverseBindings = ((I20) binding.I20).RQ;
                String name = (String) bone.I20;
                Xz0 node = Xz0.ry0(Wc0, name, true);
                Matrix4 inverse = new Matrix4((Matrix4) bone.kM);
                // The original inlined inverse throws instead of Hl's no-op.
                if (inverse.rA0() == 0.0F) {
                    throw new RuntimeException("non-invertible matrix");
                }
                Matrix4.Hl(inverse.EW);
                inverseBindings.n3(node, inverse);
            }
        }

        I2 animations = data.P10.ZD();
        while (animations.hasNext()) {
            g30_0 source = (g30_0) animations.next();
            ji0_2 animation = new ji0_2();
            animation.Ys0 = source.Bl0;
            I2 channels = source.Cp.ZD();
            while (channels.hasNext()) {
                gx_0 channel = (gx_0) channels.next();
                Xz0 node = Xz0.ry0(Wc0, channel.by0, true);
                if (node == null) {
                    continue;
                }
                yg0_0 track = new yg0_0();
                track.Cr = node;
                if (channel.Jr0 != null) {
                    es_1 frames = new es_1();
                    track.TK = frames;
                    frames.Bv(channel.Jr0.KB);
                    I2 sourceFrames = channel.Jr0.ZD();
                    while (sourceFrames.hasNext()) {
                        DJ0 frame = (DJ0) sourceFrames.next();
                        float time = frame.tz0;
                        if (time > animation.Oj) {
                            animation.Oj = time;
                        }
                        Object value = frame.Yo0;
                        C8 vector = value == null ? node.BI0 : (C8) value;
                        track.TK.Ue0(new li0_2(time, new C8(vector)));
                    }
                }
                if (channel.JF != null) {
                    es_1 frames = new es_1();
                    track.l = frames;
                    frames.Bv(channel.JF.KB);
                    I2 sourceFrames = channel.JF.ZD();
                    while (sourceFrames.hasNext()) {
                        DJ0 frame = (DJ0) sourceFrames.next();
                        float time = frame.tz0;
                        if (time > animation.Oj) {
                            animation.Oj = time;
                        }
                        Object value = frame.Yo0;
                        me0_2 quaternion = value == null ? node.RG : (me0_2) value;
                        track.l.Ue0(new li0_2(time, new me0_2(quaternion)));
                    }
                }
                if (channel.i9 != null) {
                    es_1 frames = new es_1();
                    track.HG = frames;
                    frames.Bv(channel.i9.KB);
                    I2 sourceFrames = channel.i9.ZD();
                    while (sourceFrames.hasNext()) {
                        DJ0 frame = (DJ0) sourceFrames.next();
                        float time = frame.tz0;
                        if (time > animation.Oj) {
                            animation.Oj = time;
                        }
                        Object value = frame.Yo0;
                        C8 vector = value == null ? node.Fc0 : (C8) value;
                        track.HG.Ue0(new li0_2(time, new C8(vector)));
                    }
                }
                if (track.TK != null && track.TK.KB > 0
                        || track.l != null && track.l.KB > 0
                        || track.HG != null && track.HG.KB > 0) {
                    animation.jl.Ue0(track);
                }
            }
            if (animation.jl.KB > 0) {
                AF.Ue0(animation);
            }
        }
        int count = Wc0.KB;
        for (int i = 0; i < count; i++) {
            ((Xz0) Wc0.get(i)).Z90();
        }
        for (int i = 0; i < count; i++) {
            ((Xz0) Wc0.get(i)).pF0();
        }
    }

    public final Xz0 vQ(ui0_0 source) {
        Xz0 node = new Xz0();
        node.mw = source.OS;
        C8 translation = source.X20;
        if (translation != null) {
            C8 value = node.BI0;
            value.getClass();
            float x = translation.x;
            float y = translation.y;
            float z = translation.z;
            value.x = x;
            value.y = y;
            value.z = z;
        }
        me0_2 rotation = source.IE0;
        if (rotation != null) {
            node.RG.CA0(rotation);
        }
        C8 scale = source.Dy0;
        if (scale != null) {
            C8 value = node.Fc0;
            value.getClass();
            float x = scale.x;
            float y = scale.y;
            float z = scale.z;
            value.x = x;
            value.y = y;
            value.z = z;
        }
        if (source.Wu != null) {
            for (xu_0 sourcePart : source.Wu) {
                U30 meshPart = null;
                BM material = null;
                if (sourcePart.Hi != null) {
                    I2 parts = a50.ZD();
                    while (parts.hasNext()) {
                        U30 candidate = (U30) parts.next();
                        if (sourcePart.Hi.equals(candidate.Xj)) {
                            meshPart = candidate;
                            break;
                        }
                    }
                }
                if (sourcePart.ys != null) {
                    I2 materials = Cs.ZD();
                    while (materials.hasNext()) {
                        BM candidate = (BM) materials.next();
                        if (sourcePart.ys.equals(candidate.mi)) {
                            material = candidate;
                            break;
                        }
                    }
                }
                if (meshPart == null || material == null) {
                    throw new nf_1(new StringBuilder("Invalid node: ").append(node.mw).toString());
                }
                I20 part = new I20();
                part.d40 = meshPart;
                part.jK0 = material;
                node.sJ0.Ue0(part);
                if (sourcePart.fH != null) {
                    SJ.WK0(part, sourcePart.fH);
                }
            }
        }
        if (source.Q1 != null) {
            for (ui0_0 child : source.Q1) {
                node.lPt7(vQ(child));
            }
        }
        return node;
    }

    @Override
    public final void dispose() {
        I2 resources = iM.ZD();
        while (resources.hasNext()) {
            ((fy0_0) resources.next()).dispose();
        }
    }

    public final Xz0 rE(String name, boolean recursive) {
        return Xz0.ry0(Wc0, name, recursive);
    }
}
