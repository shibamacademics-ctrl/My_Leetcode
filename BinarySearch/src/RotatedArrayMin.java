public class RotatedArrayMin {
    public static int findminimum(int ar[]){
        int low = 0;
        int high = ar.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(ar[low]<=ar[mid]){
                ans = Math.min(ans,ar[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans,ar[mid]);
                high = mid -1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int ar[] = {7,8,1,2,3,4,5,6};
        System.out.println("Minimum in the rotated array is(Using BinarySearch): "+findminimum(ar));
    }

}
