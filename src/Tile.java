/**
 * Represents a single tile from a sudoku puzzle
 */
public class Tile {
    /**
     * The value that the tile contains
     */
    public int label;

    /**
     * fixed: Boolean which determines whether the label can be changed
     */
    public boolean fixed;

    /**
     * Constructs a tile with a pre-determined label that can't be changed
     * @param value The value of the label that is filled in in the tile
     */
    public Tile(int value) {
        label = value;
        fixed = true;
    }

    /**
     * Constructs an empty tile that can be filled in
     */
    public Tile() {
        label = 0;
        fixed = false;
    }

    /**
     * Fills a value in or changes the label of a tile. Fails if tile is fixed.
     * @param value The value of the label that is filled in in the tile
     */
    public void fill(int value) {
        if (fixed) {
            System.out.println("This tile can not be changed");
        } else {
            label = value;
        }
    }

    /**
     * Clears the label of a tile. Fails if tile is fixed.
     */
    public void clear() {
        fill(0);
    }
}
