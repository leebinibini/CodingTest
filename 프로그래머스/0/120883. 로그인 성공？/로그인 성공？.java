class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        String Id = id_pw[0];
        String Pw = id_pw[1];

        boolean idMatch = false;
        boolean pwMatch = false;

        for (int i = 0; i < db.length; i++) {
        
            if (Id.equals(db[i][0])) {
                idMatch = true;
                
                if (Pw.equals(db[i][1])) {
                    pwMatch = true;
                    break;
                }
            }
        }

        if (idMatch && pwMatch) answer = "login";
        else if (idMatch) answer = "wrong pw";
        else answer = "fail";

        return answer;
    }
}
