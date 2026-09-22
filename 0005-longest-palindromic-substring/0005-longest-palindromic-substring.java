class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);

                if (isPalindrome(str)) {
                    if (str.length() > max) {
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }

        return ans;
    }

    boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}