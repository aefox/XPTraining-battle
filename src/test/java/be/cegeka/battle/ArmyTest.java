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
        Soldier soldier = new Soldier("frontline soldier");
        Soldier secondSoldier = new Soldier("second soldier in line");
        Army army = new Army();

        army.enroll(soldier);
        army.enroll(secondSoldier);

        assertThat(army.getFrontlineSoldier()).isEqualTo(soldier);
    }
}
