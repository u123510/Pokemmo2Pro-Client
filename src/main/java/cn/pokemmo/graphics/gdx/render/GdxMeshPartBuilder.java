package cn.pokemmo.graphics.gdx.render;

import f.*;


public class GdxMeshPartBuilder {
    public ut_0 de0;
    public Xz0 Yg0;
    public final es_1 Hz;

    public GdxMeshPartBuilder() {
        super();
        this.Hz = new es_1();
        new com.badlogic.gdx.math.Matrix4();
    }

    public static void aG0(ut_0 target, Xz0 node) {
        I2 meshes = node.sJ0.ZD();
        while (meshes.hasNext()) {
            I20 item = (I20) meshes.next();
            if (!target.Cs.j4(item.jK0, true)) {
                target.Cs.Ue0(item.jK0);
            }
            if (target.a50.j4(item.d40, true)) {
                continue;
            }
            target.a50.Ue0(item.d40);
            if (!target.By.j4(item.d40.m8, true)) {
                target.By.Ue0(item.d40.m8);
            }
            ap0_0 material = item.d40.m8;
            if (!target.iM.j4(material, true)) {
                target.iM.Ue0(material);
            }
        }
        I2 children = node.yn.ZD();
        while (children.hasNext()) {
            aG0(target, (Xz0) children.next());
        }
    }

    public final void Pj() {
        if (this.de0 != null) {
            throw new nf_1("Call end() first");
        }
        this.Yg0 = null;
        this.de0 = new ut_0();
        this.Hz.clear();
    }

    public final ut_0 ps() {
        ut_0 result = this.de0;
        if (result == null) {
            throw new nf_1("Call begin() first");
        }
        if (this.Yg0 != null) {
            this.Yg0 = null;
        }
        this.de0 = null;
        I2 meshes = this.Hz.ZD();
        while (meshes.hasNext()) {
            L8 part = (L8) meshes.next();
            ap0_0 mesh = new ap0_0(true,
                    Math.min(part.qh.Or / part.nF0, 65536),
                    part.A00.Sd0,
                    part.RE0);
            part.Xa0();
            sa_0 attributes = part.RE0;
            if (attributes == null) {
                throw new nf_1("Call begin() first");
            }
            if (!attributes.equals(mesh.COM6.JP())) {
                throw new nf_1("Mesh attributes don't match");
            }
            if (mesh.COM6.Ew0() * part.nF0 < part.qh.Or) {
                throw new nf_1("Mesh can't hold enough vertices: " + mesh.COM6.Ew0() * part.nF0
                        + " < " + part.qh.Or);
            }
            if (mesh.Sw0.Kd() < part.A00.Sd0) {
                throw new nf_1("Mesh can't hold enough indices: " + mesh.Sw0.Kd()
                        + " < " + part.A00.Sd0);
            }
            mesh.COM6.ce0(0, part.qh.Or, part.qh.iS);
            mesh.Sw0.Gy0(part.A00.Sd0, part.A00.mi0);
            I2 users = part.zH0.ZD();
            while (users.hasNext()) {
                ((U30) users.next()).m8 = mesh;
            }
            part.zH0.clear();
            part.RE0 = null;
            part.qh.Or = 0;
            part.A00.Sd0 = 0;
        }
        this.Hz.clear();
        result.Cs.clear();
        result.By.clear();
        result.a50.clear();
        I2 nodes = result.Wc0.ZD();
        while (nodes.hasNext()) {
            aG0(result, (Xz0) nodes.next());
        }
        return result;
    }

