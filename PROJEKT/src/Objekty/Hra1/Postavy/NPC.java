package Objekty.Hra1.Postavy;

import Objekty.Hra1.Zbrane.Weapons;

public class NPC {
    int damage;
    int armor;
    int magicResist;
    int level;
    int health;
    Weapons zbran;

    public NPC(Weapons zbran) {
        this.zbran = zbran;
    }

    public NPC(int damage, int armor, int magicResist, int level, int health) {
        this.damage = damage;
        this.armor = armor;
        this.magicResist = magicResist;
        this.level = level;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addWeapon(Weapons weapons) { //tu pridavame zbran
        this.zbran = zbran;
    }

    public String showWeapon() {
        if (zbran != null) {
            return "Weapon damage : " + zbran.getDamage() +
                    "Weapon range : " + zbran.getRange() +
                    "Weapon attack speed : " + zbran.getAttackSpeed();

        } else {
            return "No weapon";
        }


    }
}