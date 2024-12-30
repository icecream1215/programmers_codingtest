//https://school.programmers.co.kr/learn/courses/30/lessons/172928

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int park_x = park[0].length();
        int park_y = park.length;
        int[] now = new int[2];

        for(int i = 0; i < park_y; i++){
            for(int j = 0; j < park_x; j++){
                if(park[i].charAt(j) == 'S'){
                    now[0] = i;
                    now[1] = j;
                    break;
                }
            }
        }

        for(String route : routes){
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            int move_x = now[1];
            int move_y = now[0];
            int temp_x = move_x;
            int temp_y = move_y;

            for(int i = 0; i < distance; i++){
                switch(direction){
                    case "E": move_x++; break;
                    case "W": move_x--; break;
                    case "S": move_y++; break;
                    case "N": move_y--; break;
                }

                if (move_x >= 0 && move_x < park_x && move_y >= 0 && move_y < park_y
                        && park[move_y].charAt(move_x) != 'X'){
                    now[0] = move_y;
                    now[1] = move_x;
                }else{
                    now[0] = temp_y;
                    now[1] = temp_x;
                    break;
                }
            }
        }

        /*
        int[][] arr = new int[park.length][park[0].length()];

        int[] now = new int[2];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                switch(park[i].charAt(j)){
                    case 'O':
                        arr[i][j] = 1;
                        break;
                    case 'X':
                        arr[i][j] = 0;
                        break;
                    case 'S':
                        now[0] = i;
                        now[1] = j;
                        arr[i][j] = 1;
                        break;
                }
            }
        }

        for(int i = 0; i < routes.length; i++){
            String[] route = routes[i].split(" ");
            int next_num = 0;
            switch(route[0]){
                case "E":
                    next_num = now[1] + Integer.parseInt(route[1]);
                    if(next_num < arr[0].length){
                        for(int j = now[1]+1; j <= next_num; j++){
                            if (arr[now[0]][j] != 1)
                                break;
                            if (j == next_num)
                                now[1] = next_num;
                        }
                    }
                    break;
                case "W":
                    next_num = now[1] - Integer.parseInt(route[1]);
                    if(next_num >= 0){
                        for(int j = now[1]-1; j >= next_num; j--){
                            if (arr[now[0]][j] != 1)
                                break;
                            if (j == next_num)
                                now[1] = next_num;
                        }
                    }
                    break;
                case "N":
                    next_num = now[0] - Integer.parseInt(route[1]);
                    if(next_num >= 0){
                        for(int j = now[0]-1; j >= next_num; j--){
                            if (arr[j][now[1]] != 1)
                                break;
                            if (j == next_num)
                                now[0] = next_num;
                        }
                    }
                    break;
                case "S":
                    next_num = now[0] + Integer.parseInt(route[1]);
                    if(next_num < arr.length){
                        for(int j = now[0]+1; j <= next_num; j++){
                            if (arr[j][now[1]] != 1)
                                break;
                            if (j == next_num)
                                now[0] = next_num;
                        }
                    }
                    break;

            }
        }
        */
        return now;
    }
}