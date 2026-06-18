public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);

        int low = 0,high = n1,left = (n1+n2+1)/2;
        int n = n1 + n2;
        while(low<=high){
            int mid1 = low+(high-low)/2;
            int mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];
            if(mid1 - 1>=0) l1 = nums1[mid1 - 1];
            if(mid2 - 1>=0) l2 = nums2[mid2 - 1];

            if(l1<=r2 && l2<=r1){
                if(n%2==1) return Math.max(l1,l2);
                return((double)Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0;*/
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, k = 0;
        int []a = new int[n+m];
        while (i<n && j <m){
            if(nums1[i]<nums2[j]){
                a[k++] = nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                a[k++] = nums2[j];
                j++;
            }
            else{
                a[k++] = nums1[i];
                a[k++] = nums2[j];
                i++;
                j++;
            }
        }
        while(i<n) a[k++] = nums1[i++];
        while(j<m) a[k++] = nums2[j++];
        double r;
        if(k%2 == 0) r = (double)(a[k/2]+a[(k/2)-1])/2;
        else r = a[k/2];
        return r;
    }
    public static void main(String args[]){
        int ar1[] = {7,8,9,14};
        int ar2[] = {1,2,3,4,5,6,15};
        System.out.println("Median of two sorted array is: "+findMedianSortedArrays(ar1,ar2));
    }
}

