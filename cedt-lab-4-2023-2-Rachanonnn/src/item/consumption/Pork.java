package item.consumption;

import item.base.BaseConsumption;
import item.usage.CookState;
import item.usage.Cookable;
import item.usage.Healable;

import java.util.HashMap;

import static item.usage.CookState.RAW;

public class Pork extends BaseConsumption implements Cookable, Healable {
    private CookState cookstate;
    private HashMap<CookState, Integer> RECOVER_PT;
    public Pork() {
        super("Pork");
        setCookstate(CookState.RAW);
        this.RECOVER_PT = new HashMap<>();
        initializeRecoveryMap();
    }
    private void initializeRecoveryMap() {
        RECOVER_PT.put(CookState.RAW, 1);
        RECOVER_PT.put(CookState.COOKED, 2);
        RECOVER_PT.put(CookState.BURNT, 0);
    }
    public int getRecoverPoint() {
        return RECOVER_PT.get(cookstate);
    }
    public String toString() {
        String s;
        switch (getCookState()) {
            case RAW -> { s = "Raw"; }
            case COOKED -> { s = "Cooked"; }
            case BURNT -> {s = "Burnt"; }
            default -> {s = "";}
        }
        return s + " " + getName() + " (+" + getRecoverPoint() + " HP)";
    }


    @Override
    public CookState getCookState() {
        return cookstate;
    }

    @Override
    public void setCookState(CookState cookState) {
        this.cookstate = cookState;
    }

    public CookState getCookstate() {
        return cookstate;
    }

    public void setCookstate(CookState cookstate) {
        this.cookstate = cookstate;
    }
}
