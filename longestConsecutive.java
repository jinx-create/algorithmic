package hashmap;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
    public static void main(String[] args) {
        /*
        给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

        请你设计并实现时间复杂度为 O(n) 的算法解决此问题。

        示例 1：

        输入：nums = [100,4,200,1,3,2]
        输出：4
        解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
        示例 2：

        输入：nums = [0,3,7,2,5,8,4,6,0,1]
        输出：9
        示例 3：

        输入：nums = [1,0,1,2]
        输出：3
        */
    }
    public static int solution(int[] nums){
        //1.将数组转换为集合
        HashSet<Integer> hm = new HashSet<>();
        for (int num : nums) {
            hm.add(num);
        }
        //2.初始化最长序列的长度
        int longestStreak = 0;
        //3.遍历集合中的每一个数字
        for (Integer i : hm) {
            //4.检查是否为序列的起点
            //关键逻辑：
            //仅处理序列的起点：若 i - 1存在 ，说明i不是起点，可以比避免重复计算
            //向后扩展：        从起点开始，不断检查i+1是否存在，统计当前序列的长度
            if( !hm.contains(i - 1) ){
                //5.计算当前序列的长度
                int end = i;
                int count = 1;
                while (hm.contains(end + 1)){
                    end = end + 1;
                    count = count + 1;
                }
                //6.更新最长序列的长度
                longestStreak = Math.max(longestStreak, count);
            }
        }
        //7.返回序列的长度
        return longestStreak;
    }
}
