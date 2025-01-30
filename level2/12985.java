//https://school.programmers.co.kr/learn/courses/30/lessons/12985
class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }

        while(true){
            if(a+1 == b && b%2 == 0)
                break;
            answer++;
            a = (a%2==1? (int)a/2 + 1 : a/2);
            b = (b%2==1? (int)b/2 + 1 : b/2);
        }

        return answer;
    }
}