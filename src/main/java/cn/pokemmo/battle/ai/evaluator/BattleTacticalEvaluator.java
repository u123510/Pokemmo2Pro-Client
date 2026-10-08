/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.battle.ai.evaluator;

import f.*;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.battle.ai.evaluator.BaseBattleAiEvaluator;

import f.Aj;
import f.BR;
import f.Gh0;
import f.sm0_0;
import f.tw0_0;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

public class BattleTacticalEvaluator extends BaseBattleAiEvaluator {
    public final boolean u20;

    public BattleTacticalEvaluator(Aj aj, boolean bl) {
        super(aj);
        this.u20 = bl;
    }

    public BattleTacticalEvaluator(Aj aj) {
        this(aj, false);
    }

    @Override
    public final String UG() {
        return super.Tz();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean AZ(String object) {
        if (this.u20) return super.AZ(object);
        try {
            String value = object.replace(' ', '\u00a0');
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat)numberFormat;
                value = value.replace(decimalFormat.getDecimalFormatSymbols().getDecimalSeparator(), decimalFormat.getDecimalFormatSymbols().getGroupingSeparator());
            }
            Number number = numberFormat.parse(value);
            if (number == null) throw new NumberFormatException();
            this.case$(number.intValue());
            return true;
        } catch (Exception exception) {
            BR logger = tw0_0.rl;
            if (logger != null) logger.qK(sm0_0.c0(5896));
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String XF0(String object) {
        if (this.u20) return super.XF0(object);
        try {
            String value = object.replace(' ', '\u00a0');
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat)numberFormat;
                value = value.replace(decimalFormat.getDecimalFormatSymbols().getDecimalSeparator(), decimalFormat.getDecimalFormatSymbols().getGroupingSeparator());
            }
            Number number = numberFormat.parse(value);
            if (number == null) return "Error";
            number.intValue();
            return null;
        } catch (Exception exception) {
            return "Error";
        }
    }

    @Override
    public final String Tz() {
        if (this.u20) {
            return super.Tz();
        }
        HashMap values = this.sA;
        if (values != null && values.get(this.eB0) != null) {
            return (String)values.get(this.eB0);
        }
        return NumberFormat.getNumberInstance().format(this.eB0);
    }
}
