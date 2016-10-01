package pla;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// size of total points is determined and random object defined.
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		Random rand = new Random();
		
		// x and y coordinates are defined
		Double[] xCoordinates = new Double[size];
		Double[] yCoordinates = new Double[size];
		
		// y coordinates are being created
		for(int i = 0; i < size; i++ ){
			xCoordinates[i] = rand.nextDouble()*2-1;
		}
		
		// y coordinates are being created
		for(int i = 0; i < size; i++ ){
			yCoordinates[i] = rand.nextDouble()*2-1;
		}
		
		// printing list of points
		for(int i = 0; i < size; i++){
			System.out.println( "(" + xCoordinates[i] + ", " + yCoordinates[i] + ")");
		}
	}

}
