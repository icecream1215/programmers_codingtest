//https://school.programmers.co.kr/learn/courses/30/lessons/340198

import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int max_size = mats[mats.length-1];
        int mat_size = -1;

        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length; j++){
                if(park[i][j].equals("-1")){
                    int result = checkArea(mats, park, i, j, mat_size);
                    mat_size = Math.max(mat_size,result);
                    if(mat_size == max_size)
                        return mat_size;
                }
            }
        }
        return mat_size;
    }

    private int checkArea(int[] mats, String[][] park, int x, int y, int mat_size){
        int result = -1;
        for(int mat : mats){
            if(mat < mat_size)
                continue;
            for(int i = 0; i < mat; i++){
                for(int j = 0; j < mat; j++){
                    int h_mat = x+i;
                    int w_mat = y+j;
                    if(w_mat >= park[0].length || h_mat >= park.length)
                        return result;
                    if(!park[h_mat][w_mat].equals("-1"))
                        return result;
                }
            }
            result = mat;
        }
        return result;
    }
}