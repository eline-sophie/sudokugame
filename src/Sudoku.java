/**
 * Represents a sudoku puzzle
 */
public class Sudoku {
    /**
     * Used to store the entries of the sudoku puzzle
     */
    public int[][] puzzle;

    /**
     * Creates an empty sudoku puzzle (9x9 matrix)
     */
    public Sudoku() {
        puzzle = new int[9][9];
    }

    /**
     * Fills a specified value (1-9) in at specified x- and y-coordinates in the sudoku puzzle
     * @param x     x-coordinate of the square where the value is filled in
     * @param y     y-coordinate of the square where the value is filled in
     * @param value value to be filled in
     */
    public void fill(int x, int y, int value) {
        puzzle[y][x] = value;
    }

    /**
     * Prints the sudoku puzzle with lines drawn to separate the 3x3 blocks
     */
    public void print() {
        int j = 0;
        for(int[] row : puzzle) {
            int i = 0;
            for(int value : row) {
                System.out.print(value);
                if(i == 2 || i == 5) {
                    System.out.print(" | ");
                } else if(i == 8) {
                } else {
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
