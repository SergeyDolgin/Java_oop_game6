package units;

public class Warrior extends BaseHero {
    int delivery;

    public Warrior(String name, int health, int attack, int speed, int maxDamage, int minDamage,int protection, int x, int y, int delivery) {
        super(name, health, attack, speed, maxDamage, minDamage, protection, x, y);
        this.delivery = delivery;
    }



}
