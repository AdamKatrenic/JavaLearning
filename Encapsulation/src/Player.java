public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health < 0) {
            System.out.println("You lose!");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to max health!");
            health = 100;
        }
    }
}
