/**
 * Represents a sudoku puzzle
 */
public class Sudoku {
    /**
     * Used to store the entries of the sudoku puzzle
     */
    public Tile[][] puzzle;

    /**
     * Creates an empty sudoku puzzle (9x9 matrix)
     */
    public Sudoku() {
        puzzle = new Tile[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                puzzle[i][j] = new Tile();
            }
        }
    }

    /**
     * Fills a specified value (1-9) in at specified x- and y-coordinates in the sudoku puzzle
     * @param x     x-coordinate of the square where the value is filled in
     * @param y     y-coordinate of the square where the value is filled in
     * @param value value to be filled in
     */
    public void fill(int x, int y, int value) {
        puzzle[y][x].fill(value);
    }

    /**
     * Prints the sudoku puzzle with lines drawn to separate the 3x3 blocks
     */
    public void print() {
        int j = 0;
        for(Tile[] row : puzzle) {
            int i = 0;
            for(Tile tile : row) {
                System.out.print(tile.label);
                if(i == 2 || i == 5) {
                    System.out.print(" | ");
                } else if(i != 8) {
                    System.out.print("  ");
                }
                i++;
            }
            System.out.println();
            if(j == 2 || j == 5){
                System.out.println("---------------------------");
            }
            j++;
        }
    }
}
