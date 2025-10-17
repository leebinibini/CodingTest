class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = 0;
        int min = 0;
        
        max = sides[0] + sides[1];
        
        for(int i = max-1; i>0; i--){
            if((sides[0]+i>sides[1]) && (sides[1] + i > sides[0])){
                answer += 1;
            }else {
                      answer = answer;
            }
        }
        return answer;
    }
}


    
