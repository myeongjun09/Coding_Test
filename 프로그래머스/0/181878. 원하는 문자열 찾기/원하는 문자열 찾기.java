class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        if(lowerMyString.contains(lowerPat)) {
            return 1;
        }
        return answer;
    }
}