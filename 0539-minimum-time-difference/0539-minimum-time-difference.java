class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();

        // Convert each time into minutes
        for(String time:timePoints){
            int hours = Integer.parseInt(time.substring(0,2));
            int mins = Integer.parseInt(time.substring(3,5));

            minutes.add(hours * 60 + mins);
        }

        // Sort times in ascending order
        Collections.sort(minutes);

        int minDiff = Integer.MAX_VALUE;
        int n = minutes.size();

        // Compare adjacent times

        for(int i = 1;i<n;i++){
            minDiff = Math.min(minDiff,minutes.get(i)-minutes.get(i-1));
        }

        // Compare Last time with first time across midnight

        int circularDiff = 1440 - minutes.get(n-1)+minutes.get(0);

        minDiff = Math.min(minDiff , circularDiff);

        return minDiff;
    }
}