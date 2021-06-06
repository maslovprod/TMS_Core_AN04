package Lesson5.HomeWorkMaslov;

public class Warrior {
    private final String name;
    private final Race race;
    private final Weapon weapon;

    public Warrior(String name, Race race, Weapon weapon) {
        this.name = name;
        this.race = race;
        this.weapon = weapon;
    }

    public void kill() {
        System.out.println("*************************");
        System.out.println(name + " (" + race.getName() + ")" + " is preparing to kill the enemy");
        takeWeapon(weapon);
        sayBeforAttack();
        attack();
        sayAfterAttack();
        System.out.println("*************************");
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Warrior is taking weapon");
    }

    public void sayBeforAttack() {
        System.out.println("I'll kill you!");
    }

    public void attack() {
        System.out.println("Warrior is hitting the enemy");
    }

    public void sayAfterAttack() {
        System.out.println("I - won! You - lost!");
    }
}
