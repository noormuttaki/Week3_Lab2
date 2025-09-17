package DiceGame;

import java.util.Random;

public class DiceGame {
    private Random random;

    public DiceGame() {
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
