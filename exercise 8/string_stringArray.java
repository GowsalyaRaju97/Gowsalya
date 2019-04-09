public class SortArray
{
    public static void main(String []args)
    {
        String str = "fguecbdavwyxzhijklmnopqrst";
	String[] strArr = {"geeksforgeeks", "is", "the", "best", "place", "for", "learning"};
	String output = "";

	for(int i = 0;i < str.length();i++)
	{
	    for(int j = 0;j < strArr.length;j++)
	    {
	     	if(str.charAt(i) == strArr[j].charAt(0))
		{
		    output = output + " " + strArr[j];
		}
		
	    }
	}
	System.out.println(output);
    }
}