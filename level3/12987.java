//https://school.programmers.co.kr/learn/courses/30/lessons/12987
import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int indexA = 0;
        for(int indexB=0; indexB<B.length; indexB++){
            if(A[indexA]<B[indexB]){
                answer++;
                indexA++;
            }
        }

        return answer;
    }
}

/*import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int num : B){
            queue.add(num);
        }

        for(int i=0; i<A.length; i++){
            int numB = 0;
            while(A[i]>=numB){
                if(queue.isEmpty()) break;
                numB = queue.poll();
            }

            if(A[i] < numB)
                answer++;
        }
        return answer;
    }
}*/