package ��̬�滮.q5_������Ӵ�.f1;

/**
 * o(n^2) ��ÿ���ַ�Ϊ���ļ�����ĳ���
 */
class Solution {

    public String getPalindrome(String s, int index) {
        String rs = "";
        int sLen = s.length();
        int i = index;
        int j = index;
        while (j < sLen) {
            if (s.charAt(j) == s.charAt(index)) {
                rs = rs + s.charAt(j);
                j++;
            } else {
                break;
            }
        }
        i--;
        while (i >= 0 && j < sLen) {
            if (s.charAt(i) == s.charAt(j)) {
                rs = s.charAt(i) + rs;
                rs = rs + s.charAt(i);
                i--;
                j++;
            } else {
                break;
            }
        }
        return rs;
    }

    public String longestPalindrome(String s) {
        int maxLen = -1;
        String rs = "";
        for (int i = 0; i < s.length(); i++) {
            String t = getPalindrome(s, i);
            if (t.length() > maxLen) {
                maxLen = t.length();
                rs = t;
            }
        }
        return rs;
    }
}
