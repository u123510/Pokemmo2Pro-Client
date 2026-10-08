package cn.pokemmo.graphics.gdx.model;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Matrix4;

public class GdxG3dModelLoader extends ir_1 {
    public final yf0_2 Nx0;
    public final me0_2 Mu;

    public GdxG3dModelLoader(yf0_2 reader) {
        this(reader, null);
    }

    public GdxG3dModelLoader(yf0_2 reader, gq_1 resolver) {
        super(resolver);
        Mu = new me0_2();
        Nx0 = reader;
    }

    public static Color H40(oe_0 value) {
        if (value.lpt3 < 3) throw new nf_1("Expected Color values <> than three.");
        return new Color(value.pI0(0), value.pI0(1), value.pI0(2), 1.0F);
    }

    public final y90_0 AO(Dn0 file, SH0 parameters) {
        oe_0 root = Nx0.Zk0(file);
        y90_0 model = new y90_0();
        oe_0 version = root.package$("version");
        oe_0 component = version.dz0;
        if (component == null) throw new IllegalArgumentException("Indexed value not found: " + version.Z3);
        model.eJ0[0] = component.lm0();
        component = version.dz0;
        if (component != null) component = component.Uu;
        if (component == null) throw new IllegalArgumentException("Indexed value not found: " + version.Z3);
        model.eJ0[1] = component.lm0();
        if (model.eJ0[0] != 0 || model.eJ0[1] != 1) throw new nf_1("Model version not supported");
        root.L1("id", "");
        oe_0 meshes = root.Is("meshes");
        if (meshes != null) {
            model.Bz.Bv(meshes.lpt3);
            for (oe_0 mesh = meshes.dz0; mesh != null; mesh = mesh.Uu) {
                te_0 result = new te_0();
                mesh.L1("id", "");
                oe_0 attributes = mesh.package$("attributes");
                es_1 parsed = new es_1();
                int uv = 0;
                int bone = 0;
                for (oe_0 attribute = attributes.dz0; attribute != null; attribute = attribute.Uu) {
                    String name = attribute.cd0();
                    if (name.equals("POSITION")) parsed.Ue0(new kz_0(1, 3, "a_position"));
                    else if (name.equals("NORMAL")) parsed.Ue0(new kz_0(8, 3, "a_normal"));
                    else if (name.equals("COLOR")) parsed.Ue0(new kz_0(2, 4, 5126, false, "a_color"));
                    else if (name.equals("COLORPACKED")) parsed.Ue0(new kz_0(4, 4, 5121, true, "a_color"));
                    else if (name.equals("TANGENT")) parsed.Ue0(new kz_0(128, 3, "a_tangent"));
                    else if (name.equals("BINORMAL")) parsed.Ue0(new kz_0(256, 3, "a_binormal"));
                    else if (name.startsWith("TEXCOORD")) {
                        parsed.Ue0(new kz_0(16, 2, yr_1.pG("a_texCoord", uv), uv));
                        uv++;
                    } else if (name.startsWith("BLENDWEIGHT")) {
                        parsed.Ue0(new kz_0(64, 2, yr_1.pG("a_boneWeight", bone), bone));
                        bone++;
                    } else {
                        throw new nf_1("Unknown vertex attribute '" + name
                                + "', should be one of position, normal, uv, tangent or binormal");
                    }
                }
                result.Ef = (kz_0[]) parsed.Mo0(kz_0.class);
                result.e90 = floats(mesh.package$("vertices"));
                oe_0 parts = mesh.package$("parts");
                es_1 parsedParts = new es_1();
                for (oe_0 part = parts.dz0; part != null; part = part.Uu) {
                    vx0 value = new vx0();
                    String id = part.L1("id", null);
                    if (id == null) throw new nf_1("Not id given for mesh part");
                    I2 existing = parsedParts.ZD();
                    while (existing.hasNext()) {
                        if (((vx0) existing.next()).a80.equals(id)) {
                            throw new nf_1("Mesh part with id '" + id + "' already in defined");
                        }
                    }
                    value.a80 = id;
                    String type = part.L1("type", null);
                    if (type == null) throw new nf_1("No primitive type given for mesh part '" + id + "'");
                    if (type.equals("TRIANGLES")) value.Yu0 = 4;
                    else if (type.equals("LINES")) value.Yu0 = 1;
                    else if (type.equals("POINTS")) value.Yu0 = 0;
                    else if (type.equals("TRIANGLE_STRIP")) value.Yu0 = 5;
                    else if (type.equals("LINE_STRIP")) value.Yu0 = 3;
                    else throw new nf_1("Unknown primitive type '" + type
                                + "', should be one of triangle, trianglestrip, line, linestrip or point");
                    value.Ky0 = shorts(part.package$("indices"));
                    parsedParts.Ue0(value);
                }
                result.W = (vx0[]) parsedParts.Mo0(vx0.class);
                model.Bz.Ue0(result);
            }
        }
        String directory = file.Br().el();
        oe_0 materials = root.Is("materials");
        if (materials != null) {
            model.zK.Bv(materials.lpt3);
            for (oe_0 material = materials.dz0; material != null; material = material.Uu) {
                ef0_1 result = new ef0_1();
                String id = material.L1("id", null);
                if (id == null) throw new nf_1("Material needs an id.");
                result.dq0 = id;
                oe_0 color = material.Is("diffuse");
                if (color != null) result.lF0 = H40(color);
                color = material.Is("ambient");
                if (color != null) result.dm0 = H40(color);
                color = material.Is("emissive");
                if (color != null) result.ph0 = H40(color);
                color = material.Is("specular");
                if (color != null) result.xv = H40(color);
                color = material.Is("reflection");
                if (color != null) result.x80 = H40(color);
                result.ai = material.sr("shininess", 0.0F);
                result.xu0 = material.sr("opacity", 1.0F);
                oe_0 textures = material.Is("textures");
                if (textures != null) {
                    for (oe_0 texture = textures.dz0; texture != null; texture = texture.Uu) {
                        jx0_0 value = new jx0_0();
                        if (texture.L1("id", null) == null) throw new nf_1("Texture has no id.");
                        String filename = texture.L1("filename", null);
                        if (filename == null) throw new nf_1("Texture needs filename.");
                        StringBuilder path = new StringBuilder().append(directory);
                        String separator = directory.length() == 0 || directory.endsWith("/") ? "" : "/";
                        value.Dn0 = VG.Mq(path, separator, filename);
                        value.iy0 = vector2(texture.Is("uvTranslation"), 0.0F, 0.0F);
                        value.Vi0 = vector2(texture.Is("uvScaling"), 1.0F, 1.0F);
                        String type = texture.L1("type", null);
                        if (type == null) throw new nf_1("Texture needs type.");
                        if (type.equalsIgnoreCase("AMBIENT")) value.for$ = 4;
                        else if (type.equalsIgnoreCase("BUMP")) value.for$ = 8;
                        else if (type.equalsIgnoreCase("DIFFUSE")) value.for$ = 2;
                        else if (type.equalsIgnoreCase("EMISSIVE")) value.for$ = 3;
                        else if (type.equalsIgnoreCase("NONE")) value.for$ = 1;
                        else if (type.equalsIgnoreCase("NORMAL")) value.for$ = 7;
                        else if (type.equalsIgnoreCase("REFLECTION")) value.for$ = 10;
                        else if (type.equalsIgnoreCase("SHININESS")) value.for$ = 6;
                        else if (type.equalsIgnoreCase("SPECULAR")) value.for$ = 5;
                        else if (type.equalsIgnoreCase("TRANSPARENCY")) value.for$ = 9;
                        else value.for$ = 0;
                        if (result.wX == null) result.wX = new es_1();
                        result.wX.Ue0(value);
                    }
                }
                model.zK.Ue0(result);
            }
        }
        oe_0 nodes = root.Is("nodes");
        if (nodes != null) {
            model.d9.Bv(nodes.lpt3);
            for (oe_0 node = nodes.dz0; node != null; node = node.Uu) model.d9.Ue0(ds0(node));
        }
        oe_0 animations = root.Is("animations");
        if (animations != null) {
            model.P10.Bv(animations.lpt3);
            for (oe_0 animation = animations.dz0; animation != null; animation = animation.Uu) {
                oe_0 bones = animation.Is("bones");
                if (bones == null) continue;
                g30_0 result = new g30_0();
                model.P10.Ue0(result);
                result.Cp.Bv(bones.lpt3);
                result.Bl0 = animation.Nz0("id");
                for (oe_0 bone = bones.dz0; bone != null; bone = bone.Uu) {
                    gx_0 track = new gx_0();
                    result.Cp.Ue0(track);
                    track.by0 = bone.Nz0("boneId");
                    oe_0 frames = bone.Is("keyframes");
                    if (frames != null && frames.jY()) {
                        for (oe_0 frame = frames.dz0; frame != null; frame = frame.Uu) {
                            float time = frame.sr("keytime", 0.0F) / 1000.0F;
                            oe_0 value = frame.Is("translation");
                            if (value != null && value.lpt3 == 3) {
                                if (track.Jr0 == null) track.Jr0 = new es_1();
                                legacyKey(track.Jr0, time, value, false);
                            }
                            value = frame.Is("rotation");
                            if (value != null && value.lpt3 == 4) {
                                if (track.JF == null) track.JF = new es_1();
                                legacyKey(track.JF, time, value, true);
                            }
                            value = frame.Is("scale");
                            if (value != null && value.lpt3 == 3) {
                                if (track.i9 == null) track.i9 = new es_1();
                                legacyKey(track.i9, time, value, false);
                            }
                        }
                    } else {
                        oe_0 channel = bone.Is("translation");
                        if (channel != null && channel.jY()) {
                            track.Jr0 = new es_1();
                            sparseKeys(track.Jr0, channel, false);
                        }
                        channel = bone.Is("rotation");
                        if (channel != null && channel.jY()) {
                            track.JF = new es_1();
                            sparseKeys(track.JF, channel, true);
                        }
                        channel = bone.Is("scaling");
                        if (channel != null && channel.jY()) {
                            track.i9 = new es_1();
                            sparseKeys(track.i9, channel, false);
                        }
                    }
                }
            }
        }
        return model;
    }

