import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prob022 {
	
	public static ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		try {
			
			Scanner reader = new Scanner(new File("prob022_file.txt"));
			String line = "";
			while(reader.hasNextLine()) {
				line = reader.nextLine();
				String[] lineNames = line.split(",");
				for(String s : lineNames) {
					names.add(s);
				}
			}
			Collections.sort(names);
			long nameScoreTotal = 0;
			for(int i = 0; i < names.size(); i++) {
				nameScoreTotal += (i+1) * worth(names.get(i));
				if(names.get(i).equals("COLIN")) System.out.println(i);
			}
			System.out.println(nameScoreTotal);
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
	
	public static long worth(String name) {
		long sum = 0;
		for(int i = 1; i < name.length()-1; i++) {
			sum += (int) (name.charAt(i) - 'A' + 1);
		}
		return sum;
	}
}