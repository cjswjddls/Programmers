import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        String strNum = Integer.toString(n);
        int[] arr = new int[strNum.length()];
        
        for(int i = 0; i < strNum.length(); i++){
            arr[i] = Character.getNumericValue(strNum.charAt(i));
            answer += arr[i];
        }

        return answer;
    }
}