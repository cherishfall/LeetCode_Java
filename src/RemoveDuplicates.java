public class RemoveDuplicates {
}

class Solution_03 {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        if(nums.length != 0){
            int  v, i;
            for (v = 0, i = 0; i < nums.length; i++){
                if(nums[v] != nums[i]){
                    nums[k] = nums[v];
                    k++;
                    v = i;
                }
            }
            nums[k++] =nums[i-1];
        }

        return k;
    }
}
