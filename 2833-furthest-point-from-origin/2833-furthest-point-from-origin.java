class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int remain = 0;

        for(int i = 0; i < moves.length() ; i++){
            if(moves.charAt(i) == 'L'){
                countL++;
            }
            if(moves.charAt(i) == 'R'){
                countR++;
            }
        }

        remain = moves.length() - countL - countR;
        int ans = countR - countL;

        if(countL > countR){
            ans -= remain; 
        }
        else {
            ans += remain;
        }

        return Math.abs(ans);
    }
}