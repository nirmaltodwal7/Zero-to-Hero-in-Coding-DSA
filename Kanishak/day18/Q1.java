// Number of Palindromic Subsequences
package day18;

class Solution {
    public int countPalindromes(String s) {
       int MOD=1000000007;
       long output=0;
       char[]sChar=s.toCharArray();
       long[] dpA=new long[10];
       long[][]dpB=new long[10][10];
       long[][]dpD=new long[10][10];
       long[]dpE=new long[10];

       for(char c:sChar)
       {
          int i=c-'0';
          output=(output+dpE[i])%MOD;
          for(int j=0;j<10;j++) dpE[j]+=dpD[i][j];
          for(int j=0;j<10;j++)
          {
            for(int k=0;k<10;k++)
            {
                dpD[j][k]+=dpB[j][k];
            }
          }
            for(int j=0;j<10;j++ ) dpB[i][j]+=dpA[j];
            dpA[i]++;

          
       }
       return (int)output;
    }
}

