public class RemoveDuplicatesTwo {
}

class Solution_04 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;

        for(int i = 1, count = 1, tmp = nums[0]; i < nums.length; i++){
            if(tmp == nums[i]){
                count++;
            }else {
                tmp = nums[i];
                count = 1;
            }
            if(count > 2) nums[i] = Integer.MAX_VALUE;
        }

        int i, j;
        for(i = 0, j =0; j < nums.length; j++){
            if(nums[j] != Integer.MAX_VALUE){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
