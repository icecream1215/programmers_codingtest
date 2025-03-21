//https://school.programmers.co.kr/learn/courses/30/lessons/42898
import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] countArr = new int[m+1][n+1];
        // HashSet 속도개선 필요
        // HashSet<String> set = new HashSet<String>();
        // for(int[] puddle : puddles){
        //     set.add(puddle[0] + "/"+ puddle[1]);
        // }

        boolean[][] puddleArr = new boolean[m+1][n+1];
        for(int[] puddle : puddles){
            puddleArr[puddle[0]][puddle[1]] = true;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i==1&&j==1)
                    countArr[j][i] = 1;
                else if(!puddleArr[j][i]){
                    countArr[j][i] = (countArr[j-1][i] + countArr[j][i-1])%1000000007;
                }
            }
        }
        return countArr[m][n];
    }
}