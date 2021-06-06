package Lesson5.HomeWorkMaslov;

public class Undead extends Warrior {
    public Undead(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Undead summons " + weapon.getName()); //skeletons
    }

    public void sayBeforAttack() {
        System.out.println("Undead says: \"Ho-ho ha-ha!\"");
    }

    public void attack() {
        System.out.println("The enemy dies");
    }

}
