package files;

import java.io.File;

public class Delete {
	public static void main(String[] args) {
		File f1 = new File("D:FileOperationExample.txt");
		if (f1.delete()) {
			System.out.println(f1.getName() + " file is deleted successfully.");
		} else {
			System.out.println("Unexpected error found in deletion of the file.");
		}
	}
}