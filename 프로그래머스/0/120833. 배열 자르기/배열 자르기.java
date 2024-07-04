class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
            answer[0] = numbers[num1];
            answer[num2-num1] = numbers[num2];
            for(int i = num1; i< (num2-num1+1); i++){
                answer[i-num1] = numbers[i];
            } 
        return answer;
    }
}