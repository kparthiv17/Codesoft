import java.util.Random;
import java.util.Scanner;

public class Main {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Number guess game !");
        System.out.println("You have 5 Attempt to win");
        while (true) {
            int x= r.nextInt(100);

            int i = 5;
            while (i > 0) {
                System.out.println("Your Attempt:" + i);
                System.out.print("Enter your choice:");
                int y = sc.nextInt();
                i--;
                if (y > x) {
                    System.out.println("your choice is high");
                } else if (y< x) {
                    System.out.println("your choice is low");
                } else {
                    System.out.println("Correct answer you won!");
                    score++;
                    break;
                }
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");
                System.out.flush();

            }
            System.out.println("Your score:" + score);
            System.out.print("Do you want to continue (press 1):");

            int a = sc.nextInt();
            if (a == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                continue;

            } else {
                break;
            }
        }

        sc.close();
    }
}