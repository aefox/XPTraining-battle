package be.cegeka.battle;

import org.junit.Test;

import static be.cegeka.battle.Weapon.AXE;
import static be.cegeka.battle.Weapon.BARE_FIST;
import static org.assertj.core.api.Assertions.assertThat;

public class SoldierTest {

    @Test
    public void construction_ASoldierMustHaveANameAndADefaultWeapon() {
        Soldier soldier = new Soldier("name");

        assertThat(soldier.getName()).isEqualTo("name");
        assertThat(soldier.getWeapon()).isEqualTo(BARE_FIST);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeNull() {
        new Soldier(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeEmpty() {
        new Soldier("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void construction_ASoldierMustHaveAName_CannotBeBlank() {
        new Soldier("   ");
    }

    @Test
    public void construction_ASoldierCanBeGivenADifferentWeapon() {
        Soldier soldier = new Soldier("name", AXE);

        assertThat(soldier.getWeapon()).isEqualTo(AXE);
    }
}