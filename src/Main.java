public class Main {
    public static void main(String[] args) {
        Sudoku s1 = new Sudoku();
        s1.print();
        System.out.println();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                s1.fill(i,j,(i + j) % 9 + 1);
            }
        }
        s1.print();
        System.out.println();
        s1.fill(0,0,4);
        s1.print();
        System.out.println();

        s1.puzzle[0][0].fixed = true;
        s1.fill(0,0,7);
        s1.print();
    }
}
