//https://school.programmers.co.kr/learn/courses/30/lessons/12977

import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int add1,add2,add3;
        Arrays.sort(nums);
        for(int num1=0; num1<nums.length-2; num1++){
            add1 = nums[num1];
            for(int num2=num1+1; num2<nums.length-1; num2++){
                if(add1 == nums[num2])
                    continue;
                add2 = nums[num2];
                for(int num3=num2+1; num3<nums.length; num3++){
                    if(add1 == nums[num3] || add2 == nums[num3])
                        continue;
                    add3 = nums[num3];

                    boolean pNum = true;
                    int add = add1+add2+add3;
                    for(int i=2;i<add;i++){
                        if(add%i==0){
                            pNum = false;
                            break;
                        }
                    }
                    if(pNum){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}