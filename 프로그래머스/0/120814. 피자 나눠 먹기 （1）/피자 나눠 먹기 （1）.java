class Solution {
    public int solution(int n) {
        int answer = 0;
        int quota = n / 7;
        int rest = n % 7;
        if(rest != 0){
            answer = quota + 1;
        }else{
              answer = quota;
        }
        return answer;
    }
    }
