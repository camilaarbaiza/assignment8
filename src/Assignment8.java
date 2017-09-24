/*
   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   The purpose of this program is to read a 3-by-4 matrix and display the sum of each column
   */

import java.util.Scanner;

public class Assignment8 {

    public static void main(String [] args){


        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // declare space of array
        double[][] m = new double [3][4];
        double columnTotal;    // total in each column


        //Prompt user to enter values of the array
        System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");

        //Fill in the array with user input
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        // Print out results for every column
            for(int c=0; c < m[0].length; c++){

                columnTotal = sumColumn(m, c);
                System.out.println("Sum of the elements at column " +c+ " is " + columnTotal);
            }
    }//end main

    /**
     *  sumColumn method adds all the values in a specific column of an array
     *
     * @param x               array
     * @param columnIndex     index of the column
     * @return sumByColumn    sum of the elements in that column
     */
    public static double sumColumn(double[][] x, int columnIndex){

       double sumByColumn = 0;
       int row;


           for(row = 0; row < x.length; row++){

               sumByColumn += x[row][columnIndex];
           }

   return sumByColumn; }// end sumColumn method


}//end Assignment8 class
