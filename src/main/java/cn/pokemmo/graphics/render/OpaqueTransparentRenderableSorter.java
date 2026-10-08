package cn.pokemmo.graphics.render;

import f.*;
import java.util.Comparator;

import com.badlogic.gdx.math.Matrix4;
import java.util.Comparator;

public class OpaqueTransparentRenderableSorter implements RenderableSorter, Comparator {
    public Tv0 Dy;
    public final C8 SQ = new C8();
    public final C8 ly0 = new C8();

    @Override
    public final void On0(Tv0 camera, es_1 values) {
        this.Dy = camera;
        values.sort(this);
    }

    @Override
    public final int compare(Object firstObject, Object secondObject) {
        W00 first = (W00) firstObject;
        W00 second = (W00) secondObject;

        long key = sh_0.vF0;
        boolean firstSpecial = first.ly.tM(key) && ((sh_0) first.ly.sg(key)).yg;
        boolean secondSpecial = second.ly.tM(key) && ((sh_0) second.ly.sg(key)).yg;

        int result;
        if (firstSpecial != secondSpecial) {
            result = firstSpecial ? 1 : -1;
            return result;
        }

        if (firstSpecial && secondSpecial) {
            float firstLevel = ((sh_0) first.ly.sg(key)).yt;
            float secondLevel = ((sh_0) second.ly.sg(key)).yt;
            if (firstLevel == 1.0f && !(secondLevel >= 1.0f)) {
                return -1;
            }
            if (secondLevel == 1.0f && !(firstLevel >= 1.0f)) {
                return 1;
            }
        }

        key = xd_2.DK0;
        boolean firstKeyed = first.ly.tM(key);
        boolean secondKeyed = second.ly.tM(key);
        if (firstKeyed != secondKeyed) {
            return firstKeyed ? 1 : -1;
        }

        Matrix4 firstMatrix = first.eo0;
        C8 firstLocal = first.VE0.T4;
        C8 firstWorld = this.SQ;
        if (firstLocal.eG()) {
            firstMatrix.V1(firstWorld);
        } else if (!firstMatrix.Mq0()) {
            firstMatrix.V1(firstWorld).na(firstLocal.x, firstLocal.y, firstLocal.z);
        } else {
            firstWorld.x = firstLocal.x;
            firstWorld.y = firstLocal.y;
            firstWorld.z = firstLocal.z;
            firstWorld.cu(firstMatrix);
        }

        Matrix4 secondMatrix = second.eo0;
        C8 secondLocal = second.VE0.T4;
        C8 secondWorld = this.ly0;
        if (secondLocal.eG()) {
            secondMatrix.V1(secondWorld);
        } else if (!secondMatrix.Mq0()) {
            secondMatrix.V1(secondWorld).na(secondLocal.x, secondLocal.y, secondLocal.z);
        } else {
            secondWorld.x = secondLocal.x;
            secondWorld.y = secondLocal.y;
            secondWorld.z = secondLocal.z;
            secondWorld.cu(secondMatrix);
        }

        float difference = (int) (this.Dy.v40.Lk(this.SQ) * 1000.0f)
                - (int) (this.Dy.v40.Lk(this.ly0) * 1000.0f);
        if (difference < 0.0f) {
            result = -1;
        } else if (difference > 0.0f) {
            result = 1;
        } else {
            result = 0;
        }

        return firstSpecial ? -result : result;
    }
}
