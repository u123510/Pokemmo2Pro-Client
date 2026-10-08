package f.org.json;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import org.json.JSONException;
import org.json.JSONTokener;

/**
 * Renamed from f.A70 (org.json.JSONTokener implementation)
 */
public class A70 extends JSONTokener {

    public A70(Reader reader) {
        super(reader);
    }

    public A70(InputStream inputStream) {
        super(inputStream);
    }

    public A70(String s) {
        super(s);
    }

    public A70(StringReader stringReader) {
        super(stringReader);
    }

    public final void nv0() {
        this.back();
    }

    public final boolean ax0() {
        return this.end();
    }

    public final char gH0() {
        return this.next();
    }

    public final char wg() {
        return this.nextClean();
    }

    public final Object NZ() {
        return this.nextValue();
    }

    public final Object ic0(char toQuote) {
        return this.nextString(toQuote);
    }

    public final ic_1 sC(String message) {
        JSONException err = this.syntaxError(message);
        return new ic_1(err.getMessage(), err.getCause());
    }
}
