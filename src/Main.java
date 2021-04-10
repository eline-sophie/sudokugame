public class Main {

    public static void main(String[] args) {
        Sudoku s1 = new Sudoku();
//        s1.fill(2,1,2);
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                s1.fill(i,j,(i + j) % 9 + 1);
            }
        }
        s1.print();
    }
}
