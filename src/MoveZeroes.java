/*
移动零
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:
必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。

作者：力扣 (LeetCode)
链接：https://leetcode-cn.com/leetbook/read/all-about-array/x9rh8e/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int notZeroIndex = 0;

        for(int var : nums){
            if(var != 0){
                nums[notZeroIndex++] = var;
            }
        }

        int i = notZeroIndex;
        for(; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args){
        int[] num1 = {1, 0, 0, 1, 1, 0, 0};
        int[] num2 = {0, 0, 0, 1, 0, 0, 1, 1, 1, 0};
        Solution s1 = new Solution();
        s1.moveZeroes(num1);
        s1.moveZeroes(num2);
    }
}
