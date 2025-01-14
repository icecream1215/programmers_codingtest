//https://school.programmers.co.kr/learn/courses/30/lessons/250137

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max_power = health;
        int sec_power = bandage[1];
        int add_time = bandage[0];
        int add_power = bandage[2];

        int cnt_attack = 0;
        int cnt_power = 0;

        int last_attack = attacks[attacks.length-1][0];
        for(int i = 1; i <= last_attack; i++){
            if(attacks[cnt_attack][0] == i){
                health -= attacks[cnt_attack][1];
                cnt_attack++;
                cnt_power = 0;
            }else{
                health = Math.min(health + sec_power, max_power);
                cnt_power++;
                if(cnt_power == add_time){
                    health = Math.min(health + add_power, max_power);
                    cnt_power = 0;
                }
            }
            if(health <= 0)
                return -1;
        }
        return health;
    }
}