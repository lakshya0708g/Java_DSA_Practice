class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            int min = matrix[row][0];
            int column = 0;

            for (int col = 1; col < matrix[row].length; col++) {

                if (matrix[row][col] < min) {
                    min = matrix[row][col];
                    column = col;
                }
            }

            boolean Lucky = true;

            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][column] > min) {
                    Lucky = false;
                    break;
                }
            }

            if (Lucky) {
                list.add(min);
            }
        }

        return list;
    }
}