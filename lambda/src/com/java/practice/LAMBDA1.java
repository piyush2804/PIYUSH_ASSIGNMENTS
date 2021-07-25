package com.java.practice;

public class LAMBDA1 {

	public static void main(String []args) {

		xyz object=(x,y,z)->{ if(z.equals("add"))
		{
			System.out.println("addition:"+(x+y));
		}
		else if(z.equals("mul"))
		{
			System.out.println("mul:"+(x*y));
		}
		else if(z.equals("divide"))
		{
			System.out.println("divide:"+(x/y));
		}
		else
		{
			System.out.println("sub:"+(x-y));
		}
		};
		
		object.arithmetic(4,7,"add");
		object.arithmetic(4,7,"mul");
		object.arithmetic(4,2,"divide");
		object.arithmetic(4,7,"subtract");
	}
}
@FunctionalInterface
interface xyz
{
	void arithmetic(int x,int y,String z);
}