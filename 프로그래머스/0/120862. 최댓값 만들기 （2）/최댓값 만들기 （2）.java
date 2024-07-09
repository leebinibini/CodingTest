import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        Arrays.sort(numbers);
        if(numbers[0]*numbers[1] >
           numbers[numbers.length-1]*numbers[numbers.length-2]){
            max = numbers[0]*numbers[1];
        }else {
            max =numbers[numbers.length-1]*numbers[numbers.length-2];
        }
        return max;
    }
        
}
