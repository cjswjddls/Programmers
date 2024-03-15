class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String strX = Integer.toString(x);
        int sum = 0;
        
        for(int i = 0; i < strX.length(); i++){
            sum += Character.getNumericValue(strX.charAt(i));
        }
        if(x % sum == 0){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}