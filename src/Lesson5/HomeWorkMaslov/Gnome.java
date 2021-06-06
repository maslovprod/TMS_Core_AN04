package Lesson5.HomeWorkMaslov;

public class Gnome extends Warrior {
    public Gnome(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Gnome pulls out an " + weapon.getName()); //ax
    }

    public void sayBeforAttack() {
        System.out.println("Gnome says: \"Mmmm shaka laka!\"");
    }

    public void attack(Weapon weapon) {
        System.out.println(weapon.getName() + " kill the enemy");
    }

    public void sayAfterAttack() {
        System.out.println("Pulls out a mug of ale and happily drinks!");
    }
}
