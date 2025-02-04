//https://school.programmers.co.kr/learn/courses/30/lessons/159993

import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int[] start = new int[3];
        int[] lever = new int[3];

        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[i].length(); j++){
                if(maps[i].charAt(j)=='S'){
                    start[0] = i;
                    start[1] = j;
                    start[2] = 1;
                }else if(maps[i].charAt(j)=='L'){
                    lever[0] = i;
                    lever[1] = j;
                    lever[2] = 1;
                }
            }
            if(start[2] == 1 && lever[2] == 1)
                break;
        }

        int leverSec = bfs(maps, start[0], start[1], 'L');
        if(leverSec == -1)
            return -1;
        int exitSec = bfs(maps, lever[0], lever[1], 'E');
        if(exitSec == -1)
            return -1;

        return leverSec+exitSec;
    }

    private int bfs(String[] maps, int i, int j, char toChar){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.offer(new int[]{i,j,0});

        while(!queue.isEmpty()){
            int[] q = queue.poll();
            int x = q[0];
            int y = q[1];
            int sec = q[2];

            if(maps[x].charAt(y) == toChar){
                return sec;
            }

            for(int dic = 0; dic < dx.length; dic++){
                int newX = x + dx[dic];
                int newY = y + dy[dic];
                if(newX >= 0 && newY >= 0 && newX < maps.length && newY < maps[0].length()
                        && maps[newX].charAt(newY) != 'X' && !visited[newX][newY]){
                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX,newY,sec+1});
                }
            }
        }
        return -1;
    }
}