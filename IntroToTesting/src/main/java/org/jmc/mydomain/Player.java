package org.jmc.mydomain;

public abstract class Player {
    public final int HEALTH_FIXED;
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        HEALTH_FIXED = health;
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public void decrementLive() {
        setLives(getLives() - 1);
        if (getLives() <= 0) {
            setHealth(HEALTH_FIXED);
            System.out.println("This character is dead");
        }
    }

    public void checkHealth() {
        if (getHealth() <= 0) {
            decrementLive();
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - this.getStrength());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
