class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] num = new int[1000];
        int max =0;
        for(int i =0; i< array.length; i++){
            num[array[i]]++;
            
            if(max < num[array[i]]){
                max = num[array[i]];
                answer = array[i];
            }
        }
        int temp = 0;
        for(int j =0; j < 1000; j++){
            if(max == num[j])temp++;
            if(temp >1) answer = -1;
        }
            
        
        return answer;
    }
}