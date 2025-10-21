import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        Arrays.sort(spell);
            String spellj = String.join("",spell);
        
        for(int i = 0; i< dic.length; i++){
           String dicc = dic[i];
           char[] chardic = dicc.toCharArray();
            Arrays.sort(chardic);
          
            
         String schardic =  String.valueOf(chardic);  
            
            if(schardic.equals(spellj)){
                answer = 1;
                break;
            }answer = 2;
    }
        return answer;
}
}