    public final L8 aM(String name, long mask, BM material) {
        int usage = 4;
        // Force the same L8 class initialization point as the original bytecode.
        C8 ignoredLayoutInit = L8.g4;
        es_1 attributes = new es_1();
        if ((mask & 1L) == 1L) {
            attributes.Ue0(new kz_0(1, 3, "a_position"));
        }
        if ((mask & 2L) == 2L) {
            attributes.Ue0(new kz_0(2, 4, "a_color"));
        }
        if ((mask & 4L) == 4L) {
            attributes.Ue0(new kz_0(4, 4, "a_color"));
        }
        if ((mask & 8L) == 8L) {
            attributes.Ue0(new kz_0(8, 3, "a_normal"));
        }
        if ((mask & 16L) == 16L) {
            attributes.Ue0(new kz_0(16, 2, "a_texCoord0"));
        }
        kz_0[] descriptors = new kz_0[attributes.KB];
        for (int i = 0; i < attributes.KB; i++) {
            descriptors[i] = (kz_0) attributes.get(i);
        }
        sa_0 vertexAttributes = new sa_0(descriptors);
        I2 parts = this.Hz.ZD();
        L8 part = null;
        while (parts.hasNext()) {
            L8 candidate = (L8) parts.next();
            if (candidate.RE0.equals(vertexAttributes) && candidate.lx < 32768) {
                part = candidate;
                break;
            }
        }
        if (part == null) {
            part = new L8();
            if (part.RE0 != null) {
                throw new RuntimeException("Call end() first");
            }
            part.RE0 = vertexAttributes;
            part.qh.Or = 0;
            part.A00.Sd0 = 0;
            part.zH0.clear();
            part.mg0 = 0;
            part.lx = -1;
            part.xv = 0;
            part.k = null;
            int floatsPerVertex = vertexAttributes.u5 / 4;
            part.nF0 = floatsPerVertex;
            if (part.V80 == null || part.V80.length < floatsPerVertex) {
                part.V80 = new float[floatsPerVertex];
            }
            kz_0 descriptor = vertexAttributes.r70(1);
            if (descriptor == null) {
                throw new nf_1("Cannot build mesh without position attribute");
            }
            part.kg = descriptor.Kk0 / 4;
            part.vu = descriptor.dG0;
            descriptor = vertexAttributes.r70(8);
            int offset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.Am = offset;
            descriptor = vertexAttributes.r70(256);
            offset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.Fw = offset;
            descriptor = vertexAttributes.r70(128);
            offset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.Iy0 = offset;
            descriptor = vertexAttributes.r70(2);
            int colorOffset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.yL0 = colorOffset;
            part.DU = descriptor == null ? 0 : descriptor.dG0;
            descriptor = vertexAttributes.r70(4);
            offset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.Gs0 = offset;
            descriptor = vertexAttributes.r70(16);
            offset = descriptor == null ? -1 : descriptor.Kk0 / 4;
            part.l60 = offset;
            part.rv0.set(com.badlogic.gdx.graphics.Color.WHITE);
            part.mB = false;
            part.WZ(null);
            part.XB0();
            part.NP = -1;
            part.Pj.br();
            this.Hz.Ue0(part);
        }
        U30 usagePart = new U30();
        if (part.RE0 == null) {
            throw new RuntimeException("Call begin() first");
        }
        // Keep the original bytecode order: Xa0 runs before the usage fields are attached.
        part.Xa0();
        part.k = usagePart;
        usagePart.Xj = name;
        usagePart.bJ0 = usage;
        part.NP = usage;
        part.zH0.Ue0(usagePart);
        part.rv0.set(com.badlogic.gdx.graphics.Color.WHITE);
        part.mB = false;
        part.WZ(null);
        part.XB0();
        if (this.Yg0 == null) {
            Xz0 node = new Xz0();
            ut_0 root = this.de0;
            if (root == null) {
                throw new nf_1("Call begin() first");
            }
            root.Wc0.Ue0(node);
            this.Yg0 = node;
            node.mw = "node" + root.Wc0.KB;
        }
        this.Yg0.sJ0.Ue0(new I20(usagePart, material));
        return part;
    }

