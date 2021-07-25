package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LAMBDA_6 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		//UnaryOperator<String> unaryOperator=z->z.toUpperCase();
		list.add("piyush");
		list.add("piyus");
		list.add("piyu");
		list.add("piy");
		list.add("pi");
		list.replaceAll((x)-> x.toUpperCase());
		System.out.println(list);
		//list.forEach(System.out::println);

	}

}
