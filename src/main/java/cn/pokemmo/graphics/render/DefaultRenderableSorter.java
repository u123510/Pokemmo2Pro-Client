package cn.pokemmo.graphics.render;

import f.*;
import java.util.Comparator;

import com.badlogic.gdx.math.Matrix4;
import java.util.Comparator;

public class DefaultRenderableSorter implements RenderableSorter, Comparator {
    public Tv0 NUl;
    public final C8 vK0;
    public final C8 ks0;

    public DefaultRenderableSorter() {
        this.vK0 = new C8();
        this.ks0 = new C8();
    }

    @Override
    public void On0(Tv0 camera, es_1 values) {
        this.NUl = camera;
        values.sort(this);
    }

    @Override
    public int compare(Object firstObject, Object secondObject) {
        return this.Yr0((W00)firstObject, (W00)secondObject);
    }

    public int Yr0(W00 first, W00 second) {
        long key = sh_0.vF0;
        boolean firstSpecial = first.ly.tM(key) && ((sh_0)first.ly.sg(key)).yg;
        boolean secondSpecial = second.ly.tM(key) && ((sh_0)second.ly.sg(key)).yg;
        if (firstSpecial != secondSpecial) {
            return firstSpecial ? 1 : -1;
        }

        Matrix4 firstMatrix = first.eo0;
        C8 firstLocal = first.VE0.T4;
        if (firstLocal.eG()) {
            firstMatrix.V1(this.vK0);
        } else if (!firstMatrix.Mq0()) {
            firstMatrix.V1(this.vK0).na(firstLocal.x, firstLocal.y, firstLocal.z);
        } else {
            this.vK0.x = firstLocal.x;
            this.vK0.y = firstLocal.y;
            this.vK0.z = firstLocal.z;
            this.vK0.cu(firstMatrix);
        }

        Matrix4 secondMatrix = second.eo0;
        C8 secondLocal = second.VE0.T4;
        if (secondLocal.eG()) {
            secondMatrix.V1(this.ks0);
        } else if (!secondMatrix.Mq0()) {
            secondMatrix.V1(this.ks0).na(secondLocal.x, secondLocal.y, secondLocal.z);
        } else {
            this.ks0.x = secondLocal.x;
            this.ks0.y = secondLocal.y;
            this.ks0.z = secondLocal.z;
            this.ks0.cu(secondMatrix);
        }

        float difference = (int)(this.NUl.v40.Lk(this.vK0) * 1000.0F)
            - (int)(this.NUl.v40.Lk(this.ks0) * 1000.0F);
        int result = difference < 0.0F ? -1 : (difference > 0.0F ? 1 : 0);
        return firstSpecial ? -result : result;
    }
}
