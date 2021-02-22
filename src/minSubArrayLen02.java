public class minSubArrayLen02 {
}

class Solution_15 {
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) return 0;

        int start = 0, end = 0, sum = 0;
        for (int i = 0; i < nums.length; ++i){
            sum += nums[i];
            if(sum >= target){
                end = i;
                break;
            }
        }
        if(sum < target) return 0;

        int minLen = end - start + 1;
        // if(minLen == 1) return 1;

        while (end < nums.length){
            while (sum - nums[start] >= target){
                sum -= nums[start];
                start++;
            }
            if(end - start + 1 < minLen) minLen = end - start + 1;

            if(end+1 == nums.length)
                break;
            else
                sum += nums[++end];
        }

        return minLen;
    }
}