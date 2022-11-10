package recurcion;

import java.util.HashMap;
import java.util.LinkedList;

public class Hashmap {

	public static void main(String[] args) {
		LinkedList<String> cars=new LinkedList<String>();
		HashMap<String, Integer> people=new HashMap<String,Integer>();
		people.put("Emre", 21);
		people.put("Ahmet", 30);
		people.put("Mehmet", 35);
		for(String i:people.keySet()) 
		{
			System.out.println("key : "+ i+ "\nValue : "+people.get(i));
		}
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Ford");
		cars.add(1,"Mazda");
		String a=cars.get(1);
		if(a=="Mercedes") 
		{
			System.out.println("Eşitlik Sağlandı...");
		}
		else if(a.equals(cars.get(1))) 
		{
			System.out.println("Equals Sağlandı...");
		}
		else
			System.out.println("Eşitlik Sağlanamadı");
	}

}
