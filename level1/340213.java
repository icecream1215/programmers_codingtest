//https://school.programmers.co.kr/learn/courses/30/lessons/340213

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int total_sec = Integer.parseInt(video_len.split(":")[0])*60
                + Integer.parseInt(video_len.split(":")[1]);
        int now_sec = Integer.parseInt(pos.split(":")[0])*60
                + Integer.parseInt(pos.split(":")[1]);
        int op_start_sec = Integer.parseInt(op_start.split(":")[0])*60
                + Integer.parseInt(op_start.split(":")[1]);
        int op_end_sec = Integer.parseInt(op_end.split(":")[0])*60
                + Integer.parseInt(op_end.split(":")[1]);

        for(String command : commands){
            if (now_sec >= op_start_sec && now_sec <= op_end_sec)
                now_sec = op_end_sec;

            int sec = 0;
            switch(command){
                case "prev":
                    sec = -10;
                    break;
                case "next":
                    sec = 10;
                    break;
            }
            now_sec = now_sec + sec;
            if (now_sec > total_sec)
                now_sec = total_sec;
            else if (now_sec < 0)
                now_sec = 0;
            else if (now_sec >= op_start_sec && now_sec <= op_end_sec)
                now_sec = op_end_sec;
        }

        String answer = "";
        answer = String.format("%02d:%02d", now_sec/60, now_sec%60);

        return answer;
    }
}