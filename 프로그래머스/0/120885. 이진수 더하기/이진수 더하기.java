class Solution {
    public String solution(String bin1, String bin2) {
       int num1 = Integer.parseInt(bin1, 2);  // 2진법 → 10진법
        int num2 = Integer.parseInt(bin2, 2);  // 2진법 → 10진법

        // 2️⃣ 더하기
        int sum = num1 + num2;

        // 3️⃣ 다시 10진수를 2진수 문자열로 변환
        String result = Integer.toBinaryString(sum);
        
        
        return result;
    }
}