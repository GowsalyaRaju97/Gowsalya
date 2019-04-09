public class FindSmallestLargest
{
	public static void findLargestAndSmallest(int[] numbers)
	{
		int smallestNumber = numbers[0];
		int largestNumber = numbers[0];
		
		for(int i=0; i < numbers.length; i++)
		{
			if(numbers[i] > largestNumber){
				largestNumber = numbers[i];
			}
			else if(numbers[i] < smallestNumber)
			{
				smallestNumber = numbers[i];
			}
		}
		System.out.println(smallestNumber + " is the Smallest Number ");
		System.out.println(largestNumber + " is the Largest Number ");
	}
 
	public static void main(String[] args){
 
		int[] Numbers = {50,32,4,9,17,21,3};
 
		findLargestAndSmallest(Numbers);
	}
}