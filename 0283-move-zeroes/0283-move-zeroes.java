import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int j=0;
        for(i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;

            }
        }
        System.out.println(Arrays.toString(nums));
        
    }
}