package Objekty.Hra1.Zbrane;

public class Weapons {
    int damage;
    int range;
    int attackSpeed;

    public Weapons(int damage, int range, int attackSpeed) {
        this.damage = damage;
        this.range = range;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
