class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] array = my_string.split("");
        
        for(int i = 0; i< array.length; i++){
            if(i == num1){
                answer += array[num2];
            }else if(i == num2){
                answer += array[num1]; 
            }else 
                answer += array[i];
        }
        return answer;
    }
}