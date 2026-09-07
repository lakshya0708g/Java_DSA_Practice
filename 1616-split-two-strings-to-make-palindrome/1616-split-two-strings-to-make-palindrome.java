class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    boolean check(String a, String b) {
        int start = 0;
        int end = a.length() - 1;

        while (start < end && a.charAt(start) == b.charAt(end)) {
            start++;
            end--;
        }

        return palindrome(a, start, end) || palindrome(b, start, end);
    }

    boolean palindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}