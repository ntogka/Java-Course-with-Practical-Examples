import java.util.Random;

public class ArraysApp {

    public static void main(String[] args) {

        int[] lotteryNumbers = new int[5];

        Random randomNumberGenerator = new Random();

        lotteryNumbers[0] = randomNumberGenerator.nextInt(90) + 1;
        lotteryNumbers[1] = 23;
        lotteryNumbers[2] = 67;
        lotteryNumbers[3] = 37;
        lotteryNumbers[4] = 11;

        for (int lotteryNumber : lotteryNumbers){
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumber = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };

        for (int i=0; i < weeklyLotteryNumber.length; i++) {
            for (int j = 0; j < weeklyLotteryNumber[i].length; j++) {
                System.out.print(weeklyLotteryNumber[i][j] + " ");
            }
            System.out.println();
        }
    }

}
