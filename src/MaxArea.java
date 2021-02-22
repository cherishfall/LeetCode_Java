public class MaxArea {
}

class Solution_12 {
    public int maxArea(int[] height) {
        int maxWater = 0, tmpWater = 0, i = 0, j = height.length - 1;

        while (i < j){
            tmpWater = (j - i) * (Math.min(height[i], height[j]));
            if(tmpWater > maxWater) maxWater = tmpWater;

            if(height[i] <= height[j]){
                ++i;
            }else
                --j;
        }

        return maxWater;
    }
}
