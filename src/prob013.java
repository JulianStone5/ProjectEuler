import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class prob013 {
	
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(new File("prob013_file.txt"));
			BigInteger sum = BigInteger.ZERO;
			for(int i = 0; i < 100; i++) {
				sum = sum.add(new BigInteger(reader.nextLine()));
			}
			System.out.println(sum.toString().substring(0, 10));
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
	
}