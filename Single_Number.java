/* Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4  */

class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1) result = entry.getKey();
        }
        return result;
    }
}

// Needed to improvise as it uses the extra memory
// On looking up on google found the cool operation of bitwise Ex-Or 

class Solution {
    public int singleNumber(int[] nums) {
         if(nums.length==0) return 0;
        int ans = 0, n = nums.length;
        
        for(int i=0;i< nums.length;i++){
            ans ^= nums[i];
        }
        
        return ans;
    }
}

