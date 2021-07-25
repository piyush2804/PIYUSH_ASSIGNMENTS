package com.java.practice;

public class LAMBDA2 {



	public static void main(String[] args) {
		ORDERS_2 obj1=new ORDERS_2("chocolate",10000,"COMPLETED");
		ORDERS_2 obj2=new ORDERS_2("chocolate",9000,"COMPLETED");
		ORDERS_2 obj3=new ORDERS_2("chocolate",9000,"nCOMPLETED");
		p object = (x)-> {
			if(x.getPrice()>=10000||x.getStatus().equals("COMPLETED")||x.getStatus().equals("ACCEPTED"))
			System.out.println(x);
		};
		
		object.criteria(obj1);
		object.criteria(obj2);
		object.criteria(obj3);

	}

}
@FunctionalInterface
interface p
{
	void criteria(ORDERS_2 x);
}