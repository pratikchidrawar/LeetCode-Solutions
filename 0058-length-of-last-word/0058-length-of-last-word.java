class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();   // trim() removes the spaces at the beginning and ending
        int count = 0;

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}