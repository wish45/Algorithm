package level1;

import java.util.HashSet;
import java.util.Set;

public class Pocketmon {
    /**
     * [해시] 폰켓몬
     * 포켓몬의 종류와 갯수가 담긴 int형 배열이 주어진다
     * 배열의/2 갯수만큼 최대한 많은 종류의 포켓몬을 선택해야 한다.
     * 최대한 많은 갯수의 포켓몬을 고르는 값을 리턴하라
     *
     * */
    public static void main(String args[]){
        Pocketmon asd = new Pocketmon();
        //int[] num = new int[]{3,1,2,3};
        //int[] num = new int[]{3,3,3,2,2,4};
        int[] num = new int[]{3,3,3,2,2,2};

        System.out.println(asd.solution(num));
    }
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length/2;

        //Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size()>len){
            answer = len;
        }else{
            answer = set.size();
        }


        return answer;
    }
}
