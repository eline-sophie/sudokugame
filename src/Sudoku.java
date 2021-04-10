public class Sudoku {
    public int[][] puzzle = new int[9][9];

    public Sudoku() {
    }

    public void fill(int x, int y, int value) {
        puzzle[y][x] = value;
    }

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
