package cn.pokemmo.io.loader;

import f.*;
import com.badlogic.gdx.graphics.Texture;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Particle2DEffectLoader extends SyncAssetLoader {

    public Particle2DEffectLoader(gq_1 resolver) {
        super(resolver);
    }

    @Override
    public Object mm(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        jk0_2 param = (jk0_2) v4;
        xw_0 effect = new xw_0();
        Dn0 dir = v3.Br();
        InputStream in = v3.uf0();
        effect.cq.clear();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in), 512);
            while (true) {
                No emitter = new No(reader);
                effect.cq.Ue0(emitter);
                if (reader.readLine() == null) {
                    break;
                }
            }
        } catch (IOException ex) {
            throw new nf_1("Error loading effect: " + v3, ex);
        } finally {
            KT.E1(reader);
        }
        effect.QC = true;
        nb_2 textureMap = new nb_2(effect.cq.KB);
        for (int i = 0; i < effect.cq.KB; i++) {
            No emitter = (No) effect.cq.get(i);
            if (emitter.oD0.KB != 0) {
                es_1 spriteList = new es_1();
                I2 it = emitter.oD0.ZD();
                while (it.hasNext()) {
                    String path = (String) it.next();
                    String name = new File(path.replace('\\', '/')).getName();
                    B5 sprite = (B5) textureMap.Wk0(name);
                    if (sprite == null) {
                        Dn0 imageFile = dir.wp(name);
                        Texture texture = new Texture(imageFile, false);
                        sprite = new B5(texture);
                        textureMap.WK0(name, sprite);
                    }
                    spriteList.Ue0(sprite);
                }
                emitter.fo0 = spriteList;
                if (spriteList.KB != 0) {
                    for (int p = 0; p < emitter.Pw.length; p++) {
                        Ns0 particle = emitter.Pw[p];
                        if (particle == null) {
                            break;
                        }
                        B5 chosenSprite = null;
                        switch (G3.bl0[emitter.zm0.ordinal()]) {
                            case 1:
                                chosenSprite = (B5) spriteList.KI();
                                break;
                            case 2:
                                float f = 0.0f;
                                chosenSprite = (B5) spriteList.get(Math.min((int) ((1.0f - (f / f)) * ((float) spriteList.KB)), spriteList.KB - 1));
                                break;
                            case 3:
                                chosenSprite = spriteList.KB == 0 ? null : (B5) spriteList.rZ[(int) LW.Yu.nextLong(spriteList.KB)];
                                break;
                        }
                        particle.t60(chosenSprite);
                        float w = chosenSprite.Zu0();
                        float h = chosenSprite.kC0();
                        particle.Jn0 = w;
                        particle.si = h;
                        particle.o70 = true;
                    }
                }
            }
        }
        return effect;
    }

    @Override
    public es_1 getDependencies(String str, Dn0 dn0, in_0 in_0Var) {
        jk0_2 unused = (jk0_2) in_0Var;
        return null;
    }
}
