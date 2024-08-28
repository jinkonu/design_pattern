package strategy_pattern.game;

import strategy_pattern.game.algorithm.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    protected Character() {
        this.weapon = null;
    }

    protected void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    protected WeaponBehavior getWeapon() {
        return this.weapon;
    }

    protected void fight() {
        if (this.weapon != null) {
            this.weapon.useWeapon();
        }
    }
}
