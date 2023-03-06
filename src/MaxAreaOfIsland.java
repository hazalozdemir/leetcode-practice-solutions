import java.util.HashSet;
import java.util.Set;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {

        Set<String> visited = new HashSet<>();
        int maxArea = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

                int size = exploreGraphSize(r, c, grid, visited);
                if (size > maxArea) {
                    maxArea = size;
                }
            }
        }

        return maxArea;
    }

    public int exploreGraphSize(int r, int c, int[][] graph, Set<String> visited) {
        boolean rowInbounds = 0 <= r && r < graph.length;
        boolean colInbounds = 0 <= c && c < graph[0].length;

        if (!rowInbounds || !colInbounds) {
            return 0;
        }

        if (graph[r][c] == 0) return 0;

        String key = r + "." + c;
        if (visited.contains(key)) return 0;

        visited.add(key);
        int size = 1;

        size += exploreGraphSize(r - 1, c, graph, visited);
        size += exploreGraphSize(r, c + 1, graph, visited);
        size += exploreGraphSize(r + 1, c, graph, visited);
        size += exploreGraphSize(r, c - 1, graph, visited);
        return size;
    }
}
