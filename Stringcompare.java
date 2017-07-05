
public class Stringcompare {
	public static void main(String args[])
	
	{
		String str1="abc";
		String str2="abc";
		String str3=new String("abc");
		if(str1==str2)
		{
		System.out.println("both are equal");
		}
		else
		{
			System.out.println("1 & 2 are not equal");
		}
		if(str1==str3)
		{
	    System.out.println("1 & 3 are equal");
		}
		else
		{
			System.out.println("1 & 3 are not equal");
		}
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
