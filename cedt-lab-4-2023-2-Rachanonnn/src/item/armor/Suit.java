package item.armor;

import item.base.BaseArmor;
import item.usage.Upgradable;

public class Suit extends BaseArmor implements Upgradable {
    private int level;
    private int MAX_LEVEL;
    private int[] DEF;
    public Suit() {
        super("Suit", 10);
        setLevel(0);
        setMAX_LEVEL(3);
        this.DEF = new int[]{1, 2, 3, 5};
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level >= 0 && level <= MAX_LEVEL) {
            this.level = level;
        } else {
            this.level = 0;
        }
    }

    @Override
    public int getMaxLevel() {
        return MAX_LEVEL;
    }

    public void setMAX_LEVEL(int MAX_LEVEL) {
        this.MAX_LEVEL = MAX_LEVEL;
    }

    public void setDEF(int[] DEF) {
        this.DEF = DEF;
    }

    public int getDef() {
        return DEF[level];
    }
    public String toString() {
        return getName() + " (Def: " + getDef() + ", Level: " + getLevel() + ")";
    }
}
