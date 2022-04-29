import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
        for (int i = 0; i < nums.length; i ++) {
            map.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }

        for (int i = 0; i < nums.length; i ++) {
            int otherNum = target - nums[i];
            if (map.containsKey(otherNum)) {
                int otherIndex = map.get(Integer.valueOf(otherNum)).intValue();
                if (otherIndex == i) {
                    continue; 
                }
                else {
                    answer[0] = i;
                    answer[1] = otherIndex; 
                }
            }
        }
        
        return answer; 
    }
}