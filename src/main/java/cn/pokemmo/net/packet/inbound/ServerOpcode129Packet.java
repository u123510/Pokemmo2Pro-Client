package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.lang.StringBuilder;

public class ServerOpcode129Packet extends GH {
    public pe_0 dB0;

    public ServerOpcode129Packet(k20_0 source, java.nio.ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.dB0 = this.h();
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        pk_0 packageState = world.xI0;
        if (packageState == null) {
            return;
        }
        pe_0 expected = packageState.mn0;
        pe_0 actual = this.dB0;
        if (expected.LPt9 != actual.LPt9
            || expected.QH0 != actual.QH0
            || expected.fI0 != actual.fI0
            || expected.eD != actual.eD
            || expected.Db != actual.Db) {
            this.sr0().jC(sm0_0.c0(2603), zo_0.kJ0);
        }
        if (!expected.VB.equals(actual.VB)) {
            this.sr0().jC(
                new StringBuilder(actual.lt0)
                    .append(": ")
                    .append(actual.VB)
                    .toString(),
                zo_0.kJ0);
        }
        if (!expected.lt0.equals(actual.lt0)) {
            this.sr0().jC(
                sm0_0.Bx(2621, new String[]{expected.lt0, actual.lt0}),
                zo_0.kJ0);
        }
        if (!expected.M1.equals(actual.M1)) {
            this.sr0().jC(
                sm0_0.Bx(2622, new String[]{expected.M1, actual.M1}),
                zo_0.kJ0);
        }
        for (pg0_0 type : pg0_0.we) {
            String expectedValue = expected.j7[type.b8];
            String actualValue = actual.j7[type.b8];
            if (expectedValue.equals(actualValue)) {
                continue;
            }
            if (actualValue.isEmpty()) {
                actualValue = sm0_0.c0(type.r20);
            }
            this.sr0().jC(
                sm0_0.Bx(2640, new String[]{packageState.Ha0(type), actualValue}),
                zo_0.kJ0);
        }
        expected.lt0 = actual.lt0;
        expected.M1 = actual.M1;
        expected.Ym0 = actual.Ym0;
        expected.VB = actual.VB;
        expected.LPt9 = actual.LPt9;
        expected.QH0 = actual.QH0;
        expected.fI0 = actual.fI0;
        expected.eD = actual.eD;
        expected.Db = actual.Db;
        expected.hr = actual.hr;
        expected.j7 = actual.j7;
        packageState.Ov = true;
    }
}
