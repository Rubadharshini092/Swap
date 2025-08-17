import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input scores
        System.out.print("Enter Player 1 score: ");
        int score1 = sc.nextInt();

        System.out.print("Enter Player 2 score: ");
        int score2 = sc.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("Player 1 score = " + score1);
        System.out.println("Player 2 score = " + score2);

        // Swapping using a temporary variable
        int temp = score1;
        score1 = score2;
        score2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("Player 1 score = " + score1);
        System.out.println("Player 2 score = " + score2);

        sc.close();
    }
}


