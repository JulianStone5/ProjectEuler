import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob11 {
	
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(new File("prob13_file.txt"));
			int[][] grid =new int[20][20];
			for(int i = 0; i < 20; i++) {
				for(int j = 0; j < 20; j++) {
					grid[i][j] = reader.nextInt();
				}
			}
			int prod = 0;
			System.out.println(prod);
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
}