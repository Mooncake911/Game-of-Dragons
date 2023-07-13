import java.util.concurrent.ThreadLocalRandom;

public class  Dragonfly extends Creature {
    Dragonfly(){
        setName("Dragonfly");
        setLocation(0);
        setDamage(ThreadLocalRandom.current().nextInt(2, 6));
        setHealth(15);
        setSpeed(5);
        setDefense(10);
        setAttackDistance(8);
    }

    void superPower(Creature hunter, Creature victim) {
        double random = Math.random();
        if (random >= 0.5){
            hunter.setHealth(hunter.getHealth() + (int)Math.round(victim.getHealth()*0.5));
            victim.setHealth(victim.getHealth() - (int)Math.round(victim.getHealth()*0.5));
        }
        System.out.println(hunter.getName() + " Use super power");
        System.out.println(victim.getName() + " health: " + victim.getHealth());
    }

}
