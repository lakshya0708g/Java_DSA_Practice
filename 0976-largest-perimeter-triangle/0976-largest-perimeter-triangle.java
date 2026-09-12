class Solution {
    public int largestPerimeter(int[] nums) {
        selectionSort(nums);

        for(int i = nums.length - 1; i >= 2; i--) {
            if(nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }

    void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {

            int maxIndex = 0;

            for(int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int correctIndex = arr.length - i - 1;

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[correctIndex];
            arr[correctIndex] = temp;
        }
    }
}