package com.javaLoops;

public class Example2 {

	public static void main(String[] args) {
		
		int studentAges[] = {10, 20, 19, 21, 17, 18};
		
		for(int i = 0; i < studentAges.length; i++)
		{
			if(studentAges[i] >= 18)
			{
				System.out.println("the person is major, bcz age is "+studentAges[i]);
			}	
			else
			{
				System.out.println("the person is minor, bcz age is "+studentAges[i]);
				
			}
			
		}
		
	}

}
