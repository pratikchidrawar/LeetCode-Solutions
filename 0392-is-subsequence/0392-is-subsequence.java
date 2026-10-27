class Solution {
    public boolean isSubsequence(String s, String t) {
        // Base case

        if(s.isEmpty()){
            return true;
        }

        if(t.isEmpty()){
            return false;
        }

        // processing part
        if(s.charAt(0) == t.charAt(0)){
            return isSubsequence(s.substring(1),t.substring(1));
        }

    
        // recursive call
        return isSubsequence(s, t.substring(1));
    }
}