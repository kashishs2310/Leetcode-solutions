import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=target-nums[i];
            if(n.containsKey(a))
            {
                return new int[] {n.get(a),i};
            }
            n.put(nums[i],i);
        }
        return new int[] {};
    }
}