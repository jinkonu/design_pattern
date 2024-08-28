package strategy_pattern.game;

import strategy_pattern.game.algorithm.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King fights");
        weapon.useWeapon();
    }
}
