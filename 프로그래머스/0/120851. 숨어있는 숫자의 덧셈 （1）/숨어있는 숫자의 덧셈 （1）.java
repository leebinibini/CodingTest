
class Solution {
    public int solution(String my_string) {
        int sum =0;
        String num = my_string.replaceAll("[^\\d]", "");
        for(int i =0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        
        return sum;
    }
}