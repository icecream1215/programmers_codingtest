//https://school.programmers.co.kr/learn/courses/30/lessons/84512
class Solution {
    int count = 0;
    int answer = 0;
    public int solution(String word) {
        String[] dic = {"A","E","I","O","U"};
        dfs(dic, "", word);
        return answer;
    }
    private void dfs(String[] dic, String nowWord, String word){
        if (nowWord.equals(word)){
            answer = count;
            return;
        }

        if(nowWord.length() == 5)
            return;

        for(int i = 0; i < dic.length; i++){
            count++;
            dfs(dic, nowWord + dic[i], word);
        }
    }
}