package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    /*
    给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
    字母异位词 是由重新排列源单词的所有字母得到的一个新单词。

    示例 1:

    输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
    示例 2:

    输入: strs = [""]
    输出: [[""]]
    示例 3:

    输入: strs = ["a"]
    输出: [["a"]]
    */

    public static List<List<String>> solution(String[] strs) {
        //如果输入数组为空或长度为0，直接返回空列表
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        //使用哈希表来存储分组结果，键是排序后的字符串，值是对应的字母异位词列表
        HashMap<String,List<String>> map = new HashMap<>();
        //3.处理每个字符串：
        for (String s : strs) {
            // 将每个字符串转换为字符数组并排序
            //排序后的字符串作为哈希表的键
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            //4.分组存储
            // 如果哈希表中不存在该键，则新建一个列表
            if (!map.containsKey(sorted)) {
                map.put(sorted,new ArrayList<>());
            }
            // 将当前字符串添加到对应的列表中
            map.get(sorted).add(s);
        }
        //5.返回哈希表中的所有值（分组后的列表)
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] s =  {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution(s));
    }
}
