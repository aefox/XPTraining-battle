package be.cegeka.battle;

public class Fight {
    FightResult fight(Soldier attacker, Soldier defender) {
        if (defender.getWeapon().getDamage() > attacker.getWeapon().getDamage()) {
            return FightResult.DEFENDER_WINS;
        }

        return FightResult.ATTACKER_WINS;
    }

    enum FightResult {
        ATTACKER_WINS,
        DEFENDER_WINS
    }
}