    private static float[] floats(oe_0 array) {
        if (array.wH0 != lpt3__3.cL) throw new IllegalStateException("Value is not an array: " + array.wH0);
        float[] result = new float[array.lpt3];
        int i = 0;
        for (oe_0 value = array.dz0; value != null; value = value.Uu) {
            float number;
            switch (Z9.zl0[value.wH0.ordinal()]) {
                case 1: number = Float.parseFloat(value.lpt4); break;
                case 2: number = (float) value.dJ; break;
                case 3: number = (float) value.yY; break;
                case 4: number = value.yY != 0L ? 1.0F : 0.0F; break;
                default: throw new IllegalStateException("Value cannot be converted to float: " + value.wH0);
            }
            result[i++] = number;
        }
        return result;
    }

    private static short[] shorts(oe_0 array) {
        if (array.wH0 != lpt3__3.cL) throw new IllegalStateException("Value is not an array: " + array.wH0);
        short[] result = new short[array.lpt3];
        int i = 0;
        for (oe_0 value = array.dz0; value != null; value = value.Uu) {
            short number;
            switch (Z9.zl0[value.wH0.ordinal()]) {
                case 1: number = Short.parseShort(value.lpt4); break;
                case 2: number = (short) value.dJ; break;
                case 3: number = (short) value.yY; break;
                case 4: number = (short) (value.yY != 0L ? 1 : 0); break;
                default: throw new IllegalStateException("Value cannot be converted to short: " + value.wH0);
            }
            result[i++] = number;
        }
        return result;
    }

