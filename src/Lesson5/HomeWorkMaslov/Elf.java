package Lesson5.HomeWorkMaslov;

public class Elf extends Warrior {
    public Elf(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Elf pulls out a" + weapon.getName()); //bow
    }

    public void sayBeforAttack() {
        System.out.println("Elf says: \"Ma emma harel!\"");
    }

    public void attack() {
        System.out.println("Elf shoots the enemy");
    }

    public void sayAfterAttack() {
        System.out.print("");
    }
}
