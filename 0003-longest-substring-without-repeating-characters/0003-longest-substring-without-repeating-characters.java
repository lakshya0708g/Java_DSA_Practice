class Solution {
    public int lengthOfLongestSubstring(String s) {

        String current = "";
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (current.indexOf(ch) != -1) {
                current = current.substring(current.indexOf(ch) + 1);
            }

            current += ch;

            ans = Math.max(ans, current.length());
        }

        return ans;
    }
}