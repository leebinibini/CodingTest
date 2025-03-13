import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
       // 소문자로 바꾸기
           String str = my_string.toLowerCase(); 
        // 문자 배열로 바꾸기
        char[] arrayChar = str.toCharArray();
        // 정렬하기
        Arrays.sort(arrayChar);
        
        answer = new String(arrayChar);
        return answer;
    }
}