class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            
            answer += absolutes[i];
            
            if(signs[i] == false){
                answer -= 2 * absolutes[i];
            }
            
        }
        
        return answer;
    }
}