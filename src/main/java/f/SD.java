package f;

import cn.pokemmo.constant.enums.TableDebugMode;

public enum SD {
    none,
    all,
    table,
    cell,
    actor;

    public static final SD cg = none;
    public static final SD FP = all;
    public static final SD Pq0 = table;
    public static final SD La0 = cell;
    public static final SD k2 = actor;
    public static final SD[] prn = values();

    public TableDebugMode asModern() {
        return TableDebugMode.valueOf(name());
    }
}