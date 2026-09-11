class Solution {
    public boolean halvesAreAlike(String s) {
        String a = "";
        String b = "";

        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            a = a + s.charAt(start);
            start++;

            b = b + s.charAt(end);
            end--;
        }

        if(vowelscount(a) == vowelscount(b)){
            return true;
        }

        return false;
    }

    int vowelscount(String str){
        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        str = str.toLowerCase();
        int count = 0 ;

        for(int i = 0; i < str.length() ; i++){
            if(list.contains(str.charAt(i))){
                count++;
            }
        }

        return count;

    }

}