//https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
    public int[] solution(int brown, int yellow) {
        int x = 0;
        int y = 0;
        for(int i = 3; i < (int)brown/2; i++){
            if(i*(brown/2-i+2)==brown+yellow){
                x = i;
                y = (brown/2-i+2);
                break;
            }
        }
        int[] answer = {Math.max(x,y), Math.min(x,y)};
        return answer;
    }
}