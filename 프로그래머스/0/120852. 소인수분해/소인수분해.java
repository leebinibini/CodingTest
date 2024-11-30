import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> solution(int n) {
        HashSet<Integer> primeFactorsSet = new HashSet<>();

        // 2로 나누기 (짝수 처리)
        while (n % 2 == 0) {
            primeFactorsSet.add(2);
            n /= 2;
        }

        // 홀수 소수로 나누기
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactorsSet.add(i);
                n /= i;
            }
        }

        // n이 1이 아닌 경우 (소수인 경우)
        if (n > 1) {
            primeFactorsSet.add(n);
        }

        // HashSet을 List로 변환하고 정렬
        List<Integer> primeFactors = new ArrayList<>(primeFactorsSet);
        primeFactors.sort(Integer::compareTo);

        return primeFactors;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 12; // 예시: 12의 소인수
        List<Integer> result = sol.solution(n);
        System.out.println(result); // 출력: [2, 3]
        
    
    }
}
