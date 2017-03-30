package com.dinesh.Corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1,"Abhinandhan");
		hmap.put(3,  "Anisha");
		hmap.put(24, "Dinesh");
		hmap.put(2,"Tirupati");
		
		
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			boolean ba = hmap.isEmpty();
			System.out.println(ba);
			Map.Entry me = (Map.Entry)it.next();
			System.out.println("The key is:"+me.getKey()+"\t The value is:"+ me.getValue());
			}
		hmap.remove(2);
		
		Iterator it2 = set.iterator();
		while(it2.hasNext()){
			Map.Entry me2 = (Map.Entry)it2.next();
			System.out.println("The key is:"+me2.getKey()+"\t The value is:"+ me2.getValue());	
		}
		
		

}
}