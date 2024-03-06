package item.consumption;

import item.base.BaseConsumption;
import item.usage.Healable;
import item.usage.Upgradable;

public class HealingPotion extends BaseConsumption implements Healable, Upgradable {
    private int level;
    private int MAX_LEVEL;
    private final int[] RECOVER_PT;
    public HealingPotion() {
        super("HealingPotion");
        setLevel(0);
        setMAX_LEVEL(3);
        this.RECOVER_PT = new int[]{3, 5, 7, 10};
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

    public int getRecoverPoint() {
        return RECOVER_PT[level];
    }
    public String toString() {
        return getName() + " (+" + getRecoverPoint() + " HP, Level: " + getLevel() + ")";
    }
}
