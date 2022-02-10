import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    int result = askToUser();
        List<Player> players = new ArrayList< >();

        for (int i = 0; i < result; i++) {
            Player player = createPlayer();
            players.add(player);

        }
        for (Player player: players){
            System.out.println(player);
        }
    }

    private static Player createPlayer() {
        String playerName = askNameOfPlayer();
        int numberOfBakets = askForNumberOfBaskets();
        int numberOfAssists = askForNumberOfAssists();
        int numberOFBounces = askForNumberOfBounces();
        Player player = new Player(playerName , numberOfBakets , numberOfAssists , numberOFBounces );
        System.out.println("Player registered: " + player.getPlayerName ()  + player.getNumberOfBaskets() + player.getNumberOfAssists() + player.getNumberOfBounces());
        return player;
    }

    private static int askForNumberOfBounces() {
        System.out.println(" Number of bounces: " );
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int askForNumberOfAssists() {
        System.out.println(" Number of assists: " );
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static int askForNumberOfBaskets() {
        System.out.println(" Number of baskets: " );
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static String askNameOfPlayer() {
        System.out.println(" Player name: " );
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int askToUser() {

        System.out.println("Quants jugadors Vols inscriure ? " );
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
