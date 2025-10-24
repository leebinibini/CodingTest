class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken ;
        
        while(coupons >=10){
            int newCh = coupons / 10;
            answer += newCh;
            coupons = newCh + coupons % 10;
        }
        
        return answer;
    }
}