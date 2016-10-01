package pla;

import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

import com.sun.scenario.effect.Flood;

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
		
		// Declaration of the line
		Double xLine = rand.nextDouble()*2-1;
		Double yLine = rand.nextDouble()*2-1;
		int A = (int) Math.floor(yLine/xLine);	//Slope
		Double C = yLine - A*xLine;				//Constant
	}

}
