import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
       int answer = 0;
   
        char [] b = before.toCharArray();
        char [] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        if(Arrays.equals(a, b)){
            answer = 1;
        }else{
         answer = 0;   
        }
    
    return answer;}
    
    }
