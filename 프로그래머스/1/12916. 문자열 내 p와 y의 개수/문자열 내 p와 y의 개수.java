import java.util.ArrayList;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        ArrayList<Character> p = new ArrayList<>();
        ArrayList<Character> y = new ArrayList<>();
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p.add(s.charAt(i)); 
            }
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                y.add(s.charAt(i));   
            }
        }
        
        if(p.size() != y.size()){
            answer = false;
        }

        return answer;
    }
}