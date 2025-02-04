//https://school.programmers.co.kr/learn/courses/30/lessons/154540
import java.util.*;
class Solution {
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private int count = 0;

    public int[] solution(String[] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[i].length(); j++){
                count = 0;
                if(!visited[i][j] && maps[i].charAt(j) != 'X') {
                    count = Integer.parseInt(String.valueOf(maps[i].charAt(j)));
                    dfs(maps, visited, i, j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        if(list.size() == 0)
            return new int[]{-1};
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private void dfs(String[] maps, boolean[][] visited, int i, int j){
        visited[i][j] = true;
        for(int dic = 0; dic < dx.length; dic++){
            int x = i + dx[dic];
            int y = j + dy[dic];

            if(x>=0 && y>=0 && x<maps.length && y<maps[0].length()
                    && maps[x].charAt(y) != 'X' && !visited[x][y]) {
                count += Integer.parseInt(String.valueOf(maps[x].charAt(y)));
                dfs(maps, visited, x, y);
            }
        }
    }
}