public class Solution {
    public int solution(int order) {
        // 숫자를 문자열로 변환
        String orderStr = String.valueOf(order);
        int clapCount = 0;

        // 각 문자에 대해 반복
        for (char ch : orderStr.toCharArray()) {
            // '3', '6', '9'일 경우 박수를 치는 횟수 증가
            if (ch == '3' || ch == '6' || ch == '9') {
                clapCount++;
            }
        }

        // 총 박수 횟수 반환
        return clapCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int order = 369;
        System.out.println(sol.solution(order));  // 출력: 2 (3과 6이 있으므로)
    }
}
