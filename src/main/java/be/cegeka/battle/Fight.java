package be.cegeka.battle;

public class Fight {
    FightResult fight(Soldier attacker, Soldier defender) {
        if (attacker.getWeapon() == defender.getWeapon()) {
            return FightResult.ATTACKER_WINS;
        }
        return null;
    }

    enum FightResult {
        ATTACKER_WINS,
        DEFENDER_WINS
    }
}
