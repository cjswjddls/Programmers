import java.util.Arrays;
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        char[] ch = s.toCharArray();
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(65 <= ch[i] && ch[i] <= 90){
                    answer = false;
                    break;
                } else if(97 <= ch[i] && ch[i] <= 122){
                    answer = false;
                    break;
                } else {
                    answer = true;
                }     
            }
        }
        
        
        return answer;
    }
}