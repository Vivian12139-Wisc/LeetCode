import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
        for (int i = 0; i < nums.length; i ++) {
            // 建立数字和其坐标位置之间的映射
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