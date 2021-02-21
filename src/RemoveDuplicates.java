public class RemoveDuplicates {
}

class Solution_03 {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0 || nums.length ==1){
            return nums.length;
        }else {
            int  k, v, i;
            for ( k = 0, v = 0, i = 0; i < nums.length; i++){
                if(nums[v] != nums[i]){
                    nums[k] = nums[v];
                    k++;
                    v = i;
                }
            }
            nums[k++] =nums[i-1];
            return k;
        }
    }
}

