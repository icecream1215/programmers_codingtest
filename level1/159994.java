//https://school.programmers.co.kr/learn/courses/30/lessons/159994

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int num1=0;
        int num2=0;
        for (String word : goal){
            if(cards1.length > num1 && word.equals(cards1[num1]))
                num1++;
            else if(cards2.length > num2 && word.equals(cards2[num2]))
                num2++;
            else
                return "No";
        }
        return "Yes";
    }
}