package be.cegeka.battle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FightTest {

    @Test
    public void fight_GivenSoldiersHaveSameWeapon_ThenAttackerWins() {
        // GIVEN
        Soldier attacker = new Soldier("attackingSoldier");
        Soldier defender = new Soldier("defendingSoldier");

        // WHEN
        Fight.FightResult fightResult = new Fight().fight(attacker, defender);

        // THEN
        assertThat(fightResult).isEqualTo(Fight.FightResult.ATTACKER_WINS);
    }

    @Test
    public void fight_GivenAttackingSoldierHasStrongerWeaponThanDefender_ThenAttackerWins() {
        // GIVEN
        Soldier attacker = new Soldier("attackingSoldier", Weapon.AXE);
        Soldier defender = new Soldier("defendingSoldier");

        // WHEN
        Fight.FightResult fightResult = new Fight().fight(attacker, defender);

        // THEN
        assertThat(fightResult).isEqualTo(Fight.FightResult.ATTACKER_WINS);
    }

    @Test
    public void fight_GivenAttackingSoldierHasWeakerWeaponThanDefender_ThenDefenderWins() {
        // GIVEN
        Soldier attacker = new Soldier("attackingSoldier");
        Soldier defender = new Soldier("defendingSoldier", Weapon.AXE);

        // WHEN
        Fight.FightResult fightResult = new Fight().fight(attacker, defender);

        // THEN
        assertThat(fightResult).isEqualTo(Fight.FightResult.DEFENDER_WINS);
    }
}
