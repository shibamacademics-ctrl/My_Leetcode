import java.util.*;
public class LargestRectangleInHistogram {
    public static int calculateArea(int heights[]){
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int right[] = new int[n];
        int left[] = new int[n];
        //Right smaller nearest element
        for(int i = n-1;i>=0;i--){
            while(s.size()>0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            right[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        s.clear();
        //Left smaller nearest element
        for(int i = 0;i<n;i++){
            while(s.size()>0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }

            left[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        int maxArea = 0;
        for(int i = 0;i<n;i++){
            int area = heights[i] * (right[i] - left[i] - 1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int heights [] = {2,1,5,6,2,3};
        System.out.println("Largest Rectangle is: "+calculateArea(heights));
    }
}
