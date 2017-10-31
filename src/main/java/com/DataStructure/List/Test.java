package com.DataStructure.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String[] array1={"马超","马云","关羽","刘备","张飞","马云"};
		Set<String> arrayList=new HashSet<String>(Arrays.asList(array1));
		List<String> arrayList2=(List<String>) Arrays.asList(array1);
		System.out.println(arrayList);
		Arrays.sort(array1);
		for(String s:array1){
			System.out.print(s+",");
		}
	}
	
}
