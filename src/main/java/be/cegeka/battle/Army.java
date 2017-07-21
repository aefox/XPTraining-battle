package be.cegeka.battle;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Army {

    private Queue<Soldier> soldiers = new LinkedList<>();

    public Collection<Soldier> soldiers() {
        return soldiers;
    }

    public void enroll(Soldier soldier) {
        soldiers.add(soldier);
    }

    public Soldier getFrontlineSoldier() {
        return soldiers.peek();
    }
}
