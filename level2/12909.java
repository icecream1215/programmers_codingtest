//https://school.programmers.co.kr/learn/courses/30/lessons/12909

import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        if(s.length()%2!=0)
            return false;
        for(char tmp : s.toCharArray()){
            if(tmp == '('){
                stack.push(1);
            }else{
                if(stack.size() == 0)
                    return false;
                stack.pop();
            }
        }
        if(stack.size() > 0)
            return false;
        return true;
    }
}