    private static Bp0 vector2(oe_0 value, float x, float y) {
        if (value == null) return new Bp0(x, y);
        if (value.lpt3 != 2) throw new nf_1("Expected Vector2 values <> than two.");
        return new Bp0(value.pI0(0), value.pI0(1));
    }

    private static C8 vector3(oe_0 value) {
        return new C8(value.pI0(0), value.pI0(1), value.pI0(2));
    }

    private static me0_2 quaternion(oe_0 value) {
        return new me0_2(value.pI0(0), value.pI0(1), value.pI0(2), value.pI0(3));
    }

    private static void legacyKey(es_1 channel, float time, oe_0 value, boolean rotation) {
        DJ0 key = new DJ0();
        key.tz0 = time;
        key.Yo0 = rotation ? quaternion(value) : vector3(value);
        channel.Ue0(key);
    }

    private static void sparseKeys(es_1 channel, oe_0 frames, boolean rotation) {
        channel.Bv(frames.lpt3);
        for (oe_0 frame = frames.dz0; frame != null; frame = frame.Uu) {
            DJ0 key = new DJ0();
            channel.Ue0(key);
            key.tz0 = frame.sr("keytime", 0.0F) / 1000.0F;
            oe_0 value = frame.Is("value");
            if (value != null && value.lpt3 >= (rotation ? 4 : 3)) {
                key.Yo0 = rotation ? quaternion(value) : vector3(value);
            }
        }
    }

