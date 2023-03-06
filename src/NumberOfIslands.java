import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        Set<String> visited = new HashSet<>();
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

                if (exploreGraph(r, c, grid, visited)) {
                    count += 1;
                }
            }
        }

        return count;

    }

    public boolean exploreGraph(int r, int c, char[][] graph, Set<String> visited) {

        boolean rowInbounds = 0 <= r && r < graph.length;
        boolean colInbounds = 0 <= c && c < graph[0].length;

        if (!rowInbounds || !colInbounds) {
            return false;
        }

        if (graph[r][c] == '0') return false;

        String key = r + "." + c;
        if (visited.contains(key)) return false;

        visited.add(key);

        exploreGraph(r - 1, c, graph, visited);
        exploreGraph(r, c + 1, graph, visited);
        exploreGraph(r + 1, c, graph, visited);
        exploreGraph(r, c - 1, graph, visited);
        return true;
    }

}
