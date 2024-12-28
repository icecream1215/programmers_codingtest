//https://school.programmers.co.kr/learn/courses/30/lessons/12918

import java.util.regex.*;

class Solution {
    public boolean solution(String s) {
        String reg = "^[0-9]*$";

        if ((s.length() == 4 || s.length() == 6) && s.matches(reg))
            return true;
        return false;
    }
}