package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class LAMBDA_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		StringBuilder str=new StringBuilder();
		//UnaryOperator<String> unaryOperator=z->z.toUpperCase();
		list.add("piyush");
		list.add("iiyus");
		list.add("yiyu");
		list.add("uiy");
		list.add("si");
		list.add("h");
		list.forEach((x)->str.append(x.charAt(0)));
	
		System.out.println(str);
		

	}

}
