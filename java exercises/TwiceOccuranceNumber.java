import java.util.Scanner;
public class TwiceOccuranceNumber  
{ 
    static void printRepeating(int arr[], int size)  
    { 
        int i, j; 
        System.out.println("Repeated Elements are :"); 

        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    public static void main(String[] args)  
    { 
	Scanner s = new Scanner(System.in);

	System.out.println("Enter the size of the array");
	int size = s.nextInt();

	int[] arr = new int[size]; 

	System.out.println("Enter the array");
	for(int i=0;i<size;i++){
        	arr[i] = s.nextInt(); 
	}

        printRepeating(arr, size); 
    } 
} 