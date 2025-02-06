//https://school.programmers.co.kr/learn/courses/30/lessons/43165
class Solution {
    static int count;
    public int solution(int[] numbers, int target) {
        count = 0;
        dfs(numbers, target, 0, 0);

        return count;
    }
    private void dfs(int[] numbers, int target, int idx, int sum){
        if(idx==numbers.length){
            if(target==sum)
                count++;
            return;
        }
        dfs(numbers, target, idx+1, sum+numbers[idx]);
        dfs(numbers, target, idx+1, sum-numbers[idx]);
    }
}