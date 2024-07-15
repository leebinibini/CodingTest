class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] letters = letter.split(" ");
        
        for(int i =0; i< letters.length; i++){
            for(int j =0; j< morse.length; j++){
                if(letters[i].equals(morse[j])){
                    answer += (char)(j+97);
                }  
            }
        }
        return answer;
    }
}