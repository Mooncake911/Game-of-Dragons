import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static void action(Creature hunter, Creature victim) {
        if (hunter.getAttackDistance() < Math.abs(hunter.getLocation() - victim.getLocation())){
            hunter.doMove(hunter, victim);
        }else {
            int b = ThreadLocalRandom.current().nextInt(0, 2);
            if (b == 1){
                hunter.superPower(hunter, victim);
            } else{
                victim.doDefense(hunter, victim);
                hunter.doAttack(hunter, victim);
            }
        }

        if (victim.getHealth() < 0)
            victim.doDie(victim);

    }


    public static void main(String[] args) {
        MightyGorgon player1 = new MightyGorgon();
        Dragonfly player2 = new Dragonfly();

        // Происходят ходы пока здоровье > 0
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            int a = ThreadLocalRandom.current().nextInt(0, 2);
            if (a == 1) {
                action(player1, player2);
            } else {
                action(player2, player1);
            }
        }
    }

}