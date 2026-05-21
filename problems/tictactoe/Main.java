package problems.tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(); // design tic tac toe game

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String p1name = sc.nextLine();

        System.out.print("Enter Player 2 name: ");
        String p2name = sc.nextLine();

        Player p1 = new Player(p1name, 'X');
        Player p2 = new Player(p2name, 'O');

        Game game = new Game(p1, p2, 3);
        game.start();

        System.out.println();
    }
}
