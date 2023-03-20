package arrayList;

import java.util.ArrayList;

public class Update {

	public static void main(String[] argv) throws Exception {
		try {

			ArrayList<Integer> arrlist = new ArrayList<Integer>();

			arrlist.add(1);
			arrlist.add(2);
			arrlist.add(3);
			arrlist.add(4);
			arrlist.add(5);

			System.out.println("Before operation: " + arrlist);

			// Replacing element at the index 3 with 30
			// using method set()
			int i = arrlist.set(3, 30);

			System.out.println("After operation: " + arrlist);

			System.out.println("Replaced element: " + i);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		}
	}
}