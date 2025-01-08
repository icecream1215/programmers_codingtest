//https://school.programmers.co.kr/learn/courses/30/lessons/81301

class Solution {
    public int solution(String s) {
        String[] en_nums = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if("0123456789".indexOf(s.substring(i,i+1)) > -1){ //숫자
                answer.append(s.substring(i,i+1));
            }else{
                for(int j = 0; j < en_nums.length; j++){
                    String en = en_nums[j];
                    if(s.length() < i+en.length())
                        continue;
                    if(en.indexOf(s.substring(i,i+en.length())) > -1){
                        answer.append(j);
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(answer.toString());

        /*
        for(int i = 0; i < en_nums.length; i++) {
            s = s.replaceAll(en_nums[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
        */
    }
}