class Solution { 
    static int solve(int[] arr, int target, int left, int right){ 
        // base case 
        if(left > right){ 
            return -1; 
        } 
        
        // Processing or Binary Search ka logic 
        int mid = left + (right - left) / 2; 
        
        if(arr[mid] == target){ 
            return mid; 
        }else if(arr[mid] > target){ 
            // move to left 
            right = mid - 1; 
        }else{ 
            // move to right 
            left = mid + 1; 
        } 
        
        // recursive call 
        return solve(arr, target, left, right); 
    } 

    public int search(int[] nums, int target) { 
        int left = 0; 
        int right = nums.length - 1; 
        int ans = solve(nums, target, left, right); 
        return ans; 
    } 
}
