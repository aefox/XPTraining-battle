package be.cegeka.battle;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmyTest {

    @Test
    public void construction_AnArmyDoesNotHaveAnySoldiers() {
        Army army = new Army();

        assertThat(army.soldiers()).isEmpty();
    }

    @Test
    public void enroll_WhenFirstSoldierEnrolls_ThenHeIsInTheFrontline() {
        Soldier firstSoldier = new Soldier("first line soldier");
        Soldier secondSoldier = new Soldier("second soldier in line");
        Army army = new Army();

        army.enroll(firstSoldier);
        army.enroll(secondSoldier);

        assertThat(army.getFirstSoldierInLine()).isEqualTo(firstSoldier);
    }
}