    public final ui0_0 ds0(oe_0 value) {
        ui0_0 node = new ui0_0();
        String id = value.L1("id", null);
        if (id == null) throw new nf_1("Node id missing.");
        node.OS = id;
        oe_0 transform = value.Is("translation");
        if (transform != null && transform.lpt3 != 3) throw new nf_1("Node translation incomplete");
        node.X20 = transform == null ? null : vector3(transform);
        transform = value.Is("rotation");
        if (transform != null && transform.lpt3 != 4) throw new nf_1("Node rotation incomplete");
        node.IE0 = transform == null ? null : quaternion(transform);
        transform = value.Is("scale");
        if (transform != null && transform.lpt3 != 3) throw new nf_1("Node scale incomplete");
        node.Dy0 = transform == null ? null : vector3(transform);
        value.L1("mesh", null);
        oe_0 parts = value.Is("parts");
        if (parts != null) {
            node.Wu = new xu_0[parts.lpt3];
            int i = 0;
            for (oe_0 part = parts.dz0; part != null; part = part.Uu) {
                xu_0 result = new xu_0();
                String mesh = part.L1("meshpartid", null);
                String material = part.L1("materialid", null);
                if (mesh == null || material == null) {
                    throw new nf_1("Node " + id + " part is missing meshPartId or materialId");
                }
                result.ys = material;
                result.Hi = mesh;
                oe_0 bones = part.Is("bones");
                if (bones != null) {
                    result.fH = new cf_2(true, bones.lpt3, String.class, Matrix4.class);
                    for (oe_0 bone = bones.dz0; bone != null; bone = bone.Uu) {
                        String boneId = bone.L1("node", null);
                        if (boneId == null) throw new nf_1("Bone node ID missing");
                        Matrix4 matrix = new Matrix4();
                        oe_0 position = bone.Is("translation");
                        if (position != null && position.lpt3 >= 3) {
                            matrix.el0(position.pI0(0), position.pI0(1), position.pI0(2));
                        }
                        oe_0 rotation = bone.Is("rotation");
                        if (rotation != null && rotation.lpt3 >= 4) {
                            float x = rotation.pI0(0);
                            float y = rotation.pI0(1);
                            float z = rotation.pI0(2);
                            float w = rotation.pI0(3);
                            Mu.m1 = x;
                            Mu.ao0 = y;
                            Mu.th = z;
                            Mu.Au0 = w;
                            matrix.qt(Mu);
                        }
                        oe_0 scale = bone.Is("scale");
                        if (scale != null && scale.lpt3 >= 3) {
                            matrix.w2(scale.pI0(0), scale.pI0(1), scale.pI0(2));
                        }
                        result.fH.n3(boneId, matrix);
                    }
                }
                node.Wu[i++] = result;
            }
        }
        oe_0 children = value.Is("children");
        if (children != null) {
            node.Q1 = new ui0_0[children.lpt3];
            int i = 0;
            for (oe_0 child = children.dz0; child != null; child = child.Uu) node.Q1[i++] = ds0(child);
        }
        return node;
    }
}
