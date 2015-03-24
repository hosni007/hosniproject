



package com.bs.collectionsample;
import java.util.*;
public class ListExample {


public static void main(String[] args) {
ArrayList <Integer> al= new ArrayList<Integer>();


al.add(12);
//al.add("praveen"); // It is not allowed as we made AL for INtegers only


Integer a= al.get(0);
System.out.println(a);


LinkedList ll = new LinkedList();
ll.add(2);
ll.add(1);
ll.add(5);
System.out.println(ll);
ll.add(0,3);
System.out.println(ll);

HashMap hm= new HashMap();
HashMap<Integer, String> shm= new HashMap<Integer, String>();


shm.put(3, "praveen");
shm.put(11, "mahesh");
shm.put(5, "philip");
shm.put(22,"hosni");
shm.put(19, "aruna");


System.out.println(shm);


TreeMap<Integer, String> tm = new TreeMap<Integer, String>(shm);
System.out.println(tm);


System.out.println(shm.get(5));
System.out.println(tm.get(22));
}

}


