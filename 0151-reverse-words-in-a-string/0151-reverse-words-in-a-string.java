class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length()-1;

        while(i>=0){
            // remove all trailing spaces

            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }
            // check value of i
            if(i < 0){
                break;
            }
            int j = i;
            // find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi j space wale index pr aya ,toh rukh jaega
            // ab iss word ko apne ans me append kardena
            ans.append(s.substring(j+1,i+1));

            // remove faltu ke space where j is standing and add a space in ans
            while (j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            // j<0 , iska matlab first word ke uppar tha main -> no space needed
            // j>=0 , space method

            if(j>= 0){
                ans.append(' ');
            }

            // place i at last index of the remaining string
            i = j;
        }
        return ans.toString();
    }
}