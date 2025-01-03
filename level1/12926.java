//https://school.programmers.co.kr/learn/courses/30/lessons/12926

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
            int code=s.charAt(i);
            if(code>=(int)'A' && code<=(int)'Z'){
                code=code+n;
                if(code>(int)'Z')
                    code=code-26;
            }else if(code>=(int)'a' && code<=(int)'z'){
                code=code+n;
                if(code>(int)'z')
                    code=code-26;
            }
            sb.append((char)code);
        }
        return sb.toString();
    }
}