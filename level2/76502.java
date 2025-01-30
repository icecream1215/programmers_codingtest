//https://school.programmers.co.kr/learn/courses/30/lessons/76502
import java.util.Stack;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');

        for(int i = 0; i < s.length(); i++){
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt((i+j)%s.length());
                if("{,[,(".indexOf(ch) > -1){
                    stack.push(ch);
                }else{
                    if(stack.size() == 0){
                        break;
                    }

                    char peek = stack.peek();
                    if(map.get(peek).equals(ch)){
                        stack.pop();
                    }else{
                        break;
                    }
                }

                if(j == s.length()-1 && stack.size()==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}