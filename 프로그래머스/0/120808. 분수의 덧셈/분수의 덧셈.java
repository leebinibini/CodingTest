class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1 * denom2;
        int numerA = numer1*denom2;
        int numerB = numer2*denom1;
        
        int max =1;
        int numerAB = numerA + numerB;
        for(int i =1; i<= numerAB && i<= denom; i++){
            if(numerAB % i ==0 && denom % i ==0)
                max = i;
        }

        answer[0] = numerAB /max;
        answer[1] = denom/max;
        return answer;
    }
}