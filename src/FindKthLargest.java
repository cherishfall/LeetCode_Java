import java.lang.reflect.Array;
import java.util.Arrays;

public class FindKthLargest {
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
