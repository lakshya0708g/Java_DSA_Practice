class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;

        List<Integer> rm = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int rmin = Integer.MAX_VALUE;
            for(int j = 0; j < M; j++){
                rmin = Math.min(rmin, matrix[i][j]);
            }
            rm.add(rmin);
        }

        List<Integer> cmx = new ArrayList<>();
        for(int j = 0; j < M; j++){
            int cmax = Integer.MIN_VALUE;
            for(int i = 0; i < N; i++){
                cmax = Math.max(cmax, matrix[i][j]);
            }
            cmx.add(cmax);
        }

        List<Integer> lucky = new ArrayList<>();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(matrix[i][j] == rm.get(i) && matrix[i][j] == cmx.get(j)){
                    lucky.add(matrix[i][j]);
                }
            }
        }

        return lucky;
    }
}