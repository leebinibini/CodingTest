class Solution {
    public int solution(int hp) {
        int answer = 0;
        int [] ant = {5, 3, 1};
        
        for(int i = 0; i<ant.length; i++){
            answer += hp/ant[i];
                hp = hp%ant[i];
        }
        return answer;
    }
}