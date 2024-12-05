import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String s) {
        String[] elements = s.split(" ");  // 공백으로 문자열을 나누어 배열로 변환
        List<Integer> stack = new ArrayList<>();  // 숫자를 저장할 리스트
        int total = 0;  // 총합을 저장할 변수

        for (String element : elements) {
            if (element.equals("Z")) {
                if (!stack.isEmpty()) {  // 리스트가 비어있지 않으면
                    int lastNumber = stack.remove(stack.size() - 1);  // 마지막 숫자를 꺼내고
                    total -= lastNumber;  // 총합에서 빼줌
                }
            } else {
                int number = Integer.parseInt(element);  // 숫자로 변환
                stack.add(number);  // 리스트에 추가
                total += number;  // 총합에 더해줌
            }
        }

        return total;  // 최종 총합 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
      
    }
}
