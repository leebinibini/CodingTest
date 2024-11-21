class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            if (isComposite(i)) {
                answer++;
            }
        }
        
        return answer;
    }

    private boolean isComposite(int num) {
        int count = 0; // 약수 개수 세기
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++; // 약수 발견
            }
        }
        return count > 2; // 약수가 3개 이상이면 합성수
    }
}