package cn.pokemmo.util.text;

import f.*;

public class LinkedStringNode {
    public final String Fk;
    public nb_2 cA;
    public es_1 mx0;
    public String j0;

    public LinkedStringNode(String v1, G10 v2) {
        this.Fk = v1;
    }

    public final String Rf(String v1) {
        if (this.cA != null) {
            String value = (String) this.cA.Wk0(v1);
            if (value != null) {
                return value;
            }
        }
        throw new nf_1("Element " + this.Fk + " doesn't have attribute: " + v1);
    }

    public final String SC(String v1, String v2) {
        if (this.cA == null) {
            return v2;
        }
        String value = (String) this.cA.Wk0(v1);
        return value == null ? v2 : value;
    }

    @Override
    public final String toString() {
        return this.Fi0("");
    }

    public final String Fi0(String v1) {
        b3_0 out = new b3_0(128);
        out.sV(v1);
        out.GC0('<');
        out.sV(this.Fk);
        if (this.cA != null) {
            a60_0 iterator = this.cA.lb0();
            iterator.getClass();
            while (iterator.hasNext()) {
                xn_1 entry = (xn_1) iterator.next();
                out.GC0(' ');
                out.sV((String) entry.I20);
                out.sV("=\"");
                out.sV((String) entry.kM);
                out.GC0('"');
            }
        }
        if (this.mx0 == null && (this.j0 == null || this.j0.length() == 0)) {
            out.sV("/>");
            return out.toString();
        }
        out.sV(">\n");
        String childIndent = v1 + '\t';
        if (this.j0 != null && this.j0.length() > 0) {
            out.sV(childIndent);
            out.sV(this.j0);
            out.GC0('\n');
        }
        if (this.mx0 != null) {
            I2 iterator = this.mx0.ZD();
            while (iterator.hasNext()) {
                G10 child = (G10) iterator.next();
                out.sV(child.Fi0(childIndent));
                out.GC0('\n');
            }
        }
        out.sV(v1);
        out.sV("</");
        out.sV(this.Fk);
        out.GC0('>');
        return out.toString();
    }

    public final G10 uQ(String v1) {
        if (this.mx0 == null) {
            return null;
        }
        for (int i = 0; i < this.mx0.KB; i++) {
            G10 child = (G10) this.mx0.get(i);
            if (child.Fk.equals(v1)) {
                return child;
            }
        }
        return null;
    }

    public final es_1 m8(String v1) {
        es_1 result = new es_1();
        if (this.mx0 == null) {
            return result;
        }
        for (int i = 0; i < this.mx0.KB; i++) {
            G10 child = (G10) this.mx0.get(i);
            if (child.Fk.equals(v1)) {
                result.Ue0(child);
            }
        }
        return result;
    }

    public final float FB(String v1, float f2) {
        String value = this.SC(v1, null);
        return value == null ? f2 : Float.parseFloat(value);
    }

    public final int jB0(int i1, String v2) {
        String value = this.SC(v2, null);
        return value == null ? i1 : Integer.parseInt(value);
    }
}
