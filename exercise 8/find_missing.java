public class Main 
{  
    static int getMissingNo(int a[]) 
    { 
        int n = a.length; 
        for (int i = 0; i < n; i++)
	{         
            if (a[i] != (i+1)) 
                return (i+1);
	} 
  
        return n+1; 
    } 
        
    public static void main(String args[]) 
    { 
        int a[] = new int[100]; 

	for(int i = 0; i < 100; i++)
	{
		a[i] = i+1;
	}
    a[25] = 15;
        System.out.println("The missing number is " + getMissingNo(a)); 
    } 
} 