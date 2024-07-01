class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int num = (int)(money / 5500);
        int rest = money - num*5500;
        answer [0] = num;
        answer [1] = rest; 
        return answer;
    }
}