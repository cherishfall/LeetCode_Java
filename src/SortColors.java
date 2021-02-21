public class SortColors {
}

class Solution_06 {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int val : nums){
            if (val == 0)
                count0++;
            else if (val == 1)
                count1++;
            else
                count2++;
        }

        int i;
        for (i = 0; i < count0; i++) nums[i] = 0;
        for ( ; i < count1 + count0; i++) nums[i] = 1;
        for ( ; i < nums.length; i++) nums[i] = 2;
    }
}
