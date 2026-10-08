package cn.pokemmo.util.collection;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.yk_0
 */
public class Modern_Col_yk_0
extends ws_1 {

    public Modern_Col_yk_0() {
        super();
    }

    public int TW;

    @Override
    public final void ro(int n, int n2) {
        int n3 = this.TW;
        if (n3 >= n) {
            this.TW = n3 + n2;
        }
        if ((n3 = this.aW) >= n) {
            this.aW = n3 + n2;
        }
        if ((n3 = this.rk) >= n) {
            this.rk = n3 + n2;
        }
    }

    @Override
    public final void nE0(int n, int n2) {
        int n3 = this.TW;
        if (n3 >= n) {
            this.TW = n3 < n + n2 ? -1 : n3 - n2;
        }
        if ((n3 = this.aW) >= n) {
            this.aW = Math.max(n, n3 - n2);
        }
        if ((n3 = this.rk) >= n) {
            this.rk = Math.max(n, n3 - n2);
        }
    }

    @Override
    public final void cd() {
        if (this.PI()) {
            this.TW = -1;
        }
    }

    @Override
    public final void J2(int n, int n2) {
        Modern_Col_yk_0 yk_02 = this;
        yk_02.rk = n;
        yk_02.aW = n2;
        yk_02.TW = n2;
    }

    @Override
    public final void fc0(int n, int n2) {
        Modern_Col_yk_0 yk_02 = this;
        yk_02.rk = n;
        yk_02.aW = n2;
        yk_02.TW = n2;
    }

    @Override
    public final void Ol(int n, int n2) {
        this.rk = n;
        this.aW = n2;
        this.TW = this.TW == n2 ? -1 : n2;
    }

    @Override
    public final void MM(int n, int n2) {
        this.rk = n;
        this.aW = n2;
        if (this.PI()) {
            int n3 = n;
            n = Math.min(n3, n2);
            n2 = Math.max(n3, n2);
            int n4 = this.TW;
            if (n4 >= n && n4 <= n2) {
                this.TW = -1;
            }
        }
    }

    @Override
    public final boolean iK0(int n) {
        return this.TW == n;
    }

    public final boolean PI() {
        return this.TW >= 0;
    }
}


