package problems.tictactoe;

public class Board {
    private char[][] grid;

    public Board(int size) {
        grid = new char[size][size];
        intializeGrid();
    }

    private void intializeGrid() {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                grid[i][j] = '_';
            }
        }
    }

    public void printBoard() {
        for(char[] row : grid) {
            for(char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int row, int col, char symbol) {
        if(grid[row][col] != '_') 
            return false;
        grid[row][col] = symbol;
        return true;
    }

    public int getSize() {
        return grid.length;
    }

    public char[][] getBoard() {
        return grid;
    }
}
