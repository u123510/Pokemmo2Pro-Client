package cn.pokemmo.math.geometry;

public class PolygonValidator {
    public PolygonValidator() {
    }

    public PolygonValidator(float[] fArray) {
        if (fArray.length >= 6) {
            return;
        }
        throw new IllegalArgumentException("polygons must contain at least 3 points.");
    }
}
