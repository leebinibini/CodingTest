class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                answer[0] -= 1;
            } else if (keyinput[i].equals("right")) {
                answer[0] += 1;
            } else if (keyinput[i].equals("up")) {
                answer[1] += 1;
            } else if (keyinput[i].equals("down")) {
                answer[1] -= 1;
            }

            if (Math.abs(answer[0]) > board[0] / 2) {   // ← math → Math
                if (answer[0] > 0) {
                    answer[0] -= 1;
                } else if (answer[0] < 0) {
                    answer[0] += 1;
                }
            }

            if (Math.abs(answer[1]) > board[1] / 2) {   // ← math → Math
                if (answer[1] > 0) {
                    answer[1] -= 1;
                } else if (answer[1] < 0) {
                    answer[1] += 1;
                }
            }
        }

        return answer;   // ← for문 밖으로 이동
    }
}
