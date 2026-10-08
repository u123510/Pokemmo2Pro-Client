package cn.pokemmo.text;

public class WhitespaceSkippingScanner {
    public final String An0;
    public int Prn;

    public WhitespaceSkippingScanner(String string) {
        this.An0 = string;
    }

    public boolean fC() {
        while (this.Prn < this.An0.length() && Character.isWhitespace(this.An0.charAt(this.Prn))) {
            ++this.Prn;
        }
        return this.Prn < this.An0.length();
    }
}
