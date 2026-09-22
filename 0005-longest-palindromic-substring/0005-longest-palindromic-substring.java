// DSA optimised approch

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        int start = 0;
        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > max) {
                max = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + max);
    }

    int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}

//brutforce approch

// class Solution {
//     public String longestPalindrome(String s) {
//         int max = 0;
//         String ans = "";

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) {
//                 String str = s.substring(i, j);

//                 if (isPalindrome(str)) {
//                     if (str.length() > max) {
//                         max = str.length();
//                         ans = str;
//                     }
//                 }
//             }
//         }

//         return ans;
//     }

//     boolean isPalindrome(String str) {
//         int start = 0;
//         int end = str.length() - 1;

//         while (start <= end) {
//             if (str.charAt(start) == str.charAt(end)) {
//                 start++;
//                 end--;
//             } else {
//                 return false;
//             }
//         }

//         return true;
//     }
// }