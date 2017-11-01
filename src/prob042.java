import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob042 {
	
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(new File("prob042_file.txt"));
			String[] words = reader.next().split(",");
			for(int i = 0; i < words.length; i++) {
				words[i] = words[i].substring(1, words[i].length()-1);
			}
			int numTriWords = 0;
			for(String str : words) {
				int wordSum = 0;
				for(int i = 0; i < str.length(); i++) {
					wordSum += (int) str.charAt(i) - 64;
				}
				if(isPent(wordSum)) numTriWords++;
				
			}
			System.out.println(numTriWords);
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
	
	public static boolean isPent(int num) {
		double n = (-1.0 + Math.sqrt(8 * num + 1)) / 2.0;
		return n == (int) n;
	}
}