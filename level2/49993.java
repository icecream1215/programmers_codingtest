//https://school.programmers.co.kr/learn/courses/30/lessons/49993

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skill_tree : skill_trees){
            int availableLevel = -1;
            boolean pass = true;
            for(char ch : skill_tree.toCharArray()){
                int nowLevel = skill.indexOf(ch);
                if(nowLevel > availableLevel+1){
                    pass = false;
                    break;
                }
                availableLevel = Math.max(nowLevel, availableLevel);
            }
            if(pass)
                answer++;
        }
        return answer;
    }
}