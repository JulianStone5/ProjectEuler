import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob011 {
	
	public static void main(String[] args) {
		try {
			Scanner reader = new Scanner(new File("prob011_file.txt"));
			int[][] grid =new int[20][20];
			for(int i = 0; i < 20; i++) {
				for(int j = 0; j < 20; j++) {
					grid[i][j] = reader.nextInt();
				}
			}
			long prod = 0;
			for(int i = 0; i <= 16; i++) {
				for(int j = 0; j <= 16; j++) {
					long temp1 = 1;
					long temp2 = 1;
					long temp3 = 1;
					long temp4 = 1;
					for(int k = 0; k < 4; k++) {
						temp1 *= grid[i][j+k];
						temp2 *= grid[i+k][j];
						temp3 *= grid[i+k][j+k];
						temp4 *= grid[i+k][j+3-k];
					}
					prod = Math.max(prod, temp1);
					prod = Math.max(prod, temp2);
					prod = Math.max(prod, temp3);
					prod = Math.max(prod, temp4);
				}
				
			}
			System.out.println(prod);
			reader.close();
		} catch (FileNotFoundException e) {
			
		}
	}
}