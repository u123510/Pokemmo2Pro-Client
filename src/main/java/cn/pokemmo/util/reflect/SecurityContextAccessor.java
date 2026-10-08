package cn.pokemmo.util.reflect;

public class SecurityContextAccessor extends SecurityManager {
    @Override
    public Class[] getClassContext() {
        return super.getClassContext();
    }
}
