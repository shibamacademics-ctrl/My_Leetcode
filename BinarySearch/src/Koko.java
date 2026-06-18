public class Koko {
    public static long calctotalhours(int ar[],int hours){
        long total = 0;
        int n = ar.length;
        for(int i = 0;i<n;i++){
            total+=(long)Math.ceil((double)ar[i]/hours);
        }
        return total;
    }
    public static int MinEats(int ar[],int h){
        int low = 1;
        int high = 0;
        for(int ele : ar){
            if(ele>high){
                high = ele;
            }
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            long totalh = calctotalhours(ar,mid);
            if(totalh<=h){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }


    public static void main(String args[]){
        int piles []= {30,11,23,4,20};
        int h = 5;
        int res = MinEats(piles,h);
        System.out.println("Minimum she can eats: "+res);
    }

}
