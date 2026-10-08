/*
 * Decompiled with CFR 0.152.
 */
package com.badlogic.gdx.graphics;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import f.Dn0;
import f.E9;
import f.Em0;
import f.I2;
import f.S60;
import f.a00_0;
import f.cm_0;
import f.du_2;
import f.eb0_1;
import f.es_1;
import f.hd0_2;
import f.i4_0;
import f.ix0_0;
import f.lg_0;
import f.lq_2;
import f.mc_0;
import f.nf_1;
import f.ty_1;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Texture
extends lq_2 {
    private static hd0_2 assetManager;
    static final Map managedTextures;
    E9 data;

    public Texture(String string) {
        this(lg_0.I70.cD0(string));
    }

    public Texture(Dn0 dn0) {
        this(dn0, null, false);
    }

    public Texture(Dn0 dn0, boolean bl) {
        this(dn0, null, bl);
    }

    public Texture(Dn0 dn0, ix0_0 ix0_02, boolean bl) {
        this(cm_0.Py(dn0, ix0_02, bl));
    }

    public Texture(i4_0 i4_02) {
        this(new S60(i4_02, null, false, false));
    }

    public Texture(i4_0 i4_02, boolean bl) {
        this(new S60(i4_02, null, bl, false));
    }

    public Texture(i4_0 i4_02, ix0_0 ix0_02, boolean bl) {
        this(new S60(i4_02, ix0_02, bl, false));
    }

    public Texture(int n, int n2, ix0_0 ix0_02) {
        this(new S60(new i4_0(n, n2, ix0_02), null, false, true));
    }

    public Texture(E9 e9) {
        this(3553, lg_0.OH0.glGenTexture(), e9);
    }

    public Texture(int n, int n2, E9 e9) {
        super(n, n2);
        this.load(e9);
        if (e9.wx()) {
            Texture.addManagedTexture(lg_0.k, this);
        }
    }

    private static void addManagedTexture(du_2 du_22, Texture texture) {
        Map map = managedTextures;
        es_1 es_12 = (es_1)map.get(du_22);
        if (es_12 == null) {
            es_12 = new es_1();
        }
        es_12.Ue0(texture);
        map.put(du_22, es_12);
    }

    public static void clearAllTextures(du_2 du_22) {
        managedTextures.remove(du_22);
    }

    public static void invalidateAllTextures(du_2 du_22) {
        es_1 objectArray = (es_1)managedTextures.get(du_22);
        if (objectArray == null) {
            return;
        }
        Object object = assetManager;
        if (object == null) {
            for (int j = 0; j < objectArray.KB; ++j) {
                ((Texture)objectArray.get(j)).reload();
            }
        } else {
            ((hd0_2)object).Q4();
            object = new es_1();
            I2 i2 = new es_1((es_1)objectArray).ZD();
            while (i2.hasNext()) {
                Em0 em0;
                Texture texture = (Texture)i2.next();
                String string = assetManager.RV(texture);
                if (string == null) {
                    texture.reload();
                    continue;
                }
                Texture texture2 = texture;
                int n = assetManager.R80(string);
                assetManager.v9(0, string);
                texture2.glHandle = 0;
                Em0 em02 = em0 = new Em0();
                em02.iJ = texture.getTextureData();
                em02.A30 = texture.getMinFilter();
                em02.YI = texture.getMagFilter();
                em02.nf0 = texture.getUWrap();
                em02.wd0 = texture.getVWrap();
                em02.f8 = texture.data.bm();
                em0.wU = texture;
                em0.loadedCallback = new ty_1(n);
                assetManager.Mj(string);
                texture2.glHandle = lg_0.OH0.glGenTexture();
                assetManager.im(string, Texture.class, em02);
            }
            es_1 objectArray2 = objectArray;
            Object object2 = object;
            objectArray.clear();
            Object[] restored = ((es_1)object2).rZ;
            int n = ((es_1)object2).KB;
            objectArray2.G6(restored, 0, n);
        }
    }

    public static void setAssetManager(hd0_2 hd0_22) {
        assetManager = hd0_22;
    }

    public static String getManagedStatus() {
        StringBuilder stringBuilder2 = new StringBuilder("Managed textures/app: { ");
        Iterator iterator = managedTextures.keySet().iterator();
        while (iterator.hasNext()) {
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder3.append(((es_1)Texture.managedTextures.get((Object)((du_2)iterator.next()))).KB);
            stringBuilder3.append(" ");
        }
        StringBuilder stringBuilder4 = stringBuilder2;
        stringBuilder4.append("}");
        return stringBuilder4.toString();
    }

    public static int getNumManagedTextures() {
        return ((es_1)Texture.managedTextures.get((Object)lg_0.k)).KB;
    }

    static {
        managedTextures = new HashMap();
    }

    public void load(E9 object) {
        if (this.data != null && object.wx() != this.data.wx()) {
            throw new nf_1("New data must have the same managed status as the old data");
        }
        this.data = object;
        if (!object.xZ()) {
            object.Dx0();
        }
        Texture texture = this;
        texture.bind();
        lq_2.uploadImageData(3553, object);
        texture.unsafeSetFilter(texture.minFilter, texture.magFilter, true);
        texture.unsafeSetWrap(texture.uWrap, texture.vWrap, true);
        texture.unsafeSetAnisotropicFilter(texture.anisotropicFilterLevel, true);
        lg_0.OH0.glBindTexture(this.glTarget, 0);
    }

    public void reload() {
        if (this.isManaged()) {
            Texture texture = this;
            texture.glHandle = lg_0.OH0.glGenTexture();
            texture.load(texture.data);
            return;
        }
        throw new nf_1("Tried to reload unmanaged Texture");
    }

    public void draw(i4_0 i4_02, int n, int n2) {
        if (!this.data.wx()) {
            this.bind();
            i4_0 i4_03 = i4_02;
            int n3 = this.glTarget;
            int n4 = 0;
            Gdx2DPixmap gdx2DPixmap = i4_03.XF;
            int n5 = gdx2DPixmap.SH;
            int n6 = gdx2DPixmap.mB0;
            int n7 = i4_03.Wc();
            int n8 = i4_03.t30();
            ByteBuffer byteBuffer = i4_03.Rh0();
            lg_0.OH0.glTexSubImage2D(n3, n4, n, n2, n5, n6, n7, n8, byteBuffer);
            return;
        }
        throw new nf_1("can't draw to a managed texture");
    }

    public int getWidth() {
        return this.data.Nx();
    }

    public int getHeight() {
        return this.data.Af();
    }

    public int getDepth() {
        return 0;
    }

    public E9 getTextureData() {
        return this.data;
    }

    public boolean isManaged() {
        return this.data.wx();
    }

    @Override
    public void dispose() {
        Map map;
        if (this.glHandle == 0) {
            return;
        }
        Texture texture = this;
        texture.delete();
        if (texture.data.wx() && (map = managedTextures).get(lg_0.k) != null) {
            ((es_1)map.get(lg_0.k)).sj0(this, true);
        }
    }

    public String toString() {
        E9 e9 = this.data;
        if (e9 instanceof mc_0) {
            return e9.toString();
        }
        return super.toString();
    }
}
