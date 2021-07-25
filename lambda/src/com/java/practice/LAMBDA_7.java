package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LAMBDA_7 {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		StringBuilder str=new StringBuilder();
		map.put("1", "piyush");
		map.put("2", "piyus");
		map.put("3", "piyu");
		map.put("4", "piy");
		map.put("5", "pi");
		//System.out.println(map.entrySet());4
		
		Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			str.append(it.next());
		}
		System.out.println(str);
		
		

	}

}
