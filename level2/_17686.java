//https://school.programmers.co.kr/learn/courses/30/lessons/17686
import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (a, b)->{
            String headA = a.toLowerCase().split("[0-9]")[0];
            String headB = b.toLowerCase().split("[0-9]")[0];
            String numberA = a.substring(headA.length()).split("[^0-9]")[0];
            String numberB = b.substring(headB.length()).split("[^0-9]")[0];

            if(!headA.equals(headB)) {
                return headA.compareTo(headB);
            } else if (!numberA.equals(numberB)) {
                return Integer.compare(Integer.parseInt(numberA), Integer.parseInt(numberB));
            }
            return 0;
        });
        return files;
    }
}