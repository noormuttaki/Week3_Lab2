package DiceGame;

import java.util.Random;

public class Lab2_NoorMuttaki {
    private Random random;

    public Lab2_NoorMuttaki() {
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
