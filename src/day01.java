import java.util.HashMap;
import java.util.Map;


public class day01 {

    public static void main(String[] args) {
        /**
         * 力扣热题1
         * 两数之和
         */

    }

    /**
     * 简单思路：1.对数组进行遍历，时间复杂度是O(N2)
     *         2.先对数组排序，再使用双指针，时间复杂度O(NlogN)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        /*Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;*/
        //因为数组中同一个元素在答案中不能重复出现，故为<，
        // 又每种输入只会对应一种答案，故我们可以使用map来存数组中元素原来的下标位置
        //双指针会出现数组中相同元素相加等于target，导致输出有误，看了大神的解答，可以一边存入map，一边计算是否是该元素得到结果，还是太菜了
        /*while (start < end){
            if (nums[start]+nums[end]==target){
                return new int[]{map.get(nums[start]),map.get(nums[end])};
            }else if (nums[start]+nums[end]>target){
                end--;
            }else{
                start++;
            }
        }*/
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
