class Solution {
    public int minimumLength(String s) {
        int pre = 0;
        int suf = s.length() - 1;

        while (pre < suf && s.charAt(pre) == s.charAt(suf)) {
            char ch = s.charAt(pre);

            while (pre <= suf && s.charAt(pre) == ch) {
                pre++;
            }

            while (pre <= suf && s.charAt(suf) == ch) {
                suf--;
            }
        }

        return suf - pre + 1;
    }
}