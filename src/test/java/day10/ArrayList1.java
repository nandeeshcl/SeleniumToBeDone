package day10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Shivu");
		list.add("Raghu");
		list.add("Puni");

		// System.out.println(list); //print all elements

		System.out.println("Size of an array list is: " + list.size());

		System.out.println("Array list contains");
		for (Object obj : list) {
			System.out.println(obj);
		}

		System.out.println("--------------------------");

		list.remove(0);
		list.add("Shivu");
		list.add("Shivu");

		System.out.println("Size of an array list is: " + list.size());

		Iterator it = list.iterator();

		System.out.println("Array list contains");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
