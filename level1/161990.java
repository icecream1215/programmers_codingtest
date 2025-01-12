//https://school.programmers.co.kr/learn/courses/30/lessons/161990

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] point = new int[]{50,50,0,0};
        for(int i = 0 ; i < wallpaper.length; i ++){
            for(int j = 0 ; j < wallpaper[0].length(); j++){
                if(String.valueOf(wallpaper[i].charAt(j)).equals("#")){
                    point[0] = Math.min(point[0], i);
                    point[1] = Math.min(point[1], j);
                    point[2] = Math.max(point[2], i+1);
                    point[3] = Math.max(point[3], j+1);
                }
            }
        }
        return point;
    }
}