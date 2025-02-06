//https://school.programmers.co.kr/learn/courses/30/lessons/87946
class Solution {
    private int max = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];

        dfs(dungeons, k, visited, 0);

        return max;
    }

    private void dfs(int[][] dungeons, int health, boolean[] visited, int count){
        max = Math.max(max, count);
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && health >= dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, health-dungeons[i][1], visited, count + 1);
                visited[i] = false;
            }
        }
    }
}