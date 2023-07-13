import java.util.concurrent.ThreadLocalRandom;

public class MightyGorgon extends Creature{
    MightyGorgon(){
        setName("Mighty_Gorgon");
        setLocation(25);
        setDamage(ThreadLocalRandom.current().nextInt(12, 17));
        setHealth(70);
        setSpeed(6);
        setDefense(16);
        setAttackDistance(11);
    }

    void superPower(Creature hunter, Creature victim){
        double random = Math.random();
        if (random > 0.8){
            victim.setHealth(0);
        }
        System.out.println(hunter.getName() + " Use super power");
        System.out.println(victim.getName() + " health: " + victim.getHealth());
    }

}
