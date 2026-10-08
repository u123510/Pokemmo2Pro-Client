package cn.pokemmo.constant.enums;

import f.*;

public enum SystemCursorType {
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

    public static final SystemCursorType ur0 = Arrow;
    public static final SystemCursorType ma0 = None;

    public f.ku_1 toLegacy() {
        return f.ku_1.valueOf(name());
    }
}