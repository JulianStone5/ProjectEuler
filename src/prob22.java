import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob22 {
	
	public static void main(String[] args) {
		try {
			ArrayList<String> names = new ArrayList<String>();
			Scanner reader = new Scanner(new File("prob22_file.txt"));
			String line = "";
			while((line = reader.nextLine()) != null) {
				String[] lineNames = line.split(",");
				for(String s : lineNames) {
					names.add(s);
				}
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
	
}