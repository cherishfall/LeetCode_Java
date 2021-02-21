public class MoveZeroes_01 {
}

class Solution_01 {
    public void moveZeroes(int[] nums) {
        int i, notZeroIndex;

        for(i=0, notZeroIndex=0; i < nums.length; ++i){
            if(0 != nums[i]){
                nums[notZeroIndex] = nums[i];
                notZeroIndex++;
            }
        }

        for(; notZeroIndex< nums.length; notZeroIndex++){
            nums[notZeroIndex] = 0;
        }

    }
}
