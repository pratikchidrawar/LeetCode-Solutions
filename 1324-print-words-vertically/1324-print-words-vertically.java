class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> result = new ArrayList<>();

        int maxLength = 0;

        // Find the longest word

        for(String word : words){
            maxLength = Math.max(maxLength,word.length());
        }

        // Build each vertical row
        for(int i = 0;i<maxLength;i++){
            StringBuilder row = new StringBuilder();

            for(String word : words){
                if(i < word.length()){
                    row.append(word.charAt(i));
                }else{
                    row.append(' ');
                }
            }

            // Remove trailing spaces only
            while(row.length() > 0 
                  && row.charAt(row.length()-1) == ' '){
                row.deleteCharAt(row.length() - 1);
            }
            result.add(row.toString());
        }
        return result;
    }
}