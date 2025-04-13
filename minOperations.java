package hashmap;

import java.util.HashSet;
import java.util.Set;

public class minOperations {
   /* 给你一个整数数组nums和一个整数k。
    如果一个数组中所有严格大于h的整数值都相等，那么我们称整数h是
    合法的。
    比方说，如果
            nums = [10,8,10,8],那么h=9是一个合法整数，
    因为所有满足nums[i]>9的数都等于10，但是5不是合法整数。
    你可以对nums
    执行以下操作：
           1·选择一个整数h,它对于当前nums中的值是合法的。
           2.对于每个下标1，如果它满足nums[i]>h,那么将nums[i]变为h
    你的目标是将nums中的所有元素都变为k,请你返回最少操作次数。如果无法将所有元素都变k，那么返回-1。*/
    public int minOperations(int[] nums , int k){
        //创建一个空的HashSetst，用于存储需要被操作的数值
        Set<Integer> set = new HashSet<>();
        //遍历数组
        for (int num : nums) {
            //当数组中的元素小于K，无法通过操作变为K
            if(num < k){
                return -1;
            }else if (num > k){
                //当数组大于K，使用HashSet可以自动去重，只保留不同的值
                set.add(num);
            }
        }
        //返回
        return set.size();
    }
}
