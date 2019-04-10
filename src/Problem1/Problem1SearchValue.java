package Problem1;

import java.util.HashMap;
import java.util.Iterator;

public class Problem1SearchValue {

	private static HashMap<Integer, String> data = new HashMap<Integer, String>() {
		{
			put(1, "AAA");
			put(2, "BBB");
			put(3, "CCC");
			put(4, "DDD");
			put(5, "EEE");
		}
	};

	public void printValue(int key) {
		if(data.containsKey(key)) {
			System.out.println("Key :"+key+"\t\t"+"Value :"+data.get(key));
		}else {
			System.err.println("\n Key is not available in list");
		}
	}
	public static void main(String[] args) {
	
		Problem1SearchValue searchdata = new Problem1SearchValue();
		searchdata.printValue(3);
		searchdata.printValue(55);

	}

}
