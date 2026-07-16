class Solution {
    public int uniquePaths(int m, int n) {
      int dp[][]= new int [m][n];
      for(int i=0;i<m;i++){
        Arrays.fill(dp[i],0);
      }
       return helperFunction (m-1,n-1,dp);
        
        
    }


   public int helperFunction(int i, int j, int[][] dp){

    if(i == 0 && j == 0)
        return 1;

    if(i < 0 || j < 0)
        return 0;

    if(dp[i][j] != 0)
        return dp[i][j];

    dp[i][j] = helperFunction(i-1, j, dp)
             + helperFunction(i, j-1, dp);

    return dp[i][j];
}
}


