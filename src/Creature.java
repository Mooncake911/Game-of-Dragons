public abstract class Creature implements Info {
    private String name;
    private int location;
    private int attackDistance;
    private int defense;
    private int damage;
    private int health;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setAttackDistance(int attackDistance) {
        this.attackDistance = attackDistance;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

    public int getAttackDistance() {
        return this.attackDistance;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getHealth() {
        return this.health;
    }

    public int getSpeed() {
        return this.speed;
    }


    // Методы
    public void doAttack(Creature one, Creature two) {
        if (two.defense < 0) {
            two.health += two.defense;
            two.defense = 0;
        }

        System.out.println(two.getName() + " health: " + two.getHealth());
    }

    public void doDefense(Creature one, Creature two) {
        System.out.println(one.getName() + " do attack");
        two.defense -= one.damage;
        if (two.defense > 0)
            System.out.println(two.getName() + "'s defense " + two.getDefense());
        else
            System.out.println(two.getName() + "'s defense " + 0);
    }

    public void doMove(Creature one, Creature two) {
        if ((one.getLocation() - two.getLocation()) < 0) {
            one.location += one.speed;
            System.out.println(one.getName() + "'s new location " + one.getLocation());
        } else {
            one.location -= one.speed;
            System.out.println(one.getName() + "'s new location " + one.getLocation());
        }
    }

    public void doDie(Creature one) {
        one.health = 0;
        System.out.println(one.getName() + " I'm die");
    }

    abstract void superPower(Creature one, Creature two);
}
