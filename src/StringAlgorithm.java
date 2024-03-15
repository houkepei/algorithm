import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode
 * 字符串：3，49，30
 */

public class StringAlgorithm {

    /**
     * 3. 无重复字符的最长子串
     * 中等
     * <p>
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串的长度。
     * <p>
     * 示例 1:
     * <p>
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * <p>
     * 示例 2:
     * <p>
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * <p>
     * 示例 3:
     * <p>
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int num = 0;
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (map.get(charAt) == null) {
                num = num + 1;
                map.put(charAt, num);
            } else {

                if (max <= num) {
                    max = num;
                    map.clear();
                    num = 1;
                    map.put(charAt, num);

                }
            }

        }
        if (max == 0 || max <= num) {
            max = num;
        }
        return max;
    }

    /**
     * 49. 字母异位词分组
     * 中等
     * 相关标签
     * 相关企业
     * <p>
     * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
     * <p>
     * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * <p>
     * 示例 2:
     * <p>
     * 输入: strs = [""]
     * 输出: [[""]]
     * <p>
     * 示例 3:
     * <p>
     * 输入: strs = ["a"]
     * 输出: [["a"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        return null;
    }

    /**
     * 30. 串联所有单词的子串
     * 困难
     * 相关标签
     * 相关企业
     * <p>
     * 给定一个字符串 s 和一个字符串数组 words。 words 中所有字符串 长度相同。
     * <p>
     * s 中的 串联子串 是指一个包含  words 中所有字符串以任意顺序排列连接起来的子串。
     * <p>
     * 例如，如果 words = ["ab","cd","ef"]， 那么 "abcdef"， "abefcd"，"cdabef"， "cdefab"，"efabcd"， 和 "efcdab" 都是串联子串。 "acdbef" 不是串联子串，因为他不是任何 words 排列的连接。
     * <p>
     * 返回所有串联子串在 s 中的开始索引。你可以以 任意顺序 返回答案。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
     * 输出：[0,9]
     * 解释：因为 words.length == 2 同时 words[i].length == 3，连接的子字符串的长度必须为 6。
     * 子串 "barfoo" 开始位置是 0。它是 words 中以 ["bar","foo"] 顺序排列的连接。
     * 子串 "foobar" 开始位置是 9。它是 words 中以 ["foo","bar"] 顺序排列的连接。
     * 输出顺序无关紧要。返回 [9,0] 也是可以的。
     * <p>
     * 示例 2：
     * <p>
     * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
     * 输出：[]
     * 解释：因为 words.length == 4 并且 words[i].length == 4，所以串联子串的长度必须为 16。
     * s 中没有子串长度为 16 并且等于 words 的任何顺序排列的连接。
     * 所以我们返回一个空数组。
     * <p>
     * 示例 3：
     * <p>
     * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
     * 输出：[6,9,12]
     * 解释：因为 words.length == 3 并且 words[i].length == 3，所以串联子串的长度必须为 9。
     * 子串 "foobarthe" 开始位置是 6。它是 words 中以 ["foo","bar","the"] 顺序排列的连接。
     * 子串 "barthefoo" 开始位置是 9。它是 words 中以 ["bar","the","foo"] 顺序排列的连接。
     * 子串 "thefoobar" 开始位置是 12。它是 words 中以 ["the","foo","bar"] 顺序排列的连接。
     */
    public List<Integer> findSubstring(String s, String[] words) {

        return null;
    }

}
