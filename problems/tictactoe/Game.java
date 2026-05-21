package problems.tictactoe;

import java.util.Scanner;

public class Game {
    private Player p1, p2;
    private Player currPlayer;
    private Board board;    
    private int moves = 0; 

    public Game(Player p1, Player p2, int size) {
        this.p1 = p1;
        this.p2 = p2;        
        currPlayer = p1;
        board = new Board(size);
    }

    public void start() {

        Scanner sc = new Scanner(System.in);        

        while (true) {

            board.printBoard();
            System.out.println(currPlayer.getName() + "'s turn (" + currPlayer.getSymbol() + ")");            

            System.out.print("Enter row and column: ");            
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;

            if (!isValidMove(row, col)) {
                System.out.println("Invalid position, try again");
                continue;
            }
            if (!board.placeMove(row, col, currPlayer.getSymbol())) {
                System.out.println("Cell already occupied, try again");
                continue;
            }
            moves++;

            if (checkWinner(row, col)) {
                board.printBoard();
                System.out.println(currPlayer.getName() + " wins");
                break;
            }            
            if (checkDraw(moves)) {
                board.printBoard();
                System.out.println("Match is draw");
                break;
            }
            
            switchTurn();
        }
    }
    private boolean isValidMove(int row, int col) {
        return row >= 0 && col >= 0 && row < board.getSize() && col < board.getSize();
    }

    private boolean checkWinner(int row, int col) {
        char grid[][] = board.getBoard();
        int n = board.getSize();
        char symbol = grid[row][col];

        boolean win;

        win = true;
        for(int i = 0; i < n; i++) {
            if(grid[row][i] != symbol) {
                win = false;
                break;
            }
        }
        if(win) return true;

        win = true;
        for(int i = 0; i < n; i++) {
            if(grid[i][col] != symbol) {
                win = false;
                break;
            }
        }
        if(win) return true;

        if(row == col) {
            win = true;
            for(int i = 0; i < n; i++) {
                if(grid[i][i] != symbol) {
                    win = false;
                    break;
                }
            }
            if(win) return true;            
        }

        if(row+col == n-1) {
            win = true;
            for(int i = 0; i < n; i++) {
                if(grid[i][n-1-i] != symbol) {
                    win = false;
                    break;
                }
            }
            if(win) return true;            
        }

        return false;
    }

    private boolean checkDraw(int moves) {
        return moves == board.getSize() * board.getSize();
    }

    private void switchTurn() {
        currPlayer = currPlayer == p1 ? p2 : p1;
    }
}
