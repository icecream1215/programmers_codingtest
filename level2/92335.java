//https://school.programmers.co.kr/learn/courses/30/lessons/92335
import java.util.HashMap;
class Solution {
    public int solution(int n, int k) {
        HashMap<Long, Boolean> map = new HashMap<>();
        int answer = 0;
        String num = Integer.toString(n, k);
        for(String str : num.split("0")){
            if(str.length() == 0)
                continue;
            long intNum = Long.parseLong(str);

            //소수체크
            if(map.containsKey(intNum)){
                if(map.get(intNum))
                    answer++;
            }else{
                if(isPrime(intNum)){
                    answer++;
                    map.put(intNum, true);
                }else{
                    map.put(intNum, false);
                }
            }
        }

        return answer;
    }

    private boolean isPrime(long n){
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(n); i += 2) { // 홀수만 검사
            if (n % i == 0) return false;
        }
        return true;
    }
}
// import java.util.HashMap;
// class Solution {
//     public int solution(int n, int k) {
//         HashMap<Long, Boolean> map = new HashMap<>();
//         int answer = 0;
//         String num = Integer.toString(n, k);
//         int lastLeftIdx = -1;
//         int lastRightIdx = -1;
//         for(int i=0; i<num.length(); i++){
//             if(num.charAt(i) != '0'){
//                 if(lastLeftIdx == -1)
//                     lastLeftIdx = i;
//                 lastRightIdx = i;
//             }
//             if(num.charAt(i) == '0' || i == num.length()-1){
//                 if(lastLeftIdx > -1 && lastRightIdx > -1){
//                     long intNum = Long.parseLong(num.substring(lastLeftIdx,lastRightIdx+1));
//                     //소수체크
//                     if(map.containsKey(intNum)){
//                         if(map.get(intNum))
//                             answer++;
//                     }else{
//                         if(isPrime(intNum)){
//                             answer++;
//                             map.put(intNum, true);
//                         }else{
//                             map.put(intNum, false);
//                         }
//                     }
//                     //-1로 초기화
//                     lastLeftIdx = -1;
//                     lastRightIdx = -1;
//                 }
//             }
//         }
//         return answer;
//     }

//     private boolean isPrime(long n){
//         if (n < 2) return false;
//         else if (n == 2) return true;
//         else if (n % 2 == 0) return false;
//         for (long i = 3; i <= Math.sqrt(n); i += 2) { // 홀수만 검사
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
// }