import java.util.*; 
  
public class TreeSetDemo { 

    public static void closestSmaller(int[] arr) 
    { 
        TreeSet<Integer> ts = new TreeSet<Integer>(); 
        for (int i = 0; i < arr.length; i++) 
            ts.add(arr[i]); 
  
        for (int i = 0; i < arr.length; i++) { 
            int smaller = ts.lower(arr[i]); 
            if (smaller == null) 
                System.out.print(-1 + " "); 
            else
                System.out.print(smaller + " "); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int[] arr = { 10, 5, 11, 6, 20, 12 }; 

        closestSmaller(arr); 
    } 
} 