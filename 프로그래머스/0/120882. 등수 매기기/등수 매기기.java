class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] avg = new double[n];
        int[] result = new int[n];
        
        // 평균값 구하기
        for (int i = 0; i< n; i++){
            avg[i] = (score[i][0] + score[i][1])/2.0;
        }
        
        // 값 비교하기
        for (int i =0; i<n; i++){
            int rank = 1;
            for(int j = 0; j <n; j++){
              if(avg[j] > avg[i]){
                  rank ++;
              }
            }
            result[i] = rank;
        }
        return result;
    }
}
