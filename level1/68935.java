//https://school.programmers.co.kr/learn/courses/30/lessons/68935

class Solution {
    public int solution(int n) {
        return Integer.parseInt(new StringBuilder(Integer.toString(n,3)).reverse().toString(),3);

         /*
         int answer = 0;
         String result = "";
         while(n > 0){
             result = n%3 + result;
             n = n/3;
         }

         answer = Integer.parseInt(new StringBuilder(result).reverse().toString(), 3);
         return answer;

        */
    }
}