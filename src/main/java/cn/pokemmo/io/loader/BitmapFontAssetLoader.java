package cn.pokemmo.io.loader;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitmapFontAssetLoader extends SyncAssetLoader {
    public final n8_0 FC0;
    public final zb0_0 Uf0;

    public BitmapFontAssetLoader() {
        this(new lpt1__2());
    }

    public BitmapFontAssetLoader(gq_1 v1) {
        super(v1);
        this.FC0 = new n8_0();
        this.Uf0 = new zb0_0();
    }

    @Override
    public Object mm(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        n8_0 ignored = (n8_0) v4;
        synchronized (v3) {
            es_1 shape = (es_1) v1.GE.Wk0(v2);
            Texture texture = (Texture) v1.hi((String) shape.KI());
            LPT6_ region = new LPT6_(texture);
            int bufferSize = 256;
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(v3.uf0()), bufferSize)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.startsWith("s")) continue;
                    String[] values = line.substring(1).trim().split(",");
                    float[] vertices = new float[values.length];
                    for (int i = 0; i < values.length; i++) {
                        vertices[i] = Float.parseFloat(values[i]);
                    }
                    BB bounds = this.Uf0.PRn(vertices);
                    short[] triangles = new short[bounds.Sd0];
                    System.arraycopy(bounds.mi0, 0, triangles, 0, bounds.Sd0);
                    return new vh_0(region, vertices, triangles);
                }
            } catch (IOException e) {
                throw new nf_1("Error reading polygon shape file: " + v3, e);
            } catch (Throwable e) {
                throw new nf_1("Error reading polygon shape file: " + v3, e);
            }
            throw new nf_1("Polygon shape not found: " + v3);
        }
    }

    @Override
    public es_1 getDependencies(String v1, Dn0 v2, in_0 v3) {
        n8_0 format = (n8_0) v3;
        if (format == null) format = this.FC0;
        String dependency = null;
        try {
            int bufferSize = format.s70;
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(v2.uf0()), bufferSize);
            String line = reader.readLine();
            while (line != null) {
                if (line.startsWith(format.fN)) {
                    dependency = line.substring(format.fN.length());
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
            if (dependency == null && format.Y0 != null) {
                for (String suffix : format.Y0) {
                    Dn0 candidate = v2.xt(v2.R20().concat("." + suffix));
                    if (candidate.os0()) dependency = candidate.o30();
                }
            }
        } catch (IOException e) {
            throw new nf_1(jj0_0.hw0("Error reading ", v1), e);
        }
        if (dependency == null) return null;
        es_1 result = new es_1(1);
        result.Ue0(new cr_2(v2.xt(dependency), Texture.class));
        return result;
    }
}
