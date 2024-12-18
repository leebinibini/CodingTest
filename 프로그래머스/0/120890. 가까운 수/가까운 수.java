class Solution {
    public int solution(int[] array, int n) {
        int l =0;
        int absoluteValue = 0;
        int closeNumber = array[0];
       int  minNumber = Integer.MAX_VALUE;
        for (int i =0 ; i< array.length; i++){    
           l = array[i] - n ;
           absoluteValue = Math.abs(l);   
           if(absoluteValue < minNumber){
               minNumber = absoluteValue;
               closeNumber = array[i];
           } else if(absoluteValue == minNumber){
               closeNumber = Math.min(closeNumber , array[i]);
           }
            }
        
        return closeNumber;
    }
}