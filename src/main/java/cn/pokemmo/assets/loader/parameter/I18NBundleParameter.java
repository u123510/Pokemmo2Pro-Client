package cn.pokemmo.assets.loader.parameter;

import java.util.Locale;

public class I18NBundleParameter extends BaseAssetLoaderParameters {
    public final Locale Y8;
    public final String wT;

    public I18NBundleParameter() {
        this(null, null);
    }

    public I18NBundleParameter(Locale locale) {
        this(locale, null);
    }

    public I18NBundleParameter(Locale locale, String string) {
        this.Y8 = locale;
        this.wT = string;
    }

    public Locale getLocale() {
        return this.Y8;
    }

    public String getEncoding() {
        return this.wT;
    }
}
