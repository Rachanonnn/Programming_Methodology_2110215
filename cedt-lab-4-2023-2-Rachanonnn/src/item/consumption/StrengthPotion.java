package item.consumption;

import item.base.BaseConsumption;
import item.usage.AttBuffable;
import item.usage.CookState;
import item.usage.Upgradable;

public class StrengthPotion extends BaseConsumption implements AttBuffable, Upgradable {
    private int level;
    private int MAX_LEVEL;
    private final int[] ATT_BUFF;
    private int BUFF_TURN;
    public StrengthPotion() {
        super("StrengthPotion");
        setLevel(0);
        setMAX_LEVEL(3);
        this.BUFF_TURN = 3;
        this.ATT_BUFF = new int[]{3, 5, 7, 10};
    }
    public int getAttBuff() {
        return ATT_BUFF[level];
    }
    public int getBuffTurn() {
        return BUFF_TURN;
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

    public int getLevel() {
        return level;
    }

    public String toString() {
        return getName() + " (+" + getAttBuff() + " Att for next " + getBuffTurn() + " turns, Level: " + getLevel() + ")";
    }
}
