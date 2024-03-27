import java.lang.System;
import java.util.Scanner;
public class TemperatureCalculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //take in data
        int[][] data = new int[2][12];//2 rows with 12 columns
        System.out.println("Hello given is a 2 x 12 array.");
        System.out.println("Enter the data for rows and then columns: ");
        getData(data); //a method that retrieves data
        System.out.println("The Average High is: " + avgHigh(data));
        System.out.println("The Average Low is: " + avgLow(data));
        System.out.println("The Highest Temperature is: " + indxHigh(data));
        System.out.println("The Lowest Temperature is: " + indxLow(data)); }
    static int[][] getData(int[][] array) { //retrieves data
        Scanner in = new Scanner(System.in); //input Scanner
        for (int r = 0; r < array.length; r++) // number of rows
        {
            for (int c = 0; c < array[r].length; c++)// number of columns
            {
                array[r][c] = in.nextInt(); //take in input for the rows and columns
            } //array looks like: { { 1,2,3,4}, {5,6,7,8} }
        }
        return array;
    }
    static int avgHigh(int[][] array) {
        int sum = 0; //sets sum = 0
        for (int c = 0; c < array[0].length; c++) { //while c < the length of the first row
            sum += array[0][c];  //add the sum of the columns from the first row
        }
        return (sum / array[0].length); //return the sum / the size
    }
    static int avgLow(int[][] array) {
        int sum = 0;
        for (int c = 0; c < array[1].length; c++) { //while the length is less than row 2
            sum += array[1][c]; // add the sum of the columns in row 2
        }
        return (sum / array[0].length); //divide the sum by the total elements
    }
    static int indxHigh(int[][] array) {
        int index = array[0][0]; //sets the index to zero
        for (int r = 0; r < array.length; r++) // number of rows
        {
            for (int c = 0; c < array[r].length; c++)// number of colums
            {
                if (array[r][c] > index) { // if the matrix is at one point ever greater than index
                    index = array[r][c]; //set index equal to that amount
                }
            }
        }
        return index;
    }
    static int indxLow(int[][] array) {
        int index = array[0][0];
        for (int r = 0; r < array.length; r++) // number of rows
        {
            for (int c = 0; c < array[r].length; c++)// number of colums
            {
                if (array[r][c] < index) {
                    index = array[r][c];
                }
            }
        }
        return index;
    }
}