package com.hcl.July25;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Map is not part of collections
		
		Map<Integer, String> map = new HashMap<>();
		
        map.put(121, "Brandon");
        map.put(122, "Rachid");
        map.put(123, "Vijaya");
        map.put(124, "Gaurav");
        map.put(125, "Claudio");
        
        System.out.println(map);
        System.out.println(map.get(123));
        System.out.println(map.containsKey(122));
        System.out.println(map.containsValue("Claudi"));
        map.put(124, "Blaise");
        System.out.println(map);
        map.replace(123, "Chris");
        System.out.println(map);
        map.putIfAbsent(126, "Ajay");
        System.out.println(map);
        
	}

}
