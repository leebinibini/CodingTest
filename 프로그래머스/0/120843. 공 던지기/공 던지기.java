class Solution {
    public int solution(int[] numbers, int k) {
        int n = numbers.length; // 배열의 길이
        // k번째 던지는 사람의 인덱스 계산
        int index = (2 * (k - 1)) % n;
        return numbers[index]; // 해당 인덱스의 번호 반환
    }
}