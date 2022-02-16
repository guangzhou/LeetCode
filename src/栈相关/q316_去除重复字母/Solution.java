package ջ���.q316_ȥ���ظ���ĸ;

import java.util.Stack;

/**
 * ջ���� o(n*log(n))
 *
 * ����һ���ַ��� s ������ȥ���ַ������ظ�����ĸ��ʹ��ÿ����ĸֻ����һ�Ρ��豣֤ ���ؽ�����ֵ�����С��Ҫ���ܴ��������ַ������λ�ã���
 *
 *
 *
 * ʾ�� 1��
 *
 * ���룺s = "bcabc"
 * �����"abc"
 * ʾ�� 2��
 *
 * ���룺s = "cbacdcbc"
 * �����"acdb"
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/remove-duplicate-letters
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 */
public class Solution {

    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(c);
        }
        String rs = "";
        for (int i = 0; i < stack.size(); i++) {
            rs += stack.get(i);
        }
        return rs;
    }
}
