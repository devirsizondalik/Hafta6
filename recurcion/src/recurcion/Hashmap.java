package recurcion;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> people=new HashMap<String,Integer>();
		people.put("Emre", 21);
		people.put("Ahmet", 30);
		people.put("Mehmet", 35);
		for(String i:people.keySet()) 
		{
			System.out.println("key : "+ i+ "\nValue : "+people.get(i));
		}

	}

}
