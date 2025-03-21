

class Solution {
    public int solution(int[] array) {
    int answer = 0;
      for(int num : array){
          String strNum = String.valueOf(num);
          for(char c : strNum.toCharArray()){
          if(c == '7'){
              answer ++;
          }
      }
      }
               return answer;
    }
}