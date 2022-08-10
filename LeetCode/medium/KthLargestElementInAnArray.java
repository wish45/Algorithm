package LeetCode.medium;

public class KthLargestElementInAnArray {
    int nums[];
    int k;
    public void swap(int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int partition(int low,int high)
    {
        int piv=nums[high];
        int l=low,h=high-1;
        while(l<=h)
        {
            if(nums[l]<=piv) ++l;
            else {
                swap(l,h);
                --h;
            }
        }
        swap(h+1,high);
        return h+1;

    }
    public int quickselect(int low,int high)
    {
        int pi=partition(low,high);
        if(pi==k) return nums[pi];
        else if(pi>k) return quickselect(low,pi-1);
        else return quickselect(pi+1,high);
    }

    public int findKthLargest(int[] nums, int K) {
        this.nums=nums;
        this.k=nums.length-K;
        return   quickselect(0,nums.length-1);
    }
}
