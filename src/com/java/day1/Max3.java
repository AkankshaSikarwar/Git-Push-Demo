package com.java.day1;

public class Max3 {
	public void check(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		int a=5, b=7, c=3;
		
		Max3 obj = new Max3();
		obj.check(a, b, c);
		
		int x = 'A';
		System.out.println(x);
	}
}
