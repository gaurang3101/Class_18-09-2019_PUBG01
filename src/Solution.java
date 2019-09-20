import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine().trim();
        Player[] players = new Player[n];
        if (n > 0 && n <= 100) {
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine().trim();
                String userName = scanner.nextLine().trim();
                String level = scanner.nextLine().trim();
                int score = scanner.nextInt();
                scanner.nextLine().trim();
                players[i] = new Player(name, userName, level, score);
            }
            String header = String.format("%10s\t%10s\t%10s\t%10s",
                    "PlayerName", "UserName", "Level", "Score");
            System.out.println(header);
            for (Player player : players) {
                System.out.println(player);
            }
        }
        scanner.close();
    }
}

class Player {
    private String name;
    private String userName;
    private String level;
    private int score;

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String name, String userName, String level, int score) {
        this.name = name;
        this.userName = userName;
        this.level = level;
        this.score = score;
    }

    @Override
    public String toString() {
        return
                String.format("%10s\t%10s\t%10s\t%10d",
                        getName(), getUserName(), getLevel(), getScore());
    }
}