package com.cg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> hm = new HashMap<String, Double>();
		hm.put("John", new Double(3423.3));
		hm.put("Tom", new Double(-34));
		hm.put("Tim", new Double(700));
		hm.put("Jack", new Double(10000));
		hm.put("Romeo", new Double(80000));
		
		Set set= hm.entrySet(); // get a set of entries
		
		Iterator iterator = set.iterator(); // get an iterator
		
		while(iterator.hasNext()) {
			Map.Entry m = (Entry) iterator.next();
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		double balance = hm.get("Tom");
		System.out.println(balance);
		//double balance = (double) ((Entry) hm).getValue();
		
	}

}
