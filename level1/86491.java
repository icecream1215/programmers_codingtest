// https://school.programmers.co.kr/learn/courses/30/lessons/86491

class Solution {
    public int solution(int[][] sizes) {
        int max_width = 0;
        int max_height = 0;
        for(int[] size:sizes){
            if(size[0]<size[1]){
                int temp=size[1];
                size[1] = size[0];
                size[0] = temp;
            }
            if(max_width < size[0])
                max_width=size[0];
            if(max_height < size[1])
                max_height=size[1];
        }
        return max_width*max_height;
    }
}