import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();

        // 문자열을 순회하며 숫자 추출
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }

        // 오름차순 정렬
        Collections.sort(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
      
    }
}
