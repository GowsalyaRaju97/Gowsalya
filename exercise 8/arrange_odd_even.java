import java.util.* ; 
  
public class GFG 
{ 
  
    static void Rearrange(int arr[], int n)  
    {  
        Arrays.sort(arr) ; 
          
        Vector even = new Vector();   
        Vector odd = new Vector();   
      
        for (int i = 0; i < n; i++)  
            if (arr[i] % 2 == 0)  
                even.add(arr[i]);  
            else
                odd.add(arr[i]);  
      
        int index = 0, i = 0, j = 0;  
      
        boolean flag = false;  
       
        if (arr[0] % 2 == 0)  
            flag = true;  
        
        while (index < n)  
        {  
        
            if (flag == true)  
            {  
                arr[index] = (int)even.get(i);  
                i += 1 ; 
                index += 1 ; 
                flag = !flag;  
            }  
       
            else
            {  
                arr[index] = (int)odd.get(j) ;  
                j += 1 ; 
                index += 1 ; 
                flag = !flag;  
            }  
        }  
        
        for (i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    }  
       
    public static void main(String []args)  
    {  
        int arr[] = {1, 3, 2, 5, 4, 7, 10};  
        int n = arr.length ; 
      
        Rearrange(arr, n);  
    }  
} 
