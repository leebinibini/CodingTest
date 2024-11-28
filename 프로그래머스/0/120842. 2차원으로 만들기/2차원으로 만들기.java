import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length / n; // 행의 수 계산
        int[][] result = new int[rows][n]; // 2차원 배열 초기화
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j]; // 값 할당
            }
        }
        
        return result; // 결과 반환
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;
        int[][] result = sol.solution(num_list, n);
        
        // 결과 출력
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
