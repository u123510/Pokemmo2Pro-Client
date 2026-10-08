package cn.pokemmo.data;

public class BitmaskFlagState {
    public int Rl0 = 1;
    public boolean UN = false;
    public int ro = 0;

    public boolean gr0(int n) {
        if (this.UN) {
            return false;
        }
        return (this.ro & 1 << n) != 0;
    }
}