    public final ut_0 CR(float x, float y, float z, BM material) {
        this.Pj();
        L8 part = this.aM("box", 9L, material);
        float hx = x * 0.5F;
        float hy = y * 0.5F;
        float hz = z * 0.5F;
        float x0 = -hx;
        float y0 = -hy;
        float z0 = -hz;
        float x1 = hx;
        float y1 = hy;
        float z1 = hz;
        com9__5 vertexPool = vo_0.u4;
        C8 v0 = (C8) vertexPool.obtain();
        v0.x = x0;
        v0.y = y0;
        v0.z = z0;
        C8 v1 = (C8) vertexPool.obtain();
        v1.x = x0;
        v1.y = y1;
        v1.z = z0;
        C8 v2 = (C8) vertexPool.obtain();
        v2.x = x1;
        v2.y = y0;
        v2.z = z0;
        C8 v3 = (C8) vertexPool.obtain();
        v3.x = x1;
        v3.y = y1;
        v3.z = z0;
        C8 v4 = (C8) vertexPool.obtain();
        v4.x = x0;
        v4.y = y0;
        v4.z = z1;
        C8 v5 = (C8) vertexPool.obtain();
        v5.x = x0;
        v5.y = y1;
        v5.z = z1;
        C8 v6 = (C8) vertexPool.obtain();
        v6.x = x1;
        v6.y = y0;
        v6.z = z1;
        C8 v7 = (C8) vertexPool.obtain();
        v7.x = x1;
        v7.y = y1;
        v7.z = z1;
        long mask = part.RE0.Js0();
        if ((mask & 408L) == 0L) {
            VC a = vo_0.nE.kf0(v0, null);
            VC b = vo_0.MJ0.kf0(v1, null);
            VC c = vo_0.CE.kf0(v2, null);
            VC d = vo_0.Ti0.kf0(v3, null);
            VC e = vo_0.Com1.kf0(v6, null);
            VC f = vo_0.hV.kf0(v5, null);
            VC g = vo_0.Xu.kf0(v4, null);
            VC h = vo_0.DD0.kf0(v7, null);
            part.qh.bD(part.nF0 * 8);
            short i0 = part.ek0(a);
            short i1 = part.ek0(c);
            short i2 = part.ek0(d);
            short i3 = part.ek0(b);
            short i4 = part.ek0(e);
            short i5 = part.ek0(g);
            short i6 = part.ek0(h);
            short i7 = part.ek0(f);
            if (part.NP == 1) {
                part.A00.Wf(24);
                part.Ix(i0, i1, i2, i3);
                part.Ix(i4, i5, i6, i7);
                part.A00.Wf(8);
                part.A00.e80(i0);
                part.A00.e80(i4);
                part.A00.e80(i3);
                part.A00.e80(i7);
                part.A00.e80(i2);
                part.A00.e80(i6);
                part.A00.e80(i1);
                part.A00.e80(i5);
            } else if (part.NP == 0) {
                part.Pm(2);
                part.Ix(i0, i1, i2, i3);
                part.Ix(i4, i5, i6, i7);
            } else {
                part.Pm(6);
                part.Ix(i0, i1, i2, i3);
                part.Ix(i4, i5, i6, i7);
                part.Ix(i0, i3, i7, i4);
                part.Ix(i5, i1, i2, i6);
                part.Ix(i5, i2, i0, i4);
                part.Ix(i1, i6, i7, i3);
            }
        } else {
            part.qh.bD(part.nF0 * 24);
            part.Pm(6);
            C8 normal = vo_0.KI0;
            normal.x = v0.x;
            normal.y = v0.y;
            normal.z = v0.z;
            normal.JA(v3, 0.5F);
            C8 midpoint = vo_0.Hq;
            midpoint.x = v6.x;
            midpoint.y = v6.y;
            midpoint.z = v6.z;
            midpoint.JA(v7, 0.5F);
            normal.Vy(midpoint.x, midpoint.y, midpoint.z).KM();
            part.MK0(v0, v1, v3, v2, normal);
            part.MK0(v5, v6, v4, v7, normal.Fg0(-1.0F));

            normal.x = v0.x;
            normal.y = v0.y;
            normal.z = v0.z;
            normal.JA(v4, 0.5F);
            midpoint.x = v1.x;
            midpoint.y = v1.y;
            midpoint.z = v1.z;
            midpoint.JA(v7, 0.5F);
            normal.Vy(midpoint.x, midpoint.y, midpoint.z).KM();
            part.MK0(v6, v0, v2, v4, normal);
            part.MK0(v1, v5, v7, v3, normal.Fg0(-1.0F));

            normal.x = v0.x;
            normal.y = v0.y;
            normal.z = v0.z;
            normal.JA(v5, 0.5F);
            midpoint.x = v2.x;
            midpoint.y = v2.y;
            midpoint.z = v2.z;
            midpoint.JA(v7, 0.5F);
            normal.Vy(midpoint.x, midpoint.y, midpoint.z).KM();
            part.MK0(v6, v5, v1, v0, normal);
            part.MK0(v2, v3, v7, v4, normal.Fg0(-1.0F));
        }
        vo_0.u4.hJ();
        vo_0.Bp.hJ();
        return this.ps();
    }

    public final ut_0 Q3(float r0, float r1, float r2, float r3, float r4, float r5, float r6,
            float r7, float r8, float r9, float r10, float r11, float r12, float r13, BM material,
            long mask) {
        this.Pj();
        L8 part = this.aM("rect", mask, material);
        VC[] corners = new VC[4];
        corners[0] = part.RJ.kf0(null, null);
        corners[0].Bv.x = r0;
        corners[0].Bv.y = r1;
        corners[0].Bv.z = r2;
        corners[0].Qj = true;
        // The original descriptor stores the final two float arguments as
        // texture coordinates in reverse local-slot order: x <- arg14,
        // z <- arg13. This is observable in the generated sprite UVs.
        corners[0].t3.x = r13;
        corners[0].t3.y = 1.0F;
        corners[0].t3.z = r12;
        corners[0].Lpt9 = true;
        corners[0].p70(0.0F, 1.0F);
        corners[1] = part.nq0.kf0(null, null);
        corners[1].Bv.x = r3;
        corners[1].Bv.y = r4;
        corners[1].Bv.z = r5;
        corners[1].Qj = true;
        corners[1].t3.x = r13;
        corners[1].t3.y = 1.0F;
        corners[1].t3.z = r12;
        corners[1].Lpt9 = true;
        corners[1].p70(1.0F, 1.0F);
        corners[2] = part.S50.kf0(null, null);
        corners[2].Bv.x = r6;
        corners[2].Bv.y = r7;
        corners[2].Bv.z = r8;
        corners[2].Qj = true;
        corners[2].t3.x = r13;
        corners[2].t3.y = 1.0F;
        corners[2].t3.z = r12;
        corners[2].Lpt9 = true;
        corners[2].p70(1.0F, 0.0F);
        corners[3] = part.vw0.kf0(null, null);
        corners[3].Bv.x = r9;
        corners[3].Bv.y = r10;
        corners[3].Bv.z = r11;
        corners[3].Qj = true;
        corners[3].t3.x = r13;
        corners[3].t3.y = 1.0F;
        corners[3].t3.z = r12;
        corners[3].Lpt9 = true;
        corners[3].p70(0.0F, 0.0F);
        part.qh.bD(part.nF0 * 4);
        short i0 = part.ek0(corners[0]);
        short i1 = part.ek0(corners[1]);
        short i2 = part.ek0(corners[2]);
        short i3 = part.ek0(corners[3]);
        part.Ix(i0, i1, i2, i3);
        return this.ps();
    }
}
