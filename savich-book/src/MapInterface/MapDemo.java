package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String , String> languages = new HashMap<>();if(languages.containsKey("Java")){
			System.out.println("Java is already in the map");
		}else {
			
			languages.put("Java","a compiled high leve, object-oriented , platform independant langauage");
			System.out.println("Java is added");
		}
		languages.put("Java","a compiled high leve, object-oriented , platform independant langauage");
		languages.put("Python", "an interperted , object-oriented , high-level programming  ");
		System.out.println(languages.put("Algol","an algorithmic language"));
		languages.put("BASIC","Beginning All Purpose Symbolic Instructions Code");
		System.out.println(languages.get("Java"));
		System.out.println(languages.put("Java","This course is about java"));
		System.out.println(languages.get("Java"));
		if(languages.containsKey("Java")){
			System.out.println("Java is already in the map");
		}else {
			languages.put("Java", "this is course about Java");
		}
		System.out.println(languages.putIfAbsent("Java","Java"));
		
		System.out.println(languages.keySet());
		//loop and find values through keys
		for(String key : languages.keySet()){
			System.out.println(key + " : " +languages.get(key));
		}
		System.out.println(languages.remove("BASIC"));
		System.out.println("**********");
		//this will remove only if key and value match what we have
		if(languages.remove("Algol","a family of algorithmic langauges")) {
			System.out.println("Algo removed");
		}else{
			System.out.println("Algo not removed , key/value pair not found");
			}
		languages.replace("Java","I love java");
		System.out.println(languages.get("Java"));
		
		
		//so if the old value match it will be replaced
		if(languages.replace("Java","this will not work","I dont love java")){
			System.out.println("Java was updated to "+ languages.get("I love java"));
		}
		System.out.println(languages.keySet());
		
		Map < Map<Map<Map<Map<Map<String ,String>,String>,String> , String> ,String >,String>nice ;
	
	
	
	
	
	}
	
		
	}


