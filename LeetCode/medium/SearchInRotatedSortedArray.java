package LeetCode.medium;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0;
        int r =nums.length-1;


        while(l<=r){
            int mid = (l+r)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[mid]<=nums[r]){ //우정렬
                if(target>nums[mid] && target<=nums[r]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }else{//좌정렬
                if(target<nums[mid] && nums[l]<=target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }
        }
        return -1;
    }
}

