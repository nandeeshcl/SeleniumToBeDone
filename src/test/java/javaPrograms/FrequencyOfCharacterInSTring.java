package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterInSTring {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char ch[]=s.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		
		System.out.println(map);

	}

}
