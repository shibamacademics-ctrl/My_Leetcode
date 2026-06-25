import java.util.*;
public class KthSmallest {
    public static int smallest(int ar[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : ar){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }

    public static void main(String args[]){
        int ar[] = {7,10,3,4,20,13};
        int k  = 3;

        System.out.println("Kth Smallest Element is: "+smallest(ar,k));
    }

}
