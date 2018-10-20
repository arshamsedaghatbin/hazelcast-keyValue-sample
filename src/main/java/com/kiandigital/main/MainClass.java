package com.kiandigital.main;

import java.util.Map;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class MainClass {
	public static void main(String[] args) {
		HazelcastInstance hz = Hazelcast.newHazelcastInstance();
		IMap<String, String> capitals = hz.getMap("capitals");
		//Map<String, String> capitals = hz.getMap("capitals");
		 if(capitals.containsKey("AU"))
		    {
			    capitals.put("NY", "NeyYork");
		
		    }
	    capitals.put("GB", "London");
	    capitals.put("FR", "Paris");
	    capitals.put("US", "Washington DC");
	    capitals.put("AU", "Canberra");
	    
	   
	    
	    System.out.println("Known capital cities: " + capitals.size());

//		Set<String> persons = hz.getSet("persons");
//		persons.addAll(employees.values());
//		persons.add("tom");
//		persons.add("john");
//		persons.add("jobin");
//
//
//		List<String> countries = hz.getList("persons");
//		persons.addAll(employees.keySet());
//		persons.add("tom");
//		persons.add("john");
//		persons.add("tom"); // duplicate entry
//		BlockingQueue<String> arrivals = hz.getQueue("arrivals");
//
//		while (true) {
//			String arrival = arrivals.take();
//
//			System.err.println(
//					"New arrival from: " + arrival);
//		}



	}
}
