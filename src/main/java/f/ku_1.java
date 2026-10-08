package f;

import cn.pokemmo.constant.enums.SystemCursorType;

public enum ku_1 {
    Arrow,
    Ibeam,
    Crosshair,
    Hand,
    HorizontalResize,
    VerticalResize,
    NWSEResize,
    NESWResize,
    AllResize,
    NotAllowed,
    None;

    public static final ku_1 ur0 = Arrow;
    public static final ku_1 ma0 = None;

    public SystemCursorType asModern() {
        return SystemCursorType.valueOf(name());
    }
}