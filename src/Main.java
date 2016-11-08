


public class Main {

    public static void main(String[] args) {
        MicroMint mimi = new MicroMint();
        int total1Rounds = 0;
        int total100Rounds = 0;
        int total10kRounds = 0;
        int u = 20;
        int k = 7;
        int round = 0;
        int totalTries = 10000;

        for (int i = 0; i < totalTries; i++) {
            round = mimi.getRoundsFor(u, k, 1);
            total1Rounds += round;
           /** round = mimi.getRoundsFor(u, k, 100);
            total100Rounds += round;
            round = mimi.getRoundsFor(u, k, 10000);
            total10kRounds += round;
            */
            System.out.println(i);
        }

        System.out.println("The mean for 1 coin is: " + total1Rounds/totalTries );
        System.out.println("The mean for 100 coins is: " + total100Rounds/totalTries );
        System.out.println("The mean for 10k coins is: " + total10kRounds/totalTries );
    }


}
