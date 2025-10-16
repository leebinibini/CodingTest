

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String [] A = my_string.split(" ");
        
         answer = Integer.parseInt(A[0]);
        //  첫 숫자를 먼저 넣어주고
        
        for (int i = 1; i < A.length; i += 2){
            
            String operate = A[i];
            
            int num = Integer.parseInt(A[i+1]); 
            
            if(operate.equals("+")){
                answer += num;
            } else if( operate.equals("-")  
            )answer -= num;
        }
        return answer;
    }
}