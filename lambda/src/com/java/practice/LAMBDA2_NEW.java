package com.java.practice;

import java.util.Arrays;
import java.util.List;
public class LAMBDA2_NEW {

public static void main(String []args)
{
	List<ORDERS_2> order=Arrays.asList(
			new ORDERS_2("chocolate",10000,"COMPLETED"),
			new ORDERS_2("chocole",1000,"COMPLETED"),
			new ORDERS_2("choco",100,"nCOMPLETED"),
			new ORDERS_2("late",10000,"ACCEPTED"),
			new ORDERS_2("oolate",10,"COMPLETED"));
	p object = (x)-> {
		if(x.getPrice()>=10000||x.getStatus().equals("COMPLETED")||x.getStatus().equals("ACCEPTED"))
		System.out.println(x);
	};
//		object.criteria(order.get(0));
//		object.criteria(order.get(1));
//		object.criteria(order.get(2));
//		object.criteria(order.get(3));
//		object.criteria(order.get(4));
}
}
