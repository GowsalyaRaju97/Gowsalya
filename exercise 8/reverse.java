import java.util.Scanner;
public class GFG
{ 
     
    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
           
        while (start < end) 
        { 
            temp = arr[start];  
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        }  
    }      
       
    static void printArray(int arr[], int size) 
    { 
        for (int i = 0; i < size; i++) 
             System.out.print(arr[i] + " "); 
           
         System.out.println(); 
    }  
   
    public static void main(String args[]) { 
          
        Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of the array");
	int size = s.nextInt();

	int[] arr = new int[size]; 

	System.out.println("Enter the array");
	for(int i=0;i<size;i++){
        	arr[i] = s.nextInt(); 
	}

        printArray(arr, size); 
        rvereseArray(arr, 0, size-1); 

        System.out.print("Reversed array is \n"); 
        printArray(arr, size);  
         
    } 
} 