package info.prodesign;

public class MyString {

	
	public static void main(String[] args) 
	{
		String s="raj";
		String s1="bhai";
		String s3=new String("bhai");
		System.out.println(s3);
		if(s.equals(s3))
		{
			System.out.println("s  and s3 are same");
		}
		else
		{
			System.out.println("s and s3 are not same");
		}
		if(s1.equals(s3))
		{
			System.out.println("s1 and s3 are same");
		}
		else
		{
			System.out.println("s1 and s3 are not same");
		}
		
		
	}

}
