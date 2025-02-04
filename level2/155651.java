//https://school.programmers.co.kr/learn/courses/30/lessons/155651

//개선된 코드 (시간 복잡도 개선)
import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));
        PriorityQueue<Integer> roomQueue = new PriorityQueue<>();

        for (String[] time : book_time) {
            int start = calculateTime(time[0]);
            int end = calculateTime(time[1]) + 10;
            if (!roomQueue.isEmpty() && roomQueue.peek() <= start) {
                roomQueue.poll();
            }
            roomQueue.offer(end);
        }
        return roomQueue.size();
    }

    private int calculateTime(String time) {
        return Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);
    }
}

//원래 작성한 코드
import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        List<Integer> room = new ArrayList<>();
        Arrays.sort(book_time, (a,b)->a[0].compareTo(b[0]));
        for(String[] time : book_time){
            boolean checked = false;
            for(int i = 0 ; i < room.size(); i++){
                if(room.get(i) <= calculateTime(time[0])){
                    room.set(i, calculateTime(time[1]) + 10);
                    checked = true;
                    break;
                }
            }
            if(!checked){
                room.add(calculateTime(time[1]) + 10);
            }
        }
        return room.size();
    }

    private int calculateTime(String time){
        return Integer.parseInt(time.split(":")[0])*60 + Integer.parseInt(time.split(":")[1]);
    }
}