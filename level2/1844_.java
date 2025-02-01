//https://school.programmers.co.kr/learn/courses/30/lessons/1844

import java.util.*;
class Solution {
    static int[][] result;
    public int solution(int[][] maps) {
        int mapSizeX = maps.length;
        int mapSizeY = maps[0].length;

        if (mapSizeX >= 2 && mapSizeY >= 2) {
            if (maps[mapSizeX - 1][mapSizeY - 2] == 0 && maps[mapSizeX - 2][mapSizeY - 1] == 0) {
                return -1;
            }
        }
        result = new int[mapSizeX][mapSizeY];
        result[0][0] = 1;
        bfs(0,0,maps);

        return result[mapSizeX-1][mapSizeY-1] == 0 ? -1 : result[mapSizeX-1][mapSizeY-1];
    }

    private void bfs(int i, int j, int[][] maps){
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>();

        visited[i][j] = true;
        queue.offer(new int[]{i,j});

        while(!queue.isEmpty()){
            int[] nowArr = queue.poll();
            int x = nowArr[0];
            int y = nowArr[1];
            for(int k = 0; k < 4; k++){
                int tmpX = x + dx[k];
                int tmpY = y + dy[k];
                if(tmpX >= 0 && tmpY >= 0 && tmpX < maps.length && tmpY < maps[0].length){
                    if(maps[tmpX][tmpY] != 0 && !visited[tmpX][tmpY]){
                        visited[tmpX][tmpY] = true;
                        result[tmpX][tmpY] = result[x][y] + 1;
                        queue.offer(new int[]{tmpX,tmpY});
                    }
                }
            }
        }
    }
}