class Solution {
    public String solution(String rsp) {
        String answer = "";
        char r = '0';
        char s = '2';
        char p = '5';
        for(int i = 0; i < rsp.length(); i++){
            if(rsp.charAt(i) == r){
            answer += '5';
        }else if(rsp.charAt(i) == s){
            answer += '0';
        }else if(rsp.charAt(i) == p){
            answer += '2';
        }
    }
        return answer;
        }
}