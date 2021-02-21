public class RemoveElement {
    public static void main(String[] args){

    }
}

class Solution_02 {
    public int removeElement(int[] nums, int val) {
        int i, k;
        for(i = 0, k =0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}