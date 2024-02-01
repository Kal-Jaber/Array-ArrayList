import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {		

		
		String[] carsArray = {"BMW","FORD","MAZDA","HONDA"};
		 //Array & ArrayList both start @[0][1][2][3]
		
		ArrayList<String>carArrayList = 
				new ArrayList<>(Arrays.asList("BMW","FORD","MAZDA","HONDA"));
		
		// how to call to get element 
		System.out.println(carsArray[3]);
		System.out.println(carArrayList.get(2));
		
		// how to find the  size
		System.out.println(carsArray.length);
		System.out.println(carArrayList.size ());
		
		// add element in ArrayList / can not with Array
		carArrayList.add("Audi");
		System.out.println(carArrayList.get(4));
		
		//remove element can't be done with Array
		carArrayList.remove("BMW");
		System.out.println(carArrayList.get(0));
		
		
		//change element  / set element 
		 
		carArrayList.set(0, "TOYOTA");
		System.out.println(carArrayList.get(0));
		
		// change element  index
		carsArray[3] = "Vw";
		System.out.println(carsArray[3]);
		
	

		// easy removing adding and printing using ArrayList
		
		
	}

}
