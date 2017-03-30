package com.dinesh.Corejava;

import java.util.*;

public class HS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable hs = new Hashtable();

		hs.put(324, "dinesh");
		hs.put(316, "Sati");
		hs.put(325, "Vinay");
		hs.put(333, "Anji");

		Set set = hs.entrySet();
		Iterator i = set.iterator();

		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + "\t" + me.getValue());
		}
		

	}
}
