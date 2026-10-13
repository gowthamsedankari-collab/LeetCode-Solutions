import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    //     HashMap<Integer,Integer> map=new HashMap<>();
     
    //     for(int i=0;i<=nums.length-1;i++){     
    //    if( map.containsKey(target-nums[i])){
    //     return new int[]{map.get(target-nums[i]),i};
    //    }
    //        map.put(nums[i],i);
    //     }
    //     return new int[]{};
//     }
// }
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
}
