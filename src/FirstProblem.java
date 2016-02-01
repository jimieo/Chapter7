import java.util.Scanner;

public class FirstProblem {
	public static void main(String[] args) {
		System.out.print("Enter ten numbers: ");	
		Scanner scnr = new Scanner(System.in);
        int[] array = new int[10];
        double[] doublearray = new double[array.length];
        for (int i = 0; i < array.length; i++){
            Double input = scnr.nextDouble();
            array[i] = input.intValue();
            doublearray[i] = input;
        }
        double minimum = min(doublearray);
        System.out.println("The int average is: "+ average(array));
        System.out.println("The double average is: "+ average(doublearray));
        System.out.println("The min is: "+ min(doublearray));
	}
	
	public static int average(int[] array) {
		int areyouproud = ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / array.length);
		return areyouproud;
	}
	public static double average(double[] array) {
		double areyouproud = ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / array.length);
		return areyouproud;
	}
	public static double min(double[] array){
		double minimum = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];	
			}
		}
		return minimum;

	}

}
