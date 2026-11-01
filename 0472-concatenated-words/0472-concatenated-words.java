class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();

        for(String word : words){
            set.remove(word);

            if(canForm(word,set,0, new Boolean[word.length()])){
                result.add(word);
            }

            set.add(word);
        }
        return result;
    }

    private boolean canForm(String word,Set<String> set,int start,Boolean[] dp){

        if(start == word.length()){
            return true;
        }

        if(dp[start] != null){
            return dp[start];
        }

        for(int end = start;end <= word.length();end++){
            String prefix = word.substring(start,end);

            if(set.contains(prefix) && canForm(word,set,end,dp)){
                return dp[start] = true;
            }
        }
        return dp[start] = false;
    }
}