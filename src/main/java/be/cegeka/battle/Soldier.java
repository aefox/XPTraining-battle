package be.cegeka.battle;

import org.apache.commons.lang3.Validate;

import static be.cegeka.battle.Weapon.BARE_FIST;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class Soldier {

    private String name;
    private Weapon weapon;

    public Soldier(String name) {
        Validate.isTrue(isNotBlank(name));

        this.name = name;
        this.weapon = BARE_FIST;
    }

    String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
