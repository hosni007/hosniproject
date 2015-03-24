







	
	package com.bs.collectionsample;

	import java.util.*;

	public class SetExample {
		
		public static void main(String[] args) {
			HashSet hs = new HashSet();
			hs.add(23);
			hs.add(12);
			hs.add(76);
			hs.add(14);
			hs.add(9);
			hs.add(46);
			hs.add(76);
		//	hs.add("praveen");
			hs.add(888);
		
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Integer x=(Integer) hs.iterator().next();
		System.out.println("HashSet "+hs);
		//hs.add("abcd");
		System.out.println("HashSet "+hs);

		TreeSet dts= new TreeSet(hs); // We are buidling tree set based on values of HS to avoid repeated sorting process.
		System.out.println("Sorted set from HS "+dts);
		
		TreeSet ts = new TreeSet();
		ts.add(23);
		ts.add(12);
		ts.add(76);
		ts.add(14);
		ts.add(9);
		ts.add(46);
		ts.add(76);


	System.out.println("Tree Set"+ts);
		
	TreeSet tsn= new TreeSet();
	tsn.add("praveen");
	tsn.add("mahesh");
	tsn.add("aruna");
	System.out.println("Tree Set"+tsn);


	ArrayList al= new ArrayList<>();
	al.get(4);
	Iterator itl=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	HashMap hm = new HashMap();

		}

	}


