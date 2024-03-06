package item.weapon;

import item.base.BaseWeapon;

public class Stick extends BaseWeapon {
    private int ATT;
    public Stick() {
        super("Stick", 3, 0);
        setATT(1);
    }
    @Override
    public int getAtt() {
        return ATT;
    }

    public int getATT() {
        return ATT;
    }

    public void setATT(int ATT) {
        this.ATT = ATT;
    }
}
