package item.armor;

import item.base.BaseArmor;

public class Boots extends BaseArmor {
    private int DEF;
    public Boots() {
        super("Boots", 5);
        setDEF(1);
    }

    @java.lang.Override
    public int getDef() {
        return DEF;
    }
    public void setDEF(int DEF) {
        this.DEF = DEF;
    }
}
