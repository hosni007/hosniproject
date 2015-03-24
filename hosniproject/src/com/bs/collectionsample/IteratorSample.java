



package com.bs.collectionsample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("praveen");
		al.add("philip");
		al.add("elouafi");
		
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			System.out.println((String)it.next());
		}
		
		System.out.println("Reading based on on index");
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}

