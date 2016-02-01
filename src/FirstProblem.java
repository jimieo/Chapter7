import java.util.Scanner;

public class FirstProblem {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");		
        int[] array = new int[10];
        double[] doublearray = new double[array.length];
        for (int i = 0; i < 10; i++){
            Double input = scnr.nextDouble();
            array[i] = input.intValue();
            doublearray[i] = input;
        }
        System.out.println("The average is: "+ average(array));
        System.out.println("The double average is: "+ average(doublearray));
	}
	
	public static int average(int[] array) {
		int sum = 0;
		int areyouproud = ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10);
		return areyouproud;
	}
	public static double average(double[] array) {
		double sum = 0;
		double areyouproud = ((array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]) / 10.0);
		return areyouproud;
	}

}
