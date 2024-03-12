import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> divArr = new ArrayList<>();
        int[] answer;
        
        for (int num : arr) {
            if (num % divisor == 0) {
                divArr.add(num);
            }
        }
        
        if (divArr.size() < 1) {
            answer = new int[] {-1};
        } else {
            answer = new int[divArr.size()];
            for (int i = 0; i < divArr.size(); i++) {
                answer[i] = divArr.get(i);
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}