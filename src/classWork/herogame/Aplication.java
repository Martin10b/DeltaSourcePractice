package classWork.herogame;

public class Aplication {
    public static void main(String[] args) {
        Assasin rengar = new Assasin(750, 900, 2300);
        Tank statistic = new Tank(1000, 1500, 10000);
        Warrior Thor = new Warrior(2000, 1600, 3200);
        myHero Xmen = new myHero(1800, 1500, 3500);

        int counter = 0;

        while (Xmen.getHealthPoints() > 0 && Thor.getHealthPoints() > 0) {
            counter++;
            System.out.print("\nDefender: ");
            if (counter % 2 != 0) {
                StartBattle(Thor, Xmen);
                System.out.println("Xmen " + Xmen);
            } else {
                StartBattle(Xmen, Thor);
                System.out.println("Thor " + Thor);
            }
        }

    }

    public static void StartBattle(Hero attacker, Hero defender) {
        double attackDmj = attacker.attack();
        double defendDmj = defender.def((int) attackDmj);
        double dmjDone = attackDmj - defendDmj;
        defender.updateHP((int) (attacker.getHealthPoints() - dmjDone));
    }
}
