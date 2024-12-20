import java.util.*;

public class Solution {
    public String solution(String s) {
        // 각 문자의 등장 횟수를 세기 위한 맵
        Map<Character, Integer> charCount = new HashMap<>();

        // 문자열의 각 문자를 순회하며 등장 횟수 계산
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 한 번만 등장하는 문자를 저장할 리스트
        List<Character> uniqueChars = new ArrayList<>();

        // 등장 횟수가 1인 문자를 리스트에 추가
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        // 사전 순으로 정렬
        Collections.sort(uniqueChars);

        // 정렬된 문자들을 문자열로 변환
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString(); // 결과 문자열 반환
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abcdeabc")); // 출력: "de"
        System.out.println(sol.solution("aabbcc"));   // 출력: ""
    }
}
