import java.util.Scanner;

/*
 * Set B - c
 * Define a class CricketPlayer (name,no_of_innings, no_of_times_notout total total runs, bat_avg). Create 
 * an array of n player objects .Calculate the batting average for each player using static method avg(). 
 * Define a static sort method which sorts the array on the basis of average. Display the player details in 
 * sorted order. 
 */

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int total_runs;
    double bat_avg;

    public CricketPlayer(String name, int no_of_innings, int no_of_times_notout, int total_runs) {
        this.name = name;
        this.no_of_innings = no_of_innings;
        this.no_of_times_notout = no_of_times_notout;
        this.total_runs = total_runs;
        this.bat_avg = 0.0;
    }

    public static void avg(CricketPlayer p) {
        int times_out = p.no_of_innings - p.no_of_times_notout;
        if (times_out > 0) {
            p.bat_avg = (double) p.total_runs / times_out;
        } else {
            p.bat_avg = p.total_runs;
        }
    }

    public static void sort(CricketPlayer[] players) {
        for (int i = 0; i < players.length - 1; i++) {
            for (int j = 0; j < players.length - i - 1; j++) {
                if (players[j].bat_avg > players[j + 1].bat_avg) {
                    CricketPlayer temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.printf("Name: %-15s Innings: %-5d NotOut: %-5d Runs: %-5d Avg: %.2f\n", 
                          name, no_of_innings, no_of_times_notout, total_runs, bat_avg);
    }
}

public class CricketPlayerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("No of innings: ");
            int innings = sc.nextInt();
            System.out.print("No of times not out: ");
            int notOut = sc.nextInt();
            System.out.print("Total runs: ");
            int runs = sc.nextInt();
            sc.nextLine();

            players[i] = new CricketPlayer(name, innings, notOut, runs);
            CricketPlayer.avg(players[i]);
        }

        CricketPlayer.sort(players);

        System.out.println("\n--- Player Details (Sorted by Batting Average) ---");
        for (CricketPlayer p : players) {
            p.display();
        }

        sc.close();
    }
}
