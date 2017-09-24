import org.junit.Assert;


import static org.junit.Assert.*;


public class Assignment8Test {
    @org.junit.Test
    public void sumColumn() throws Exception {


        double [][] matrix = {{1.5, 2, 3, 4},{5.5, 6, 7, 8},{9.5, 1, 3, 1}};
        int column = 0;
        double expected = 16.5;

        Assert.assertTrue(expected == Assignment8.sumColumn(matrix,column));

            System.out.println("Sum of the elements at column " +column+ " is " + expected);

        }

    }

