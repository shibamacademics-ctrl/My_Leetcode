public class SearchInRotated {
    public static int search(int ar[],int target){
        int low = 0;
        int high = ar.length - 1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(ar[mid]==target){
                return mid;
            }
            else if(ar[low]<=ar[mid]){
                if(ar[low]<=target && target<=ar[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(ar[mid]<=target && target<=ar[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int ar[] = {7,8,1,2,3,4,5,6};
        int x = 1;
        System.out.println("Element found at index: "+search(ar,x));

    }

}
