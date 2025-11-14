package LabEst;

import java.util.Arrays;

class Solution1 {
    public int uniquePaths(int n, int m) {
        int dp[][] = new int[n][m];

        for(int a[] : dp) Arrays.fill(a, -1);

        boolean vis[][] = new boolean[n][m];

        return ways(0, 0, vis, dp);
    }

    int ways(int i, int j, boolean vis[][], int dp[][]){
        if(i<0 || j<0 || i>=vis.length || j>=vis[0].length){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        if(i==vis.length-1 && j==vis[0].length-1){
            return dp[i][j] = 1;
        }

        vis[i][j] = true;
        dp[i][j] = ways(i+1, j, vis, dp) + ways(i, j+1, vis, dp);
        vis[i][j] = false;

        return dp[i][j];
    }
}