package LeetCode.medium;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] ret = new int[length];

        for(int i =0 ; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(temperatures[i]<temperatures[j]){
                    ret[i] = j-i;
                    //i++;
                    break;
                }
            }
        }

        return ret;
    }
}
