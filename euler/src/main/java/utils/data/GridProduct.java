package utils.data;

import java.util.Arrays;

public class GridProduct {
    private final short[][] grid;
    private final int r;
    private final int c;
    private final int cells;

    public GridProduct(short[][] grid, int r, int c, int cells) {
        this.grid = grid.clone();
        this.r = r;
        this.c = c;
        this.cells = cells;
    }

    private static int maxOf(int... a) {
        return Arrays.stream(a).max().orElse(0);
    }

    private int getProductHorizontal() {
        if (c + cells > grid[0].length)
            return 0;
        int product = 1;
        short[] row = grid[r];

        for (int i = 0; i < cells; i++)
            product *= row[c + i];

        return product;
    }

    private int getProductVertical() {
        if (r + cells > grid.length)
            return 0;
        int product = 1;

        for (int i = 0; i < cells; i++)
            product *= grid[r + i][c];

        return product;
    }

    private int getProductDiagonalDownRight() {
        if (r + cells > grid.length)
            return 0;
        if (c + cells > grid.length)
            return 0;
        int product = 1;

        for (int i = 0; i < cells; i++)
            product *= grid[r + i][c + i];

        return product;
    }

    private int getProductDiagonalDownLeft() {
        if (r + cells > grid.length)
            return 0;
        if (c + cells > grid.length)
            return 0;
        int product = 1;

        for (int i = 0; i < cells; i++)
            product *= grid[r + i][c + cells - i - 1];

        return product;
    }

    public int max() {
        return maxOf(
                getProductHorizontal(),
                getProductVertical(),
                getProductDiagonalDownRight(),
                getProductDiagonalDownLeft()
        );
    }
}
