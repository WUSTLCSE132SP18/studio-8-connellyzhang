package studio8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps {
	public static void main(String[] args) throws FileNotFoundException {
		double upOrDown[] = new double[3];
		int i = 0;
		File f = new File("/CSE132-studio8/src/studio8/YOUR_FILENAME.csv");
		Scanner ripArduino = new Scanner(f).useDelimiter(",");
		while(ripArduino.hasNext()) {
			System.out.println(ripArduino.nextDouble());
			ripArduino.nextDouble();
			ripArduino.nextDouble();
			upOrDown[i]= ripArduino.nextDouble();
			i++;
			if(i == 3) {
				i = 0;
			}
			if(upOrDown[1] > upOrDown[0] && upOrDown[1] > upOrDown[2]) {
				System.out.println(upOrDown[1]);
			}
		}
	}
}
