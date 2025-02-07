//https://school.programmers.co.kr/learn/courses/30/lessons/86971
import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        ArrayList<ArrayList<Integer>> connection = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            connection.add(new ArrayList<>());
        }
        for(int[] wire : wires){
            connection.get(wire[0]).add(wire[1]);
            connection.get(wire[1]).add(wire[0]);
        }

        for(int[] wire : wires){
            connection.get(wire[0]).remove(Integer.valueOf(wire[1]));
            connection.get(wire[1]).remove(Integer.valueOf(wire[0]));

            int count = bfs(connection, n);
            int diff = Math.abs((n - count) - count);
            answer = Math.min(answer,diff);

            connection.get(wire[0]).add(wire[1]);
            connection.get(wire[1]).add(wire[0]);
        }
        return answer;
    }

    private int bfs(ArrayList<ArrayList<Integer>> connection, int n){
        int count = 0;
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int num = queue.poll();
            if(!visited[num]){
                visited[num] = true;
                count++;
                for(int idx : connection.get(num)){
                    if(!visited[idx]){
                        queue.add(idx);
                    }
                }
            }
        }
        return count;
    }
}