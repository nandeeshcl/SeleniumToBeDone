package day10;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapWIthList {

	public static void main(String[] args) {
		
		HashMap<String,List<String> > map=new HashMap<String,List<String>>();
		
		List<String> list =new ArrayList<String> ();
		
		list.add("appu@gmail.com");
		list.add("shivu@gmail.com");
		
		map.put("email",list);
		
		//System.out.println(map);
		
		Set<String> set = map.keySet();

		for (Object obj : set) {
			System.out.println(obj + "  " + map.get(obj));
		}

		

	}

}
