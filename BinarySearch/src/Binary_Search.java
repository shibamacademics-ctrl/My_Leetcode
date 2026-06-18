class Binary_Search{
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }

            else if(target<nums[mid]){
                right = mid-1;
            }

            else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int ar[] = {23,45,67,89,90,100};
        int target = 89;

        System.out.println("Target found at "+search(ar,target)+" index");
    }

}