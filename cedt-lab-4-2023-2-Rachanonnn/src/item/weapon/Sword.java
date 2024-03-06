package item.weapon;

import item.base.BaseWeapon;
import item.usage.Upgradable;

public class Sword extends BaseWeapon implements Upgradable {
    private int level;
    private int MAX_LEVEL;
    private final int[] ATT;
    public Sword() {
        super("Sword", 15, 1);
        setLevel(0);
        setMAX_LEVEL(3);
        this.ATT = new int[]{3, 5, 8, 12};
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

    @Override
    public int getAtt() {
        return ATT[level];
    }

    public String toString() {
        return getName() + " (Att: " + getAtt() + ", Range: " + getRange() + ", Level: " + getLevel() + ", " + getDurability() + " uses left)";
    }
}
