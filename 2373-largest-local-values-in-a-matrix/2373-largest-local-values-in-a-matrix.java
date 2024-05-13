class Solution {
    private static int findMax(int[][] grid, int x, int y) {
        int maxElement = 0;
        for (int i=x; i<x+3; ++i) {
            for (int j=y; j<y+3; ++j) {
                maxElement = Math.max(maxElement, grid[i][j]);
            }
        }
        return maxElement;
    }

    public int[][] largestLocal(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] maxLocal = new int[rows-2][cols-2];

        for (int row=0; row<rows-2; ++row) {
            for (int col=0; col<cols-2; ++col) {
                maxLocal[row][col] = findMax(grid, row, col);
            }
        }
        return maxLocal;
    }
}