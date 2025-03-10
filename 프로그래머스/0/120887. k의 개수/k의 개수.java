public class Solution{
     int solution(int i, int j, int k) {
     int count =  0;
         
     String target = String.valueOf(k);    
    for (int x = i; x<j+1; x++){
        String str =String.valueOf(x);
       count += str.length() - str.replace(target, "").length();
        }
    return count;
}
}
