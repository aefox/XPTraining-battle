package be.cegeka.battle;

public enum Weapon {
    AXE(3),
    BARE_FIST(1),
    SPEAR(2),
    SWORD(2);

    private int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
