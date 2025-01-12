//https://school.programmers.co.kr/learn/courses/30/lessons/250125

class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int board_size = board.length;
        String color = board[h][w];
        int[] dh = new int[]{0,1,-1,0};
        int[] dw = new int[]{1,0,0,-1};
        for(int i = 0; i < dh.length; i++){
            if(h+dh[i] >= 0 && h+dh[i] < board_size && w+dw[i] >= 0 && w+dw[i] < board_size){
                if(color.equals(board[h+dh[i]][w+dw[i]]))
                    count++;
            }
        }
        return count;
    }
}