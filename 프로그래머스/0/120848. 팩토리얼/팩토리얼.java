class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            long fac = factorial(answer);
            if (fac > n){
                break;
            }
            answer++;
        }
        return answer-1;
    }
      public long factorial(int n) {
        long result = 1; // long 타입으로 result를 선언
        for (int k = 1; k <= n; k++) {
            result *= k; // result에 k를 곱함
        }
        return result; // 결과 반환
    }
    
    
}