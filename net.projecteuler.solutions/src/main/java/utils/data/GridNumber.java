package utils.data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class GridNumber {
    public static final Pattern SPACE = Pattern.compile(" ");

    public static short[][] toShortGrid(Stream<String> lines) {
        List<List<Short>> grid = makeGrid(lines);
        int rows = grid.size();
        int cols = getCols(grid);
        short[][] a = new short[rows][cols];

        int row = 0;
        for (List<Short> r : grid) {
            int col = 0;
            for (Short s : r) {
                a[row][col] = s;
                col++;
            }
            for (int i = col; i < a[row].length; i++)
                a[row][col] = 0;

            row++;
        }

        return a;
    }

    private static Integer getCols(List<List<Short>> grid) {
        return grid.stream().map(List::size).max(Integer::compare).orElse(0);
    }

    private static List<List<Short>> makeGrid(Stream<String> lines) {
        List<List<Short>> grid = new ArrayList<>();

        lines.forEach(line -> {
            List<Short> row = new ArrayList<>();
            SPACE.splitAsStream(line).forEach(token -> row.add(Short.parseShort(token)));
            grid.add(row);
        });

        return grid;
    }

    private GridNumber() {
    }
}
