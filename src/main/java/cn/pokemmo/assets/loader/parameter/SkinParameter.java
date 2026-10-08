package cn.pokemmo.assets.loader.parameter;

public class SkinParameter extends BaseAssetLoaderParameters {
    public final boolean PD0;

    public SkinParameter() {
        super();
        this.PD0 = true;
    }

    public boolean isLoaded() {
        return this.PD0;
    }
}
