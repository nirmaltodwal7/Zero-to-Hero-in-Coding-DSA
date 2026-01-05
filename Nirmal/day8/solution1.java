/*
54. Spiral Matrix
 */


import java.util.*;

class Solution1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
            }
        }

        return result;
    }
}



//Approach 2: Visited Matrix (Simulation)//

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;

        boolean[][] visited = new boolean[m][n];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, d = 0;

        for (int i = 0; i < m * n; i++) {
            res.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) {
                d = (d + 1) % 4; 
            }

            r += dr[d];
            c += dc[d];
        }
        return res;
    }
}


//Approach 3: Recursive Layer-by-Layer//

import java.util.*;

class Solution {
    List<Integer> res = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        spiral(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1);
        return res;
    }

    private void spiral(int[][] m, int top, int bottom, int left, int right) {
        if (top > bottom || left > right) return;

        for (int i = left; i <= right; i++)
            res.add(m[top][i]);

        for (int i = top + 1; i <= bottom; i++)
            res.add(m[i][right]);

        if (top < bottom) {
            for (int i = right - 1; i >= left; i--)
                res.add(m[bottom][i]);
        }

        if (left < right) {
            for (int i = bottom - 1; i > top; i--)
                res.add(m[i][left]);
        }

        spiral(m, top + 1, bottom - 1, left + 1, right - 1);
    }
}
