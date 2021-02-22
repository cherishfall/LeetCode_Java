public class TwoSum {
}

class Solution_09 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i != j){
            if(target > numbers[i] + numbers[j])
                ++i;
            else if(target < numbers[i] + numbers[j])
                --j;
            else
                break;
        }

        return new int[] {i+1, j+1};
    }
}
