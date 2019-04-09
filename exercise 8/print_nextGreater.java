public class Main 
{  
    static void printNGE(int arr[], int n) 
    { 
        int next, i, j; 
        
        System.out.println("Output");
        for (i=0; i<n; i++) 
        { 
            next = -1; 
            for (j = i+1; j<n; j++) 
            { 
                if (arr[i] < arr[j]) 
                { 
                    next = arr[j]; 
                    break; 
                } 
            } 
            System.out.println(next + " "); 
        } 
    } 
       
    public static void main(String args[]) 
    { 
        int arr[]= {5, 6, 3, 49}; 
        int n = arr.length; 

	System.out.println("Input");
	for(int i = 0; i < n; i++)
	{
		System.out.println(arr[i] + " ");
	}
	System.out.println();

        printNGE(arr, n); 
    } 
} 
