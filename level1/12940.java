//https://school.programmers.co.kr/learn/courses/30/lessons/12940

class Solution {
    public int[] solution(int n, int m) {
        int x = 0;
        int y = 0;

        for(int i=1; i<=Math.min(n,m); i++){
            if(n%i==0 && m%i==0){
                x = i;
            }
        }

        for(int i=1; i<=n*m; i++){
            if(i%n==0 && i%m==0){
                y = i;
                break;
            }
        }

        return new int[]{x,y};
    }
}

/* 유클리드 호제법적용
class Solution {
    public int[] solution(int n, int m) {
        int i_gcd = 1;
        int i_lcm = 0;

        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }
        i_gcd = gcd(n,m);
        i_lcm = n*m/i_gcd;

        return new int[]{i_gcd,i_lcm};
    }

    private int gcd(int x, int y){
        if(y==0)
            return x;
        return gcd(y, x%y);
    }
}
 */