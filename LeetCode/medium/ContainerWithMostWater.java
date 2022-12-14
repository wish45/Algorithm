package LeetCode.medium;

class ContainerWithMostWater {
    public static void main(String args[]){
        ContainerWithMostWater asd = new ContainerWithMostWater();
        int[] num = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(asd.maxArea(num));
    }
    public int maxArea(int[] height) {
        int maxValue = 0;

        for(int i = 0; i<height.length-1; i++){
            for(int j = i+1; j<height.length; j++){
                int area = Math.min(height[i],height[j])*(j-i);
                maxValue = Math.max(maxValue,area);
            }
        }
        return maxValue;                            
    }
}

