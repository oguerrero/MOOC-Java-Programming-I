
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int games = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int visitingTeamScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    games++;

                    if (homeTeam.equals(team) && homeTeamScore > visitingTeamScore) {
                        wins++;
                    } else if (visitingTeam.equals(team) && visitingTeamScore > homeTeamScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

        scan.close();
    }
}
