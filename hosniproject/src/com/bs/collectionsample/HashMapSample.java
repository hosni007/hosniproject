

package com.bs.collectionsample;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {
	
	public static void main(String[] args) {
		HashMap<String, String> hm= new HashMap <String, String>();
		hm.put("praveen", "praveen@bss.com");
		hm.put("aruna", "aruna@bss.com");
		hm.put("hosni", "hosni@bss.com");
		
		Set <Entry<String, String>> es=hm.entrySet();
		
		Iterator<Entry<String, String>> it= es.iterator();
		while(it.hasNext())
		{
			Entry<String, String> et= it.next();
			System.out.println("Key is "+et.getKey()+" and vlaue is "+et.getValue());
		}
		
	}

}

