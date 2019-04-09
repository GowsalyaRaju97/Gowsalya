public class MakeAllElementsSame  
{   
    static boolean EqualNumbers(int a[], int n) 
    { 
        int two = 0, three  = 0;
        for (int i = 0; i < n; i++)  
        { 
   
            while (a[i] % 2 == 0)  
            { 
                a[i] /= 2; 
                two++;
            }
  
            while (a[i] % 3 == 0) 
            { 
                a[i] /= 3; 
                three++;
            } 
        } 
        
        if(two % 2 == 0)
        {
            two /= 2;
        }
        else
        {
            two /= 2;
            two++;
        }
        
        if(three % 2 == 0)
        {
            three /= 2;
        }
        else
        {
            three /= 2;
            three++;
        }
  
        
        for (int i = 1; i < n; i++)  
        { 
            if (a[i] != a[0]) 
            { 
                return false; 
            } 
        } 
        
        for(int i = 0; i < n; i++)
        {
            a[i] = a[i] * (2 * two) * (3 * three);
            System.out.print(a[i] + " ");
        }
  
        return true; 
    } 
    
    public static void main(String[] args)  
    { 
        int a[] = {50, 75, 100}; 
  
        int n = a.length; 
  
        if (EqualNumbers(a, n))  
        { 
            System.out.println("Yes"); 
  	}  
        else 
        { 
            System.out.println("No"); 
        } 
    } 
}  
 