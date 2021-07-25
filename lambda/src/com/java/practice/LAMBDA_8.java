package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LAMBDA_8 {

	public static void main(String[] args) {
	
		List<Integer> mylist= new ArrayList<>();
		mylist.add(10);
		mylist.add(12);
		mylist.add(15);
		mylist.add(16);
		mylist.add(18);
		//mylist.forEach(x-> System.out.println(x));
//		Collections.sort(mylist, (x,y)-> x.compareTo(y));
//		System.out.println(mylist);
		Thread lambdathread=new Thread(()-> mylist.forEach(x->System.out.println(x)));
		lambdathread.run();
		
		//print(mylist,(x)->true, (x)->System.out.println(x));

	}
	public static void print(List<Integer> list, Predicate<Integer> predicate, Consumer<Integer> consumer)
	{
		for (Integer x:list)
		{
			if(predicate.test(x))
			{
				consumer.accept(x);
			}
		}
	}

}
