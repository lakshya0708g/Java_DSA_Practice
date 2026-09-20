class Solution {
    public int reverseDegree(String s) {
        s = s.toLowerCase();
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++  ) {
            char ch = s.charAt(i);
            int val = 'z' - ch + 1 ;
            ans = ans + ((i+1) * val);
        }
        return ans;
    }
    
}