public class EnhancedPlayer {

    private String fullName;
    private int healthRemaining;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int healthRemaining, String weapon) {
        this.fullName = fullName;
        if (healthRemaining <= 100) {
            this.healthRemaining = 1;
        } else if (healthRemaining > 100) {
            this.healthRemaining = 100;
        }else {
            this.healthRemaining = healthRemaining;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage) {
        healthRemaining = healthRemaining - damage;
        if (healthRemaining < 0) {
            System.out.println("You lose!");
        }
    }

    public int healthRemaining() {
        return healthRemaining;
    }

    public void restoreHealth(int extraHealth) {
        healthRemaining = healthRemaining + extraHealth;
        if (healthRemaining > 100) {
            System.out.println("Player restored to max health!");
            healthRemaining = 100;
        }
    }
}
