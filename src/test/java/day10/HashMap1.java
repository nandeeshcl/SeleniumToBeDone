package day10;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		Hashtable<String, String> map = new Hashtable<String, String>();

		map.put("sivu@gmail.com", "sivu123");
		map.put("appu@gmail.com", "appu123");
		

		// System.out.println(map);

		// System.out.println(map.size());

		Set<String> set = map.keySet();

		for (Object obj : set) {
			System.out.println(obj + "  " + map.get(obj));
		}

	}

}
