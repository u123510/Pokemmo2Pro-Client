package cn.pokemmo.graphics.model;

import f.*;

import java.util.ArrayList;

public class ModelPolygonMeshFace {
    public final jk_0[] I3;
    public final ArrayList<ModelPolygonMeshFace> vQ = new ArrayList<>();
    public final int IW;
    public int eX;
    public final int aK0;
    public final int hK;
    public long GN;
    public long Dv0;
    public boolean Com4;
    public int Oi0;
    public final int wj0;
    public int cs0;
    public int sd0;
    public final int VZ;
    public boolean Nu0;
    public final int DH;
    public boolean QD0;

    public final boolean Dk0() {
        return (long) this.IW <= this.GN;
    }

    public final void VG(long j1) {
        this.GN += j1;
        this.Dv0 += j1;
        for (ModelPolygonMeshFace child : this.vQ) {
            child.VG(j1);
        }
    }

    public final void UT() {
        if (this.Dv0 < this.VZ) {
            return;
        }
        this.Dv0 = 0L;
        while (this.sd0 < ((int) this.GN - this.IW) / this.VZ && this.H40()) {
            this.Fu();
            this.sd0++;
        }
        for (ModelPolygonMeshFace child : this.vQ) {
            child.UT();
        }
        if (this.Dk0()) {
            this.Fu();
        }
        if (this.Dk0() && !this.H40() && !this.Com4) {
            this.Ks();
        }
    }

    public final boolean H40() {
        if (this.QD0) {
            return true;
        }
        return this.GN < (long) (this.IW + this.eX);
    }

    public final void Ks() {
        if (this.QD0) {
            this.GN = 0L;
            return;
        }
        this.eX = 0;
        this.Com4 = true;
        for (ModelPolygonMeshFace child : this.vQ) {
            child.Ks();
        }
    }

    public final void uc() {
        for (ModelPolygonMeshFace child : this.vQ) {
            child.uc();
        }
    }

    public void Fu() {
        if (!this.Dk0()) {
            return;
        }
        if (!this.Nu0) {
            this.Nu0 = true;
            this.uc();
        }
        if (this.hK != -1) {
            int delta = (int) this.GN - this.IW;
            this.cs0 = (this.hK * this.aK0 + delta) / this.aK0 % this.I3.length;
        }
    }

    public final void Rn0(long j1) {
        for (ModelPolygonMeshFace child : this.vQ) {
            child.Rn0(j1);
        }
    }

    public int hC() {
        return this.Oi0;
    }

    public int lt0() {
        return this.wj0;
    }

    public ModelPolygonMeshFace(jk_0[] v1, int i2, int i3, int i4, int i5, int i6) {
        this.I3 = v1;
        this.IW = i2;
        this.eX = i3;
        this.hK = 0;
        this.aK0 = i4;
        this.Oi0 = i5;
        this.wj0 = i6;
        this.GN = 0L;
        this.Dv0 = 0L;
        this.Com4 = false;
        this.VZ = 10;
        this.Nu0 = false;
        this.DH = 1;
        this.QD0 = false;
    }

    public ModelPolygonMeshFace(jk_0 v1, int i2, int i3) {
        this.I3 = new jk_0[]{v1};
        this.IW = 0;
        this.eX = 2000;
        this.hK = -1;
        this.aK0 = 2000;
        this.Oi0 = i2;
        this.wj0 = i3;
        this.GN = 0L;
        this.Dv0 = 0L;
        this.Com4 = false;
        this.VZ = 10;
        this.Nu0 = false;
        this.DH = 1;
        this.QD0 = false;
    }
}
