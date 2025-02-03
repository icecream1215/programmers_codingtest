//https://school.programmers.co.kr/learn/courses/30/lessons/131704
import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int boxNum = 1;
        int orderIdx = 0;
        while(boxNum <= order.length || !stack.isEmpty()){
            if(boxNum <= order.length && boxNum == order[orderIdx]){
                boxNum++;
                orderIdx++;
            }else if(!stack.isEmpty() && stack.peek() == order[orderIdx]){
                stack.pop();
                orderIdx++;
            }else if(boxNum <= order.length){
                stack.push(boxNum++);
            }else{
                break;
            }
        }
        return orderIdx;
    }
}