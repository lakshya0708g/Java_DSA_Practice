class Solution {
    public double average(int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = 0;
        for(int i = 0 ; i < salary.length ; i ++){
            if(max < salary[i]){
                max = salary[i];
            }
            if(min > salary[i]){
                min = salary[i];
            }

            sum = sum + salary[i];
        }

        double avg = (sum - (min + max)) / (salary.length - 2);
        return avg;
        
    }

}