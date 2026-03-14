// Given an elevation map like:

// [0,1,0,2,1,0,1,3,2,1,2,1]

// Calculate how much rainwater is trapped.

// Example output → 6

public class TrappingRainWater {

    public static int trap(int[] height) {

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while(left < right){

            if(height[left] < height[right]){

                if(height[left] >= leftMax)
                    leftMax = height[left];
                else
                    water += leftMax - height[left];

                left++;
            }
            else{

                if(height[right] >= rightMax)
                    rightMax = height[right];
                else
                    water += rightMax - height[right];

                right--;
            }
        }

        return water;
    }
}
