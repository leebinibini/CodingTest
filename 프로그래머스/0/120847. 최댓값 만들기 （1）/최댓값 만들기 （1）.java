import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        Arrays.sort(numbers);
        for(int i = 0; i< numbers.length-1; i++){
            int A = numbers[i] * numbers[i+1];
            if(A> max){
                 max = A;
            }       
    }
        return max;
}
}