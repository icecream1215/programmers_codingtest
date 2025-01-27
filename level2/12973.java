//https://school.programmers.co.kr/learn/courses/30/lessons/12973
import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char alpa : s.toCharArray()){
            if(stack.size()>0 && stack.peek() == alpa){
                stack.pop();
            }else{
                stack.push(alpa);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}