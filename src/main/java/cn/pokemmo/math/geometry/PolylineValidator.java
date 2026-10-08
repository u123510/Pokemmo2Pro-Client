package cn.pokemmo.math.geometry;

public class PolylineValidator {
    public PolylineValidator() {
    }

    public PolylineValidator(float[] fArray) {
        if (fArray.length >= 4) {
            return;
        }
        throw new IllegalArgumentException("polylines must contain at least 2 points.");
    }
}
