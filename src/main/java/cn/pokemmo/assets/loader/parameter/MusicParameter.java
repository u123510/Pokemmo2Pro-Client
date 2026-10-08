package cn.pokemmo.assets.loader.parameter;

public class MusicParameter extends BaseAssetLoaderParameters {
    public final boolean ah0;

    public MusicParameter() {
        this(false);
    }

    public MusicParameter(boolean bl) {
        super();
        this.ah0 = bl;
    }

    public boolean isLoadedAsync() {
        return this.ah0;
    }
}
