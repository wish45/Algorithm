package LeetCode.Easy;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
       /* O(N^2) 시간복잡도
       for(int pivot=0; pivot<nums.length; pivot++){
            int Lsum = 0;
            int Rsum = 0;

            for(int L=0; L<pivot; L++){
                Lsum += nums[L];
            }
            for(int R =pivot+1; R<nums.length;R++){
                Rsum += nums[R];
            }

            if(Lsum==Rsum){
                return pivot;
            }

        }
        return -1;*/

        /*O(n) 시간복잡도 */
        int total = 0;
        int Lsum = 0;
        int Lpast = 0;

        for(int i=0; i<nums.length; i++){
            total+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            total = total - nums[i];
            Lsum = Lsum + Lpast;
            if(Lsum == total){
                return i;
            }
            Lpast = nums[i];
        }
        return -1;
    }
}

