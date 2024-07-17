class Solution {
    public int solution(String message) {
        int answer = 0;
        String [] num = message.split("");
        answer = (num.length)*2;
        return answer;
    }
}