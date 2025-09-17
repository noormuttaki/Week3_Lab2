package DiceGame;   // lowercase package names are best practice

import java.util.Random;

public class lab2_noormuttaki {
    private Random random;

    public lab2_noormuttaki() {
        random = new Random();
    }

    public int rollFourDice() {
        int sum = 0;
        System.out.print("Rolls: ");
        for (int i = 0; i < 4; i++) {
            int die = random.nextInt(6) + 1;
            sum += die;
            System.out.print(die + " ");
        }
        System.out.println();
        return sum;
    }
}
