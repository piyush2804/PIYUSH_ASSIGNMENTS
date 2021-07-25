package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LAMBDA_4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("piyush");
		list.add("piyushk");
		list.add("hi");
		list.add("iam");
		list.add("here");
		list.removeIf((x)->x.length()%2!=0);
		System.out.print(list);
		
		
	}

}
