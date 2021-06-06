package Lesson5.HomeWorkMaslov;

public class Orc extends Warrior {
    public Orc(String name, Race race, Weapon weapon) {
        super(name, race, weapon);
    }

    public void takeWeapon(Weapon weapon) {
        System.out.println("Orc takes out the " + weapon.getName()); //mace
    }

    public void sayBeforAttack() {
        System.out.println("Orc says: \"Ghtringa maaaaaaa!\"");
    }

    public void attack() {
        System.out.println("Orc blows off the head of the enemy");
    }

    public void sayAfterAttack() {
        System.out.println("AAAAhahahaha!");
    }
}
