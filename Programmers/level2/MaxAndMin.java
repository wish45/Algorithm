package level2;


import java.util.Arrays;

public class MaxAndMin {
    public static void main(String args[]){
        MaxAndMin asd = new MaxAndMin();
        String str = "-1 -4 -3 -2";
        System.out.println(asd.solution(str));
    }
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] strToInt = new int[str.length];
        int[] nums = Arrays.asList(str).stream().mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        answer = nums[0] + " " + nums[nums.length-1];
        return answer;
    }
}
