package cgi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeLists {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list2.add(3);
		list2.add(4);
		list1.addAll(list2);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(" ");
		System.out.println(list1);
		
	}

}
