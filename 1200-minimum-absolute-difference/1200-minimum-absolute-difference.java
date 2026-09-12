class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minabsdiff = Integer.MAX_VALUE;

        for(int i = 1 ; i < arr.length ; i++){
            minabsdiff = Math.min(minabsdiff , Math.abs(arr[i] - arr[i-1]));
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int j = 1; j < arr.length ; j++){
            if(arr[j] - arr[j - 1] == minabsdiff){
                ans.add(Arrays.asList(arr[j - 1], arr[j]));
            }
        }

        return ans;
    }
}