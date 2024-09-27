import java.util.Scanner;

public class GameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a game: ");
        String gameName = scanner.nextLine();

        System.out.print("Enter the maximum number of players: ");
        int maxNumPlayers = scanner.nextInt();
        scanner.nextLine();

        GameInheritance game1 = new GameInheritance(gameName, maxNumPlayers);
        System.out.println(game1);

        System.out.print("\nEnter a game that has time limit: ");
        String timeLimitGameName = scanner.nextLine();

        System.out.print("Enter the maximum number of players: ");
        int timeLimitMaxNumPlayers = scanner.nextInt();

        System.out.print("Enter the time limit in minutes: ");
        int timeLimit = scanner.nextInt();

        GameWithTimeLimit game2 = new GameWithTimeLimit(timeLimitGameName, timeLimitMaxNumPlayers, timeLimit);
        System.out.println(game2);

        scanner.close();
    }
}
