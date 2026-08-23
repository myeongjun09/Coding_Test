class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean [] arrflag = new boolean[10];
        
        for(int i = 0; i<numbers.length; i++) {
            arrflag[numbers[i]] = true;
        }
        
        for(int i = 0; i<10; i++) {
            if(!arrflag[i]) {
                answer+=i;
            }
        }
        return answer;
    }
}