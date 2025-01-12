//https://school.programmers.co.kr/learn/courses/30/lessons/12915

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length-1; i++){
            for(int j = i+1; j < strings.length; j++){
                if (strings[i].charAt(n) == strings[j].charAt(n)){
                    int str_length = Math.min(strings[i].length(), strings[j].length());
                    for(int k = 0; k < str_length; k++){
                        if(strings[i].charAt(k) < strings[j].charAt(k))
                            break;
                        if(strings[i].charAt(k) > strings[j].charAt(k)){
                            String temp = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp;
                            break;
                        }
                    }
                }else if(strings[i].charAt(n) > strings[j].charAt(n)){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}