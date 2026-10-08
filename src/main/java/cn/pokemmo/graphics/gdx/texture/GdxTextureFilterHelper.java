package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GdxTextureFilterHelper {
    public final es_1 O4;

    public GdxTextureFilterHelper() {
        this.O4 = new es_1();
    }

    public static Color j40(String[] tokens) {
        float r = Float.parseFloat(tokens[1]);
        float g = Float.parseFloat(tokens[2]);
        float b = Float.parseFloat(tokens[3]);
        float a = 1.0f;
        if (tokens.length > 4) {
            a = Float.parseFloat(tokens[4]);
        }
        return new Color(r, g, b, a);
    }

    public final void Dw(Dn0 dn0) {
        sz_2 mat = new sz_2();
        if (dn0 == null || !dn0.os0()) {
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(dn0.uf0()), 4096);
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > 0 && line.charAt(0) == '\t') {
                    line = line.substring(1).trim();
                }
                String[] tokens = line.split("\\s+");
                if (tokens[0].length() == 0 || tokens[0].charAt(0) == '#') {
                    continue;
                }
                String key = tokens[0].toLowerCase();
                if (key.equals("newmtl")) {
                    ef0_1 built = mat.A5();
                    this.O4.Ue0(built);
                    if (tokens.length > 1) {
                        mat.gD0 = tokens[1];
                        mat.gD0 = mat.gD0.replace('.', '_');
                    } else {
                        mat.gD0 = "default";
                    }
                    mat.tt0();
                } else if (key.equals("ka")) {
                    mat.OC = j40(tokens);
                } else if (key.equals("kd")) {
                    mat.py0 = j40(tokens);
                } else if (key.equals("ks")) {
                    mat.Ry0 = j40(tokens);
                } else if (key.equals("tr") || key.equals("d")) {
                    mat.Yi = Float.parseFloat(tokens[1]);
                } else if (key.equals("ns")) {
                    mat.d7 = Float.parseFloat(tokens[1]);
                } else if (key.equals("map_d")) {
                    mat.P00 = dn0.Br().wp(tokens[1]).el();
                } else if (key.equals("map_ka")) {
                    mat.Hg0 = dn0.Br().wp(tokens[1]).el();
                } else if (key.equals("map_kd")) {
                    mat.ZN = dn0.Br().wp(tokens[1]).el();
                } else if (key.equals("map_ks")) {
                    mat.xF0 = dn0.Br().wp(tokens[1]).el();
                } else if (key.equals("map_ns")) {
                    mat.ts0 = dn0.Br().wp(tokens[1]).el();
                }
            }
            reader.close();
            ef0_1 built = mat.A5();
            this.O4.Ue0(built);
        } catch (IOException ignored) {
        }
    }
}
