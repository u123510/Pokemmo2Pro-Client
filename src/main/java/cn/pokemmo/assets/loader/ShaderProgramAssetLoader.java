package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class ShaderProgramAssetLoader extends BaseAssetLoader {
    public final String wT;
    public final String u20;

    public ShaderProgramAssetLoader(gq_1 resolver) {
        super(resolver);
        this.wT = ".vert";
        this.u20 = ".frag";
    }

    public ShaderProgramAssetLoader(gq_1 resolver, String vertexSuffix, String fragmentSuffix) {
        super(resolver);
        this.wT = vertexSuffix;
        this.u20 = fragmentSuffix;
    }

    @Override
    public final Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        U0 options = (U0) parameters;
        String fragmentPath = null;
        String vertexPath = null;

        if (fileName.endsWith(this.u20)) {
            vertexPath = fileName.substring(0, fileName.length() - this.u20.length()) + this.wT;
        }
        if (fileName.endsWith(this.wT)) {
            fragmentPath = fileName.substring(0, fileName.length() - this.wT.length()) + this.u20;
        }

        Dn0 vertexFile = vertexPath == null ? file : this.resolve(vertexPath);
        Dn0 fragmentFile = fragmentPath == null ? file : this.resolve(fragmentPath);
        String vertexSource = vertexFile.gd0(null);
        String fragmentSource = vertexFile.equals(fragmentFile) ? vertexSource : fragmentFile.gd0(null);
        lt_1 shader = new lt_1(vertexSource, fragmentSource);

        if ((options == null || options.PD0) && !shader.U00) {
            Ls0 logger = manager.LPt4;
            String message = "ShaderProgram " + fileName + " failed to compile:\n" + shader.aX();
            if (logger.Em0 >= 1) {
                lg_0.k.Xd0(logger.Km0, message);
            }
        }
        return shader;
    }

    @Override
    public final void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        U0 ignored = (U0) parameters;
    }

    @Override
    public final es_1 getDependencies(String fileName, Dn0 file, in_0 parameters) {
        U0 ignored = (U0) parameters;
        return null;
    }
}
