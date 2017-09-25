package info.prodesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	
	public static void main(String[] args) throws IOException 
	{
		//reading data from console using bufferedreader class
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//prompt for taking name
		System.out.println("Enter student name:");
		//reading data from console
		String name=br.readLine();
		//prompt for taking id
		System.out.println("Enter student id:");
		//reading data from console
		String id=br.readLine();
		//print name and id
		System.out.println("name is:"+ " "+name+ "  "+"id is:"+ " "+id);
		
	}

}
