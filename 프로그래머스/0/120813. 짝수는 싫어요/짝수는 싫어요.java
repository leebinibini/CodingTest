import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] array = new int[n];
        int index=0;   
        for(int i =1; i <= n; i++){
            if(i % 2 !=0){
                array[index++]= i;
            }
        }
        
        return Arrays.copyOf(array, index);
    }
}
