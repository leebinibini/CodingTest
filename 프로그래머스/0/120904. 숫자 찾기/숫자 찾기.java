class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        if(str.contains(kStr)){
            answer = str.indexOf(kStr) + 1;
        }else {
            answer = -1;
        }
            
            
        
        return answer;
    }
}