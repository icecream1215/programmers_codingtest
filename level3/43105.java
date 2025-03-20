//https://school.programmers.co.kr/learn/courses/30/lessons/43105
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int x = 1;
        while(x<triangle.length){
            for(int i = 0; i < triangle[x].length; i++){
                if(i==0)
                    triangle[x][i] += triangle[x-1][0];
                else if(i== triangle[x].length-1)
                    triangle[x][i] += triangle[x-1][triangle[x].length-2];
                else
                    triangle[x][i] += Math.max(triangle[x-1][i-1], triangle[x-1][i]);
            }
            x++;
        }

        for(int i = 0; i < triangle[triangle.length-1].length; i++){
            answer = Math.max(triangle[triangle.length-1][i], answer);
        }
        return answer;
    }
}